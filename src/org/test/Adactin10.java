package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin10 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day9\\driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
	    a.get("http://adactin.com/HotelApp/");
	    WebElement b = a.findElement(By.id("username"));
	    b.sendKeys("Arunpr11");
	    WebElement c = a.findElement(By.id("password"));
	    c.sendKeys("Sachin12");
	    WebElement d = a.findElement(By.id("login"));
	    d.click();
	    
	    WebElement f = a.findElement(By.id("room_type"));
	    Select s=new Select(f);
	    List<WebElement> l=s.getOptions();
	    for (WebElement Alo : l) {
			String n=Alo.getText();
			s.selectByVisibleText(n);
			System.out.println(n);
		}   
	    
	}

}
