package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {

    //#1: Create constructor and initialize the 'driver' and 'object'

    public DynamicControlsPage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//button[.='Remove']" )
    public WebElement removeButton;


    @FindBy(id = "loading")
    public WebElement loadingBar;


    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkBox;


    @FindBy (id= "message")
    public WebElement itsGoneMessage;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement inputBox;

    @FindBy(xpath = "//button[.='Enable']")
    public WebElement enableButton;




}
