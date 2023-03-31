package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Productlink {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\eclipse-workspace\\Locatorslink\\Driver\\chromedriver.exe");
		
		WebDriver m = new ChromeDriver();
		m.get("https://www.shopclues.com/wholesale.html");
		
		WebElement s = m.findElement(By.id("autocomplete"));
		s.sendKeys("Checked Shirt");
		
		WebElement rt = m.findElement(By.xpath("//a[@onclick='searchTrigger()']"));
		rt.click();
		
		WebElement rf = m.findElement(By.id("det_img_2134230"));
		rf.click();
	}

}

 