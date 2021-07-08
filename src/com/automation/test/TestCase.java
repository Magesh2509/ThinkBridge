package com.automation.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.utility.Selenium;

public class TestCase extends Selenium{

	@Test
	@Parameters({"Dropdownoption","FullName","OrganizationName","Email"})
	public void TestMethod(String Dropdownoption,String FullName,String OrganizationName,String Email)throws Exception
	{
		try
		{
			flow.OpenURL("http://jt-dev.azurewebsites.net/#/SignUp"); // Function to Open a URL
			flow.ValidateDropDown(Dropdownoption); // Function that will validate the drop down and print the result
			flow.TypeTextBasedonPlaceholderName("Full Name", FullName); //  Function to type the text based on the placeholder text it required two parameters First paramater is the placeholder text and the second one is the text which needs to be populated 
			flow.TypeTextBasedonPlaceholderName("Organization Name", OrganizationName);
			flow.TypeTextBasedonPlaceholderName("Email", Email);
			flow.ClickCheckBox(); // Function to click the check box
			flow.ClickButton("Get Started"); // Function to click the button based on its name
			flow.VerifyTextPresentinUI(" A welcome email has been sent. Please check your email. "); // Function to verify the text present in the UI
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}
