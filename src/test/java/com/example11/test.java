package com.example11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {
    
    public static void main(String[] args) {
//Using Chrome Browser 
     WebDriver chromeDriver = new ChromeDriver();
     chromeDriver.get("https://chroma.mexil.it/site/login");

//Using EDGE Browser 
       WebDriver edgeDriver = new EdgeDriver();
            edgeDriver.get("https://chroma.mexil.it/site/login");
    }
}
