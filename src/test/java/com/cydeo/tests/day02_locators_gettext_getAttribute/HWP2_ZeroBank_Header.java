package com.cydeo.tests.day02_locators_gettext_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP2_ZeroBank_Header {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        driver.get("http://zero.webappsecurity.com/login.html");


        //Verify header text
        WebElement headerText = driver.findElement(By.tagName("h3"));


        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();
        if(actualHeaderText.contains(expectedHeaderText)){
            System.out.println("Header verification is passed!");
        }else{
            System.out.println("Header verification is failed!");
        }











    }
}
