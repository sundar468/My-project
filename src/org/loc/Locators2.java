package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse-workspace\\Locators\\Drives\\chromedriver.exe");
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		d.manage().window().maximize();
		
		WebElement fd = d.findElement(By.xpath("(//input[@data-testid='royal_email'])"));
		fd.sendKeys("Sundar.crazie@gmail.com");
		
		WebElement er = d.findElement(By.xpath("(//input[@data-testid='royal_pass'])"));
		er.sendKeys("6379321053");
		
		WebElement fr = d.findElement(By.xpath("//a[contains(text(),'Create a Page')]"));
		String txt = fr.getText();
		System.out.println(txt);
		
	
		
		
		
		
		
		
		
		
		
		
		WebElement df = d.findElement(By.xpath("//a[text()='Create new account']"));
		df.click();
		
		
		
		
	}

}
