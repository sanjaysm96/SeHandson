package com.omrbranch.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_U0401 {
	public void t0401_NameAndNumber() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		WebElement txtPageHeading = driver.findElement(By.xpath("//h1[text()='For Joining Automation Course']"));
		String pageHeading = txtPageHeading.getText();
		System.out.println("Page heading: "+ pageHeading);

		//span[contains(text(),'Velmurugan')]
		WebElement txtNameAndNumber= driver.findElement(By.xpath("//span[contains(text(),'Velmurugan')]"));
		String nameAndNumber = txtNameAndNumber.getText();
		System.out.println("Name And Number:"+ nameAndNumber);

		driver.quit(); 
	}	
	public static void main(String[] args) {
		Day4_U0401 Info = new Day4_U0401();
		Info.t0401_NameAndNumber();
	}

}
