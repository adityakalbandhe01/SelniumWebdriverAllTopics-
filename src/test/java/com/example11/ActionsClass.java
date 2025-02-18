package com.example11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = " https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        Actions actions = new Actions(driver);

        // Scrolling down using action class
        WebElement hoverbutton = driver.findElement(By.xpath(" //button[@id='mousehover']"));
        // actions.moveToElement(hoverbutton, 0, 0).perform();

        //right click on the button using context method
        // actions.contextClick().perform();

        //right click on the button
        // actions.moveToElement(hoverbutton).contextClick().perform();

        //scrolling down to an element 
       WebElement iframebutton =  driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
       actions.moveToElement(hoverbutton).moveToElement(iframebutton, 0, 0).perform();

    }

}
