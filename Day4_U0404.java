package com.omrbranch.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_U0404 {
	public void t0404_ExtractSectionTitle() {
		// Set up ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open the Selenium Training page and maximize the window
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

		// Locate the title of Section 1 using XPath
		WebElement section1Title = driver.findElement(By.xpath("//h4[text()='Section 1']"));

		// Extract and print the title text of Section 1
		String sectionTitle = section1Title.getText();
		System.out.println("Title: " + sectionTitle);

		// Close the browser
		driver.quit();
	}

	public static void main(String[] args) {
		Day4_U0404 Info = new Day4_U0404();
		Info.t0404_ExtractSectionTitle();
	}
}
