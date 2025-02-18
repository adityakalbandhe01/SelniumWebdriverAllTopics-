package com.example11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttons {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // selecting a unique radio buton
        // driver.findElement(By.xpath("//input[@value='radio1']")).click();
        // driver.findElement(By.xpath("//input[@value='radio2']")).click();
        // driver.findElement(By.xpath("//input[@value='radio3']")).click();

        //selecting a non unique radio button
        // driver.findElement(By.xpath("(//input[@name='radioButton'])[1]")).click(); 
        // Thread.sleep(2000);
        // driver.findElement(By.xpath("(//input[@name='radioButton'])[2]")).click(); 
        // driver.findElement(By.xpath("(//input[@name='radioButton'])[3]")).click(); 


    }
}
