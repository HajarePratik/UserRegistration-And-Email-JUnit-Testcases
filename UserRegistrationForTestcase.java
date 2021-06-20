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
}
