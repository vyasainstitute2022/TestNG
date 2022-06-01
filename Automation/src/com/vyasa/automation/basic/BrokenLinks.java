package com.vyasa.automation.basic;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
	

	public static void verifyBrokenLinks(String linkurl)  {
		
		HttpURLConnection connection;
		//sending http req on url 
		//convert string to url type
		try {
		URL url=new URL(linkurl);
		connection =(HttpURLConnection)url.openConnection();
		connection.setConnectTimeout(5000);
		connection.connect();
		
		//conclusion 
		if(connection.getResponseCode()==200)
		{
			System.out.println("valid link:"+connection.getResponseMessage());
		}else
		{
			System.out.println("broken links:"+connection.getResponseMessage());
		}
		
		if(connection.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println("broken link :"+connection.getResponseMessage());
		}
		}catch (Exception e)
		{
			System.out.println("cant perform the hrttp request on url"+e.getMessage());
		}
	}

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Amazon.in/");
		driver.manage().window().maximize();
		
		//1.collect links
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link:links)
		{
			//2.collect href
			String  url=link.getAttribute("href");
			System.out.println(url);
			
			if(url==null)
			{
				System.out.println("url is null");
			}else
			{
				verifyBrokenLinks(url);   //call a method to verify link working or not
				
			}
	}
		driver.close();
	}
}
