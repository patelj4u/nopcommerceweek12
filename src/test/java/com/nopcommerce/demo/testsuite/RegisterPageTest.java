package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class RegisterPageTest extends TestBase {

    HomePage homepage ;
    RegisterPage registerPage ;
    @BeforeMethod
    public void inIt(){
        homepage = new HomePage();
        registerPage  = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //Click on Register Link
        homepage.clickOnRegisterLink();
        //Verify "Register" text
        Assert.assertEquals("Register", registerPage.verifyRegisterText());
    }
    @Test
    public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() throws InterruptedException {
        homepage.clickOnRegisterLink();
        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,800)");
        registerPage.CilckOnRegister();

        String expected = "First name is required.";
        Assert.assertEquals(registerPage.verifyFristNameIsRequired(),expected);

        String expected1 = "Last name is required.";
        Assert.assertEquals(registerPage.verifyLastNameIsRequiredText(),expected1);

        String expected2 = "Email is required.";
        Assert.assertEquals(registerPage.verifyEmailIsRequiredText(),expected2);

        String expected3 = "Password is required.";
        Assert.assertEquals(registerPage.verifyPasswordIsRequiredText(),expected3);

        String expected4 = "Password is required.";
        Assert.assertEquals(registerPage.verifyConfirmPasswordIsRequiredText(),expected4);
    }
    @Test
    public void  verifyThatUserShouldCreateAccountSuccessfully() throws InterruptedException {
        homepage.clickOnRegisterLink();
        registerPage.cilckMaleFemaleRadio();
        registerPage.enterFirstnameField("Jiten");
        registerPage.enterLastnameField("Patel");
        Thread.sleep(1000);
        registerPage.ClickDateOfDropDown("7");
        registerPage.ClickMonthOfDropdown("6");
        registerPage.ClickYearOfDropdown("1986");
        Thread.sleep(1000);
        Random randomGenrator = new Random(System.currentTimeMillis());
        int num = randomGenrator.nextInt(5);
        registerPage.enterEmailField("Jiten"+num+"@gmail.com");
        registerPage.enterPasswordField("Abcd123");
        registerPage.eneterComfirmPassword("Abcd123");
        registerPage.CilckOnRegister();

        String expected = "Your registration completed";
        Assert.assertEquals(registerPage.VerifyRegisterComplateText(),expected);
    }
}
