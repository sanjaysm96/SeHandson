package com.omrbranch.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0702 {
public void t0702_courseSeLogin() throws Exception {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
	driver.manage().window().maximize();
	
	Actions action = new Actions(driver);
	
	WebElement coursesMenu = driver.findElement(By.xpath("//a[text()='Courses ']"));
	action.moveToElement(coursesMenu).perform();
	
	Thread.sleep(3000);
	WebElement seleniumSubMenu = driver.findElement(By.xpath("(//a[text()='Selenium'])[1]"));
	seleniumSubMenu.sendKeys(Keys.ENTER);
	
	WebElement txtUserName = driver.findElement(By.xpath("//input[@id='email']"));
	txtUserName.sendKeys("greenstechchennaiomr@gmail.com");
	
	WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
	txtPassword.sendKeys("Greens@123");
	
	WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Login']"));
	btnLogin.click();
	
	Thread.sleep(4000);
	WebElement errMessage = driver.findElement(By.xpath("//div[@id='errorMessage']"));
    if (errMessage.isDisplayed()) {
        System.out.println("Login Failed: " + errMessage.getText());
    } else {
        System.out.println("Login success");
        
        driver.quit();
    }
}
public static void main(String[] args) throws Exception {
	Day7_U0702 login = new Day7_U0702();
	login.t0702_courseSeLogin();
}
}
