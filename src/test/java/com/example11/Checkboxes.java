package com.example11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
        driver.findElement(By.xpath("//input[@name='checkBoxOption2']")).click();
        driver.findElement(By.xpath("//input[@name='checkBoxOption3']")).click();

        
    }
    
}
