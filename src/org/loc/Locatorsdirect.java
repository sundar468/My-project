package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdirect {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse-workspace\\Locators\\Drives\\chromedriver.exe");
		
		WebDriver c = new ChromeDriver();
		
		c.get("https://www.facebook.com/");
		
		c.manage().window().maximize();
		
		WebElement fe = c.findElement(By.name("email"));
		fe.sendKeys("6379321053");
		
		WebElement r = c.findElement(By.name("pass"));
		r.sendKeys("6379321053");
		
		
		
		WebElement sd = c.findElement(By.name("login"));
		sd.click();
		
		
		
		
		
		
		
	}
}
