package com.cydeo.tests.day07_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class T1_WindowsHandling {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){
        //1. Create new test and make setups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //2. Go to: https://www.amazon.com
        driver.get("https://www.amazon.com");
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.quit();
    }

    @Test
    public void window_handling_test(){
        //3. Copy/paste the lines from below into your class
        //These lines will simply open new tabs using something called JavascriptExecutor and get those pages.
        // We will learn JavascriptExecutor later as well.
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open

        //Return and store all window handles in a Set.
        Set<String> allWindowHanldes = driver. getWindowHandles();

        for (String each : allWindowHanldes) {
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains("etsy")){
                break;
            }

        }

        //5. Assert: Title contains “Etsy”
        //String actualtitle = driver.getTitle();
        //String expectedtitle = "Etsy";

        //Assert.assertTrue(actualtitle.contains(expectedtitle));

        BrowserUtils.verifyTitleContains(driver, "Etsy");





        //These lines will simply open new tabs using something called JavascriptExecutor
        //and get those pages. We will learn JavascriptExecutor later as well.
    }

    @Test
    public void window_handling_test2(){
        //3. Copy/paste the lines from below into your class
        //These lines will simply open new tabs using something called JavascriptExecutor and get those pages.
        // We will learn JavascriptExecutor later as well.
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open

        BrowserUtils.switchWindowAndVerify(driver, "etsy","Etsy");
    }
}
