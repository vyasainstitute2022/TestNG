package com.vyasa.automation.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		//browser driver update
		// chrome  ===>chromedriver 
		
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		ele.click();
		WebElement inputEmail=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		inputEmail.sendKeys("k5mahadev@gmail.com");
		
		WebElement continueEle=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		continueEle.click();
		
		WebElement errorDisplay=driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4"));
		System.out.println(errorDisplay.isDisplayed());
		
		driver.close();
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\JavaProgramming\\Automation\\drivers\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://www.amazon.in/");
		driver2.manage().window().maximize();
		WebElement ele2=driver2.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		ele2.click();
		WebElement inputEmail2=driver2.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		inputEmail2.sendKeys("k5mahadev@gmail.com");
		
		WebElement continueEle2=driver2.findElement(By.xpath("//*[@id=\"continue\"]"));
		continueEle2.click();
		
		WebElement errorDisplay2=driver2.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/h4"));
		System.out.println(errorDisplay2.isDisplayed());
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
