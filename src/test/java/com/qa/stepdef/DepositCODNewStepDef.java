package com.qa.stepdef;

import com.qa.pages.HomeCODPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class DepositCODNewStepDef {
    @Given("Click COD card in the home screen")
    public void clickCODCardInTheHomeScreen() {
        new HomeCODPage().clickHomeCODCard();
    }

    @When("Click button Bắt đầu tích lũy")
    public void clickButtonStartCOD() {
        new HomeCODPage().clickHomeCODCard();
    }

    @And("I input amount {string}")
    public void inputAmount(String depositAmount) {
        new HomeCODPage().inputDepositAmount(depositAmount);
    }

    @Then("Verify continue button is enable")
    public void verifyContinueButtonIsEnabled() {
        Assert.assertTrue(new HomeCODPage().enableContinueBtn());
    }




}
