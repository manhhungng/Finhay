package com.qa.stepdef;


import com.qa.pages.DepositCD3MCIMBPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLException;

public class DepositCD3MCIMBStepDef {
    @When("I click saving three month")
    public void i_click_saving_three_month() {
        new DepositCD3MCIMBPage().clickToCd3mTab();
    }

    @When("I click button start saving three month")
    public void i_click_button_start_saving_three_month() {
        new DepositCD3MCIMBPage().clickToStartSavingCD3MBtn();
    }

    @When("I input amount three month is {string}")
    public void i_input_amount_three_month_is(String amount) {
        new DepositCD3MCIMBPage().inputToAmountTxt(amount);
    }

    @Then("Verify button start saving disable")
    public void verify_button_start_saving_disable() {
        Assert.assertFalse(new DepositCD3MCIMBPage().isEnableStartSavingBtn());
    }

    @Then("Verify amount transfer from CIMB {string}")
    public void verify_amount_transfer_from_cimb(String text) {
        Assert.assertEquals(text, new DepositCD3MCIMBPage().getTextAmountTransfer());
    }

    @When("I click button ok transfer")
    public void i_click_button_ok_transfer() throws Exception {
        new DepositCD3MCIMBPage().clickToOkTransferBtn();
    }

    @Then("Verify text input pin for transfer {string}")
    public void verify_text_input_pin_for_transfer(String text) {
        Assert.assertEquals(text, new DepositCD3MCIMBPage().getTextInputPin());
    }

    @Then("Verify text input pin incorrect {string}")
    public void verify_text_input_pin_incorrect(String error) {
        Assert.assertEquals(error, new DepositCD3MCIMBPage().getTextErrorPin());
    }

    @Given("I click button ok when input pin incorrect")
    public void i_click_button_ok_when_input_pin_incorrect() {
        new DepositCD3MCIMBPage().clickToOkErrorPinBtn();
    }

    @Then("Verify text input pin incorrect five time {string}")
    public void verify_text_input_pin_incorrect_five_time(String fiveTime) {
        Assert.assertEquals(fiveTime, new DepositCD3MCIMBPage().getTextErrorPin5Time());
    }

    @When("I click button later")
    public void i_click_button_later() {
        new DepositCD3MCIMBPage().clickToLaterBtn();
    }

    @When("I click button ok when input wrong pin five time")
    public void i_click_button_ok_when_input_wrong_pin_five_time() {
        new DepositCD3MCIMBPage().clickToOkErrorPin5TimeBtn();
    }

    @Then("Verify button start saving enable")
    public void verify_button_start_saving_enable() {
        Assert.assertTrue(new DepositCD3MCIMBPage().isEnableStartSavingBtn());
    }

    @Then("Verify display text reset pin code {string}")
    public void verify_display_text_reset_pin_code(String resetPin) {
        Assert.assertEquals(resetPin, new DepositCD3MCIMBPage().getTextResetPin());
    }

    @Then("Verify button Reset pin code display")
    public void verify_button_reset_pin_code_display() {
        Assert.assertTrue(new DepositCD3MCIMBPage().isDisplayResetPinBtn());
    }

    @When("I click button Reset pin code")
    public void i_click_button_reset_pin_code() {
        new DepositCD3MCIMBPage().clickToResetPinBtn();
    }

    @When("I click button start saving cd three month")
    public void i_click_button_start_saving_cd_three_month() {
        new DepositCD3MCIMBPage().clickToStartSavingBtn();
    }

    @When("I click button saving in homepage")
    public void i_click_button_saving_in_homepage() {
        new DepositCD3MCIMBPage().clickToSavingInHomeBtn();
    }

    @Then("verify error message too limit {string}")
    public void verify_error_message_too_limit(String error) {
        Assert.assertEquals(error, new DepositCD3MCIMBPage().getTextTooLimit());
    }

    @Given("Delete transaction")
    public void delete_transaction() throws SQLException {
        DepositCD3MCIMBPage.deleteTransactionCD3MCIMB();
        DepositCD3MCIMBPage.deleteUserAssetsCD3MCIMB();
    }
}
