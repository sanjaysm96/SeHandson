package com.amazonpractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Iphones {


	public static void main(String[] args) throws IOException, InterruptedException {
		// Set up WebDriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			driver.manage().window().maximize();

			// Wait for the search box and enter "iPhone"
			WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("twotabsearchtextbox")));
			Thread.sleep(3000); 
			searchBox.sendKeys("iPhone");
			searchBox.sendKeys(Keys.ENTER);

			// Wait for search results to load
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']")));


			// Locate iPhone names and prices
			List<WebElement> productNames = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='listitem']//span[contains(text(),'iPhone')]")));
			List<WebElement> productPrices = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[@class='a-price-whole']")));

			// Create Excel file
			Workbook workbook = new XSSFWorkbook();
			Sheet sheet = workbook.createSheet("Amazon iPhone Prices");

			// Create header row
			Row headerRow = sheet.createRow(0);
			headerRow.createCell(0).setCellValue("iPhone Model");
			headerRow.createCell(1).setCellValue("Price (USD)");

			// Store first 10 iPhone models in Excel
			for (int i = 0; i < 10 && i < productNames.size() && i < productPrices.size(); i++) {
				Row row = sheet.createRow(i + 1);
				row.createCell(0).setCellValue(productNames.get(i).getText());
				row.createCell(1).setCellValue(productPrices.get(i).getText());
			}

			// Save Excel file
			FileOutputStream fileOut = new FileOutputStream("Amazon_iPhone_Prices.xlsx");
			workbook.write(fileOut);
			fileOut.close();
			workbook.close();

			System.out.println("Data saved to Excel successfully!");

		} finally {
			// Close the browser
			driver.quit();

		}
	}}
