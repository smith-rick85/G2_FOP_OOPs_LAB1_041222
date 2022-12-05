package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.interfaces.Credentials;
import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

public class DriverClass{

	public static void main(String[] args) {
		Employee employee = new Employee("Harshit", "Choudhary");
		
		Credentials cs = new CredentialService();
		
		System.out.println("Please enter the department from the following: "+"\n");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		String generatedEmail = null;
		String genereatedPassword = null;
		
		switch(option) {
		
		case 1: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"Technical");
			genereatedPassword = cs.generatePassword();
			break;
		}
		case 2:{
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"Admin");
			genereatedPassword = cs.generatePassword();
			break;
			
		}
		case 3: {
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"HR");
			genereatedPassword = cs.generatePassword();
			break;
		}
		case 4:{
			generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"Legal");
			genereatedPassword = cs.generatePassword();
			break;
		
	} default:{
		System.out.println("Enter a valid option");
	}
	
	}
	
	employee.setEmail(generatedEmail);
	employee.setPassword(genereatedPassword);
	cs.showCredentials(employee);
	sc.close();
}
		
}
	

