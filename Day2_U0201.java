package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0201 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		WebElement txtPassword = driver.findElement(By.id("pass"));
		
		txtUserName.sendKeys("greenstechchennaiOMR@gmail.com");
		txtPassword.sendKeys("Greens@123");
		
		driver.quit();
		
	}

}
