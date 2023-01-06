package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef7 {
    HomePage homePage = new HomePage();

    @Then("user filter using manufacturers")
    public void userFilterUsingManufacturers() {
        homePage.selectManufacturer();
    }

    @Then("validate filer is applied correctly")
    public void validateFilerIsAppliedCorrectly() {
        Assert.assertEquals(homePage.getAppleTitle(), "Apple");
    }


}
