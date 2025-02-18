package com.example11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        // Initialize dropdown with web element
        WebElement dropDown = driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));

        // Create object of select class and passing Dropdown as an argument to Select() Constructor
        Select select = new Select(dropDown);

        // Selecting option by visible text
        select.selectByVisibleText("Option1");

        // You can add a wait time like this
        Thread.sleep(4000);

        // Selecting option by Index
        select.selectByIndex(3);
        Thread.sleep(4000);

        // Selecting option by value
        select.selectByValue("option2");

    }

}
