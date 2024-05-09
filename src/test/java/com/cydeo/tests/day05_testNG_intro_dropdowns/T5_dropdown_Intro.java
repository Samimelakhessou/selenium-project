package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T5_dropdown_Intro {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
        // 2. Go to https://practice.cydeo.com/dropdown
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void simple_dropdown_test(){

        //3. Verify “Simple dropdown” default selected value is correct
        //Locating the dropdown as web element
        WebElement simpleDropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
        //Creating Select object, and passing the dropdown web element into the constructor
        Select select = new Select(simpleDropdown);

        //Expected: “Please select an option”

        String expectedDefaultValue = "Please select an option";

        //Actual:

        String actualDefaultValue = select.getFirstSelectedOption().getText();

        //Do our assertion:
        Assert.assertEquals(actualDefaultValue, expectedDefaultValue);
        Assert.assertTrue(actualDefaultValue.equals(expectedDefaultValue));

        //4. Verify “State selection” default selected


        //Create Select object, and also the dropdown itself in my constructor
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String expectedDefaultstatevalue = "Select a State";
        String actualDefaultStateValue = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualDefaultStateValue,expectedDefaultstatevalue);



    }





}



