package com.omrbranch.day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_U1304 {

	public void t1306_login() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement txtEmail = driver.findElement(By.xpath("//input[@id='email']"));
		js.executeScript("arguments[0].value='9944152058@omrbranch.com';", txtEmail);

		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		js.executeScript("arguments[0].value='9944152058';", txtPassword);

		WebElement btnLogin = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		js.executeScript("arguments[0].click();", btnLogin);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement userNotfound = driver.findElement(By.xpath("//b[text()='User does not exist']"));
		if (userNotfound.isDisplayed()) {
			System.out.println(userNotfound.getText());
		}
		driver.quit();
	}
	public static void main(String[] args) {
		Day13_U1304 login = new Day13_U1304();
		login.t1306_login();
	}
}