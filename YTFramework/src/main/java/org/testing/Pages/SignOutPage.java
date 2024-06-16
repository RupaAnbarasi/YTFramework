package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignOutPage {

ChromeDriver driver;
Properties Pr;
	
	public SignOutPage(ChromeDriver driver ,Properties Pr)
	{
		this.Pr=Pr;
		this.driver=driver;
	}
	
	
	public void SignOut() throws InterruptedException{
		{
			WebElement LogoutIm=driver.findElement(By.xpath(Pr.getProperty("SignOutImg")));
			LogoutIm.click();
			
			Thread.sleep(2000);
			
			WebElement SignOut=driver.findElement(By.xpath(Pr.getProperty("SignOut")));
			SignOut.click();
		}
	}

}
