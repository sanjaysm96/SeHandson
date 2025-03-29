package com.omrbranch.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0306 {

	public void t0308_Navigate_Click_Links() {

		WebDriver driver = new ChromeDriver();
        
        driver.get("https://greenstech.in/selenium-course-content.html");
        driver.manage().window().maximize();

        //Locate and click on the "Interview Questions" link
        WebElement txtInterviewQuestions = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
        txtInterviewQuestions.click();

        //Locate and click on the "TCS Interview Questions" link
        WebElement txtTcsInterviewQuestions = driver.findElement(By.xpath("....."));//--NOT GETTING 1 OF 1 2 same ts present
        txtTcsInterviewQuestions.click();
	}
    public static void main(String[] args) {
    	Day3_U0306 interviewQuestions = new Day3_U0306();
    	interviewQuestions.t0308_Navigate_Click_Links();
    }
}
