package com.vyasa.automation.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/dynamic-properties");
		driver.manage().window().maximize();
		WebElement button1=driver.findElement(By.xpath("//*[@id=\"enableAfter\"]"));
		WebElement button2=driver.findElement(By.xpath("//*[@id=\"colorChange\"]"));
		WebElement button3=driver.findElement(By.xpath("//*[@id=\"visibleAfter\"]"));
		System.out.println(button1.isEnabled());
		System.out.println(button2.getTagName());
		System.out.println(button3.getText());
				
	}
}
