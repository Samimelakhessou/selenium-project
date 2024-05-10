package com.cydeo.tests.day01_selenium_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {


        // setup browser driver


        // Create instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        // Maximize browser window
        driver.manage().window().maximize();




        // Go to tesla.com
        driver.get("https://www.tesla.com");

        //use.getCurrentUrl method to print out current url
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());


        // get title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // Use navigate back() to go back
        driver.navigate().back();

        //Stop execution for 3 seconds
        Thread.sleep(1000);

        // use navigate forward() to go forward
        driver.navigate().forward();

        //Stop execution for 3 seconds
        Thread.sleep(1000);

        // User refreshes the page using navigate refresh();
        driver.navigate().refresh();

        //Stop execution for 3 seconds
        Thread.sleep(1000);

        //navigate to google.com using navigate (). to google.com
        driver.navigate().to("https://www.google.com");

        //use.getCurrentUrl method to print out current url
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // get title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        currentTitle= driver.getTitle();
        System.out.println("currentTitle2 = " + currentTitle);


        //closes only the browser window
        driver.close();


        // closes all the open browser windows
        //driver.quit();
























    }
}
