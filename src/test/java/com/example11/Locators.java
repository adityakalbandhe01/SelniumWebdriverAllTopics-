package com.example11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";
        driver.get(url);

        ////Locating using ID locator/method
        WebElement userNametextbox = driver.findElement(By.id("form-username"));
        userNametextbox.sendKeys("general@teacher.com");
        ///WebElement userpassword = driver.findElement(By.id("form-password"));
        ///userpassword.sendKeys("123456");

        ////Locating using Name Locator/method
        // WebElement Passwordtextbox = driver.findElement(By.name("password"));
        // Passwordtextbox.sendKeys("123456");

        ////Locating using ClassName locator/method
        /// ClassName attribute having space will not work 
        // WebElement Passwordbox = driver.findElement(By.className("form-password
        // form-control"));
        // Passwordbox.sendKeys("123456");

        ////Locating using TagName Locator
        /// there are multiple input elements so selenium cant find the particular 
        ///driver.findElement(By.tagName("input")).sendKeys("123456")

        ///Locating using LinkText locator/method
        // driver.findElement(By.linkText("Forgot Password?")).click();

        ///Locating using Partial LinkText Locator/method
        // driver.findElement(By.partialLinkText("Forgot Passwor")).click();

        ///Locating using CSS Selectors 
         ///#attributeValueofID 
        // driver.findElement(By.cssSelector("#form-password")).sendKeys("123456");

        /// [attribute = 'attributevalue']
        // driver.findElement(By.cssSelector("[class='forgot']")).click();

        ///Locating using Xpath Selector/method fULL/ABOSULTE XPATH
        // driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div[2]/form/div[2]/input")).sendKeys("123456");

        ///Locating using Relative xpath method 1 attribute
        driver.findElement(By.xpath("//input[@class='form-password form-control']")).sendKeys("123456");

        ///Locating using Relative xpath method 2 contains text
        driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();

    }
}
