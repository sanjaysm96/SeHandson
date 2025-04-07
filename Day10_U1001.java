package com.omrbranch.day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10_U1001 {

	public void t1001_DobCheck() {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();

		//click btnSignUp = 
		driver.findElement(By.xpath("//a[@class='signupanchor showSignup']")).click();

		WebElement day = driver.findElement(By.xpath("//select[@name='day']"));
		Select s = new Select(day);
		s.selectByIndex(2);

		WebElement month = driver.findElement(By.xpath("//select[@name='month']"));
		Select s1 = new Select(month);
		s1.selectByValue("March");

		WebElement year = driver.findElement(By.xpath("//select[@name='year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1990");

		driver.quit();
	}

	public void t1002_getMonths() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//click btnSignUp
		driver.findElement(By.xpath("//a[@class='signupanchor showSignup']")).click();

		WebElement allMonth = driver.findElement(By.xpath("//select[@name='month']"));
		Select s4 = new Select(allMonth);

		List<WebElement> months = s4.getOptions();
		for (WebElement All_Months : months) {
			String Months_in_order = All_Months.getText();
			System.out.println(Months_in_order);
		}
		driver.quit();
	}
	public static void main(String[] args) {
		Day10_U1001 DobCheck = new Day10_U1001();
		//DobCheck.t1001_DobCheck();
		DobCheck.t1002_getMonths();
	}
}
