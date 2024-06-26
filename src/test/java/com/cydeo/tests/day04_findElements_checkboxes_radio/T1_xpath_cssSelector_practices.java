package com.cydeo.tests.day04_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practices {

    public static void main(String[] args) {



    // TC #1: XPATH and cssSelector Practices
    //1. Open Chrome browser

    WebDriver driver = WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();

    //2. Go to https://practice.cydeo.com/forgot_password
    driver.get("https://practice.cydeo.com/forgot_password");

    //3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
    //a. “Home” link
    // Locate "Home" link, using cssSelector, Syntax #1, class attribute value
        //    tagName[attribute='value']
        //WebElement homeLink_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));


        //Syntax #1
        //          tagName.classValue
        //WebElement homeLink_ex2 = driver.findElement(By.cssSelector("a.nav-link"));


        //     Locate "Home" link, using cssSelector, Syntax #1, href attribute value
        WebElement homeLink_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        //b. “Forgot password” header c. “E-mail” text
        // Locate header, using xpath, using text of h2

        //WebElement password = driver.findElement(By.xpath(" h2[.='Forgot Password']"));

        // Locate header, using cssSelector, locate parent element and move down to h2
        //Syntax #1
        WebElement password2 = driver.findElement(By.cssSelector("div[class='example']>h2"));

        // Locate header, using cssSelector, locate parent element and move down to h2
        //Syntax #2
        WebElement password3 = driver.findElement(By.cssSelector("div.example >h2"));


       //c. "E-mail"text
        // locate the 'email' label using xpath
        WebElement emailLabel_ex1 = driver.findElement(By.xpath("//label[@for='email']"));
        WebElement emailLabel_ex2 = driver.findElement(By.xpath("//label[.='E-mail']"));


        //d. E-mail input box
        // locate the 'email' input box label using xpath

        WebElement emailInput_ex1 = driver.findElement(By.xpath("//input[@name='email']"));

        // locate the 'email' input box using xpath contains method
        //tagName[contains(@attribute, 'value')]
        WebElement emailInput_ex2 = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]"));

        //e. “Retrieve password” button
        WebElement RetrievePassword_ex1 = driver.findElement(By.xpath("//button[@id='form_submit']"));

        // f.“Powered by Cydeo text
        WebElement PoweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        //4. Verify all web elements are displayed.
        System.out.println("homeLink_ex3.isDisplayed()" + homeLink_ex3.isDisplayed());
        System.out.println("password2.isDisplayed()" + password2.isDisplayed());
        System.out.println("emailLabel_ex1.isDisplayed()" + emailLabel_ex1.isDisplayed());
        System.out.println("RetrievePassword_ex1.isDisplayed()" + RetrievePassword_ex1.isDisplayed());
        System.out.println("PoweredByCydeoText.isDisplayed()" + PoweredByCydeoText.isDisplayed());
        System.out.println("homeLink_ex3.isEnabled()" + homeLink_ex3.isEnabled());
        System.out.println("password2.isEnabled()" + password2.isEnabled());
        System.out.println("emailLabel_ex1.isEnabled()" + emailLabel_ex1.isEnabled());





        // First solve the task with using cssSelector only. Try to create 2 different cssSelector if possible
    // Then solve the task using XPATH only. Try to create 2 different XPATH locator if possible




        driver.close();


}
}