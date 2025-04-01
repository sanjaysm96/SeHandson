package com.omrbranch.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_U0504 {
	public void t0504_Checkfield() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();

		//input[@id='inlineFormInputGroup']
		WebElement contactField = driver.findElement(By.xpath("//input[@id='inlineFormInputGroup']"));
		if (contactField.isEnabled()) {
			System.out.println(contactField.getDomProperty("value"));
		} else {
			System.out.println("Not Enabled");
		}
		driver.quit();
	}
	public static void main(String[] args) {
		Day5_U0504 contactfield = new Day5_U0504();
		contactfield.t0504_Checkfield();
	}
}
