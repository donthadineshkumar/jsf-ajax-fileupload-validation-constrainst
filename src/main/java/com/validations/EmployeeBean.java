package com.validations;

import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Named
@RequestScoped
public class EmployeeBean {

	@Future
	Date retirementDate;
	
	@Past
	Date dob;
	
	@Size(max=3)
	String name;
	
	@Min(18)
	@Max(30)
	@Digits(integer=3, fraction=0)
	int age;
	
	@NotNull
	@Pattern(regexp="^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$")
	String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	//@Size is also supported for Collection, Array, Map
	//Default values for @Size ( min =1 and max=  2147483647)
	@Size(min=5, max=9)
	int zipcode;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Date getRetirementDate() {
		return retirementDate;
	}
	public void setRetirementDate(Date retirementDate) {
		this.retirementDate = retirementDate;
	}
}
