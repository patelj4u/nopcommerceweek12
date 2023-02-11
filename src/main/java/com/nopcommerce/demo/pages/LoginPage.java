package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @FindBy(id = "Email")
    WebElement emailfield;
    @FindBy(name = "Password")
    WebElement passwordField;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    @FindBy(linkText = "Computers")
    WebElement Computers;
    @FindBy(linkText = "Digitaldownloads")
    WebElement Digitaldownloads;

    @FindBy(linkText = "Electronics")
    WebElement Electronics;
    @FindBy(linkText = "Apparel")
    WebElement Apparel;
    @FindBy(linkText = "Books")
    WebElement Books;
    @FindBy(linkText = "Jewelery")
    WebElement Jewelery;
    @FindBy(linkText = "GiftCards")
    WebElement GiftCards;


    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMag;

    public String verifyWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailfield, email);
    }

    public void enterPassword(String Password) {
        sendTextToElement(passwordField, Password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void clickOnComputers() {
        Reporter.log("clicking on Computers" + Computers.toString());
        clickOnElement(Computers);
    }

    public void clickOnElectronics() {
        Reporter.log("clicking on Electronics" + Electronics.toString());
        clickOnElement(Electronics);
    }

    public void Apparel() {
        Reporter.log("clicking on Apparel" + Apparel.toString());
        clickOnElement(Apparel);
    }

    public void clickOnDigitaldownloads() {
        Reporter.log("clicking on Digitaldownloads" + Digitaldownloads.toString());
        clickOnElement(Digitaldownloads);
    }

    public void clickOnBooks() {
        Reporter.log("clicking on Books" + Books.toString());
        clickOnElement(Books);
    }

    public void clickOnJewelery() {
        Reporter.log("clicling on Jewelery" + Jewelery.toString());
        clickOnElement(Jewelery);
    }

    public void clickOnGiftCards() {
        Reporter.log("clicking on GiftCards" + GiftCards.toString());
        clickOnElement(GiftCards);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMag);
    }

}
