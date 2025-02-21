package com.example11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Soft_Assertions {
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

        // Create and object of SoftAssert class
        SoftAssert softassert = new SoftAssert();

        // Perform Assertion using SoftAssert
        // Page Title Assertion

        softassert.assertEquals(Actualpagetitle, Expectedpagetitle, "--Verifying title of page using SoftAssert--");

        // Page Url Assertion
        softassert.assertEquals(ActualpageURL, ExpectedpageURL, "--Verifying URL of page using SoftAssert--");

        // Instructor Name Assertion
        softassert.assertEquals(ActualInstructorname.getText(), ExpectedInstructorname,
                "--Verifying Instructor name using SoftAssert--");
       
        // Perform all the assertions
        softassert.assertAll();
       
                driver.quit();
    }

}
