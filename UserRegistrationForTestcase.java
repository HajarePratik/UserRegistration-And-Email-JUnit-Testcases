package com.bridgelabz.user_registration_programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationForTestcase {
	
	Pattern pattern;
	Matcher match;
	
	// UC1 Method to validate the firstname
	public boolean isvalidfirstname(String firstname) 
	{
		//Regex to check valid firstname
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		match = pattern.matcher(firstname);
		return match.matches();
	}
	
	// UC2 Method to validate the lastname
	public boolean isvalidlastname(String lastname) 
	{
		//Regex to check valid lastname
		String  regex = "^[A-Z]{1}[a-z]{2,}";
		pattern = Pattern.compile(regex);
		match = pattern.matcher(lastname);
		return match.matches();
	}
	
	// UC3 Method to validate the email address
	public static boolean isvalidemail(String email) 
	{
		//Regex to check valid email address
		String  regex = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?";	
		pattern = Pattern.compile(regex);
		match = pattern.matcher(email);
		return match.matches();
	}
}
