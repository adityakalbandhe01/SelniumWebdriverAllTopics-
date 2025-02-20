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

        WebElement ElementDisplayedExampleText = driver
                .findElement(By.xpath("//legend[normalize-space()='Element Displayed Example']"));

        // // Scroll down to element using JS executor
        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", ElementDisplayedExampleText);

        WebElement Hideshowexampletextbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        // // Hideshowexampletextbox.click();

        // // Verifying if the textbox is displayed
        boolean isTextboxDisplayed = Hideshowexampletextbox.isDisplayed();
        System.out.println(isTextboxDisplayed);

        // Clicking on Hide button
        WebElement Hidebutton = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
        Hidebutton.click();

        // Verifying again if the textbox is displayed
        System.out.println(Hideshowexampletextbox.isDisplayed());

        Thread.sleep(2000);

        // clicking on Show button
        WebElement Showbutton = driver.findElement(By.xpath("//input[@id='show-textbox']"));
        Showbutton.click();

        // Verifying if the textbox is displayed
        System.out.println(Hideshowexampletextbox.isDisplayed());

        Thread.sleep(2000);
        driver.quit();

    }

}
