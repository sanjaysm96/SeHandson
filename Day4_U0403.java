package com.omrbranch.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_U0403 {
	public void t0403_ExtractParagraphs() {
		// Set up ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open the Java Training page and maximize the window
		driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement txtExtractParagraphs= driver.findElement(By.xpath("//p[(contains(text(),'We undertake'))]"));
		String extractParagraphs = txtExtractParagraphs.getText();
		System.out.println("Para: "+ extractParagraphs);

		// Close the browser
		driver.quit();
	}

	public static void main(String[] args) {
		Day4_U0403 Info = new Day4_U0403();
		Info.t0403_ExtractParagraphs();
	}
}
