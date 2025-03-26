package com.omrbranch.day2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0205 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();

		//got NoSuchElementException,by refering online found shld try by switching frame as it could be under ifarme tag, it worked.


		// Switch to the login iframe
		driver.switchTo().frame(0);

		WebElement customerIdField = driver.findElement(By.name("fldLoginUserId"));

		customerIdField.sendKeys("greensomrbranch");

		System.out.println("Customer ID entered successfully!");   
	}
}