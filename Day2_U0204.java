package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0204 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		WebElement usernameField = driver.findElement(By.name("username"));
		WebElement passwordField = driver.findElement(By.name("password"));

		usernameField.sendKeys("velmurugansirgtomr");
		passwordField.sendKeys("Greens@123");

		System.out.println("Test Data Entered Successfully!");
	}

}