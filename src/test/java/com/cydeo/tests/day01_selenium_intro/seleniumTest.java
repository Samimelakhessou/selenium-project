package com.cydeo.tests.day01_selenium_intro;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {

    public static void main(String[] args) {

    //1- Create the instance of chrome driver

        WebDriver drive = new ChromeDriver();


    //2- Test if driver and browser are working as expected

    drive.get("https://www.google.com");



    }
}
