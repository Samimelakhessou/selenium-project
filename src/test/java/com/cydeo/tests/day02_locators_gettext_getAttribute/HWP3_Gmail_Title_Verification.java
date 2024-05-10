package com.cydeo.tests.day02_locators_gettext_getAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HWP3_Gmail_Title_Verification {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        WebElement gmaillink = driver.findElement(By.linkText("Gmail"));

        gmaillink.click();

        String expectedGmailTitle = "Gmail";
        String actualGmailTitle = driver.getTitle();

        if(actualGmailTitle.contains(expectedGmailTitle)){
            System.out.println("Gmail title verification is passed!");
        }else{
            System.out.println("Gmail title verification is failed!");
        }

        driver.navigate().back();


        //6- Verify title equals:
        //Expected: Google

        String expectedGmailTitle2 = "Google";
        String actualGmailTitle2 = driver.getTitle();
        if(actualGmailTitle2.contains(expectedGmailTitle2)){
            System.out.println("Gmail title verification is passed!");
        }else{
            System.out.println("Gmail title verification is failed!");
        }

        driver.close();





















    }
}
             //TC #3: Back and forth navigation
             //1- Open a Chrome browser
            //2- Go to: https://google.com
            //3- Click to Gmail from top right.
            //Locating the Gmail link using "xpath" locator
            //tagName[@attribute='value']
            //WebElement gmailLink = driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/&ogbl']"));
            //Using the text of the web element with XPATH locator
            //tagName[text()='textValue'] --> //tagName[.='textValue']
            //WebElement gmailLink = driver.findElement(By.xpath("//a[text()='Gmail']"));
            //WebElement gmailLink = driver.findElement(By.xpath("//a[.='Gmail']"));

            //Locating the Gmail link using "cssSelector" locator
            // --> tagName[attribute='value'
            //Click to the gmail link
            //4- Verify title contains:
            //Expected: Gmail
            //System.out.println("actualGmailTitle = " + actualGmailTitle);

            //5- Go back to Google by using the .back();

            //6- Verify title equals:
            //Expected: Google
