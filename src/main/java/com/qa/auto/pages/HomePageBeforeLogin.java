package com.qa.auto.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.auto.base.BaseTest;

public class HomePageBeforeLogin extends BaseTest {
		
		@FindBy(xpath="//a[contains(text(),'Sign in')]")
		static WebElement signIn_button;
		
			
		@FindBy(xpath="//div[@id='header_logo']/a/img")
		static WebElement pageLogo;
	
		
		//Initializing the Page Objects:
			public HomePageBeforeLogin(){
				PageFactory.initElements(driver, this);
			}
			
			
		//Actions - Methods
			public String verifyPageTitle() {
				
				return driver.getTitle();		
			
			}
			
			public boolean validateLogoImageDisplay() {
				return pageLogo.isDisplayed();
			
			}
			
			public static LoginPage clickOnSignInBtn() {
				
				signIn_button.click();				
				return new LoginPage();
				
			
			}
			
			
			
	
}
