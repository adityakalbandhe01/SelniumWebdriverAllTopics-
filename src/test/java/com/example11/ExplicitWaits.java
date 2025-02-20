package com.example11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaits {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        // Implementing Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // Implementing Explicit Waits

        WebElement Bootstrapdropdown = driver
                .findElement(By.xpath("//button[@class='btn btn-sm dropdown-toggle btn-outline-dark']"));
        // Object of Webdriver wait class

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        // Waiting for visibility of element
        wait.until(ExpectedConditions.visibilityOf(Bootstrapdropdown));
        Bootstrapdropdown.click();

        // Waiting for element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(Bootstrapdropdown));
        Bootstrapdropdown.click();

        driver.quit();

    }

}
