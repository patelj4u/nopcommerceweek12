package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement registerLink;

    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement LoginLink;

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement logoLink;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement myaccountlink;

    @FindBy(xpath = "//a[@class='ico-logout']")
    WebElement logOutLink;

    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public  void clickOnLoginLink(){clickOnElement(LoginLink);}

    public void findLogo(){clickOnElement(logoLink);}
    public void clickOnLoginButton(){
        clickOnElement(myaccountlink);
    }

    public void clickOnLogoutButton(){
        clickOnElement(logOutLink);
    }


}
