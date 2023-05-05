package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManagerLogin = By.xpath("//button[normalize-space()='Bank Manager Login']");
    By customerLogin    =By.xpath("//button[normalize-space()='Customer Login']");



    public void clickOnBankManagerLoginButton(){
        clickOnElement(bankManagerLogin);
    }
    public void clickOnCustomerLogin(){
        clickOnElement(customerLogin);

    }

}
