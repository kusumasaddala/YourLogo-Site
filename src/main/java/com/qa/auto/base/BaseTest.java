package com.qa.auto.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public BaseTest(){
		
		
		
		prop=new Properties();
		FileInputStream fis;
		
		try {
			
			fis = new FileInputStream("C:\\Users\\KusumaSaddala\\eclipse-workspace\\YourLogo\\src\\main\\java\\com\\qa\\auto\\config\\config.properties");
			prop.load(fis);
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		 catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void initialize() {
		
		// initializing driver
		
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("Firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\KusumaSaddala\\Downloads\\FF Gecko Driver\\geckodriver.exe");	
			driver=new FirefoxDriver();
			
		}
		else if(browserName.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/kusumasaddala/Documents/SeleniumServer/chromedriver");	
			driver=new ChromeDriver();
			
		}
		else if(browserName.equals("IE")) {
			
			System.setProperty("webdriver.ie.driver", "/Users/kusumasaddala/Documents/SeleniumServer/iedriver");	
			driver=new InternetExplorerDriver();
			
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get(prop.getProperty("url"));
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		
		
		
	}
	

}
