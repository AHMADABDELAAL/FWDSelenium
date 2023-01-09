package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef6 {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage();
    CheckoutPage checkoutPage = new CheckoutPage();


    @When("user enter \\(Build your own computer) in search")
    public void userEnterBuildYourOwnComputerInSearch() {
        homePage.searchForItem();
    }

    @When("user enter email")
    public void userEnterEmail() {
        registerPage.enterEmail();
        passwordRecoveryPage.clickSendEmailBtn();
    }

    @Then("user can select different categories")
    public void userCanSelectDifferentCategories() {
        homePage.clickCategory();
        homePage.clickSubCategory();
    }

}
