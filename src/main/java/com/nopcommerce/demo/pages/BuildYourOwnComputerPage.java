package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {

    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());
    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement ComputerText;
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement ProcessorDropDown;
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement RamDropDown;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement HddRadio;

    @FindBy(xpath = "//input[@id='product_attribute_4_8']")
    WebElement OsRadio;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement SoftwareCheckBoxes;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement AddToCardButton;

    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement ShoppingCart;
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement clickBuildOwnComputer;

    @FindBy(xpath = "//p[@class='content']")
    WebElement verifyItemInCart;

    public String VerifyComputerText() {
        return getTextFromElement(ComputerText);
    }

    public void clickProcessorDropDown() {
        clickOnElement(ProcessorDropDown);
    }

    public void clickRamDropDown() {
        clickOnElement(RamDropDown);
    }

    public void clickHddRadio() {
        clickOnElement(HddRadio);
    }

    public void clickOsradio() {
        clickOnElement(OsRadio);
    }

    public void clickSoftware() {
        clickOnElement(SoftwareCheckBoxes);
    }

    public void Verifyshoppingcart() {
        clickOnElement(ShoppingCart);
    }

    public void AddToCardButton() {
        clickOnElement(AddToCardButton);
    }

    public void clickOwnComputer() {
        clickOnElement(clickBuildOwnComputer);
    }

    public String verifyItemInYourCart() {
        return getTextFromElement(verifyItemInCart);
    }
}


