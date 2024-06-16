package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoPlayPage {
	
	ChromeDriver driver;
	Properties Pr;
	
	public VideoPlayPage(ChromeDriver driver ,Properties Pr)
	{
		this.Pr=Pr;
		this.driver=driver;
	}

	
	
	public void clickLikeButton() throws InterruptedException
	{

		driver.findElement(By.xpath(Pr.getProperty("Video"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Pr.getProperty("LikeButton"))).click();
		Thread.sleep(2000);
	}
	
	

	public void clickSubscribeButton() throws InterruptedException
	{
		driver.findElement(By.xpath(Pr.getProperty("Video"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(Pr.getProperty("SubscriptionButton"))).click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	

}
