package org.testing.TestScripts;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;
import org.testing.Pages.HomePage;
import org.testing.Pages.SignOutPage;
import org.testing.Pages.loginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TC1 extends Base {
	

	
	
	
	
	@Test
	
	public void testCase1() throws InterruptedException
	
		
	{
 	
		loginPage LoginObj= new loginPage(driver, Pr);
		LoginObj.SignIn("jamesrupa2604@gmail.com", "JKR12345");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	     HomePage homePageObj=new HomePage(driver,Pr);
	     homePageObj.clickTrending();
	     
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     
	     SignOutPage SignOut = new SignOutPage(driver,Pr);
	     SignOut.SignOut();
	     
	   
	
	
	
		
	}

}