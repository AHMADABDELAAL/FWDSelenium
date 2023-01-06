package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef11 {
    HomePage homePage = new HomePage();

    @Then("click on add to compare list")
    public void clickOnAddToCompareList() {
        homePage.clickOnAddToCompare();
    }


}
