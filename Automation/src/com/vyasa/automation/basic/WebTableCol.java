package com.vyasa.automation.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCol {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\JavaProgramming\\Automation\\automationfiles\\DemoVyasa.html");
		driver.manage().window().maximize();
		
		WebElement table=driver.findElement(By.tagName("table"));
		
		WebElement colh=table.findElement(By.xpath("//tr/th[3]"));
		System.out.println(colh.getText());
		
		List<WebElement> col3=table.findElements(By.xpath("//tr/td[3]"));
		
		for(WebElement ele:col3)
		{
			    	 System.out.println(ele.getText());
			
		}

	}
}
