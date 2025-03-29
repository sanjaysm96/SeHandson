package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day3_U0309 {

	public void t0311_SnapDeal() {
		WebDriver driver = new ChromeDriver();

		// Open Snapdeal website
		driver.get("https://www.snapdeal.com");
		driver.manage().window().maximize();

		// Locate Search Bar and enter "Books"
		WebElement txtSearchBox = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
		txtSearchBox.sendKeys("Books");

		// Locate Search Button and click
		WebElement btnSearchButton = driver.findElement(By.xpath("(//button[@class='searchformButton col-xs-4 rippleGrey'])[1]"));
		btnSearchButton.click();
	}

	public static void main(String[] args) {

		Day3_U0309 snapDeal1 = new Day3_U0309();
		snapDeal1.t0311_SnapDeal();

	}
}
