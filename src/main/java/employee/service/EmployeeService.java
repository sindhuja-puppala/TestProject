package employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository emprepo;
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}
	
	public List<Employee> getAll() {
		return emprepo.findAll();
	}
	
	public void save(Employee employee){	
		emprepo.save(employee);
	}
  public Employee get(int id)
  {
	  return emprepo.findById(id).get();
  }

public void deleteEmployeeById(int id) throws RecordNotFoundException {
	 Optional<Employee> employee = emprepo.findById(id);
    
       if(employee.isPresent())
       {
           emprepo.deleteById(id);
       } 
       else {
           throw new RecordNotFoundException("No employee record exist for given id");
       }
}
       public Employee getEmployeeById(int id) throws RecordNotFoundException 
   	{
   		Optional<Employee> employee = emprepo.findById(id);
   		
   		if(employee.isPresent()) {
   			return employee.get();
   		} 
   		else {
   			throw new RecordNotFoundException("No employee record exist for given id");
   		}
   	}

}
 
 


