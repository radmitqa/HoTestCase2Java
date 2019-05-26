/**
 * AddNewUser.java popup form
 * Locate form elements, define actions
 * Author  Radovan Mitrovic
 * Version 1.0
 * Date 2019-May-24
 */

package com.way2automation.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUser {
    System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
    private final WebDriver driver;
    @FindBy(className="modal bg-scope")
    private WebElement addNewUserData;

    @FindBy(xpath = "/html/body/div[4]/div[2]/form/table/tbody/tr[1]/td[2]/input")
    private WebElement firstname;

    @FindBy(xpath = "/html/body/div[4]/div[2]/form/table/tbody/tr[2]/td[2]/input")
    private WebElement lastname;

    @FindBy(xpath = "//html/body/div[4]/div[2]/form/table/tbody/tr[3]/td[2]/input")
    private WebElement username;

    @FindBy(xpath = "/html/body/div[4]/div[2]/form/table/tbody/tr[4]/td[2]/input")
    private WebElement password;

    @FindBy(xpath = "/html/body/div[4]/div[2]/form/table/tbody/tr[5]/td[2]/label[1]")
    private WebElement customerAAA;

    @FindBy(xpath = "/html/body/div[4]/div[2]/form/table/tbody/tr[6]/td[2]/select")
    private WebElement role;

    @FindBy(xpath = "/html/body/div[4]/div[2]/form/table/tbody/tr[7]/td[2]/input")
    private WebElement email;

    @FindBy(xpath = "/html/body/div[4]/div[2]/form/table/tbody/tr[8]/td[2]/input")
    private WebElement cellphone;

    @FindBy(xpath = "/html/body/div[4]/div[3]/button[2]")
    private WebElement savebutton;


    //Constructor
    public AddNewUser(WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }
    //Actions on form elements
    public void setFirstname(String lastname){
        firstname.clear();
        firstname.sendKeys(lastname);
    }
    public void setLastname(String lastname){
        firstname.clear();
        firstname.sendKeys(lastname);
    }

    public void setUsername(String username){
        firstname.clear();
        firstname.sendKeys(username);
    }

    public void setPassword(String password){
        firstname.clear();
        firstname.sendKeys(password);
    }

    public void setCustomerAAA(String customerAAA){
        firstname.clear();
        firstname.sendKeys(customerAAA);
    }

    public void setRole(String role){
        firstname.clear();
        firstname.sendKeys(role);
    }

    public void setEmail(String email){
        firstname.clear();
        firstname.sendKeys(email);
    }

    public void setCellphone(String cellphone){
        firstname.clear();
        firstname.sendKeys(cellphone);
    }

    public void clickOnSave(){
        savebutton.click();
    }
    public boolean isPageOpened(){
        //Assertion
        return heading.getText().toString().contains("Protractor practice website - WebTables");
    }
}

/*
* End of file
*/