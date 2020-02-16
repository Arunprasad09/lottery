package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Password5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day9\\driver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
		d.manage().window().maximize();
		
		WebElement a = d.findElement(By.id("dcdrLocation"));
		Select s=new Select(a);
		List<WebElement> b=s.getOptions();
		for(WebElement i:b) {
			String name=i.getText();
			System.out.println(name);
		}
}
}