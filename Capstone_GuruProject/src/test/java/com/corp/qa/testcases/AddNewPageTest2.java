package com.corp.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.corp.qa.PageLayer.HomePage;
import com.corp.qa.PageLayer.LoginPageNew;
import com.corp.qa.base.Base;

import AddNewAccount.Add_New_Account;

public class AddNewPageTest2 extends Base {
	
	public Add_New_Account ana;
	HomePage homePage;
	//Step 1
	public AddNewPageTest2() throws IOException {
		super();
		
	}
	//Step2
	
	@BeforeMethod
	public void SSSetUp() throws IOException {
		/*
		 * Setting up browser and website to execute test scripts
		 */
		initialization();
		/*
		 * To access all login elements and actions we made an object of LoginPageNew
		 * class
		 */
		ana=new Add_New_Account();	
	}
	@Test
	public void validateLoginnnn() throws IOException
	{
		ana.register(prop.getProperty("username"), prop.getProperty("password"));
	
	}
}
