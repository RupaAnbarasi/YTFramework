package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
	
	ChromeDriver driver;
	Properties Pr;
	
	public HomePage(ChromeDriver driver ,Properties Pr)
	{
		this.Pr=Pr;
		this.driver=driver;
	}

	
	
	public void clickTrending() throws InterruptedException
	{
		
		WebElement TrendingBtn=driver.findElement(By.xpath(Pr.getProperty("Trending")));
		TrendingBtn.click();
		
	}
	
  public void clickHistory()
  {
	 WebElement HistoryBtn=driver.findElement(By.xpath(Pr.getProperty("History")));
	 HistoryBtn.click();
  }
  
  public void clickSubscription()
         {
	  WebElement SubscriptionBtn=driver.findElement(By.xpath(Pr.getProperty("Subscription")));
	  SubscriptionBtn.click();
       }
	

}
