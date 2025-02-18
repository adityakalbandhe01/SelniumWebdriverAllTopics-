package com.example11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementS {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        // Retreiving number of links on webpage
        System.out.println(links.size());
        // printing text of all the links
        for (WebElement link : links) {

          //  String linkText = link.getText();
            System.out.println(link);
            
        }

        Thread.sleep(3000);
        driver.quit();
    }

}
