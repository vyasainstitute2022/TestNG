package com.vyasa.automation.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("D:\\JavaProgramming\\Automation\\automationfiles\\DemoVyasa.html");
		driver.manage().window().maximize();
		
		/*	1.find the table  <table>
		2.find the rows  <tr>
		3.find the th or td  <th> or <td> 
		 */	
	
		WebElement table=driver.findElement(By.tagName("table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		for(WebElement row:rows)
		{
			
			//header
				List<WebElement> headers=row.findElements(By.tagName("th"));
				
				for(WebElement head:headers) {
				System.out.println(head.getText());
				}
				//data
				List<WebElement> tabledata=row.findElements(By.tagName("td"));
					
			     for(WebElement data:tabledata)
			     {		    	 
			    	 System.out.println(data.getText());
			     }
				
			
		}
		
	}
}
