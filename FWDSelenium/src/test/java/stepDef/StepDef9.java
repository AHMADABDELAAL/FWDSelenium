package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef9 {
    HomePage homePage = new HomePage();

    @When("clicking on item")
    public void clickingOnItem() {
        homePage.clickOnProduct();
    }
}
