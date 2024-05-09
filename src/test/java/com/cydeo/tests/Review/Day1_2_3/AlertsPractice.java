package com.cydeo.tests.Review.Day1_2_3;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertsPractice {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        // 1. Open browser
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void alerts_test() throws InterruptedException {
        // 2. Go to website: https://practice.cydeo.com/javascript_alerts
        driver.get("https://practice.cydeo.com/javascript_alerts");

        // 3. Click to “Click for JS Prompt” button
        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();

        // 4. Send “hello” text to alert
        Alert alert = driver.switchTo().alert();

        // If req. asking us to get text of alert window
        System.out.println("alert.getText() = " + alert.getText());

        alert.sendKeys("hello");

        Thread.sleep(5000);

        // 5. Click to OK button from the alert
        alert.accept();

        // 6. Verify “You entered: hello” text is displayed.
        WebElement resultText = driver.findElement(By.id("result"));

        Assert.assertEquals(resultText.getText(),"You entered: hello");

    }
}