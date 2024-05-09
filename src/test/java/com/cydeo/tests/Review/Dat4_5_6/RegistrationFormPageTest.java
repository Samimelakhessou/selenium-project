package com.cydeo.tests.Review.Dat4_5_6;

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

public class RegistrationFormPageTest {

    WebDriver driver;


    @BeforeMethod
    public void setup(){
        // 1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // will run everytime when findElement/s method used
        // default it is 0
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 2. Go to https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
    }

    @Test
    public void registrationFormPageTitle(){
//        // 1. Open Chrome browser
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//
//        // will run everytime when findElement/s method used
//        // default it is 0
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // 2. Go to https://practice.cydeo.com/registration_form
//        driver.get("https://practice.cydeo.com/registration_form");

        // 3. Verify title is as expected:
        // Expected: "Registration Form"
//        String actualTitle = driver.getTitle();
//        String expectedTitle = "Registration Form";
//        Assert.assertEquals(actualTitle,expectedTitle);

        Assert.assertEquals(driver.getTitle(),"Registration Form","Title verification is failed!");

        //   Assert.assertTrue(driver.getTitle().equals("Registration Form"));
    }


    @Test
    public void registrationFormPageFillingOutTest(){
        // 1. Open Chrome browser
//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//
//        // will run everytime when findElement/s method used
//        // default it is 0
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
//        // 2. Go to https://practice.cydeo.com/registration_form
//        driver.get("https://practice.cydeo.com/registration_form");

        // 3. Enter First name: "John"
        WebElement firstName = driver.findElement(By.className("form-control"));
        firstName.sendKeys("John");


        // 4. Enter Last name: "Smith"
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Smith");


        // 5. Enter Username: "johnsmith123"
        WebElement username = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
        username.sendKeys("johnsmith123");


        // 6. Enter Email address: "john.smith@email.com"
        driver.findElement(By.cssSelector("input[placeholder='email@email.com']"));


        // 7. Enter password: "John1234"
        WebElement maleButton = driver.findElement(By.xpath("//input[@value='male']"));
        maleButton.click();

        Assert.assertTrue(maleButton.isSelected());


        // 8. Enter Phone number: "123-456-7890"


        // 9. Click to "Male" from Gender


        // 10. Enter Date of birth "01/28/1990"


        // 11. Select "Department of Engineering" from Department/Office dropdown
        Select selectDepartment = new Select(driver.findElement(By.xpath("//select[@name='department']")));
        System.out.println("selectDepartment.getFirstSelectedOption()" + selectDepartment.getFirstSelectedOption().getText());

        selectDepartment.selectByIndex(1);
        selectDepartment.selectByValue("DE");
        selectDepartment.selectByVisibleText("Department of Engineering");

        String actualOption = selectDepartment.getFirstSelectedOption().getText();
        String expectedOption = "Department of Engineering";

        Assert.assertEquals(actualOption, expectedOption, "Department of Engineering is not selected!");


        // 12. Select "SDET" from Job title dropdown

        Select selectJobTitle = new Select(driver.findElement(By.name("job_title")));

        selectJobTitle.selectByVisibleText("SDET");

        Assert.assertEquals(selectJobTitle.getFirstSelectedOption().getText(),"SDET");



        // 13. Click to "Java" from languages
        WebElement javaBtn = driver.findElement(By.id("inlineCheckbox2"));
        javaBtn.click();

        Assert.assertTrue(javaBtn.isSelected());



        // 14. Click to "Sign up" button


        // 15. Verify text displayed on page
        //     Expected: "Well done!"

    }

    @AfterMethod
    public void teardown(){
       // driver.quit();


    }
}