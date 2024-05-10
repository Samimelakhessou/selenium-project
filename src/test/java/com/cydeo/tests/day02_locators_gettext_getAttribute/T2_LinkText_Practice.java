package com.cydeo.tests.day02_locators_gettext_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practice {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //3 - Click to A/B Testing from top of the list.

        driver.findElement(By.linkText("A/B Testing")).click();

        //4- Verify title is:
        // Expected: No A/B Test

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is passed!");
        }else {
            System.out.println("Title verification is failed!");
        }

        //5- Go back to home page by using the .back();
        driver.navigate().back();

        //6- Verify title equals :
        // Expected: Practice

        String expectedTitle2 = "Practice";
        String actualTitle2 = driver.getTitle();

        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("Title verification is passed!");

        }else {
            System.out.println("Title verification is failed!");
        }








    }
}
