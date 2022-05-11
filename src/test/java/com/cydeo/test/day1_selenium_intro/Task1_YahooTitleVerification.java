package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {
        //1 Set up Web Driver Manager
        WebDriverManager.chromedriver().setup();

        //2 Created an instance of WebDriver
        WebDriver driver = new ChromeDriver();

        //3 Maximize a page
        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com/");

       // actualTitle comes from selenium
        String actualTitle  = driver.getTitle();

        // expected title comes from requirements
        String expectedTitle = "Yahoo";
        if(actualTitle.contains(expectedTitle )) {

            System.out.println("Title verification is passed! " );
        }else{
            System.out.println("Title verification is failed ");

        }
        driver .quit() ;
    }
}
