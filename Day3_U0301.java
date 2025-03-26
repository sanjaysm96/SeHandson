package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0301 {

	public void t0301_LoginWithoutRememberme() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		WebElement txtUserName = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		txtUserName.sendKeys("greentechchennaiomr@gmail.com");

		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPassword.sendKeys("Greens@123");

		WebElement rememberMeCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		if (rememberMeCheckbox.isSelected()) {
			System.out.println("Remember Me checkbox is checked.");
		}else {
			System.out.println("Remember Me checkbox is unchecked.");
		}

		WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btnLogin.click();
	}

	public void t0302_LoginWitRememberme() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		WebElement txtUserName = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		txtUserName.sendKeys("greentechchennaiomr@gmail.com");

		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPassword.sendKeys("Greens@123");

		WebElement rememberMeCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		rememberMeCheckbox.click();

		WebElement btnLogin = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btnLogin.click();
	}
	public static void main(String[] args) {
		Day3_U0301 Login1 = new Day3_U0301();
		Login1.t0301_LoginWithoutRememberme();
		Login1.t0302_LoginWitRememberme();
	}
}
