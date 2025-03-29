package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0313 {

	public void t0315_YouTubeSignIn() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		//---not getting 1 of 1 forsignin btn in xpath
		WebElement btnSignIn = driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']"));
		btnSignIn.click();

		// Locate the email input field and enter the email ID
		WebElement txtEmail = driver.findElement(By.xpath("//input[@type='email']"));
		txtEmail.sendKeys("greenstechchennaiomr@gmail.com");

		// Locate Next button and Click
		WebElement btnNext = driver.findElement(By.xpath("//span[text()='Next']"));
		btnNext.click();
	}

	public static void main(String[] args) {
		Day3_U0313 youTubeSignIn = new Day3_U0313();
		youTubeSignIn.t0315_YouTubeSignIn();
	}
}
