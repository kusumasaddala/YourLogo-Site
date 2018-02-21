package com.qa.auto.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.qa.auto.base.BaseTest;

public class LoginPage extends BaseTest {
	
	public static Actions action=new Actions(driver);
		
		//PageFactory
		
		@FindBy(id="//input[@id='email']")
		WebElement emailID;
		
		@FindBy(id="passwd")
		WebElement password;
		
		@FindBy(id="SubmitLogin")
		WebElement submitButton;
		
		
		
		
		
		
		//Initializing the Page Objects:
			public LoginPage(){
				
				super();
				PageFactory.initElements(driver, this);
			}
			
			
		//Actions - Methods
			
			@Test(priority=2)
			public HomePageAfterLogin login(String userName,String passwd) {
				
				emailID.sendKeys(userName);
				password.sendKeys(passwd);
				submitButton.click();
				
				return new HomePageAfterLogin();
				
				
			}
			
			
			
			@Test(priority=1)
			public String verifyLoginPageTitle() {
				
				return driver.getTitle();		
			
			}
			
			
}
			
			
			
			
			
			
	

