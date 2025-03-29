package com.omrbranch.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_U0405 {

	public void t0405_FirstPara() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();


		WebElement txtPara = driver.findElement(By.xpath("//p[@class='course-desc']"));
		String txtFisrtPara = txtPara.getText();
		System.out.println("overview first para: " + txtFisrtPara);
		driver.quit();
	}
public static void main(String[] args) {
	
	Day4_U0405 firstParagraph = new Day4_U0405();
	firstParagraph.t0405_FirstPara();
}

}
