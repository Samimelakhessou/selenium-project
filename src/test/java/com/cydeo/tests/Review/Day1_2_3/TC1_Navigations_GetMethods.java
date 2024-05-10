package com.cydeo.tests.Review.Day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1_Navigations_GetMethods {

    public static void main(String[] args) throws InterruptedException {
        // 1. Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://practice.expandtesting.com/");

        driver.findElement(By.linkText("Automation Training")).click();

        // 4. Verify url contains "registry"
        if(driver.getCurrentUrl().contains("formations")){

            System.out.println("URL verification passed");
        }else {
            System.out.println("URL verification failed");
        }
        // 6. Navigate back, forward and refresh
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();

        //6Click on "Practice site"

        driver.findElement(By.xpath("//a[.='Practice Site']")).click();

        //7. Verify title is "Automation Testing Practice Website for UI and API"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Testing Practice Website for UI and API";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed!");
        }else
            System.out.println("Title verification is failed!");











        driver.close();







    }
}

