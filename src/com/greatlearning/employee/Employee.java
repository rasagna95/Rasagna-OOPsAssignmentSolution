package com.greatlearning.employee;

public class Employee {
	
	private String firstName;
	private String lastName;
	private String company;
	private String department;
	
	public Employee(String firstName, String lastName,String company,String department){
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.department = department;
		
	}

	public String getFirstName() {
		return firstName;
		
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		
	}
	 
	public String getLastName() {
			return lastName;
			
		}
	public void setLastName(String lastName) {
			this.lastName = lastName;
			
		}
	public String getCompany() {
		return company;
		
	}
	public void setCompany(String company) {
		this.company = company;
		
	}
	public String getDepartment() {
		return department;
		
	}
	public void setDepartment(String department) {
		this.department = department;
		
	}
	
}