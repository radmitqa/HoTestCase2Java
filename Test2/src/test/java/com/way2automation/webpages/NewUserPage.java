/**
 * NewUserPage.java
 * Redirected to page on which new user is added
 * Check email function, collect Row Number with new user
 * Author  Radovan Mitrovic
 * Version 1.0
 * Date 2019-May-24
 */


package com.way2automation.webpages;

import com.sun.xml.internal.ws.encoding.StringDataContentHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static junit.framework.TestCase.assertTrue;

public class NewUserPage {
    System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
    private WebDriver driver;

    //Email button
    @FindBy(linkText = "E-mail")
    private WebElement emailbutton;

    //Locate table and row
    @FindBy(xpath = "/html/body/table")
    public WebElement table;
    @FindBy(className = "smart-table-data-row ng-scope")
    public WebElement row;

    //Constructor
    public NewUserPage(WebDriver driver){
        this.driver=driver;

        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void clickEmailButton(){
        emailbutton.click();
        emailbutton.click();
    }

    public void checkEmail(){
        for(int i=0;i<=count;i++){       //loop
            String a=table
            if(a.contains("mail@email.mail"))
            {

                System.out.println("Contains email");
            }
            else
            {
                System.out.println("Test Fail - Does not contain added email!");
            }
        }
    }

    public String rowNumber(String value)
    {
        WebElement table =driver.findElement(By.id("tableId"));
        WebElement tbody=table.findElement(By.tagName("tbody"));
        List<WebElement> rows=tbody.findElements(By.tagName("tr"));
        ArrayList<String> ListOdIds=new ArrayList<>();
        String rowNumber="";
        for(int i=0;i<rows.size();i++)
        {
            WebElement row = tbody.findElement(By.xpath("//table[@id='table']/tbody/tr["+(i+1)+"]"));
            if(row.getText().trim().contains(value))
            {
                rowNumber=Integer.toString(i+1);
                break;
            }

        }

        return rowNumber;
        System.out.println("Test Pass - Email displayed in order in row number:" + rowNumber);
    }
}

}
/*
* End of file
*/