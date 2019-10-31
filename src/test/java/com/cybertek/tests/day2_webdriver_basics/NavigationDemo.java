package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        //setting up the browser
        WebDriverManager.chromedriver().setup();

        //import class CMD+ENTER or ALT+enter or CONTROL +SPACE
        //selenium object
        WebDriver driver = new ChromeDriver();

        //navigate to website
        driver.get("https://www.google.com");

        Thread.sleep(5000);

        //another way of opening website
        driver.navigate().to("https://facebook.com");

        //goes to previous page
        driver.navigate().back();


        //goes forward after goes back
        driver.navigate().forward();

        //refresh the page
        driver.navigate().refresh();


    }
}



