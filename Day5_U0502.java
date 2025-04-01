package com.omrbranch.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_U0502 {
	public void t0502_EnterDetails() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		// Locate input fields
		WebElement firstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		WebElement lastName = driver.findElement(By.xpath("//input[@id='last_name']"));
		WebElement mobile = driver.findElement(By.xpath("//input[@id='phone']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement address = driver.findElement(By.xpath("//textarea[@class='form-control address']"));

		if (firstName.isEnabled() && lastName.isEnabled() && mobile.isEnabled() && email.isEnabled() && password.isEnabled() && address.isEnabled())
		{
			firstName.sendKeys("GreensTech");
			lastName.sendKeys("OMR");
			mobile.sendKeys("9944152058");
			email.sendKeys("greenstechchennaiomr@gmail.com");
			password.sendKeys("Greens@123");
			address.sendKeys("ICICI Bank Upstairs, Balamurugan Garden, Plot No.19, Landmark: Opposite to Sangeetha Hotel, Okkium, Chennai, Tamil Nadu 600097");

			System.out.println("firstname:"+ firstName.getDomProperty("value"));
			System.out.println("lastname:"+lastName.getDomProperty("value"));
			System.out.println("mobile: " + mobile.getDomProperty("value"));
			System.out.println("email: " + email.getDomProperty("value"));
			System.out.println("password: " + password.getDomProperty("value"));
			System.out.println("address: " + address.getDomProperty("value"));
		}
		else {
			System.out.println("Field not enabled");
		}

		driver.quit();
	}
	public static void main(String[] args) {
		Day5_U0502 FillAndExtration = new Day5_U0502();
		FillAndExtration.t0502_EnterDetails();
	}
}
