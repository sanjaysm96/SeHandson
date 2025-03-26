package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0207 {
	public void t0207_iciciSearch() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();

		// Ad Popup or alert blocking after closing it manually we can see
		
		WebElement txtSearchBox = driver.findElement(By.xpath("//input[@id='search-chatInput']"));
		txtSearchBox.sendKeys("Education Loan");
	}

	public static void main(String[] args) {
		Day2_U0207 searchBoxText = new Day2_U0207();
		searchBoxText.t0207_iciciSearch();

		System.out.println("Search keyword entered successfully!");
	}
}

