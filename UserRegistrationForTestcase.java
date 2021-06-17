package com.bridgelabz.user_registration_programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForTestcase {
	
	// UC1 Method to validate the firstname
	public boolean isvalidfirstname(String firstname) 
	{
		Pattern p;
		Matcher m;
		//Regex to check valid firstname
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		p = Pattern.compile(regex);
		m = p.matcher(firstname);
		return m.matches();
	}
	
	// UC2 Method to validate the lastname
	public boolean isvalidlastname(String lastname) 
	{
		Pattern p;
		Matcher m;
		//Regex to check valid lastname
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		p = Pattern.compile(regex);
		m = p.matcher(lastname);
		return m.matches();
	}
	
	// UC3 Method to validate the email address
	public static boolean isvalidemail(String email) 
	{
		Pattern p;
		Matcher m;
		//Regex to check valid email address
		String  regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";	
		p = Pattern.compile(regex);
		m = p.matcher(email);
		return m.matches();
	}
	
	// UC4 Method to validate the mobile number
	public static boolean isvalidmobileno(String mobileno) 
	{
		Pattern p;
		Matcher m;
		//Regex to check valid mobile number
		String  regex = "(0|91)?\\s([7-9][0-9]{9})";
		p = Pattern.compile(regex);
		m = p.matcher(mobileno);
		return m.matches();
	}
}
