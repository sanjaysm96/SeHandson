package com.omrbranch.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_U1302 {

	public void t1303_printDetaisl() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor)driver;

		WebElement footerText = driver.findElement(By.xpath("//span[text()='For Joining Automation Course']"));
		js.executeScript("arguments[0].scrollIntoView(true);", footerText);
		System.out.println("Foote tilte:"+ footerText.getText());

		WebElement mobileNum = driver.findElement(By.xpath("//a[normalize-space()='99441 52058']"));
		System.out.println("Mobile Number: " + mobileNum.getText());

		// Scroll back to the top of the page
		js.executeScript("window.scrollTo(0, 0);");

		//paragraph that starts with "We undertake"
		WebElement paragraph = driver.findElement(By.xpath("//div[@class='page-wrapper']//p[1]"));
		System.out.println("Paragraph: " + paragraph.getText());

		driver.quit();

	}
	public static void main(String[] args) throws Exception {
		Day13_U1302 details = new Day13_U1302();
		details.t1303_printDetaisl();

	}
}
