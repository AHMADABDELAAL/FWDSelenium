package stepDef;

import Pages.*;
import Utility.Util;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StepDef3 {

    PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage();
    @Then("recovery confirmation message is shown")
    public void recoveryConfirmationMessageIsShown() {
        Assert.assertEquals(passwordRecoveryPage.confirmationMessage(), "Email with instructions has been sent to you.");
    }

}
