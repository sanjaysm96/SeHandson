package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0310 {
	public void t0312_Myntra() {
WebDriver driver = new ChromeDriver();
        
        //--UNABLE TO INSPECT PAGE

        driver.get("https://www.myntra.com/register");
        driver.manage().window().maximize();

        // Locate Mobile Number input field and enter a number
        WebElement mobileInput = driver.findElement(By.xpath("...."));
        mobileInput.sendKeys("9876543210"); // Replace with valid mobile number

        // Locate and click the "Send OTP" button
        WebElement otpButton = driver.findElement(By.xpath("....."));
        otpButton.click();
	}
    public static void main(String[] args) {
        
    	Day3_U0310 obj = new Day3_U0310();
    	obj.t0312_Myntra();
    	
    }
}