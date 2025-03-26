package com.omrbranch.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0210 {
    public void t0210_facebookLogin() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();

        WebElement txtEmailField = driver.findElement(By.id("email"));
        WebElement txtPasswordField = driver.findElement(By.id("pass"));

        txtEmailField.sendKeys("greenstechchennaiomr@gmail.com");
        txtPasswordField.sendKeys("Greens@123");

        System.out.println("Email and Password entered successfully!");
    }

    public static void main(String[] args) {
        Day2_U0210 facebookLogin = new Day2_U0210();
        facebookLogin.t0210_facebookLogin();
    }
}
