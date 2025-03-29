package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0304 {
	public void t0306_facebookLogin() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement txtEmailField = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement txtPasswordField = driver.findElement(By.xpath("//input[@id='pass']"));

		txtEmailField.sendKeys("velmurugansiromr@gmail.com");
		txtPasswordField.sendKeys("Greens@123");

		WebElement btnLogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnLogin.click();
	}
	public static void main(String[] args) {
		Day3_U0304 facebookLogin = new Day3_U0304();
		facebookLogin.t0306_facebookLogin();
	}
}