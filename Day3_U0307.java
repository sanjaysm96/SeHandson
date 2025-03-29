package com.omrbranch.day3;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Day3_U0307 {

	    public void t0309_SearchBuses(){
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://www.redbus.in");
	        driver.manage().window().maximize();

	        //enter 'From' location
	        WebElement txtFromLocation = driver.findElement(By.xpath("//input[@id='src']"));
	        txtFromLocation.sendKeys("Bangalore");

	        //enter 'To' location
	        WebElement txtToLocation = driver.findElement(By.xpath("//input[@id='dest']"));
	        txtToLocation.sendKeys("Chennai");

	        //Select the current date
	        WebElement datePicker = driver.findElement(By.xpath("//span[@class='dateText']"));
	        datePicker.click();
	        WebElement currentDate = driver.findElement(By.xpath("....."));//unable to get current day
	        currentDate.click();

	        //Click the 'Search Buses' button
	        WebElement btnSearchBuses = driver.findElement(By.xpath("//button[@id='search_button']"));
	        btnSearchBuses.click();
	    }

	    public static void main(String[] args) throws InterruptedException {
	    	Day3_U0307 redbusSearch = new Day3_U0307();
	        redbusSearch.t0309_SearchBuses();
	    }
	}