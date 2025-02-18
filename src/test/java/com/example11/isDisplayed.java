package com.example11;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
    private static final @Nullable Object ElementDisplayedExampleText = null;

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);
        // Scroll down to element using JS executor
        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].ScrollIntoView(true);", ElementDisplayedExampleText);

        WebElement Elementbutton = driver.findElement(By.xpath("//input[@id='displayed-text']"));

        // Verifying if the textbox is displayed
        boolean isTextboxDisplayed = Elementbutton.isDisplayed();
        System.out.println(isTextboxDisplayed);

    }

}
