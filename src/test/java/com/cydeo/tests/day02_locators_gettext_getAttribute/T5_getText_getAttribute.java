package com.cydeo.tests.day02_locators_gettext_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {

    public static void main(String[] args) {
        //1- Open a Chrome browser
        // WebDriverManager.chromedriver().setup()

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");


        //3- Verify header text is as expected:
        //Expected: Registration form
           WebElement header =  driver.findElement(By.tagName("h2"));

           String expectedHeaderText = "Registration form";
           String actualHeaderText = header.getText();
           if(actualHeaderText.contains(expectedHeaderText)){
               System.out.println("Header verification is passed!");
           }else{
               System.out.println("Header verification is failed!");
           }



        //4- Locate “First name” input box
        WebElement firstNameInput = driver.findElement(By.className("form-control"));




        //5- Verify placeholder attribute’s value is as expected:
        // Expected: first name
        String expectedPlaceholderText = "first name";
        String actualPlaceholderText = firstNameInput.getAttribute("placeholder");
        if(actualPlaceholderText.contains(expectedPlaceholderText)){
            System.out.println("Placeholder verification is passed!");
        }else{
            System.out.println("Placeholder verification is failed!");
        }


    }
}





