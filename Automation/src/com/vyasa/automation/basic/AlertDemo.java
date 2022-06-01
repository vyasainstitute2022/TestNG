package com.vyasa.automation.basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Alerts.html");
			driver.manage().window().maximize();
			//identify the element and click operation "click the button to display an  alert box:"
			driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
			
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		//alt.dismiss();
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		
		Alert alt2=driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.dismiss();
		
		String Actual=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
		if("You Pressed Cancel".equalsIgnoreCase(Actual))
		{
			System.out.println("dismiss success");
		}
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		Alert alt3=driver.switchTo().alert();
		alt3.getText();
		alt3.sendKeys("Mahadev");
		alt3.accept();
		
		String ActualText=driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
		if("hello mahadev how are you today".equalsIgnoreCase(ActualText))
		{
			System.out.println("data sent ");
		}else
		{
			System.out.println("not equal");
		}
		
		
	}

}
