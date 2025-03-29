package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0311 {
	public void t0313_Swiggy() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.swiggy.com");
		driver.manage().window().maximize();

		// Locate field and enter Chennai
		WebElement txtEnterLocation = driver.findElement(By.xpath("//input[@id='location']"));
		txtEnterLocation.sendKeys("Chennai");

		//--locators correct but getting no such element exception i.e not getting clicked
		WebElement select1stSuggestion = driver.findElement(By.xpath("//span[text()='Chennai, Tamil Nadu, India']"));
		select1stSuggestion.click();

		WebElement btnRestaurantName = driver.findElement(By.xpath("//div[@class='sc-aXZVg iGFOtL']"));
		btnRestaurantName.click();

		//search bar in the restaurant section
		WebElement txtSearchBox = driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']"));
		txtSearchBox.sendKeys("Domino’s Pizza");

		// Click on the first restaurant from the search result
		WebElement select1stRestaurant = driver.findElement(By.xpath("((//div[(text()='Restaurant')])[1]"));
		select1stRestaurant.click();

	}

	public static void main(String[] args) {

		Day3_U0311 swiggy = new Day3_U0311();
		swiggy.t0313_Swiggy();
	}
}
