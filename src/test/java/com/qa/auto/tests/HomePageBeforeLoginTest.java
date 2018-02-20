package com.qa.auto.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.auto.base.BaseTest;
import com.qa.auto.pages.HomePageBeforeLogin;
import com.qa.auto.pages.LoginPage;

public class HomePageBeforeLoginTest extends BaseTest{
	
	public LoginPage loginPage;
	public HomePageBeforeLogin homePageBeforeLogin;
	
	
	public HomePageBeforeLoginTest()
	{
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialize();		
		homePageBeforeLogin=new HomePageBeforeLogin();	
		
	}
	
	
	
	@Test(priority=1)
	public void verifyTitle() {
		
		String title=homePageBeforeLogin.verifyPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, prop.getProperty("HomePage_Title"));
		
	}
	
	
	
	
	@Test(priority=2)
	public void verifyLogoDisplay() {
		Assert.assertTrue(homePageBeforeLogin.validateLogoImageDisplay());
	}
	
	
	@Test(priority=3)
	public void clickSignin() {
		
		HomePageBeforeLogin.clickOnSignInBtn();
				
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
