package com.vyasa.automation.basic;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Set<Cookie> cookieinfo=driver.manage().getCookies();
		System.out.println(cookieinfo);
		
		Cookie mycookie=new Cookie("1234","mahadev");  //(k,v)
		driver.manage().addCookie(mycookie);
		
		
		Set<Cookie> cookienew=driver.manage().getCookies();
		System.out.println(cookienew);
		
		Cookie c=driver.manage().getCookieNamed("1234");
		System.out.println(c.getName());
		System.out.println(c.getDomain());
		System.out.println(c.getValue());
		
		driver.manage().deleteCookieNamed("1234");
		
		Set<Cookie> cc=driver.manage().getCookies();
		System.out.println(cc);
		
		driver.manage().deleteAllCookies();

		Set<Cookie> ccdel=driver.manage().getCookies();
		System.out.println(ccdel);
		
	}
}
