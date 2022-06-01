package com.vyasa.automation.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		
		Wait<WebDriver> waits=new FluentWait<>(driver).withTimeout(10,TimeUnit.SECONDS)
				.pollingEvery(1,TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
	WebElement ele= waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"enableAfter\"]")));
	System.out.println(ele.isEnabled());
	
	WebElement button2=driver.findElement(By.xpath("//*[@id=\"colorChange\"]"));
	System.out.println(button2.getTagName());
	
	WebElement button3=waits.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"visibleAfter\"]")));
	System.out.println(button3.getText());
	
	
	}
}
