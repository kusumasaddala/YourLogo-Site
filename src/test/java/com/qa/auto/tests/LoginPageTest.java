package com.qa.auto.tests;

import org.testng.annotations.Test;

import com.qa.auto.base.BaseTest;
import com.qa.auto.pages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	
	public LoginPage loginPage;
	
	
	@Test(priority=1)
	public LoginPageTest() {
		
		super();
	}
	
	
	@Test(priority=2)
	public void setUp() {
		
		initialize();
		loginPage=new LoginPage();	
		
		
	}
	
	@Test(priority=3)
	public void logintest() {
		
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
		
		
	}
	
	

}
