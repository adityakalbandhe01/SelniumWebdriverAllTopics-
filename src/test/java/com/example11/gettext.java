package com.example11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma.mexil.it/site/login";

        driver.get(url);

        // By xpath
        driver.findElement(By.xpath("//input[@id='form-username']")).sendKeys("general@teacher.com");

        // By Css
        driver.findElement(By.cssSelector("[id='form-password']")).sendKeys("123456");

       WebElement Signinbutton =  driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
      // Signinbutton.getText();
       System.out.println("This is the text: " + Signinbutton.getText());

      WebElement Forgotpasswordlink = driver.findElement(By.xpath("//a[@class='forgot']"));
      System.out.println("Text of forgot passoword is: " + Forgotpasswordlink.getText());

    }

}
