package com.cydeo.tests.Review.Day1_2_3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class WindowsHandlePractice {
    WebDriver driver;
    // 1. Open browser

    @BeforeMethod
    public void setup(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
    @Test
    public void windowsHandle_test(){


        //    2. Go to website: https://demoqa.com/browser-windows
        driver.get("https://demoqa.com/browser-windows");

        String mainWindow = driver.getWindowHandle();

        //    3. Click on New Tab button
        driver.findElement(By.id("tabButton")).click();


        //    4. Click on New Window button
        driver.findElement(By.id("windowButton")).click();


        //    5. Click on New Window Message button
        driver.findElement(By.id("messageWindowButton")).click();


        //    6. Print out each window title
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String eachWindow : allWindowHandles) {
            driver.switchTo().window(eachWindow);

            System.out.println("driver.getTitle()" + driver.getTitle());
            System.out.printf("driver.getCurrentUrl()" + driver.getCurrentUrl());
            break;


        }

        // dod some action in main window
        driver.switchTo().window(mainWindow);




    }

}
