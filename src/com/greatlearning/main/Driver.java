
package com.greatlearning.main;


import java.util.Scanner;
import com.greatlearning.employee.Employee;
import com.greatlearning.credentialService.*;


public class Driver {
	static Scanner rs = new Scanner(System.in);
	static Employee emp;
	private static Service service = new Service();

	
	static String dep ;
	static String company;
	static String firstName;
	static String lastName;
	
	public static void main(String[] args) {
		
		System.out.println("First name : " );
		 firstName = rs.next();
		
		System.out.println("Last name : " );
		 lastName = rs.next();
		 
		 System.out.println("Company : " );
		 company = rs.next();
		 
		 
		displayDepartment();
		int option = rs.nextInt();
		
				
	switch (option) {
			case 1:
				dep = "tech";
			    break;
			case 2:
				dep = "adm";
			    break;
			case 3:
				dep = "hr";
			    break;
			case 4:
				dep = "lg";
			    break;
			default:
				System.out.println("Incorrect Choice");

			        }
	emp = new Employee(firstName,lastName,company,dep);
			if (option > 0 && option <= 4)
			{
			service.generateEmailAddress(emp);
			service.generatePassword();
			service.showCredentials(emp);
			}
			
		}
		
	private static void displayDepartment() {
		System.out.println("Please enter the department from the following:");	
		System.out.println("1. Technical");	
		System.out.println("2. Admin");	
		System.out.println("3. Human Resource");	
		System.out.println("4. Legal");	
		
	}	
	
}