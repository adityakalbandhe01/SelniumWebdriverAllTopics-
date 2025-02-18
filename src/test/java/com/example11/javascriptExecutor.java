package com.example11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);
        // Scroll dowm using Action class
        // Actions action = new Actions(driver);

        WebElement hoverbutton = driver.findElement(By.xpath("//a[normalize-space()='REST API']"));
        // action.moveToElement(hoverbutton, 0, 0).perform();

        // Scrolling down using Javascript executor
        // CAST the webdriver instance to JS executor

        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", hoverbutton);

        //Clicking on element using JS executor
        WebElement contactlink = driver.findElement(By.linkText("Latest News"));
        jsExecutor.executeScript("arguments[0].click();", contactlink);

        driver.quit();

    }

}
