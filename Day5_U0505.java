package com.omrbranch.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_U0505 {

	public void t0505_CheckBox() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		WebElement chkboxRememberMe = driver.findElement(By.xpath("//input[@type='checkbox']"));

		if (chkboxRememberMe.isSelected()) {
			System.out.println("selected");
		} else {
			System.out.println("Not Selected");
		}
		driver.quit();
	}
	public static void main(String[] args) {
		Day5_U0505 checkbox = new Day5_U0505();
		checkbox.t0505_CheckBox();
	}
}
