package com.cydeo.tests.day03_cssSelector_xpath;


import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_Locators_getText_getAttribute {

    public static void main(String[] args) {


        //1- Open a Chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer
        String expectedlabeltext = "Remember me on this computer";
        String actuallabeltext = driver.findElement(By.className("login-item-checkbox-label")).getText();

        if(actuallabeltext.equals(expectedlabeltext)){
            System.out.println("Label verification is passed!");
        }else{
            System.out.println("Label verification is failed!");
        }


        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?
        String  expectedforgotpasswordtext = "Forgot your password?";

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String actualforgotpasswordtext = forgotPasswordLink.getText();

        if(actualforgotpasswordtext.equalsIgnoreCase(expectedforgotpasswordtext)){
            System.out.println("Forgot password verification is passed!");
        }else{
            System.out.println("Forgot password verification is failed!");
        }


        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPasswordLink.getAttribute("href");

        if(actualInHref.contains(expectedInHref)){
            System.out.println("Href passed");
        }else {
            System.out.println("href failed");
        }


        //PS: Inspect and decide which locator you should be using to locate web elements.

    }
}



