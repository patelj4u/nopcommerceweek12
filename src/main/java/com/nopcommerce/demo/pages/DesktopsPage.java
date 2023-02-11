package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPage extends Utility {

    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Desktops']")
    WebElement clickDesktopsButton;
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement verifyDesktopsText;
    @FindBy(xpath = "//span[normalize-space()='Sort by']")
    WebElement Sortby;

    @FindBy(xpath = "//span[normalize-space()='Display']")
    WebElement Display;
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement selectProductList;

    public String verifyDesktopsText() {
        return getTextFromElement(verifyDesktopsText);

    }

    public String verifySortby() {
        return getTextFromElement(Sortby);

    }

    public String verifyDisplay() {
        return getTextFromElement((Display));

    }

    public String verifySelecetd() {
        return getTextFromElement(selectProductList);
    }

    public void clickDesktopsButton() {
        clickOnElement(clickDesktopsButton);


    }
}
