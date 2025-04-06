package com.omrbranch.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_U1303 {

	public void t1305_sendContact() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement section3 = driver.findElement(By.xpath("//h4[normalize-space()='Section 3']"));
		js.executeScript("arguments[0].scrollIntoView(true);",section3);

		WebElement clickField = driver.findElement(By.xpath("//h5[normalize-space()='Perform js click to enable contact field']"));
		js.executeScript("arguments[0].click();",clickField);

		WebElement contact = driver.findElement(By.xpath("//input[@id='inlineFormInputGroup']"));
		js.executeScript("arguments[0].value = '94451520578';", contact);
		
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		Day13_U1303 details = new Day13_U1303();
		details.t1305_sendContact();
	}
}