package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T4_StaleElementReferenceException {

    public static void main(String[] args) {

          //1- Open a chrome browser
         //2- Go to: https://practice.cydeo.com/abtest
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.cydeo.com/abtest");


         //3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink =  driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("Before refresh: cydeo.isDisplayed(); " + cydeoLink.isDisplayed());


        //4- Refresh the page.
        driver.navigate().refresh();
        System.out.println("Refreshing the page ... ");


         //5- Verify it is displayed, again.
        cydeoLink =  driver.findElement(By.xpath("//a[.='CYDEO']"));
        System.out.println("After refresh: cydeoLink.isDisplayed()" + cydeoLink.isDisplayed());

        driver.close();


    }
}
