package org.testing.TestScripts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium notes\\chromedriver-win64\\chromedriver.exe");
		 
		 /*ChromeOptions co=new ChromeOptions();
		 co.setBinary("C:\\Users\\user\\Desktop\\selenium notes\\chrome-win64\\chrome.exe");*/
		 
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
		 		
			
			WebElement element=driver.findElement(By.xpath("//ytd-button-renderer[@id='sign-in-button']"));
			element.click();
			
			// user name 
			driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("jamesrupa2604@gmail.com");
			
			driver.findElement(By.id("identifierNext")).click();
			
			//password
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@aria-label='Enter your password' and @name='Passwd']")).sendKeys("JKR12345");
			////div[@id='password']/div/div/div/input
			
			
			
			
			//div[@id='password']/div/div/div[1] ...
			
			//tag with attribut nameand value
			
			
			driver.findElement(By.xpath("//span[text()='Next']")).click();// Innext text  tag
			
			
			
			Thread.sleep(3000);
			
			
			driver.findElement(By.xpath("//img[@class='yt-core-image yt-core-image--fill-parent-height yt-core-image--fill-parent-width yt-core-image--content-mode-scale-aspect-fill yt-core-image--loaded']")).click();
			
				
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//yt-button-shape[@id='subscribe-button-shape']")).click();// Innext text  tag
			
			
			
            Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']")).click();
			
			driver.close();
				
}
	




}
