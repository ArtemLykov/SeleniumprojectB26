package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_navigation {

    public static void main(String[] args) throws InterruptedException {

        // 1- Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        driver .manage().window().maximize();

        driver.get("https://www.etsy.com");

        // navigate().to() method is for navigating to web Page
        // driver.navigate().to("https://www.etsy.com");


        // It is using for stopping code execution in application. we are giving time to application to see steps
        Thread.sleep(3000);

        // navigate().back() method is for navigating to back from web page
        driver.navigate().back();

        Thread.sleep(3000);

        // navigate().forward() method is for navigating to forward from web page
        driver.navigate().forward();

        Thread.sleep(3000);

        // navigate().refresh() method is for refreshing the page
        driver.navigate().refresh();

        // getting title of the current page
        System.out.println("Etsy page driver.getTitle() = " + driver.getTitle());

        // getting URL of the current page
        System.out.println("Etsy page driver.getCurrentUrl() = " + driver.getCurrentUrl());


        driver.get("https://www.tesla.com");

        System.out.println("Tesla page driver.getTitle() = " + driver.getTitle());

        System.out.println("Tesla page driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Thread.sleep(3000) ;

        driver.close();


    }
}
