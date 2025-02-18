package com.example11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleGetURL {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);

        //This is how we get the Title of current page 

        String actualTitle = driver.getTitle();
        System.out.println("TITLE OF THE PAGE IS: " + actualTitle);

        //This is how we get the URL of current page 
    

        String actualurl = driver.getCurrentUrl();
        System.out.println("title of current url of page is : " + actualurl);


    }

}
