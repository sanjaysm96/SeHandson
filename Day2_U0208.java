package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0208 {
	public void t0208_redBusSearch() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		// Locate & enter "From" location
		WebElement txtFromLocation = driver.findElement(By.id("src"));
		txtFromLocation.sendKeys("Bangalore");

		// Locate & enter "To" location
		WebElement txtToLocation = driver.findElement(By.id("dest"));
		txtToLocation.sendKeys("Chennai");

		System.out.println("Entered successfully!");
	}

	public static void main(String[] args) {
		Day2_U0208 redBusSearch = new Day2_U0208();
		redBusSearch.t0208_redBusSearch();
	}
}
