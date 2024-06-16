package org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	
	public ChromeDriver driver;
	public Properties Pr;
	
	@BeforeMethod
	public void init() throws IOException
	{
		//Browser launch +url hit+maximize
		
		File f=new File("../YTFramework/ObjectRepsitory.properties");
		FileInputStream fi=new FileInputStream(f);
		 Pr= new Properties();
		 Pr.load(fi);
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\selenium notes\\chromedriver-win64\\chromedriver.exe");
		 
		 /*ChromeOptions co=new ChromeOptions();
		 co.setBinary("C:\\Users\\user\\Desktop\\selenium notes\\chrome-win64\\chrome.exe");*/
		 
		 driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
		 		
	}
	
	@AfterMethod
	public void Closure()
	{

		//browser close
		
		driver.close();
	}
}
