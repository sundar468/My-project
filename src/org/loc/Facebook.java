package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse-workspace\\Locators\\Drives\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		k.get(" https://www.facebook.com/");
		
		k.manage().window().maximize();
		
		WebElement em = k.findElement(By.xpath("//input[@id='email']"));
		em.sendKeys("bala07@gmail.com");
		
		
		WebElement pa = k.findElement(By.xpath("//input[@id='pass']"));
	
		pa.sendKeys("rajini007");
		
		WebElement clk = k.findElement(By.xpath("//button[@name='login']"));
		clk.click();
		
	}

}
