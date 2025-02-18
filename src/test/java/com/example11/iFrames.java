package com.example11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class iFrames {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        /// Moving to a element near the Iframe to see properly
        Actions actions = new Actions(driver);
        WebElement RESTapi = driver.findElement(By.xpath("//a[normalize-space()='REST API']"));
        actions.moveToElement(RESTapi).perform();

        /// Locating frame with web element
        // WebElement frame =
        // driver.findElement(By.xpath("//iframe[@id='courses-iframe']"));
        /// switch to the frame using webelement
        // driver.switchTo().frame(frame);

        ///Switch to the frame by index 
    /// here entering 0 because webpage has only 1 frame so its index will be 0 
        // driver.switchTo().frame(0);

        ///Switch to the frame using Name or ID
        driver.switchTo().frame("iframe-name");

        // Click on a menu in iFrame
        WebElement Menubutton = driver.findElement(By.xpath("//i[@class='ti ti-menu']"));
        Menubutton.click();

        ///switch to main page/exit from iframes    using defaultContent method 
        driver.switchTo().defaultContent();
        RESTapi.click();

        Thread.sleep(2000);
        driver.quit();
    }

}
