package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {

    public static void main(String[] args) {


        //1- Open a Chrome browser
       // WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com
        driver.get("https://login1.nextbasecrm.com");

        // 3- Enter incorrect username: “incorrect”

        WebElement inputUsername = driver.findElement(By.className("login-inp"));
        inputUsername.sendKeys("incorrect");







        //  4- Enter incorrect password: “incorrect”

        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");





        //  5- Click to login button.
        driver.findElement(By.className("login-btn")).click();









        //  6- Verify error message text is as expected:
        // Expected: Incorrect login or password
        String expectedErrorText = "Incorrect login or password";
        String actualErrorText = driver.findElement(By.className("errortext")).getText();
        if(actualErrorText.contains(expectedErrorText)){
            System.out.println("Error message verification is passed!");
        }else{
            System.out.println("Error message verification is failed!");
        }


         driver.close();





    }


}
//  TC #1: NextBaseCRM, locators and getText() practice
// 1- Open a Chrome browser
//2- Go to: https://login1.nextbasecrm.com
// 3- Enter incorrect username: “incorrect”
//  4- Enter incorrect password: “incorrect”
//  5- Click to login button.
//  6- Verify error message text is as expected:
// Expected: Incorrect login or password