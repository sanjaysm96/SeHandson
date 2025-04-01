package com.omrbranch.day14;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day14_U1401 {
	public void t1401_txtUnPwInvalid()  throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();

		// Open the website
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;

		// Enter username
		WebElement txtUsername = driver.findElement(By.xpath("//input[@id='email']"));
		txtUsername.sendKeys("94415208@omrbranch.com");

		// Enter password
		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='pass']"));
		txtPassword.sendKeys("9445201082");

		// Click login button
		WebElement btnLogin = driver.findElement(By.xpath("//button[text()='Login']"));
		btnLogin.click();

		Thread.sleep(2000);

		// Take screenshot and save it to a FILE (not just a folder)
		File invalidUnPwSS = ts.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File("C:\\Users\\sanja\\OneDrive\\Pictures\\Screenshots\\loginError2.png");
		FileUtils.copyFile(invalidUnPwSS, destinationFile);

		System.out.println("Screenshot1 saved: " + destinationFile.getAbsolutePath());

		// Close browser
		driver.quit();
	}
	public void t1402_takePara() throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();

		//taking SS a particular Element -> locating-SS-giving path-declaring
		WebElement txtPara = driver.findElement(By.xpath("//div[@class='page-wrapper']//p"));
		File txtParaSS = txtPara.getScreenshotAs(OutputType.FILE);
		File destinationFile1 = new File("C:\\Users\\sanja\\OneDrive\\Pictures\\Screenshots\\ssParagraph.png");
		FileUtils.copyFile(txtParaSS, destinationFile1);

		System.out.println("Screenshot2 saved: " + destinationFile1.getAbsolutePath());

		driver.quit();

	}
	public static void main(String[] args) throws IOException, InterruptedException {

		Day14_U1401 txtUNandPw = new Day14_U1401();
		txtUNandPw.t1401_txtUnPwInvalid();
		txtUNandPw.t1402_takePara();
	}
}
