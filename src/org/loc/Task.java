package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse-workspace\\Locators\\Drives\\chromedriver.exe");
		
		WebDriver m = new ChromeDriver();
		
		m.get(" https://www.amazon.in/");
		WebElement fe = m.findElement(By.name("field-keywords"));
		fe.sendKeys("iphone");
		
		WebElement cl = m.findElement(By.xpath("//input[@value='Go']"));
		cl.click();
		
	}

}
