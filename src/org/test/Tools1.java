package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tools1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day9\\driver\\chromedriver.exe");
		WebDriver a=new ChromeDriver();
		a.get("https://www.toolsqa.com/automation-practice-form/");
		a.manage().window().maximize();
		
		WebElement b = a.findElement(By.id("selenium_commands"));
		Select s=new Select(b);
		
		//Even Options in Selenium commands
		
		List<WebElement> d=s.getOptions();
		for(int i=0; i<d.size(); i++){
			if(i%2==0) {
				WebElement g=d.get(i);
				String n=g.getText();
				s.selectByVisibleText(n);
				System.out.println(n);	
				
		}
			
		}

	}

}
