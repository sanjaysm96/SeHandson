package com.omrbranch.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0704 {
	public void t0704_flipkart() throws Exception {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);
		
		WebElement fashion = driver.findElement(By.xpath("//div[@aria-label='Fashion']"));
		actions.moveToElement(fashion).perform();
		
		Thread.sleep(3000);
		WebElement kidsFashion = driver.findElement(By.xpath("//a[text()='Kids']"));
		actions.moveToElement(kidsFashion).perform();
		
		kidsFashion.click();
		
		WebElement mensTshirtPage = driver.findElement(By.xpath("//div[@class='DOjaWF gdgoEp']"));
		if (mensTshirtPage.isDisplayed()) {
			System.out.println("page title:"+driver.getTitle());
		} else {
			System.out.println("page title:"+driver.getTitle());
		}
}
	public static void main(String[] args) throws Exception {
		Day7_U0704 kids = new Day7_U0704();
		kids.t0704_flipkart();
	}
}