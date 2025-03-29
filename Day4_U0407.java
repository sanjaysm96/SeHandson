package com.omrbranch.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_U0407 {

	public void t0407_AddressAndPhNo() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://traininginomr.co.in/");
		driver.manage().window().maximize();


		WebElement txtAdrsPhno = driver.findElement(By.xpath("//div[@data-id='440e57f']"));
		String txtAdPhno = txtAdrsPhno.getText();
		System.out.println(txtAdPhno);
		
		driver.quit();
	}
public static void main(String[] args) {
	
	Day4_U0407 txtAdPhno = new Day4_U0407();
	txtAdPhno.t0407_AddressAndPhNo();
}
}
