package com.omrbranch.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_U0101 {

	public void t0101_firsttUrl() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		String title1 = driver.getTitle();
		System.out.println("Title of 1st page:" + title1);
		String currentUrl1 = driver.getCurrentUrl();
		System.out.println("Url of 1st page:" + currentUrl1);

		driver.quit();
	}
	public void t0102_secondUrl() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://traininginomr.co.in/");
		driver.manage().window().maximize();

		String title2 = driver.getTitle();
		System.out.println("Title of 2nd page:" + title2);
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println("Url of 2nd page:" + currentUrl2);

		driver.quit();
	}
	public void t0103_thirdUrl() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://greenstech.in/");
		driver.manage().window().maximize();

		String title3 = driver.getTitle();
		System.out.println("Title of 3rd page:" + title3);
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println("Url of 3rd page:" + currentUrl3);

		driver.quit();
	}
	public static void main(String[] args) {

		Day1_U0101 UrlDetails = new Day1_U0101();	
		UrlDetails.t0101_firsttUrl();
		UrlDetails.t0102_secondUrl();
		UrlDetails.t0103_thirdUrl();
		

	}

}
