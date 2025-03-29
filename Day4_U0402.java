package com.omrbranch.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_U0402 {
	public void t0402_DateAndTime() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		// Locate and print the date and time from the page
		WebElement txtDateTime = driver.findElement(By.xpath("//h2[@id='dtime']"));
		String DateTime = txtDateTime.getText(); // --getting text
        String DateTime1 = DateTime.replace("Register - ", "");// --removing 'Register -' using Sttring method replace

		System.out.println("Date And Time:"+ DateTime1);

		driver.quit();
	}

	public static void main(String[] args) {
		Day4_U0402 Info = new Day4_U0402();
		Info.t0402_DateAndTime();
	}
}
