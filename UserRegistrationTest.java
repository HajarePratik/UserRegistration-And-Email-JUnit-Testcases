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
	
	// Test 3 : Testing Email Address
	@Test
	public void testing_validateemail() 
	{
		UserRegistrationForTestcase user = new UserRegistrationForTestcase();
		boolean result = user.isvalidemail("pratikhajare09@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	// Test 4 : Testing Mobile No.
	@Test
	public void testing_validatemobileno() 
	{
		UserRegistrationForTestcase user = new UserRegistrationForTestcase();
		boolean result = user.isvalidmobileno("91 9850962452");
		Assert.assertEquals(true, result);
	}
	
	// Test 5 : Testing Password, Rule 1 : should have atleast 8 characters
	@Test
	public void testvalidpassword() {
		UserRegistrationForTestcase user = new UserRegistrationForTestcase();
		boolean result = user.isvalidpassword("pratik09");
		Assert.assertEquals(true, result);
	}

	//UC7 Rule 2 & 3 : should have atleast one number & should have atleast one uppercase letter
	@Test
	public void testvalidpassword2() {
		UserRegistrationForTestcase user = new UserRegistrationForTestcase();
		boolean result = user.isvalidpassword("Pra09");
		Assert.assertEquals(true, result);
	}
	
	//UC8 Rule 4 : should have atleast one special character
	@Test
	public void testvalidpassword3() {
		UserRegistrationForTestcase user = new UserRegistrationForTestcase();
		boolean result = user.isvalidpassword("prA09@$");
		Assert.assertEquals(true, result);
	}
	
	
}
