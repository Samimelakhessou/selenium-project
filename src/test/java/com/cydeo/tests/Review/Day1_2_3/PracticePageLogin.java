package com.cydeo.tests.Review.Day1_2_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticePageLogin {

    public static void main(String[] args) {
        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2. Go to https://practice.cydeo.com/login
        driver.get("https://practice.cydeo.com/login");


        // 3. Enter username: "tomsmith"
       WebElement username =  driver.findElement(By.name("username"));
       username.sendKeys("tomsmith");



        // 4. Enter password: "SuperSecretPassword"

        WebElement password = driver.findElement(By.name("password")); // css:input[name='password']
        password.sendKeys("SuperSecretPassword");


        // 5. Click to Login button

        driver.findElement(By.id("wooden_spoon")).click();


        // 6. Verify text displayed on page
        //    Expected: "You logged into a secure area!"

        WebElement resulttext = driver.findElement(By.xpath("//div[@class='flash success']"));

        String actualText = resulttext.getText();
        String expectedText = "You logged into a secure area!";

        if (actualText.contains(expectedText)){
            System.out.println("Text verification is passed!");
        }else
            System.out.println("Text verification is failed!");


        // 7. Close the browser
        driver.close();






    }
}
