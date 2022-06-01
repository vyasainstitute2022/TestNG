package com.vyasa.automation.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle=driver.getTitle();
		if(expectedTitle.equalsIgnoreCase(actualTitle))
		{
			System.out.println("Page Landed on Amazon site");
			System.out.println("Test Case Pass");
		}else
		{
			System.out.println("not on Amazon site");
			System.out.println("Test Case Fail");
		}
		
		
		
		System.out.println(driver.getWindowHandle());
		driver.navigate().to("https://www.google.com");
		System.out.println(driver.getWindowHandles());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		
		//switchTo    manage==>cookies ,window manage
		
		System.out.println("window postion:"+driver.manage().window().getPosition());
		System.out.println("size:"+driver.manage().window().getSize());
		
		Point p=new Point(100, 500);
		driver.manage().window().setPosition(p);
		
		System.out.println("later window position:"+driver.manage().window().getPosition());
		
		Dimension d=new Dimension(720, 480);
		driver.manage().window().setSize(d);
		
		System.out.println(driver.manage().window().getSize());
		
		// for switching to alert and frames 
		//driver.switchTo().
				
		WebElement ele=driver.findElement(By.tagName("a"));	
		System.out.println(ele.getAttribute("href"));
		
		List<WebElement> eleList=driver.findElements(By.tagName("a"));	
		for(WebElement e:eleList)
		{
			System.out.println(e.getAttribute("href"));
		}
		
	}

}
