package com.example11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deselect_Dropdown {
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String url = "https://mdbootstrap.com/docs/standard/extended/multiselect/";
        driver.get(url);
        Thread.sleep(4000);

        driver.findElement(By.xpath("//button[@class= 'btn btn-primary ms-1']")).click();
        Thread.sleep(4000);

        WebElement ClickDropdownoptions = driver
                .findElement(By.xpath("//input[@class= 'form-control select-input active']"));
        ClickDropdownoptions.click();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//div[@class='select-option'][2]")).click();
        Thread.sleep(2000);


        driver.findElement(By.xpath("//input[@class='form-check-input']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@class='form-check-input']")).click();

        driver.findElement(By.xpath("//div[@class='select-option'][2]")).click();
    


//driver.findElement(By.xpath("//*[@id=\"select-dropdown-container-650521\"]/div/div/div/div[2]/span")).click();
        //Thread.sleep(4000);

       // driver.findElement(By.xpath("//input[@class='form-check-input']")).click();


    }

}
