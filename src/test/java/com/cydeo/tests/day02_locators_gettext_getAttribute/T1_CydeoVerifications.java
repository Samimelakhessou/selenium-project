package com.cydeo.tests.day02_locators_gettext_getAttribute;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {

    public static void main(String[] args) {


        //TC #1:Cydeo practice tool verifications
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com
        driver.navigate().to("https://practice.cydeo.com");

        //3.Verify URL contains
        //Expected: cydeo
        String expectedInURL = "cydeo";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains(expectedInURL)) {
            System.out.println("URL verification passed");
        } else {
            System.out.println("URL verification failed");
        }
        //4. Verify title.
        //Expected : Practice

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification passed");
        } else{
            System.out.println("Title verification failed ");
        }

        if (driver.getTitle().equals("Practice")){

            System.out.println("Title verification passed");
        }


        driver.close();





    }
}
