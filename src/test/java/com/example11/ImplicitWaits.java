package com.example11;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //// Implicit wait
        // Implicit wait is a global wait that is applied to all the elements in the script.    
        // It is defined once and is applicable throughout the script.
        // Implicit wait is defined using the below syntax:
        // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15, 0));

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        driver.quit();

    }
    
}
