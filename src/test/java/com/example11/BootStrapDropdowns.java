package com.example11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdowns {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://chroma-tech-academy.mexil.it/static_page/";
        driver.get(url);

        WebElement clickdropdown = driver
                .findElement(By.xpath("//button[@class='btn btn-sm dropdown-toggle btn-outline-dark']"));
        clickdropdown.click();
        Thread.sleep(2000);

        // WebElement option1 =
        // driver.findElement(By.xpath("//label[@class='dropdown-item'][1]"));
        // option1.click();

        // Good way unique way using java for selecting by option text directly
        // Added all the option in List
        List<WebElement> dropdownoptions = driver.findElements(By.xpath("//label[@class='dropdown-item']"));
        // Used for an web element for all elements
        for (WebElement option : dropdownoptions) {
            // we select an option from the all option
            if (option.getText().equals("Option 3"))  {
                // click on or select the option
                option.click();
            
                break;
                
            }

        }

    }

}
