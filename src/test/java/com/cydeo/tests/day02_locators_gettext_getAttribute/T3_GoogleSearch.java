package com.cydeo.tests.day02_locators_gettext_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        //3- Write "apple" in search box

        WebElement googleSearchBox = driver.findElement(By.name("q"));

         googleSearchBox.sendKeys("apple" + Keys.ENTER);


        // 5- Verify title:
        // Expected : Title should start with "apple" word

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is passed!");
        }else {
            System.out.println("Title verification is failed!");
        }








    }
}
