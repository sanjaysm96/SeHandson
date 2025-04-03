package com.omrbranch.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0705 {

	public void t0705_meesho() throws Exception {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.meesho.com/");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		WebElement homeAndKitchen = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		actions.moveToElement(homeAndKitchen).perform();

		Thread.sleep(3000);
		WebElement allHomeDecor = driver.findElement(By.xpath("//p[normalize-space()='All Home Decor']"));
		actions.moveToElement(allHomeDecor).perform();
		allHomeDecor.click();

		WebElement decorPage = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]"));
		if (decorPage.isDisplayed()) {
			System.out.println("Decor page title:"+driver.getTitle());
		} else {
			System.out.println("page title:"+driver.getTitle());
		}
	}
	public static void main(String[] args) throws Exception {
		Day7_U0705 meesho = new Day7_U0705();
		meesho.t0705_meesho();
	}}