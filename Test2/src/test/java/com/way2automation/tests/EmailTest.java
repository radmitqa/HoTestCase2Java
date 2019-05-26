/**
 * Emailtest
 * Fill in test data
 * Author  Radovan Mitrovic
 * Version 1.0
 * Date 2019-May-24
 */

package com.way2automation.tests;

import com.way2automation.webpages.HomePage;
import com.way2automation.webpages.NewUserPage;
import com.way2automation.webpages.AddNewUser;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class EmailTest {
    System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
    WebDriver driver;

    @Before
    public void setup(){
        //use FF Driver
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void applyAsDeveloper() {
        //Create object of HomePage Class
        HomePage home = new HomePage(driver);
        home.clickOnAddUser();
    }

    //Create object of NewUserPage
    NewUserPage newuser= new NewUserPage(driver);

    //Check if page is opened
       Assert.assertTrue(newuser.isPageOpened());

    //Create object of AddNewUser
    AddNewUser addNewUser = new addNewUser(driver);

    //Check if page is opened
       Assert.assertTrue(AddNewUser.isPageOpened());

    //Fill up data
       addNewUser.setFirstname("fname");
       addNewUser.setLastname("lname");
       addNewUser.setUsername("username1");
       addNewUser.setPassword("pass1234");
       addNewUser.setCustomerAAA.click();
       addNewUser.setRole.sendKeys(Keys.ARROW_DOWN);
       addNewUser.setRole.sendKeys(Keys.ARROW_DOWN);
       addNewUser.setRole.sendKeys(Keys.TAB);
       addNewUser.setEmail("mail@email.mail");
       addNewUser.setCellphone("123456789");

    //Click on Save button
       newuser.clickonSave();

    @After
    public void close(){
        driver.close();
    }

}
/*
* End of file
*/