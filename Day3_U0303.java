package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0303 {

	public void t0305_searchAmazonProduct() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		//--ASKIGNG ENTER CAPTCHA

		// find search bar and enter iPhone
		WebElement txtSearchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtSearchBox.sendKeys("iPhone");

		// find search button and click
		WebElement txtSearchButton = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		txtSearchButton.click();
	}

	public static void main(String[] args) {
		Day3_U0303 amazonTest = new Day3_U0303();
		amazonTest.t0305_searchAmazonProduct();
	}
}
