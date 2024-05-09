package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP1_Etsy_Xpath_CSS {

    public static void main(String[] args) {

        //HWP #1: etsy Title Verification
        //1. Open Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2. Go to http://www.etsy.com
        driver.get("http://www.etsy.com");




        //3. Search for "wooden spoon"

        //Xpath Examples:

        //WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
        //WebElement searchBox = driver.findElement(By.xpath("//input[@data-id='search-query']"));
        //WebElement searchBox = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));



        //cssSelector locator
        // syntax #1 : tagName[attribute='value']
        // syntax #2 : for id: --> tag#idValue, for class: tag.classValue
        //WebElement searchBox = driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));
        WebElement searchBox = driver.findElement(By.cssSelector("input#global-enhancements-search-query"));



        searchBox.sendKeys("wooden spoon" + Keys.ENTER);




        //4.Verify title:
        //Expected: "Wooden spoon - Etsy"
        String expectedTitle = "Wooden spoon - Etsy";

        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED!");
        }

        driver.close();



    }
}
