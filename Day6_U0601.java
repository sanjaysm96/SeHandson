package com.omrbranch.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6_U0601 {
	public void t0601_signup() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		WebElement btnsignup = driver.findElement(By.xpath("//a[@class='signupanchor showSignup']"));
		btnsignup.click();

		Thread.sleep(5000);

		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name*']"));
		firstName.sendKeys("GreensTech");

		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name*']"));
		lastName.sendKeys("OMR");

		WebElement mobile = driver.findElement(By.xpath("//input[@id='signupMobile']"));
		mobile.sendKeys("9944152058");

		WebElement email = driver.findElement(By.xpath("//input[@id='signupEmail']"));
		email.sendKeys("greenstechchennaiomr@gmail.com");

		WebElement password = driver.findElement(By.xpath("//input[@name='signup_password']"));
		password.sendKeys("Greens@123");

		WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='signup_pwd']"));
		confirmpassword.sendKeys("Greens@123");

		WebElement date = driver.findElement(By.xpath("//select[@name='day']"));
		date.sendKeys("1");

		WebElement month = driver.findElement(By.xpath("//select[@name='month']"));
		month.sendKeys("March");

		WebElement year = driver.findElement(By.xpath("//select[@name='year']"));
		year.sendKeys("2000");

		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();

		WebElement hobby = driver.findElement(By.xpath("//label[text()='Photography']"));
		hobby.click();

		WebElement btnSignUp = driver.findElement(By.xpath("//button[@id='sub_button']"));
		btnSignUp.click(); //Not getting submitted bcoz of otp i think

		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		Day6_U0601 signUP = new Day6_U0601();
		signUP.t0601_signup();
	}
}
