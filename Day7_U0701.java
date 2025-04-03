package com.omrbranch.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0701 {
	public void t0701_DragDropJavaSe4Elements() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

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
		
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		Day7_U0701 dragDropJavaSe4Elements = new Day7_U0701();
		dragDropJavaSe4Elements.t0701_DragDropJavaSe4Elements();
	}
}
