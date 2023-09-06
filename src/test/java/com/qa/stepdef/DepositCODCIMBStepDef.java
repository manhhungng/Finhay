package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.DepositCODCIMBPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLException;

public class DepositCODCIMBStepDef {
    @Then("Verify payment method CIMB disable")
    public void verify_payment_method_cimb_disable() {
        Assert.assertFalse(new DepositCODCIMBPage().isEnableCIMBPaymentBtn());
    }

    @Then("Verify display text no enough money {string}")
    public void verify_display_text_no_enough_money(String money) {
      Assert.assertEquals(money,new DepositCODCIMBPage().getTextNoEnoughMoney());
    }

    @Then("Verify payment method CIMB enable")
    public void verify_payment_method_cimb_enable() {
        Assert.assertTrue(new DepositCODCIMBPage().isEnableCIMBPaymentBtn());
    }

    @When("I click button payment method CIMB")
    public void i_click_button_payment_method_cimb() {
      new DepositCODCIMBPage().clickToCIMBPaymentBtn();
    }

    @Then("Verify display text please create pin code {string}")
    public void verify_display_text_please_create_pin_code(String pin) {
        Assert.assertEquals(pin,new DepositCODCIMBPage().getTextCreatePin());
    }

    @Then("Verify display button Create Pin Now")
    public void verify_display_button_create_pin_now() {
        Assert.assertTrue(new DepositCODCIMBPage().isEnableCreatePinNowBtn());
    }

    @When("I click button Create Pin Now")
    public void i_click_button_create_pin_now() {
        new DepositCODCIMBPage().clickToCreatePinNowBtn();
    }

    @Then("Verify display popup message please input password {string}")
    public void verify_display_popup_message_please_input_password(String text) {
        Assert.assertEquals(text,new DepositCODCIMBPage().getTextInputPassword());
    }

    @When("I click button OK input password")
    public void i_click_button_ok_input_password() {
        new DepositCODCIMBPage().clickToOkInputPasswordBtn();
    }

    @Then("Verify textbox password display")
    public void verify_textbox_password_display() {
        Assert.assertTrue(new DepositCODCIMBPage().isDisplayedPasswordTxt());
    }

    @Then("Verify button confirm password disable")
    public void verify_button_confirm_password_disable() {
        Assert.assertFalse(new DepositCODCIMBPage().isEnableConfirmPasswordBtn());
    }

    @Then("Verify button Forgot password display")
    public void verify_button_forgot_password_display() {
        Assert.assertTrue(new DepositCODCIMBPage().isDisplayedFindPasswordBtn());
    }

    @When("I click button forgot password when deposit by CIMB")
    public void i_click_button_forgot_password_when_deposit_by_cimb() {
        new DepositCODCIMBPage().clickToFindPasswordBtn();
    }

    @When("Verify text find password {string}")
    public void verify_text_find_password(String findPass) {
        Assert.assertEquals(findPass,new DepositCODCIMBPage().getTextFindPassword());
    }

    @When("I input password is {string}")
    public void i_input_password_is(String value) {
      new DepositCODCIMBPage().inputToPasswordTxt(value);
    }

    @When("I click button confirm password")
    public void i_click_button_confirm_password() {
        new DepositCODCIMBPage().clickToConfirmPasswordBtn();
    }

    @Then("Verify display text create pin code of you {string}")
    public void verify_display_text_create_pin_code_of_you(String pin) {
        Assert.assertEquals(pin,new DepositCODCIMBPage().getTextCreatePinOfYou());
    }

    @Then("Verify Display textbox create pin")
    public void verify_display_textbox_create_pin() {
        Assert.assertTrue(new DepositCODCIMBPage().isDisplayedPinTxt());
    }

    @When("I input create pin {string}")
    public void i_input_create_pin(String pin) {
      new DepositCODCIMBPage().inputToPinTxt(pin);
    }

    @Then("Verify text confirm pin code {string}")
    public void verify_text_confirm_pin_code(String text) {
        Assert.assertEquals(text,new DepositCODCIMBPage().getTextConfirmPin());
    }

    @When("I input confirm pin code {string}")
    public void i_input_confirm_pin_code(String confirmPin) {
        new DepositCODCIMBPage().inputToPinTxt(confirmPin);
    }

    @Then("Verify display message error confirm pin code {string}")
    public void verify_display_message_error_confirm_pin_code(String errorConfirmPin) {
        Assert.assertEquals(errorConfirmPin,new DepositCODCIMBPage().getTextMessageErrorConfirmPin());
    }

    @Given("Click button OK when confirm wrong pin code")
    public void click_button_ok_when_confirm_wrong_pin_code() {
        new DepositCODCIMBPage().clickToOkErrorConfirmPinBtn();
    }


    @Then("Verify text input OTP {string}")
    public void verify_text_input_otp(String otp) {
        Assert.assertEquals(otp,new DepositCODCIMBPage().getTextInputOTP());
    }

