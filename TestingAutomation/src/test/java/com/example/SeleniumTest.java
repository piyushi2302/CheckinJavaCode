package com.example;

import org.testng.annotations.Test;
import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class SeleniumTest {

    @Test
    public void testSeleniumForm() {

        WebDriver driver = new ChromeDriver();

        try {

            // Open Google Chrome
            driver.manage().window().maximize();

            // Open Selenium sample form
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            // Find the text box
            WebElement textbox = driver.findElement(By.name("my-text"));

            // Enter text
            textbox.sendKeys("Hello Selenium");

            // Click Submit button
            driver.findElement(By.cssSelector("button")).click();

            // Wait for the confirmation message
            WebDriverWait wait = new WebDriverWait(
                driver, Duration.ofSeconds(10)
            );

            WebElement message = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("message"))
            );

            // Verify the message
            Assert.assertEquals(message.getText(), "Received!");

            System.out.println("Selenium Test Passed!");

        } finally {

            // Close Google Chrome
            driver.quit();
        }
    }
}