package com.cydeo.tests.day05_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T1_Stale_element_reference {

    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/add_remove_elements/
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //3. Click to “Add Element” button

        WebElement addElementbutton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementbutton.click();

        //4. Verify “Delete” button is displayed after clicking.

        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        deleteButton.isDisplayed();
        System.out.println( "deleteButton.isDisplayed(): " + deleteButton.isDisplayed());


        //5. Click to “Delete” button.
        Thread.sleep(2000);
        deleteButton.click();

        //6. Verify “Delete” button is NOT displayed after clicking.
        //use ry/catch to handle and verify


        try {
            System.out.println("deleteButton.isDisplayed(), expecting false" + deleteButton.isDisplayed());
        }catch (StaleElementReferenceException e){
            System.out.println("-->StaleElements referenceException happened due to element being deleted from the page.");
            System.out.println("Which concludes our test case Passing ! ");
            System.out.println("deleteButton.isDisplayed = false" );

        }

        driver.close();




    }

}
