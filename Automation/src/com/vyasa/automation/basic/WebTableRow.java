package com.vyasa.automation.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableRow {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\JavaProgramming\\Automation\\automationfiles\\DemoVyasa.html");
		driver.manage().window().maximize();
	
		WebElement table=driver.findElement(By.tagName("table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		for(WebElement row:rows)
		{
			System.out.println(row.getText());
		}
		
	}

}
