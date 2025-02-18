package com.example11;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = " https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        //getting handle of the main window/Unique handle for each new window
        String mainWindowHandle = driver.getWindowHandle();
        // System.out.println(mainWindowHandle);

        WebElement Opentabbutton = driver.findElement(By.xpath("//a[@id='opentab']"));
        Opentabbutton.click();

        // Setting a string to all window/tabs for selecting the correct new tab
        Set<String> allWindows = driver.getWindowHandles();
        for (String nextwindow : allWindows) {
            driver.switchTo().window(nextwindow);
        }

        Thread.sleep(3000);
        // Selecting a feature or clicking on link on new tab
        WebElement EnrollLink = driver.findElement(By.linkText("Enroll Now"));
        EnrollLink.click();
        // Switching back to main window.
        driver.switchTo().window(mainWindowHandle);


    }

}
