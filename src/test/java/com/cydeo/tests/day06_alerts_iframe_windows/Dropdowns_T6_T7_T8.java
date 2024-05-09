package com.cydeo.tests.day06_alerts_iframe_windows;

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

public class Dropdowns_T6_T7_T8 {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //1. Open Chrome browser
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
    public void dropdown_task6(){

    //3. Select “December 1st, 1933” and verify it is selected.
    Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
    Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
    Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

    //Select year using : visible text

    yearDropdown.selectByVisibleText("1993");


    //Select month using : value attribute
    monthDropdown.selectByValue("11");


    //Select day using : index number
    dayDropdown.selectByIndex(0);



    //create expected values

    String expectedYear = "1993";
    String expectedMonth = "December";
    String expectedDay = "1";

    //getting actual values from browser

    String actualYear = yearDropdown.getFirstSelectedOption().getText();
    String actualMonth = monthDropdown.getFirstSelectedOption().getText();
    String actualDay = dayDropdown.getFirstSelectedOption().getText();

    //create assertions

    Assert.assertTrue(actualYear.equals(expectedYear));
    Assert.assertEquals(expectedMonth, actualMonth);
    Assert.assertEquals(expectedDay, actualDay);




    }


        @Test
        public void dropdown_task7() throws InterruptedException {
            //TC #7: Selecting state from State dropdown and verifying result

            //locate the dropdown and create select object
            Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));

            //Use all Select options. (visible text, value, index)
            //3. Select Illinois
            Thread.sleep(2000);
            stateDropdown.selectByVisibleText("Illinois");

            //4. Select Virginia
            Thread.sleep(2000);
            stateDropdown.selectByValue("VA");

            //5. Select California
            Thread.sleep(2000);
            stateDropdown.selectByIndex(5);

            //6. Verify final selected option is California.
            String expectedOptionText = "California";
            String actualOptionText = stateDropdown.getFirstSelectedOption().getText();

            //assertion
            Assert.assertEquals(actualOptionText, expectedOptionText, "STATE DROPDOWN VALUE IS NOT AS EXPECTED!");
        }

        @Test
        public void dropdown_task8() throws InterruptedException {
            //3. Click to non-select dropdown
            WebElement websitDropdown = driver.findElement(By.linkText("Dropdown link"));
            Thread.sleep(1000);
            websitDropdown.click();
            Thread.sleep(1000);

            //4. Select Facebook from dropdown
            WebElement facebookLink = driver.findElement(By.linkText("Facebook"));
            Thread.sleep(1000);
            facebookLink.click();
            Thread.sleep(1000);


            //5. Verify title is “Facebook - Log In or Sign Up”
            String expectedTitle = "Facebook - log in or sign up";
            String actualTitle = driver.getTitle();

            //assertion
            Assert.assertEquals(actualTitle, expectedTitle, "TITLE IS NOT AS EXPECTED!");



        }

    }






