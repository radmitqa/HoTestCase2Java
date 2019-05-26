/**
 * HomePage.java file
 * Navigate to HomePage of test
 * http://www.way2automation.com/angularjs-protractor/webtables/ page
 * click Add User button
 * Author  Radovan Mitrovic
 * Version 1.0
 * Date 2019-May-24
 */


package com.way2automation.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//Define class
public class HomePage {
    System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
    private WebDriver driver;
    //Check header
    @FindBy(xpath = "/html/head/title")
    private WebElement heading;

    //Page URL
    private static String PAGE_URL="http://www.way2automation.com/angularjs-protractor/webtables/";

    //Locators

    //Add User Button
    @FindBy(how = How.LINK_TEXT, using = "Add User")
    private WebElement actAddUser;

    //Constructor
    public HomePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }
    //Click Add User button
    public void clickOnAddUser(){

        actAddUser.click();

    }

}
/*
*End of File
*/