package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();


        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com") ;

/*
        // navigate.to(URL)
        driver.navigate().to("https://google.com");


        //  driver.get(URL)
        driver.get("https://google.com");


        // navigate.back()
        driver.navigate().back();

        // navigate.forward()
        driver.navigate().forward();

        //navigate.refresh()
        driver.navigate().refresh();*/





















    }
}
