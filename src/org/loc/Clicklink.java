package org.loc;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicklink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse-workspace\\Locators\\Drives\\chromedriver.exe");
		
		
		WebDriver m = new ChromeDriver();
		
		m.get(" https://www.google.com/");
		
		WebElement search = m.findElement(By.name("q"));
		search.sendKeys("“Inmakes learning hub");
		
		
		
			WebElement s = m.findElement(By.name("btnK"));
			
			s.click();
			
	}
}
