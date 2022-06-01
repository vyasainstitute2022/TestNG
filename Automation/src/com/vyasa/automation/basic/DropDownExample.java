package com.vyasa.automation.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Mahadev/Desktop/DemoVyasa.html");
		driver.manage().window().maximize();
		
		//Select 
		Select sl=new Select(driver.findElement(By.xpath("//*[@id=\"form1\"]/select")));
		sl.selectByIndex(2);
		Thread.sleep(5000);
		sl.selectByValue("blue");
		Thread.sleep(5000);
		sl.selectByVisibleText("Red");
		Thread.sleep(5000);
		List<WebElement> options=sl.getOptions();
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}
		
		System.out.println(sl.isMultiple());
	
		
		System.out.println("*********************************");
		
		WebElement dropdownmul=driver.findElement(By.xpath("//*[@id=\"form2\"]/select"));
		Select sm=new Select(dropdownmul);
		sm.selectByIndex(2);
		Thread.sleep(5000);
		sm.selectByVisibleText("Orange");
		Thread.sleep(5000);
		sm.selectByValue("green");
		Thread.sleep(5000);
		sm.deselectByIndex(2);
		Thread.sleep(5000);
		sm.selectByIndex(4);
		Thread.sleep(5000);
		
		List<WebElement> opt=sm.getOptions();
		for(WebElement op:opt)
		{
			System.out.println(op.getText());
		}
		
		System.out.println("------------");
		
		List<WebElement> allsle=sm.getAllSelectedOptions();
		for(WebElement s:allsle) {
			System.out.println(s.getText());
		}
	
		System.out.println(sm.isMultiple());
		
		WebElement f=sm.getFirstSelectedOption();
		System.out.println(f.getText());
		
		System.out.println(sm.getFirstSelectedOption().getText());
		
		sm.deselectAll();
		Thread.sleep(5000);
	}

}
