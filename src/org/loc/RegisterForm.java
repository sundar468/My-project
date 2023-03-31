package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\eclipse-workspace\\Locators\\Drives\\chromedriver.exe");
		
		WebDriver k = new ChromeDriver();
		k.get("http://demo.automationtesting.in/Register.html");
		
		k.manage().window().maximize();
		
		WebElement fn = k.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("Balasundaram");
		WebElement ln = k.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.sendKeys("Muralidharan");
		WebElement add = k.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		add.sendKeys("112, T.k street,Poomarket,"
				+ "Coimbatore-641001");
		WebElement email = k.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		email.sendKeys("Sundar.crazie@gmail.com");
		WebElement phone = k.findElement(By.xpath("//input[@ng-model='Phone']"));
		phone.sendKeys("6379321053");
		WebElement rb = k.findElement(By.xpath("//input[@value='Male']"));
		rb.click();
		WebElement cb = k.findElement(By.id("checkbox1"));
		cb.click();
		
		WebElement d = k.findElement(By.id("msdd"));
		
		d.click();
		
		Thread.sleep(3000);
		WebElement lan = k.findElement(By.xpath("(//a[@class='ui-corner-all'])[2]"));
		lan.click();
		
		WebElement lan2 = k.findElement(By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']"));
		Select y = new Select(lan2);
		y.selectByIndex(4);
		WebElement sk = k.findElement(By.id("Skills"));
		Select r = new Select(sk);
		r.selectByIndex(3);
		
		
		
		
	}

}
