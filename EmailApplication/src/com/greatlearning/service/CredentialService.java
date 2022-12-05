package com.greatlearning.service;

import java.util.Random;
import com.greatlearning.interfaces.Credentials;
import com.greatlearning.model.Employee;

public class CredentialService implements Credentials{
	
	public String generatePassword() {
		
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_+-/.<>?";
		
		String values = smallLetters + capitalLetters + numbers + specialCharacters;
		
		
		Random random = new Random();
		
		String password="";
		char temp;
		for(int i = 0; i < 8; i++) {
			password += String.valueOf(values.charAt(random.nextInt(values.length())));
		}
		
		return password;
		
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) 
	{
		
		return firstName+lastName+"@"+department+".abc.com";
	}
	public void showCredentials(Employee employee) {
		
		System.out.println("Hello "+employee.getFirstName()+ ", your generated credentials as follows: ");
		System.out.println("Email: "+ employee.getEmail());
		System.out.println("Password: "+ employee.getPassword());
	}

}
