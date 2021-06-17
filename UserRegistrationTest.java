package com.bridgelabz.user_registration_programs;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	
	// Test 1 : First name starts with capital letter and has minimum 3 characters
	@Test
	public void Testing_validatefirstname() 
	{
		UserRegistrationForTestcase firstname = new UserRegistrationForTestcase();
		boolean result = firstname.isvalidfirstname("Pratik");
		Assert.assertEquals(true, result);
	}

	// Test 2 : Last name starts with capital letter and has minimum 3 characters
	@Test
	public void Testing_validatelastname() 
	{
		UserRegistrationForTestcase lastname = new UserRegistrationForTestcase();
		boolean result = lastname.isvalidlastname("Hajare");
		Assert.assertEquals(true, result);
	}
	
}
