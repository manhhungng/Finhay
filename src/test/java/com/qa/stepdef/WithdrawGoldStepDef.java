package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.WithdrawGoldPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.awt.*;
import java.sql.SQLException;

public class WithdrawGoldStepDef {
    WithdrawGoldPage withdraw = new WithdrawGoldPage();
    @When("I click button Register Withdraw Gold")
    public void i_click_button_register_withdraw_gold() throws Exception {
      withdraw.clickToRegisterWithdrawGoldBtn();
    }

    @When("I input amount gold withdraw is {string}")
    public void i_input_amount_gold_withdraw_is(String amount) {
      withdraw.inputToAmountWithdrawTxt(amount);
    }

    @Then("Verify total volume received is {string}")
    public void verify_total_volume_received_is(String total) {
        Assert.assertEquals(total,withdraw.getTextGoldReceiveValue());
    }

    @When("I click button continue withdraw gold")
    public void i_click_button_continue_withdraw_gold() {
      withdraw.clickToNextWithdrawGoldBtn();
    }

    @Then("Verify confirm request amount {string}")
    public void verify_confirm_request_amount(String amount) {
        Assert.assertEquals(amount,withdraw.getTextGoldReceiveConfirmValue());
    }

    @When("I click button confirm request")
    public void i_click_button_confirm_request() {
      withdraw.clickToConfirmRequestBtn();
    }

    @Then("Verify message success {string}")
    public void verify_message_success(String message) {
        Assert.assertEquals(message,withdraw.getTextMessageSuccessText());
    }

    @Then("Verify message see list {string}")
    public void verify_message_see_list(String message) {
        Assert.assertEquals(message,withdraw.getTextMessageDescriptionText());
    }

    @When("I click button Open list request")
    public void i_click_button_open_list_request() {
      withdraw.clickToOpenListRequestBtn();
    }

    @When("Verify due date is {string}")
    public void verify_due_date_is(String text) {
        Assert.assertEquals(text,withdraw.getTextSubmitUndueText());
    }

    @When("I call job submit undue to submit due")
    public void i_call_job_submit_undue_to_submit_due() throws SQLException {
      withdraw.updateRequestTimeNow();
      withdraw.runJobChangeStatusSubmitUndueToSubmitDue();

    }

    @When("I click button detail request withdraw")
    public void i_click_button_detail_request_withdraw() throws Exception {
      withdraw.clickToDetailRequestWithdrawBtn();
    }

    @Then("Verify message due {string}")
    public void verify_message_due(String message) throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertEquals(message,withdraw.getTextSttMessageWithdrawText());
    }

    @Then("Verify button confirm receive disable")
    public void verify_button_confirm_receive_disable() {
      Assert.assertFalse(withdraw.isEnableUserConfirmReceiveGoldBtn());
    }

    @Then("Verify request code same in Database")
    public void verify_request_code_same_in_database() {
     Assert.assertEquals(withdraw.getRequestIDWithdrawOrder(),withdraw.getTextCodeRequestIDText());
    }

    @Then("Verify button confirm receive enable")
    public void verify_button_confirm_receive_enable() {
        Assert.assertTrue(withdraw.isEnableUserConfirmReceiveGoldBtn());
    }

    @When("I click button confirm receive gold")
    public void i_click_button_confirm_receive_gold() {
      withdraw.clickToUserConfirmReceiveGoldBtn();
    }
    @When("I call job api from submit due to shop confirm")
    public void i_call_job_api_from_submit_due_to_shop_confirm() {
      withdraw.runJobChangeStatusSubmitDueToShopConfirmed();

    }

    @Given("I click two back button")
    public void i_click_two_back_button() {
        withdraw.clickToNavigate();
        withdraw.clickToNavigate();
    }

    @When("I click button return pot of gold page")
    public void i_click_button_return_pot_of_gold_page() {
       withdraw.clickToReturnPotOfGoldBtn();
    }
    @Given("I click one back button")
    public void i_click_one_back_button() {
        withdraw.clickToNavigate();
    }
}
