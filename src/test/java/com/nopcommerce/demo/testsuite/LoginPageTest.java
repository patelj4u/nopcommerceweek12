package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPage() {
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginPage.verifyWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {

        homePage.clickOnLoginLink();
        loginPage.enterEmailId("jiten111@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        String actual = loginPage.getErrorMessage();
        String expected = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual, expected, "error message with inavalid credentials");
    }
    @Test//(dataProvider = "vaildcredentials", dataProviderClass = TestData.class)
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(String username, String password) {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("jiten@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        homePage.clickOnLogoutButton();
    }

    @Test//(dataProvider = "vaildcredentials", dataProviderClass = TestData.class)
    public void VerifyThatUserShouldLogOutSuccessFully(String username, String password) {
        homePage.clickOnLoginLink();
        loginPage.enterEmailId("jiten@gmail.com");
        loginPage.enterPassword("123456");
        loginPage.clickOnLoginButton();
        homePage.clickOnLogoutButton();

    }
}