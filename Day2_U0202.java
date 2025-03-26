package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0202 {	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement txtFirstrName = driver.findElement(By.id("first_name"));
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		WebElement txtAddress = driver.findElement(By.className("address"));
		WebElement txtPhNo = driver.findElement(By.id("phone"));
		WebElement txtEmail = driver.findElement(By.id("email"));
		WebElement txtPassword = driver.findElement(By.id("password"));
		WebElement txtPasswordConfirmation = driver.findElement(By.id("confirm-password"));

		txtFirstrName.sendKeys("GreensTech");
		txtLastName.sendKeys("OMR");
		txtAddress.sendKeys("Icici Bank Upstairs, BM Garden,Plot no.19,Landmark: opp. to Sangeetha Hotel,Okkian,Chennai,TamilNadu 600097");
		txtPhNo.sendKeys("994152058");
		txtEmail.sendKeys("greenstechchennaiOMR@gmail.com");
		txtPassword.sendKeys("Greens@123");
		txtPasswordConfirmation.sendKeys("Greens@123");
	}

}