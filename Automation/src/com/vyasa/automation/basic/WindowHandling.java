package com.vyasa.automation.basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
		String pWindowId=driver.getWindowHandle();
		System.out.println(pWindowId);
		String pTitle=driver.getTitle();
		System.out.println("parent window Title:"+pTitle);
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		Set<String> allWindowIds=driver.getWindowHandles();
		for(String id:allWindowIds)
		{
			driver.switchTo().window(id);  //switch to window
			String str=driver.getTitle();//get the title of that window
			System.out.println(str);
			if("Selenium".equalsIgnoreCase(str))
			{
				driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
			}
		}
		
		driver.switchTo().window(pWindowId);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
		
		Set<String> allWindowIdsNew=driver.getWindowHandles();
		for(String id:allWindowIdsNew)
		{
			driver.switchTo().window(id);  //switch to window
			System.out.println(driver.getTitle()); //get the title of that window
			if((pWindowId!=id)) {
				driver.close();
			}
		}
		
	}

}
