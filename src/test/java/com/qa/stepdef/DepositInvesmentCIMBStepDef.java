package com.qa.stepdef;

import com.qa.pages.DepositInvesmentCIMB;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLException;

public class DepositInvesmentCIMBStepDef {
    @When("I click button turtle Hoan Kiem")
    public void i_click_button_turtle_hoan_kiem() {
   new DepositInvesmentCIMB().clickToTurtleBtn();
    }
    @When("I click button invest")
    public void i_click_button_invest() throws Exception {
      new DepositInvesmentCIMB().clickToInvestBtn();
    }
    @When("I click button start invest")
    public void i_click_button_start_invest() {
        new DepositInvesmentCIMB().clickToStartInvestBtn();
    }
    @When("I click button continue invest")
    public void i_click_button_continue_invest() {
        new DepositInvesmentCIMB().clickToContinueInvestBtn();
    }
    @When("I click button I want input other number")
    public void i_click_button_i_want_input_other_number() {
        new DepositInvesmentCIMB().clickToInputOtherNumberBtn();
    }
    @Then("Verify display turtle Hoan Kiem")
    public void verify_display_turtle_hoan_kiem() {
   Assert.assertTrue(new DepositInvesmentCIMB().isDisplayTurtleBtn());
    }
    @Then("Verify asset total display {string}")
    public void verify_asset_total_display(String total) {
   Assert.assertEquals(total,new DepositInvesmentCIMB().getTextTotalInvest().replace("\u00a0", ""));
    }
    @Given("Delete transaction Invest CIMB")
    public void delete_transaction_invest_cimb() throws SQLException {
DepositInvesmentCIMB.deleteTransactionDepositInvestCIMB();
DepositInvesmentCIMB.deleteUserPortfolios();
DepositInvesmentCIMB.updateCashInvestUser();
    }
}
