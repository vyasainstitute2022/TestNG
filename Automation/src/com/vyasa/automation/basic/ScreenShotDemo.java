package com.vyasa.automation.basic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		//automation/screenshots/photo.png
		String filepath=System.getProperty("user.dir")+"/screenshots/"+"photo"+System.currentTimeMillis()+".png";
		File destFile=new File(filepath);
		FileUtils.copyFile(srcFile, destFile);
		
        
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,100)","");
		Thread.sleep(3000);
		
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"post-body-5867683659713562481\"]/div[1]/div[4]/table"));
		js.executeScript("arguments[0].scrollIntoView();",ele);
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)","");
		
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,200)","");
		
		//js.executeScript("window.scrollBy(0,document.body.scrollTop)","");
		Thread.sleep(5000);
		driver.quit();
	}
}
