package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {
    By firstName   = By.xpath("//input[@placeholder='First Name']");
    By lastName    = By.xpath("//input[@placeholder='Last Name']");
    By postCode    = By.xpath("//input[@placeholder='Post Code']");
    By addCustomerButton = By.xpath("//button[@type='submit']");

    public void enterFirstNameField(String FirstName){
        sendTextToElement(firstName,FirstName);
    }
    public void enterLastName(String LastName){
        sendTextToElement(lastName,LastName);
    }
    public void enterPostCode(String PostCode){
        sendTextToElement(postCode,PostCode);
    }
    public void clickAddCustomerButton(){
        clickOnElement(addCustomerButton);
    }
    public String getTextFromCustomerAddPopUP(){
        return getTextFromAlert();
    }
    public void clickOKOnAlert () {
        acceptAlert();
    }


}
