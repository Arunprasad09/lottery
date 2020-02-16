package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tspsc7 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day9\\driver\\chromedriver.exe");
	WebDriver a=new ChromeDriver();
	a.get("https://tspsc.gov.in/TSPSCOTR2015/oneTimeRegistration.tspsc");
	a.manage().window().maximize();
	
	WebElement b = a.findElement(By.id("localDistrict"));
	Select s=new Select(b);
	List <WebElement> c=s.getOptions();
	for (WebElement x : c) {
		String name=x.getText();
		s.selectByVisibleText(name);
		System.out.println(name);
		
	}
	
}
}
