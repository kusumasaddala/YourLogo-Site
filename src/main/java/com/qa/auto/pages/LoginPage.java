package com.qa.auto.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
		
		
		@FindBy(xpath="//a[@title='View my customer account']/span")
		WebElement loginAccountName;
		
		@FindBy(xpath="//a[@title='Women']")
		static WebElement womenMenu;
		
		@FindBy(xpath="//a[@title='Blouses']")
		static WebElement blousesSubMenu;
		
		
		
		//Initializing the Page Objects:
			public LoginPage(){
				
				super();
				PageFactory.initElements(driver, this);
			}
			
			
		//Actions - Methods
			public String verifyLoginPageTitle() {
				
				return driver.getTitle();		
			
			}
			
			public String verifyAccountName() {
				
				return loginAccountName.getText();
				
			}
			
			public static void mouseOverMenu() {							
				
			action.moveToElement(womenMenu).build().perform();
			}
			
			public static void selectWomenMenuOptions(String title) {
				
				driver.findElement(By.xpath("//a[@title='"+title+"']")).click();
				
				
				
				
				
				
			}
			
			
			
			
			
			
	
}
