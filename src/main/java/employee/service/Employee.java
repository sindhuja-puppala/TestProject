package employee.service;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;
@Validated
@Entity
public class Employee{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message="enter your id")
	public int id;
	@NotEmpty(message="name must be enter")
	public String forename;
	@NotNull
	public String surname;
	@NotNull
	public int age;
	@NotEmpty
	public String company;
     @NotNull
	public int postcode;
	
	public Employee() {}

	public Employee(int id, String forename, String surname, int age, String company, int postcode) {
		this.id =id;
		this.forename = forename;
		this.surname = surname;
		this.age = age;
		this.company = company;
		this.postcode = postcode;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + id + ", forename=" + forename + ", surname=" + surname + ", age=" + age
				+ ", company=" + company + ", postcode=" + postcode + "]";
	}
	
}


