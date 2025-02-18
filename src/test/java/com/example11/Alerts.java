package com.example11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = " https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // Enter any text in the alert box
        WebElement Enternamefield = driver.findElement(By.xpath("//input[@id='name']"));
        Enternamefield.sendKeys("Aditya is testing");

        // // Clicking on Alert button with OK
        // WebElement AlertButton =
        // driver.findElement(By.xpath("//input[@id='alertbtn']"));
        // AlertButton.click();

        // Clicking on Cancel button
        WebElement Confirmbutton = driver.findElement(By.xpath("//input[@id='confirmbtn']"));
        Confirmbutton.click();
        Thread.sleep(2000);

        // Alert button command
        Alert alert = driver.switchTo().alert();
        // Accepting the alert or click on positive commands OK/Confirm etc
        // alert.accept();
        //Dismiss the command by clicking on cancel/dismiss negative command
        alert.dismiss();
        Thread.sleep(1500);

        driver.quit();
    }

}