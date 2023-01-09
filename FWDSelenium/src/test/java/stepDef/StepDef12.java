package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef12 {
    HomePage homePage = new HomePage();
    CheckoutPage checkoutPage = new CheckoutPage();


    @When("navigate to cart")
    public void navigateToCart() {
        homePage.moveToCart();
    }

    @When("user agree to the terms and click on continue")
    public void userAgreeToTheTermsAndClickOnContinue() {
        checkoutPage.clickOnTermOfService();
        checkoutPage.clickOnCheckOut();
    }

    @Then("user moved to check out screen")
    public void userMovedToCheckOutScreen() {
        Assert.assertEquals(checkoutPage.getPageTitle(), "Checkout");
    }

    @Then("click add to cart")
    public void clickAddToCart() {
        homePage.clickAddToCart();
    }

}
