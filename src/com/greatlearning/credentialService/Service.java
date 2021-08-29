package com.greatlearning.credentialService;

import com.greatlearning.employee.Employee;
import java.util.Scanner;
import java.util.Random;

public class Service {
	static Scanner rs = new Scanner(System.in);
	
	 static String email;
	 static String password;
	
	public String generateEmailAddress(Employee emp) {
		 email = emp.getFirstName()+emp.getLastName()+"."+emp.getDepartment()+"@"+emp.getCompany()+".com";
		return email;
	}
	
	public String generatePassword() {
		int pwdLength = 8;
		
		String numbers="1234567890";
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghjiklmnopqrstuvwxyz";
		String specialchars="!@#$*()?.=+^&*<>";
		String combinedChars=numbers+capitalLetters+smallLetters+specialchars;
		Random random =new Random();
		char[]pwd = new char[pwdLength];
		
		
		pwd[0]=numbers.charAt(random.nextInt(numbers.length()));
		pwd[1]=capitalLetters.charAt(random.nextInt(capitalLetters.length()));
		pwd[2]=smallLetters.charAt(random.nextInt(smallLetters.length()));
		pwd[3]=specialchars.charAt(random.nextInt(specialchars.length()));
		
		for (int  i=4;i<pwdLength; i++) {
			pwd[i]=combinedChars.charAt(random.nextInt(combinedChars.length()));
		}	
		password = String.valueOf(pwd);
		return password;
	}
	
	
	public  void showCredentials(Employee emp) {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are as follows:");	
		System.out.println("Email--->"+email);
		System.out.println("Password--->"+password);
		
	}
}