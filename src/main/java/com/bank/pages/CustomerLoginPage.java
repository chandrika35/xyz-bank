package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {
    By customerNameDropDown = By.id("userSelect");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By yourNameText = By.xpath("//label[contains(text(),'Your Name :')]");

    public void selectCustomerName(String CustomerName){
        selectByVisibleTextFromDropDown(customerNameDropDown,CustomerName);
    }
    public void clickOnLogin(){
        clickOnElement(loginButton);
    }
    public String getYourNameText(){
        return getTextFromElement(yourNameText);
    }

}
