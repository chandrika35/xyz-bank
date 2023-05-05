package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By logoutButton = By.xpath("//button[normalize-space()='Logout']");
    By depositButton = By.xpath("//button[normalize-space()='Deposit']");
    By withdrawalButton = By.xpath("//button[normalize-space()='Withdrawl']");
    By depositAmount = By.xpath("//input[@placeholder='amount']");
    By depositAfterAmount = By.xpath("//button[@type='submit']");
    By depositMessage = By.xpath("//span[@ng-show='message']");
    By withdrawTab   = By.xpath("//button[normalize-space()='Withdrawl']");
    By withdrawAmount = By.xpath("//input[@placeholder='amount']");
    By withdrawAfterAmount = By.xpath("//button[normalize-space()='Withdraw']");
    By withdrawMessage =By.xpath("//span[@ng-show='message']");
    By transactions = By.xpath("//button[normalize-space()='Transactions']");
    By back = By.xpath("//button[normalize-space()='Back']");
    public String getLogoutText(){
        return getTextFromElement(logoutButton);
    }
    public void clickOnLogout(){
        clickOnElement(logoutButton);
    }
    public void clickOnDeposit(){
        clickOnElement(depositButton);
    }
    public void clickOnWithdrawButton(){
        clickOnElement(withdrawalButton);
    }
    public void sendAmountToDepositBox(String inputAmount){
        sendTextToElement(depositAmount,inputAmount);
    }
    public void clickOnDepositAfterAmount(){
        clickOnElement(depositAfterAmount);
    }
    public String getTextFromDepositMessage(){
        return getTextFromElement(depositMessage);
    }
    public void clickOnWithdrawTab(){
        clickOnElement(withdrawTab);
    }
    public void sendAmountToWithdrawBox(String inputAmount){
        sendTextToElement(withdrawAmount,inputAmount);
    }
    public void clickOnWithdrawAfterAmount() {
        clickOnElement(withdrawAfterAmount);
    }
    public String getWithdrawMessage() {
        return getTextFromElement(withdrawMessage);
    }
    public void clickOnTransactions() {
        clickOnElement(transactions);
    }

    public void clickOnBack() {
        clickOnElement(back);
    }

}
