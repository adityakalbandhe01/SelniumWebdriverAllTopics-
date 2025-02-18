package com.example11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brosweroption {
     public static void main(String[] args) {
        WebDriver driver  = new ChromeDriver();
       
        //maximize browser using maximize method 
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);
    }
}
 