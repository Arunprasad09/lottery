package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Passport4 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\eclipse-workspace\\Selenium\\Day9\\driver\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
	d.get("https://portal2.passportindia.gov.in/AppOnlineProject/user/RegistrationBaseAction?request_locale=en");
	d.manage().window().maximize();
	
	WebElement a = d.findElement(By.id("dcdrLocation"));
	Select s=new Select(a);
	s.selectByIndex(24);
	
	WebElement b = d.findElement(By.id("givenName"));
	b.sendKeys("Sachin");
	
	WebElement c = d.findElement(By.id("dob"));
	c.sendKeys("023/05/1986");
	
	WebElement e = d.findElement(By.name("email"));
	e.sendKeys("Sachu12@gmail.com");
	
	WebElement f = d.findElement(By.id("emailloginSameyes"));
	f.click();
	
	WebElement h = d.findElement(By.name("loginId"));
	h.sendKeys("Sachu12");
	
	WebElement i = d.findElement(By.id("pwd"));
	i.sendKeys("Sachu@12");
	
	WebElement j = d.findElement(By.id("confirmPwd"));
	j.sendKeys("Sachu@12");
	Thread.sleep(3000);
	WebElement l = d.findElement(By.id("hintQues"));
	Select s1=new Select(l);
	s1.selectByVisibleText("Favourite Colour");
	
	WebElement m = d.findElement(By.name("hintAns"));
	m.sendKeys("blue");
	
}
}
