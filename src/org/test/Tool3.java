package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tool3 {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day9\\driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.toolsqa.com/automation-practice-form/");
		a.manage().window().maximize();
		
		WebElement f = a.findElement(By.id("cookie_action_close_header"));
		f.click();
		WebElement b = a.findElement(By.id("continents"));
		Select s=new Select(b);
		 List<WebElement> c = s.getOptions();
		for(int i=0; i<c.size(); i++) {
			WebElement g=c.get(i);
			String n=g.getText();
			s.selectByVisibleText(n);
			System.out.println(n);
		}
		}
		
}

