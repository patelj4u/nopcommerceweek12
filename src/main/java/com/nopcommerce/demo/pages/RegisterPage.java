package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement RegisterText;

    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement MaleRadio;
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement FirstNameField;
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement LastNameField;
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement BirthDropDown;
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement BirthMonthDropdown;
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement BirthYearDropdown;
    @FindBy(xpath = "//input[@id='Email']")
    WebElement EmailField;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement PasswordField;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement ConfirmPasswordField;
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement RegisterButton;
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement ErrorMassage;
    @FindBy(xpath = "//div[@class='result']")
    WebElement RegisteronCompleted;
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement Continue;
    @FindBy(xpath = "//h1[normalize-space()='Register']")
    WebElement Register;
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement NameFieldError;
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement LastNameError;
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement EmailFiledError;
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement PasswordFieldError;
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement ConforimPasswordFieldError;


    public String findRegisterText() {
        return getTextFromElement(RegisterText);
    }

    public void cilckMaleFemaleRadio() {
        clickOnElement(MaleRadio);
    }

    public void enterFirstnameField(String fname) {
        sendTextToElement(FirstNameField, fname);
    }

    public void enterLastnameField(String lname) {
        sendTextToElement(LastNameField, lname);
    }

    public void ClickDateOfDropDown(String value) {
        selectByValueFromDropDown(BirthDropDown, value);
    }

    public void ClickMonthOfDropdown(String value) {
        selectByValueFromDropDown(BirthMonthDropdown, value);
    }

    public void ClickYearOfDropdown(String value) {
        selectByValueFromDropDown(BirthYearDropdown, value);
    }

    public void enterEmailField(String eid) {
        sendTextToElement(EmailField, eid);
    }

    public void enterPasswordField(String password) {
        sendTextToElement(PasswordField, password);
    }

    public void eneterComfirmPassword(String cpaasword) {
        sendTextToElement(ConfirmPasswordField, cpaasword);
    }

    public void CilckOnRegister() {
        clickOnElement(RegisterButton);
    }

    public String VerifyErrorMassage() {
        return getTextFromElement(ErrorMassage);
    }

    public String VerifyRegisterComplateText() {
        return getTextFromElement(RegisteronCompleted);
    }

    public String ContinueButton() {
        return getTextFromElement(Continue);
    }

    public String verifyRegisterText() {
        return getTextFromElement(Register);
    }

    public String verifyFristNameIsRequired() {
        return getTextFromElement(NameFieldError);
    }

    public String verifyLastNameIsRequiredText() {
        return getTextFromElement(LastNameError);
    }

    public String verifyEmailIsRequiredText() {
        return getTextFromElement(EmailFiledError);
    }

    public String verifyPasswordIsRequiredText() {
        return getTextFromElement(PasswordFieldError);
    }

    public String verifyConfirmPasswordIsRequiredText() {
        return getTextFromElement(ConforimPasswordFieldError);
    }


}
/*Click on Register Link
        Click on "REGISTER" button
        Verify the error message "First name is required."
        Verify the error message "Last name is required."
        Verify the error message "Email is required."
        Verify the error message "Password is required."
        Verify the error message "Password is required."  */