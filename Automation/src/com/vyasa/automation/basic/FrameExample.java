package com.vyasa.automation.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		//xpath
		//frame id
		//index
		//single frame
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"singleframe\"]")));
		//driver.switchTo().frame("singleframe");
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Mahadev");
		driver.switchTo().defaultContent();
		
		//nested frame 
		driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe")));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Vyasa");
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a")).isDisplayed());
		
		
		
	}

}
