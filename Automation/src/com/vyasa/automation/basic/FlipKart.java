package com.vyasa.automation.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipKart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement mobileNumber=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")));

		mobileNumber.sendKeys("8660242427");
		driver.findElement(By.xpath("//div[@class=\"IiD88i _351hSN\"]/input[@type=\"password\"]")).sendKeys("12345Password");
		
	}

}
