package com.bridgelabz.user_registration_programs;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	
	// Test 1 : First name starts with capital letter and has minimum 3 characters
	@Test
	public void testing_validatefirstname() 
	{
		UserRegistrationForTestcase user = new UserRegistrationForTestcase();
		boolean result = user.isvalidfirstname("Pratik");
		Assert.assertEquals(true, result);
	}

	// Test 2 : Last name starts with capital letter and has minimum 3 characters
	@Test
	public void testing_validatelastname() 
	{
		UserRegistrationForTestcase user = new UserRegistrationForTestcase();
		boolean result = user.isvalidlastname("Hajare");
		Assert.assertEquals(true, result);
	}
	
}
