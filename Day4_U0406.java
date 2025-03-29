package com.omrbranch.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_U0406 {
	
	public void t0406_HeaderForJoining() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();


		WebElement txtHeader = driver.findElement(By.xpath("//a[@class='navbar-brand d-flex align-items-center']//div"));
		String txtHeader1 = txtHeader.getText();
		System.out.println("Header Text: " + txtHeader1);
		
		driver.quit();
	}
public static void main(String[] args) {
	
	Day4_U0406 txtHeader2 = new Day4_U0406();
	txtHeader2.t0406_HeaderForJoining();
}
}
