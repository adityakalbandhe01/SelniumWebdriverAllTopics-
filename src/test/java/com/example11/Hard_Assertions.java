package com.example11;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Hard_Assertions {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        String Actualpagetitle = driver.getTitle();
        String Expectedpagetitle = "Chroma Tech Academy";

        // Assert.assertEquals(Actualpagetitle, Expectedpagetitle, "--Verifying title of
        // page--"); // Hard Assertion
        // System.out.println("Testing");

        boolean dopagetitlematch = Actualpagetitle.contentEquals(Expectedpagetitle);


        Assert.assertTrue(dopagetitlematch, "--Verifying title of page using AssertTrue--"); // Hard Assertion


        driver.quit();
    }

}
