package com.automation.pages;

import com.automation.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());

    public MyAccountPage() {
        PageFactory.initElements(driver,this);
    }
    @CacheLookup
    @FindBy(xpath="//input[@id='email_create']")
    WebElement emailForcreateanAccount;
    @CacheLookup
    @FindBy(xpath=" //input[@id='email']")
    WebElement emailAddress;
    @CacheLookup
    @FindBy(xpath=" //input[@id='passwd']")
    WebElement password;
    @CacheLookup
    @FindBy(xpath="//span[normalize-space()='Sign in']")
    WebElement signIn;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement clickOnCreateanAccount;

    public void createAnAccountWithRandomUserName(String text){
        int random = (int) (Math.random() * 10000);
        sendTextToElement(emailForcreateanAccount, text + random + "@domain.co.uk");
        log.info("Sending email " + text + " to " + emailForcreateanAccount.toString());

    }

    public void clickOnCreateAnAccountButton(){
        clickOnElement(clickOnCreateanAccount);
        log.info("click On CreatanAccount: " + clickOnCreateanAccount.toString());
    }
    public void clickOnSignin() {
        clickOnElement(signIn);
        log.info("click On Signin : " + signIn.toString());
    }
    public void enterEmail(String mail) {
        sendTextToElement(emailAddress, mail);
        log.info("Enter email " + mail + " to email field " + emailAddress.toString());
    }
    public void enterPassword(String pword) {
        sendTextToElement(password, pword);
        log.info("Enter email " + password + " to email field " + password.toString());
    }
    public void enterLoginDetail(){
        enterEmail("ram1105@domain.co.uk");
        enterPassword("12345678");
        clickOnSignin();
    }
}
