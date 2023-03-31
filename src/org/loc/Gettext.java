package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\eclipse\\eclipse-workspace\\Locators\\Drives\\chromedriver.exe");
		
		WebDriver l = new ChromeDriver();
		l.get("https://inmakesedu.com/about_us");
		
		WebElement get = l.findElement(By.xpath("//p[contains(text(),'advancement programs set professionals ')]"));
		String s = get.getText();
		System.out.println(s);
	}

}
