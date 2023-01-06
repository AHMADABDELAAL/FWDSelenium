package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef2 {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    @When("user click on login button")
    public void userClickOnLoginButton() {
        homePage.clickLoginButton();
    }

    @When("user enters data and click on login")
    public void userEntersDataAndClickOnLogin() {
        registerPage.enterEmail();
        registerPage.enterPassword();
        loginPage.clickLoginBtn();
    }

    @Then("user logged in")
    public void userLoggedIn() {
        Assert.assertEquals(homePage.getLogoutBtnText(), "Log out", "Login failed");
    }

}
