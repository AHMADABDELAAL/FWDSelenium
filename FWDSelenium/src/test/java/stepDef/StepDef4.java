package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef4 {
    HomePage homePage = new HomePage();

    @Then("related search result are shown")
    public void relatedSearchResultAreShown() {
        Assert.assertEquals(homePage.getSearchResult(), "Build your own computer");
    }

}
