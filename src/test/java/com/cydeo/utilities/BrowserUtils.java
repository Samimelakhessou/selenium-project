package com.cydeo.utilities;


//This class will be storing only the utility methods that can be used across the project.

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Set;

public class BrowserUtils {

    // This method will accept int(in second) and execute Thread. sleep method for given duration

    public static void sleep (int second){
        second *=1000;
        try{
            Thread.sleep(second);

        }catch (InterruptedException e){

        }
    }


    public static void switchWindowAndVerify(WebDriver driver,String expectedInURL, String expectedInTitle){

        //Return and store all window handles in a Set.
        Set<String> allWindowHanldes = driver. getWindowHandles();

        for (String each : allWindowHanldes) {
            driver.switchTo().window(each);
            System.out.println("Current URL: " + driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInURL)){
                break;
            }

        }

        //5. Assert: Title contains “Etsy”
        String actualtitle = driver.getTitle();

        Assert.assertTrue(actualtitle.contains(expectedInTitle));


    }

    public static void verifyTitle (WebDriver driver , String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }
    public static void verifyTitleContains (WebDriver driver , String expectedInTitle) {
        Assert.assertTrue(driver.getTitle().contains(expectedInTitle));
    }

    public static void waitForInvisibilityof(WebElement target){

        //Create the object of 'WebDriverWait' class, and set up the constructor args

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //Using the custom utility method 'waitForInvisibilityOf' to wait loadingBar disappears
        wait.until(ExpectedConditions.invisibilityOf(target));

    }

}
