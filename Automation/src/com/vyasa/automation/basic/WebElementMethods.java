package com.vyasa.automation.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 button,<input>,menu,radio,checkbox,form,div,p,
 header<h1>,dropdown,links,popups,alert,frames,label,table
 */

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JavaProgramming\\Automation\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//identify the element and perform the operation 
		
		WebElement userNameEle=driver.findElement(By.id("user-name"));
		userNameEle.sendKeys("standard_user");
		//	userNameEle.clear();
		
		WebElement passEle=driver.findElement(By.name("password"));
		passEle.sendKeys("secret_sauce");
		
		WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		String textLogin=loginButton.getAttribute("value");
		System.out.println(textLogin);
		loginButton.click();
		
		WebElement addtoKartEle=driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
		String text =addtoKartEle.getText();
		System.out.println(text);
		
		System.out.println(addtoKartEle.getLocation());
		System.out.println(addtoKartEle.isEnabled());
		System.out.println(addtoKartEle.isDisplayed());
		System.out.println(addtoKartEle.getSize());
		System.out.println(addtoKartEle.getTagName());
		WebElement price=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
		String expectedPrice="$29.99";
		String actulPrice=price.getText();
		//validation
		if(expectedPrice.equalsIgnoreCase(actulPrice))
		{
			System.out.println("prcie is correct TC pass");
		}else
		{
			System.out.println("prcie is not correct TC fail");
		}
		
		
		List<WebElement> eleList=driver.findElements(By.tagName("a"));	
		for(WebElement e:eleList)
		{
			System.out.println(e.getAttribute("href"));
		}
		
		WebElement menuButton=driver.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]"));
		menuButton.click();
		
	 /*   WebElement logout=driver.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]"));
		logout.click();
		*/
		
		WebElement logoutlink=driver.findElement(By.linkText("LOGOUT"));
		logoutlink.click();
		
		/*WebElement logoutpartial=driver.findElement(By.partialLinkText("LOGOUT"));
		logoutpartial.click();*/
		
		String expectedhomeUrl="https://www.saucedemo.com/";
		String actualhomeUrl=driver.getCurrentUrl();
		
		if(actualhomeUrl.equalsIgnoreCase(expectedhomeUrl))
		{
			System.out.println("successfully logout");
			System.out.println("logout tc pass");
		}else
		{
			System.out.println("successfully logout not done");
			System.out.println("logout tc fail");
		}
		
		driver.close();
		
	}

}
