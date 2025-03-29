package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0308 {

	public void t0310_flipkartLogin() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		//find and click the 'Login' button
		WebElement btnLogin = driver.findElement(By.xpath("//a[text()='Login']"));
		btnLogin.click();

		//find and enter the mobile number
		WebElement txtMobileInput = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		txtMobileInput.sendKeys("9585559995"); //

		//click the 'Send OTP' button
		WebElement btnSendOtp = driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));
		btnSendOtp.click();//--ElementClickInterceptedException(so not working) 
	}

	public static void main(String[] args) {
		Day3_U0308 flipkartLogin = new Day3_U0308();
		flipkartLogin.t0310_flipkartLogin();
	}
}
