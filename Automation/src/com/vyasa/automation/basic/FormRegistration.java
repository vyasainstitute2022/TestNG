package com.vyasa.automation.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormRegistration {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		
		WebElement maleele=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
		String male=maleele.getText();
		
		WebElement femaleele=driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input"));
		String female=femaleele.getText();
		
		if("male".equalsIgnoreCase(male))
		{
			maleele.click();
		}else
		{
			femaleele.click();
		}
		
		driver.findElement(By.xpath("//*[@id=\"checkbox1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\Mahadev\\Desktop\\STMA March 2022\\DemoVyasa.html");
	}

}
