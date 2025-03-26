package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0206 {
	public void t0206_googleSearch(){
		WebDriver driver = new ChromeDriver();

		driver .get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement txtSearchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		txtSearchBox.sendKeys("Greens TEch Chennai Omr");	
	}
	public static void main(String[] args) {
		Day2_U0206 searchBoxText = new Day2_U0206();
		searchBoxText.t0206_googleSearch();

		System.out.println("Entered");
	}
}
