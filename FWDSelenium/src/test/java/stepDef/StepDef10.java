package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef10 {
    HomePage homePage = new HomePage();

    @When("user enter \\(If You Wait) in search")
    public void userEnterIfYouWaitInSearch() {
        homePage.searchForItemIfYouWait();
    }

    @Then("click on add to wishlist")
    public void clickOnAddToWishlist() {
        homePage.clickAddToWishListBtn();
    }


}
