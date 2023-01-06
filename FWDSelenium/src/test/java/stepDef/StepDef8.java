package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef8 {
    HomePage homePage = new HomePage();
    @When("user click on awesome tag")
    public void userClickOnAwesomeTag() {
        homePage.clickOnAwesomeTag();
    }

    @Then("user moved to products tagged with awesome")
    public void userMovedToProductsTaggedWithAwesome() {
        Assert.assertEquals(homePage.getAwesomeTagTitle(),"Products tagged with 'awesome'");
    }
}
