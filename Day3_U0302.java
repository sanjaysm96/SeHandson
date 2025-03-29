package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0302 {

	public void t0303_Locate_Click_ChkBox_Rdobtn() {
		WebDriver driver = new ChromeDriver();

		driver .get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver .manage().window().maximize();

		WebElement rdoBtnMale = driver.findElement(By.xpath("//input[@id='male']"));
		rdoBtnMale.click();

		WebElement chkBoxCricket = driver.findElement(By.xpath("//input[@id='checkbox-cricket']"));
		chkBoxCricket.click();
		WebElement chkBoxMovie = driver.findElement(By.xpath("//input[@id='checkbox-movie']"));
		chkBoxMovie.click();
	}
	public void t0304_Locate_Click_ChkBox_Rdobtn_Refresh() {
		WebDriver driver = new ChromeDriver();

		driver .get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver .manage().window().maximize();

		WebElement rdoBtnMale = driver.findElement(By.xpath("//input[@id='male']"));
		rdoBtnMale.click();

		WebElement chkBoxCricket = driver.findElement(By.xpath("//input[@id='checkbox-cricket']"));
		chkBoxCricket.click();
		WebElement chkBoxMovie = driver.findElement(By.xpath("//input[@id='checkbox-movie']"));
		chkBoxMovie.click();

		WebElement btnRefresh = driver.findElement(By.xpath("//button[@type='reset']"));
		btnRefresh.click();	
	}
	public static void main(String[] args) {
		Day3_U0302 selectAndRefresh = new Day3_U0302();
		selectAndRefresh.t0303_Locate_Click_ChkBox_Rdobtn();
		selectAndRefresh.t0304_Locate_Click_ChkBox_Rdobtn_Refresh();
	}

}
