package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef1 {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();

    @Given("web site opens")
    public void webSiteOpens() {
        Assert.assertEquals(Util.getURL(), "https://demo.nopcommerce.com/");
    }

    @When("user click on register button")
    public void userClickOnRegisterButton() {
        homePage.clickRegisterBtn();
    }

    @When("user enters data and click on register")
    public void userEntersDataAndClickOnRegister() {

        registerPage.enterFirstName();
        registerPage.enterLastName();
        registerPage.enterEmail();
        registerPage.enterPassword();
        registerPage.enterConfirmPassword();
        registerPage.clickRegisterBtn();
    }

    @Then("confirmation message is shown")
    public void confirmationMessageIsShown() {
        Assert.assertEquals(registerPage.getRegistrationConfirmation(), "Your registration completed", "The registration failed");
    }

}
