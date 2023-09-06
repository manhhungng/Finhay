package com.qa.stepdef;

import com.qa.pages.BuyGoldPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLException;

public class BuyGoldStepDef {

    @Then("Verify display button pot of gold")
    public void verify_display_button_pot_of_gold() {
        Assert.assertTrue(new BuyGoldPage().isDisplayHomeGoldBtn());
    }

    @When("I click button pot of gold")
    public void i_click_button_pot_of_gold() {
        new BuyGoldPage().clickToHomeGoldBtn();
    }

    @Then("Verify display amount gold is {string}")
    public void verify_display_amount_gold_is(String amountGold) {
        Assert.assertEquals(amountGold, new BuyGoldPage().getTextAmountGoldValue());
    }
    @Then("Display button start buy gold")
    public void display_button_start_buy_gold() {
    Assert.assertTrue(new BuyGoldPage().isDisplayStartBuyGoldBtn());
    }

    @When("I click button start buy gold")
    public void i_click_button_start_buy_gold() {
    new BuyGoldPage().clickToStartBuyGoldBtn();
    }

    @Then("Verify display text term of use {string}")
    public void verify_display_text(String termOfUse) {
    Assert.assertEquals(termOfUse,new BuyGoldPage().getTextTermOfUseTxt());
    }

    @When("I click button continue term of use")
    public void i_click_button_continue_term_of_use() {
    new BuyGoldPage().clickToContinueTermOfUseBtn();
    }

    @Then("Verify display product is {string}")
    public void verify_display_product_is(String product) {
    Assert.assertEquals(product,new BuyGoldPage().getTextNameProductGold());
    }

    @Then("Verify disable button continue buy gold")
    public void verify_disable_button_continue_buy_gold() {
    Assert.assertFalse(new BuyGoldPage().isEnableContinueTransactionGoldBtn());
    }

    @When("I input amount gold is {string}")
    public void i_input_amount_gold_is(String amount) {
    new BuyGoldPage().inputToAmountGoldTxt(amount);
    }

    @When("I click button plus amount")
    public void i_click_button_plus_amount() {
        new BuyGoldPage().clickToPlusAmountGoldBtn();
    }

    @Then("Verify display equivalent {string}")
    public void verify_display_equivalent(String equivalent) {
    Assert.assertEquals(equivalent,new BuyGoldPage().getTextEquivalent());
    }

    @Then("Verify display expected payment")
    public void verify_display_expected_payment() {
        String expect_payment = new BuyGoldPage().getTextExpectedPaymentText();
    Assert.assertEquals(expect_payment,new BuyGoldPage().getTextExpectedPaymentText());
    }

    @Then("Verify enable button continue buy gold")
    public void verify_enable_button_continue_buy_gold() {
        Assert.assertTrue(new BuyGoldPage().isEnableContinueTransactionGoldBtn());
    }

    @When("I click button continue buy gold")
    public void i_click_button_continue_buy_gold() {
    new BuyGoldPage().clickToContinueTransactionGoldBtn();
    }

    @Then("Verify display type transaction is {string}")
    public void verify_display_type_transaction_is(String type) {
    Assert.assertEquals(type,new BuyGoldPage().getTextTypeTransactionConfirmText());
    }

    @Then("Verify amount gold {string}")
    public void verify_amount_gold(String amount) {
        Assert.assertEquals(amount,new BuyGoldPage().getTextAmountGoldConfirmText());
    }


    @Then("Verify display need payment")
    public void verify_display_need_payment() {
        String expect_payment = new BuyGoldPage().getTextNeedMoneyPaymentConfirmText();
    Assert.assertEquals(expect_payment,new BuyGoldPage().getTextNeedMoneyPaymentConfirmText());
    }

    @Then("Verify display payment {string}")
    public void verify_display_payment(String payment) {
    Assert.assertEquals(payment,new BuyGoldPage().getTextPayTypeConfirmText());
    }

    @When("I click button confirm buy gold")
    public void i_click_button_confirm_buy_gold() {
    new BuyGoldPage().clickToConfirmTransactionGold();
    }

    @Then("Verify display message buy gold success {string}")
    public void verify_display_message_buy_gold_success(String message) {
        Assert.assertEquals(message,new BuyGoldPage().getTextMessageBuyGoldSuccess());
    }

    @Then("Verify display button buy gold more")
    public void verify_display_button_buy_gold_more() {
    Assert.assertTrue(new BuyGoldPage().isDisplayBuyMoreInTransactionSuccessBtn());
    }

    @Then("Verify display button go to pot of gold page")
    public void verify_display_button_go_to_pot_of_gold_page() {
        Assert.assertTrue(new BuyGoldPage().isDisplayGoToPotOfGoldPageBtn());
    }

    @When("I click button go to pot of gold page")
    public void i_click_button_go_to_pot_of_gold_page() {
    new BuyGoldPage().clickToGoToPotOfGoldPageBtn();
    }

    @Then("Verify display equivalent confirm {string}")
    public void verify_display_equivalent_confirm(String equivalent) {
     Assert.assertEquals(equivalent,new BuyGoldPage().getTextEquivalentConfirmText());
    }
    @Given("Delete order and asset")
    public void delete_order_and_asset() throws SQLException {
       BuyGoldPage.deleteOrderBuyGold();
       BuyGoldPage.deleteUserGoldBags();
       BuyGoldPage.updateTermOfUserBuyGold();
    }

    @When("I click button history gold")
    public void i_click_button_history_gold() {
        new BuyGoldPage().clickToHistoryGoldBtn();
    }
    @Then("verify transaction type & status is {string}")
    public void verify_transaction_type_status_is(String stt) {
    Assert.assertEquals(stt,new BuyGoldPage().getTextSttTransTypeText());
    }
    @Then("Verify gold amount history is {string}")
    public void verify_gold_amount_history_is(String amount) {
        Assert.assertEquals(amount,new BuyGoldPage().getTextAmountGoldHistoryText());
    }
    @When("I click icon close popup use credit")
    public void i_click_icon_close_popup_use_credit() {
        new BuyGoldPage().clickToIconClose();
    }


}