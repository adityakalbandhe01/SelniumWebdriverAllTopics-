package com.example11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHardAssertions {
    public static void main(String[] args) {
         WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        String Actualpagetitle = driver.getTitle();
        String Expectedpagetitle = "Chroma Tech Academy";

        String ActualpageURL = driver.getCurrentUrl();
        String ExpectedpageURL = "https://chroma-tech-academy.mexil.it/static_page/";

        WebElement ActualInstructorname = driver.findElement(By.xpath("(//td[contains(text(),'John')])[1]"));
        String ExpectedInstructorname = "John";


        

    }
    
}
