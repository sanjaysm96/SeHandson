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
import org.openqa.selenium.interactions.Actions;

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

	public void t1403_SSofSuccessMsg() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

		TakesScreenshot ts1 = (TakesScreenshot) driver;
		Actions action = new Actions(driver);

		//java class
		WebElement frmElementString = driver.findElement(By.xpath("//a[text()=' String ']"));
		WebElement toElementClassJ = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		action.dragAndDrop(frmElementString, toElementClassJ).build().perform();

		//java interface
		WebElement frmElementList = driver.findElement(By.xpath("//a[text()=' List ']"));
		WebElement toElementInterfaceJ = driver.findElement(By.xpath("//ol[@id='java-interface']//li[@class='placeholder']"));
		action.dragAndDrop(frmElementList, toElementInterfaceJ).build().perform();

		//Se4 class
		WebElement frmElementActions = driver.findElement(By.xpath("//a[text()=' Actions ']"));
		WebElement toElementClassSe4 = driver.findElement(By.xpath("//ol[@id='selenium-class']//li[@class='placeholder']"));
		action.dragAndDrop(frmElementActions, toElementClassSe4).build().perform();

		//Se4 interface
		WebElement frmElementWebdriver = driver.findElement(By.xpath("//a[text()=' Webdriver ']"));
		WebElement toElementInterfaceSe4 = driver.findElement(By.xpath("//ol[@id='selenium-interface']//li[@class='placeholder']"));
		action.dragAndDrop(frmElementWebdriver, toElementInterfaceSe4).build().perform();

		WebElement successMsg = driver.findElement(By.xpath("//a[normalize-space()='Succesfully Matched!']"));

		if (successMsg.isDisplayed()) {
			System.out.println("Matched Successfully");
		}
		File successMsgSS = ts1.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\sanja\\OneDrive\\Pictures\\Screenshots\\successMsg.png");
		FileUtils.copyFile(successMsgSS, destFile);
		driver.quit();
	}
	public void t1404_registrationSS() throws Exception {

		WebDriver driver = new ChromeDriver();  
		Actions action = new Actions(driver);
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		// Open the website
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Greens");
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Tech");
		driver.findElement(By.xpath("//textarea[@class='form-control address']")).sendKeys("3/178, Second Floor, Rajiv Gandhi Salai, Mettukuppam, Chennai, Thoraipakkam, Tamil Nadu 600097");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("velmurugan@omrbranch.com");
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9944152058");

		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Hockey']")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Movies']")).click();

		// Select languages without using Select class
		driver.findElement(By.xpath("//textarea[@placeholder='Select language']")).click();
		driver.findElement(By.xpath("//li[contains(text(),'English')]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Italian')]")).click();

		//skill from suggestion
		WebElement javaOption = driver.findElement(By.xpath("//option[@value='Java']"));
		action.moveToElement(javaOption).click().perform();
		driver.findElement(By.xpath("//select[@id='country-list']")).sendKeys("India");

		//Dob from suggestion
		driver.findElement(By.xpath("//select[@id='days']")).sendKeys("1");
		driver.findElement(By.xpath("//select[@id='months']")).sendKeys("January");
		driver.findElement(By.xpath("//select[@id='dob']")).sendKeys("2000");

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Greens@123");
		driver.findElement(By.xpath("//input[@id='confirm-password']")).sendKeys("Greens@123");

		// Submit the form
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

		// Verify successful registration
		WebElement successMsg = driver.findElement(By.xpath("//h6[normalize-space()='Form submitted succesfully !!']") );
		if (successMsg.isDisplayed()) {
			System.out.println("Form submitted successfully!");
		} else {
			System.out.println("Form submission failed.");
		}
		File formSubmitSS = ts2.getScreenshotAs(OutputType.FILE);
		File destinfile = new File("C:\\Users\\sanja\\OneDrive\\Pictures\\Screenshots\\formSubmitSS.png");
		FileUtils.copyFile(formSubmitSS, destinfile);

		driver.quit();
	}

	public void t1405_pageSS() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();

		TakesScreenshot ts3 = (TakesScreenshot)driver;
		File sspage = ts3.getScreenshotAs(OutputType.FILE);
		File destfileFile = new File("C:\\Users\\sanja\\OneDrive\\Pictures\\Screenshots\\justSS.png");
		FileUtils.copyFile(sspage, destfileFile);
		driver.quit();

	}
	public static void main(String[] args) throws Exception {

		Day14_U1401 SS = new Day14_U1401();
		//SS.t1401_txtUnPwInvalid();
		//SS.t1402_takePara();
		//SS.t1403_SSofSuccessMsg();
		//SS.t1404_registrationSS();
		SS.t1405_pageSS();
	}
}
