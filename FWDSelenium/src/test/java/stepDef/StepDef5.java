package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef5 {
    HomePage homePage = new HomePage();

    @When("user select euro")
    public void userSelectEuro() {
        homePage.selectEuro();
    }

    @When("user select us")
    public void userSelectUs() {
        homePage.selectUSDollar();
    }

    @Then("currency is changed")
    public void currencyIsChanged() {
    }
}