    @Given("Reset app")
    public void reset_app() {
      new BasePage().resetApp();
    }
    @When("I input create pin one {string}")
    public void i_input_create_pin_one(String pin1) {
        new DepositCODCIMBPage().inputToPinIndex1Txt(pin1);
    }

    @When("I input create pin two {string}")
    public void i_input_create_pin_two(String pin2) {
        new DepositCODCIMBPage().inputToPinIndex2Txt(pin2);
    }

    @When("I input create pin three {string}")
    public void i_input_create_pin_three(String pin3) {
        new DepositCODCIMBPage().inputToPinIndex3Txt(pin3);
    }

    @When("I input create pin four {string}")
    public void i_input_create_pin_four(String pin4) {
        new DepositCODCIMBPage().inputToPinIndex4Txt(pin4);
    }

    @When("I input create pin five {string}")
    public void i_input_create_pin_five(String pin5) {
        new DepositCODCIMBPage().inputToPinIndex5Txt(pin5);
    }

    @When("I input create pin six {string}")
    public void i_input_create_pin_six(String pin6) {
        new DepositCODCIMBPage().inputToPinIndex6Txt(pin6);
    }
    @Given("Clear pin six")
    public void clear_pin_six() {
      new DepositCODCIMBPage().clearToPinIndex6Txt();
    }
    @Given("Delete transaction COD CIMB")
    public void delete_transaction_cod_cimb() throws SQLException {
DepositCODCIMBPage.deleteTransactionDepositCIMB();
DepositCODCIMBPage.deleteAssetUser();
DepositCODCIMBPage.updateCashInvestUser();
    }
    @Given("Get otp")
    public void get_otp() {
       new DepositCODCIMBPage().getTextOtp();
    }

    @When("I input otp index one")
    public void i_input_otp_index_one() {
      new DepositCODCIMBPage().inputOTP1();
    }

    @When("I input otp index two")
    public void i_input_otp_index_two() {
        new DepositCODCIMBPage().inputOTP2();
    }

    @When("I input otp index three")
    public void i_input_otp_index_three() {
        new DepositCODCIMBPage().inputOTP3();
    }

    @When("I input otp index four")
    public void i_input_otp_index_four() {
        new DepositCODCIMBPage().inputOTP4();
    }

    @When("I input otp index five")
    public void i_input_otp_index_five() {
        new DepositCODCIMBPage().inputOTP5();
    }

    @When("I input otp index six")
    public void i_input_otp_index_six() {
        new DepositCODCIMBPage().inputOTP6();
    }

    @Then("Verify display message error otp is {string}")
    public void verify_display_message_error_otp_is(String errorOtp) {
       Assert.assertEquals(errorOtp,new DepositCODCIMBPage().getTextErrorOTP());
    }

    @Given("I click button ok when input inccorect opt")
    public void i_click_button_ok_when_input_inccorect_opt() {
       new DepositCODCIMBPage().clickToOkErrorOTPBtn();
    }

    @Then("verify display message when input correct otp {string}")
    public void verify_display_message_when_input_correct_otp(String correctOtp) {
        Assert.assertEquals(correctOtp,new DepositCODCIMBPage().getTextCorrectOTP());
    }

    @Given("I click button ok when input correct otp")
    public void i_click_button_ok_when_input_correct_otp() {
        new DepositCODCIMBPage().clickToOkCorrectOTPBtn();
    }

    @Then("Verify display text transfer complete {string}")
    public void verify_display_text_transfer_complete(String textComplete) {
        Assert.assertEquals(textComplete,new DepositCODCIMBPage().getTextComplete());
    }

    @When("I click button Return app of partner")
    public void i_click_button_return_app_of_partner() throws Exception {
        new DepositCODCIMBPage().clickToReturnAppFinhayBtn();
    }
    @Then("Verify button ok transfer display")
    public void verify_button_ok_transfer_display() {
    Assert.assertTrue(new DepositCODCIMBPage().isDisplayedOkTransferBtn());
    }

    @When("I click button forgot pin")
    public void i_click_button_forgot_pin() {
        new DepositCODCIMBPage().clickToForgotPinBtn();
    }

    @Then("Verify message set again pin {string}")
    public void verify_message_set_again_pin(String text) {
        Assert.assertEquals(text,new DepositCODCIMBPage().getTextResetPin());
    }

    @When("I click button reset pin now")
    public void i_click_button_reset_pin_now() {
        new DepositCODCIMBPage().clickToResetPinNowBtn();
    }

    @Then("Verify button CIMB payment disable")
    public void verify_button_cimb_payment_disable() {
Assert.assertTrue(new DepositCODCIMBPage().isEnableCIMBPaymentBtn());
    }

    @Given("I click back to homepage")
    public void i_click_back_to_homepage() {
        new BasePage().sleepInSecond(1);
   new DepositCODCIMBPage().clickToBackHomeBtn();
    }

    @Then("Verify button CIMB no display")
    public void verify_button_cimb_no_display() {
     Assert.assertFalse(new DepositCODCIMBPage().isDisplayedCIMBPaymentBtn());
    }

}
