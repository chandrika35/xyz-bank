package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addCustomerTab = By.xpath("//button[normalize-space()='Add Customer']");
    By openAccount = By.xpath("//button[normalize-space()='Open Account']");

    public void clickOnAddCustomerTab(){
        clickOnElement(addCustomerTab);
    }
    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
}
