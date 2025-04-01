package com.omrbranch.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_U0501 {

	public void t0501_UnAndPw() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		WebElement txtUserName = driver.findElement(By.xpath("//input[@id='email']"));
		txtUserName.sendKeys("greenstechchennaiomr@gmail.com");

		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPassword.sendKeys("Greens@123");

		String strUNvalue = txtUserName.getDomProperty("value");
		System.out.println("username:"+strUNvalue);

		String strPWvalue = txtPassword.getDomProperty("value");
		System.out.println("password:"+strPWvalue);
		
		driver.quit();
	}
	public static void main(String[] args) {
		Day5_U0501 UnAndPWvalue = new Day5_U0501();
		UnAndPWvalue.t0501_UnAndPw();
	}
}

