package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully(){
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.clickAddCustomerButton();
        addCustomerPage.enterFirstNameField("jignesh");
        addCustomerPage.enterLastName("patel");
        addCustomerPage.enterPostCode("HA61Sy");
        addCustomerPage.clickAddCustomerButton();
        Assert.assertTrue(addCustomerPage.getTextFromCustomerAddPopUP().contains("Customer added successfully"), "customer added successfully message not displayed");
        addCustomerPage.clickOKOnAlert();
    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){
        homePage.clickOnBankManagerLoginButton();
        bankManagerLoginPage.clickOnOpenAccount();
        openAccountPage.selectCustomerNameByDropDown("Ron Weasly");
        openAccountPage.selectCurrencyFromDropDown("Pound");
        openAccountPage.clickOnProcessButton();
        Assert.assertTrue(openAccountPage.getTextFromAccountCreatedSuccessfully().contains("Account created successfully"),"Message not displayed");
        openAccountPage.clickOkOnAlert();

    }
    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
        homePage.clickOnCustomerLogin();
        customerLoginPage.selectCustomerName("Ron Weasly");
        customerLoginPage.clickOnLogin();
        accountPage.clickOnLogout();
        Assert.assertTrue(customerLoginPage.getYourNameText().contains("Your Name "), "Your Name not displayed");
    }

    @Test
    public void customerShouldDepositMoneySuccessfully(){
        homePage.clickOnCustomerLogin();
        customerLoginPage.selectCustomerName("Ron Weasly");
        customerLoginPage.clickOnLogin();
        accountPage.clickOnDeposit();
        accountPage.sendAmountToDepositBox("100");
        accountPage.clickOnDepositAfterAmount();
        Assert.assertEquals(accountPage.getTextFromDepositMessage(),"Deposit Successful","Deposit successful message not displayed");
    }
    @Test
    public void customerShouldWithdrawMoneySuccessfully(){
        homePage.clickOnCustomerLogin();
        customerLoginPage.selectCustomerName("Ron Weasly");
        customerLoginPage.clickOnLogin();
        accountPage.clickOnDeposit();
        accountPage.sendAmountToDepositBox("100");
        accountPage.clickOnDepositAfterAmount();
        accountPage.clickOnTransactions();
        accountPage.clickOnBack();
        accountPage.clickOnWithdrawButton();
        accountPage.sendAmountToWithdrawBox("50");
        accountPage.clickOnWithdrawAfterAmount();
        Assert.assertEquals(accountPage.getWithdrawMessage() ,"Transaction successful", "Transaction Successful message not displayed");


    }

}
