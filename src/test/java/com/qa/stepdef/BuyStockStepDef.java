package com.qa.stepdef;


import com.qa.pages.BuyStockPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BuyStockStepDef {
  BuyStockPage buyStock = new BuyStockPage();
    @When("I click button stock in homepage")
    public void i_click_button_stock_in_homepage() {
       buyStock.clickToStockInHomeBtn();
    }

    @When("I click button market")
    public void i_click_button_market() {
       buyStock.clickToMarketBtn();
    }
    
    @Then("Verify display button Buy stock")
    public void verify_display_button_buy_stock() {
Assert.assertTrue(buyStock.isDisplayBuyStockBtn());
    }

    @When("I click button Buy stock")
    public void i_click_button_buy_stock() {
       buyStock.clickToBuyStockBtn();
    }

    @Then("Verify estimated amount is {string}")
    public void verify_estimated_amount_is(String value) {
       Assert.assertEquals(value,buyStock.getTextEstimateAmountTxt());
    }

    @Then("Verify button Buy disable")
    public void verify_button_buy_disable() {
       Assert.assertFalse(buyStock.isEnableBuyBtn());
    }

    @When("I input amount stock is {string}")
    public void i_input_amount_stock_is(String value) {
       buyStock.inputToAmountStockTxt(value);
    }

    @Then("Verify button Buy enable")
    public void verify_button_buy_enable() {
       Assert.assertTrue(buyStock.isEnableBuyBtn());
    }

    @When("I click button Buy")
    public void i_click_button_buy() {
       buyStock.clickToBuyBtn();
    }
    @When("I choose AAA symbol")
    public void i_choose_aaa_symbol() {
    buyStock.clickToAAASymbolText();
    }

    @Then("Verify button Confirm Otp disable")
    public void verify_button_confirm_otp_disable() {
    Assert.assertFalse(buyStock.isEnableOtpConfirmBtn());
    }

    @When("I input otp index one {string}")
    public void i_input_otp_index_one(String value) {
      buyStock.inputToOtpTxt1(value);
    }

    @When("I input otp index two {string}")
    public void i_input_otp_index_two(String value) {
      buyStock.inputToOtpTxt2(value);
    }

    @When("I input otp index three {string}")
    public void i_input_otp_index_three(String value) {
      buyStock.inputToOtpTxt3(value);
    }

    @When("I input otp index four {string}")
    public void i_input_otp_index_four(String value) {
      buyStock.inputToOtpTxt4(value);
    }

    @When("I click button Confirm Otp")
    public void i_click_button_confirm_otp() {
      buyStock.clickToOtpConfirmBtn();
    }

    @Then("Verify display error message {string}")
    public void verify_display_error_message(String message) {
      Assert.assertEquals(message,buyStock.getTextErrorMessageOtp());
    }

    @Then("Verify display message success {string}")
    public void verify_display_message_success(String message) {
      Assert.assertEquals(message,buyStock.getTextSuccessMessageBuyStock());
    }

    @Then("Verify button Done display")
    public void verify_button_done_display() {
      Assert.assertTrue(buyStock.isDisplayDoneBtn());
    }

    @Then("Verify button Order book display")
    public void verify_button_order_book_display() {
        Assert.assertTrue(buyStock.isDisplayOrderBookBtn());
    }



}
