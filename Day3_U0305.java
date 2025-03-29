package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0305 {
	public void t0307_clearTrip() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();

		//--Asking to register thru otp(so no running)

		//chhosing trains
		WebElement btnTrainsLink = driver.findElement(By.xpath("//a[@title='Trains']"));
		btnTrainsLink.click();

		//From location
		WebElement txtFromField = driver.findElement(By.xpath("//input[@id='from_station']"));
		txtFromField.sendKeys("Mumbai");

		//To location
		WebElement txtToField = driver.findElement(By.xpath("//input[@id='to_station']"));
		txtToField.sendKeys("Chennai");

		// Click Search Trains button
		WebElement btnSearch = driver.findElement(By.xpath("//button[@id='trainFormButton']"));
		btnSearch.click();
	}
	public static void main(String[] args) {
		Day3_U0305 clearTrip = new Day3_U0305();
		clearTrip.t0307_clearTrip();
	}
}