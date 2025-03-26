package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day2_U0203 {
		public static void main(String[] args) {
			// Set up WebDriver
			WebDriver driver = new ChromeDriver();

			//--ERROR IN GIVEN WEBSITE contact (so skipped)
				driver.get("https://www.traininginomr.co.in/contact/");
				driver.manage().window().maximize();

				// Locate form elements and enter test data
				WebElement nameField = driver.findElement(By.id("name"));
				WebElement phoneField = driver.findElement(By.id("phone"));
				WebElement emailField = driver.findElement(By.id("email"));
				WebElement messageField = driver.findElement(By.id("message"));

				// Enter values
				nameField.sendKeys("Greens");
				phoneField.sendKeys("9944152058");
				emailField.sendKeys("greenstechchennaiomr@gmail.com");
				messageField.sendKeys("Planning to start new Java Selenium course for getting IT job");
		}
}