package com.omrbranch.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0703 {
	public void t0703_primeLogin() throws Exception {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		actions.moveToElement(prime).perform();

		Thread.sleep(2000);
		WebElement imgbtnJoinPrime = driver.findElement(By.xpath("//img[@id='multiasins-img-link']"));
		imgbtnJoinPrime.click();

		WebElement detailsPage = driver.findElement(By.xpath("//div[@id='primeDetailPage']"));

		if (detailsPage.isDisplayed()) {
			System.out.println(driver.getTitle());
		} else {
			System.out.println("Signup Page");
		}
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		Day7_U0703 prime = new Day7_U0703();
		prime.t0703_primeLogin();
	}
}
