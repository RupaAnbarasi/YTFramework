package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginPage {
	ChromeDriver driver;
	Properties Pr;
	
	public loginPage(ChromeDriver driver ,Properties Pr)
	{
		this.Pr=Pr;
		this.driver=driver;
	}
	
	//
	
	public void SignIn(String UserName, String password) throws InterruptedException
	{
		// Sign in button
		WebElement signinBtn=driver.findElement(By.xpath(Pr.getProperty("SignIn")));
		signinBtn.click();
		
		// user name 
		WebElement username= driver.findElement(By.xpath(Pr.getProperty("username")));
		username.sendKeys(UserName);
		
		// Next Button
		 WebElement NextBtn1=driver.findElement(By.id(Pr.getProperty("NextButton1")));
		 NextBtn1.click();
		
		//password
		
		Thread.sleep(3000);
		
		WebElement Pwd=driver.findElement(By.xpath(Pr.getProperty("password")));
		Pwd.sendKeys(password);
		
		//Mext Button2
		
		WebElement NextBtn2=driver.findElement(By.xpath(Pr.getProperty("NextButton2")));
		NextBtn2.click();// Innex
		
	}

	

}
