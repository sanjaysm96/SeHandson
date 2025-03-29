package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0312 {

	public void t0314_GoogleSearch() {
		WebDriver driver = new ChromeDriver();

		// Open Google website
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		// Locate the Google search bar and enter the search term
		WebElement txtSearchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		txtSearchBox.sendKeys("Greens Tech Chennai OMR Branch");

		//--InvalidSelectorException no working click
		WebElement btnSearchBox = driver.findElement(By.xpath("//input[@name='btnK'])[2]"));
		btnSearchBox.click();
	}
	public static void main(String[] args) {
		Day3_U0312 googleSearch = new Day3_U0312();
		googleSearch.t0314_GoogleSearch();

	}
}
