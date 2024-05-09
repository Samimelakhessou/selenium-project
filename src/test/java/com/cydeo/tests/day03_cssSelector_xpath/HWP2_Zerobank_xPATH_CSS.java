package com.cydeo.tests.day03_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP2_Zerobank_xPATH_CSS {
    public static void main(String[] args) {
        //HWP #2: Zero Bank header verification
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");


        //3. Verify header text
        // Expected: “Log in to ZeroBank”

        //XpathSolution
       // WebElement headerText = driver.findElement(By.xpath("//h3"));

        //cssSelectorSolution
        WebElement headerText = driver.findElement(By.cssSelector("h3"));

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = headerText.getText();

        if (actualHeaderText.contains(expectedHeaderText)){
            System.out.println("Header verification PASSED!");
        }else {
            System.out.println("Header verification FAILED!");
        }

        driver.close();




    }


}
