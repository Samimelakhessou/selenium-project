package com.cydeo.tests.day09_review_javafaker_driverUtil;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class T1_Bing_Search {

    WebDriver driver;
    @BeforeMethod
    public void setupMethod() {
        //1- Open a chrome browser

        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //2- Go to: https://google.com

        driver.get(ConfigurationReader.getProperty("googleURL"));

    }
    @Test
    public void google_search_test(){
        //3- Write “apple” in search box
        //locate the search box
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@title='Search']"));
        searchBox.sendKeys(ConfigurationReader.getProperty("searchValue") + Keys.ENTER);

        //4- Verify title:
        //Expected: apple - Google Search

        String actualTitle = driver.getTitle();
        String expectedTitle = ConfigurationReader.getProperty("searchValue") + " - Google Search";

        Assert.assertEquals(actualTitle, expectedTitle);


    }


}
