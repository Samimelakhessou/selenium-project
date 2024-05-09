package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {


@Test
    public void registration_form(){
    //1. Open browser
    //2. Go to website: https://practice.cydeo.com/registration_form

    //Driver.getDriver() --> will return "driver"
    Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

    //3. Enter first name
    WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
    inputFirstName.sendKeys("JANE");

    //4. Enter last name
    WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
    inputLastName.sendKeys("DOE");

    //5. Enter username
    WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
    inputUsername.sendKeys("janedoe123");


    //6. Enter email address
    WebElement inputAddress = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
    inputAddress.sendKeys("janedoe@example.com");


    //7. Enter password
    WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
    inputPassword.sendKeys("123456789");


    //8. Enter phone number
    WebElement inputNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
    inputNumber.sendKeys("911-911-0505");

    //9. Select a gender from radio buttons
    WebElement radioButtonFemale = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
    radioButtonFemale.click();

    //10.Enter date of birth
    WebElement inputDateBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
    inputDateBirth.sendKeys("11/22/1991");

    //11.Select Department/Office
    Select departmentDropdown = new Select(Driver.getDriver().findElement(By.name("department")));
    departmentDropdown.selectByVisibleText("Department of Engineering");

    //12.Select Job Title
    Select jobtitledropdown = new Select(Driver.getDriver().findElement(By.name("job_title")));
    jobtitledropdown.selectByVisibleText("SDET");

    //13.Select programming language from checkboxes
    WebElement javaCheckbox = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
    javaCheckbox.click();

    //14.Click to sign up button
    WebElement signUpButton = Driver.getDriver().findElement(By.id("wooden_spoon"));
    signUpButton.click();

    //15.Verify success message “You’ve successfully completed registration.” is
    //displayed.

    WebElement successMessage = Driver.getDriver().findElement(By.xpath("//div[@role='alert']"));
    Assert.assertTrue(successMessage.isDisplayed());

    //Driver.getDriver().quit(); ---> we don't use this method anymore. Because we want to assign the value back to null
    //So if we have another test, our code can continue executing

    Driver.closeDriver();

}

}
