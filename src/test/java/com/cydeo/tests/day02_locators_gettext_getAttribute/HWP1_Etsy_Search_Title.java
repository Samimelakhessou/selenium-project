package com.cydeo.tests.day02_locators_gettext_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP1_Etsy_Search_Title {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com");

        // Search for "wooden spoon"
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));

        searchBox.sendKeys("wooden spoon" + Keys.ENTER);




        // Verify title:
        // Expected: "Wooden spoon - Etsy"
        String expectedTitle = "Wooden spoon - Etsy";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is passed!");
        }else{
            System.out.println("Title verification is failed!");
        }

        driver.close();














    }
}
