package com.vyasa.testng.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	public WebDriver driver;
	@BeforeMethod
	public void browserSetup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\TestNgFramework\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@Test(dataProvider="login-data")
	void Registration(String tcid,String tcdescp,String message,String userName,String pass)
	{
		driver.findElement(By.xpath("//form/div[1]/input[@type='text']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
		if(tcid.equalsIgnoreCase("TC01"))
		{
			System.out.println(tcdescp);
			driver.findElement(By.xpath("//button/span")).click();
			String actualError=driver.findElement(By.xpath("//span[contains(text(),'Please enter valid Email ID/Mobile number')]")).getText();
			Assert.assertEquals(actualError, message);
		}else if(tcid.equalsIgnoreCase("TC02"))
		{
			System.out.println(tcdescp);
			driver.findElement(By.xpath("//button/span")).click();
			String actualError=driver.findElement(By.xpath("//span[contains(text(),'Please enter Password')]")).getText();
			Assert.assertEquals(actualError, message);
		}else if(tcid.equalsIgnoreCase("TC03"))
		{
			System.out.println(tcdescp);
			driver.findElement(By.xpath("//button/span")).click();
			boolean actual=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a")).isDisplayed();
			Assert.assertTrue(actual);
		}
		
	}	
	@DataProvider(name="login-data")
	public Object[][] loginData() 
	{   
		return new Object[][]{
			{"TC01","BlankUserName","Please enter valid Email ID/Mobile number","","Pass@12345"},
			{"TC02","PasswordBlank","Please enter Password","8660242427",""},
			{"TC03","correctLogin","true","8660242427","Pass@12345"},
	    };
	}
	
	@AfterMethod
	public void browserClose()
	{
		driver.quit();
	}
}
