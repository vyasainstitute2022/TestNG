package com.vyasa.automation.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver,5);
		WebElement button1=	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"enableAfter\"]")));
		System.out.println(button1.isEnabled());
		
		WebElement button2=driver.findElement(By.xpath("//*[@id=\"colorChange\"]"));
		System.out.println(button2.getTagName());
		
		WebElement button3=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"visibleAfter\"]")));
		System.out.println(button3.getText());
				
	}
}
