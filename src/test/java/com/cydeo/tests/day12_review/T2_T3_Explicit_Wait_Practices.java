package com.cydeo.tests.day12_review;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2_T3_Explicit_Wait_Practices {
    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod(){

        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/dynamic_controls
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage  = new DynamicControlsPage();
    }



    @Test
    public void t2_remove_checkbxo_test (){

        //TC #2: Explicit wait practice


        //3- Click to “Remove” button

        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”

        //Create the object of 'WebDriverWait' class, and set up the constructor args

        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //Using the custom utility method 'waitForInvisibilityOf' to wait loadingBar disappears
        //wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));


        //Using the custom utility Method 'waitForInvisibilityOf' to wait loadingBar disappears
        BrowserUtils.waitForInvisibilityof(dynamicControlsPage.loadingBar);


        //5- Verify:
        //a. Checkbox is not displayed

       // Assert.assertTrue(!dynamicControlsPage.checkBox.isDisplayed());

        //assertFalse method is expecting a "false" boolean value to PASS the test.
        try {
            Assert.assertFalse(dynamicControlsPage.checkBox.isDisplayed());
        }catch (NoSuchElementException n ){
            //n.printStackTrace
            System.out.println("NoSuchElementException is thrown. It means that the Checkbox is not on the page.");
            Assert.assertTrue(true);

        }

        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.itsGoneMessage.isDisplayed());

        //NOTE: FOLLOW POM


    }

    @Test
    public void t3_enable_input_box_test (){

        //3- Click to “Enable” button
        //use the object to click to enable button
        dynamicControlsPage.enableButton.click();

        //4- Wait until “loading bar disappears”
        BrowserUtils.waitForInvisibilityof(dynamicControlsPage.loadingBar);


        //5- Verify:
        //a. Input box is enabled
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());

        //b. “It’s enabled!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.itsGoneMessage.isDisplayed());

        String actualMessageText = dynamicControlsPage.itsGoneMessage.getText();

        Assert.assertTrue(actualMessageText.equals("It's enabled!"));


    }

    @AfterMethod
    public void teardownMethod(){

        Driver.closeDriver();
    }
}
