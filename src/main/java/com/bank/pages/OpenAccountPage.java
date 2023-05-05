package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By customerNameDropDown = By.id("userSelect");
    By currencyDropDown    = By.id("currency");
    By processButton  = By.xpath("//button[normalize-space()='Process']");

    public void  selectCustomerNameByDropDown(String CustomerName){
        selectByVisibleTextFromDropDown(customerNameDropDown,CustomerName);
    }
    public void selectCurrencyFromDropDown(String Currency){
        selectByVisibleTextFromDropDown(currencyDropDown,Currency);
    }
    public void clickOnProcessButton(){
        clickOnElement(processButton);
    }

    public String getTextFromAccountCreatedSuccessfully(){
        return getTextFromAlert();
    }
    public void clickOkOnAlert () {
        acceptAlert();
    }
}
