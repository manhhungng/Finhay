package com.qa.stepdef;

import com.qa.pages.DepositCODBankPage;
import com.qa.pages.DepositCODMomoPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLException;


public class DepositCODMomoStepDef {


    @When("I click button payment method momo")
    public void i_click_button_payment_method_momo() {
       new DepositCODMomoPage().clickToPaymentMoMoTab();
    }

    @Then("Verify display text Update now {string}")
    public void verify_display_text_update_now(String text) {
        Assert.assertEquals(text,new DepositCODMomoPage().getTextUpdateNow());
    }

    @Then("Verify display Free maximum first recharge with value {string}")
    public void verify_display_free_maximum_first_recharge_with_value (String value) {
        Assert.assertEquals(value,new DepositCODMomoPage().getTextFeeBonus().replace("\u00a0", ""));
    }

    @Then("Verify display fee before free with value {string}")
    public void verify_display_fee_before_free_with_value(String value) {
        Assert.assertEquals(value,new DepositCODMomoPage().getTextFeeBeforeFree().replace("\u00a0", ""));
    }

    @Then("Verify display fee after free with value {string}")
    public void verify_display_fee_after_free_with_value(String value) {
        Assert.assertEquals(value,new DepositCODMomoPage().getTextFeeAfterFree().replace("\u00a0", ""));
    }

    @Then("Verify text payment by momo is {string}")
    public void verify_text_payment_by_momo_is(String text) {
        Assert.assertEquals(text,new DepositCODMomoPage().getTextFeePaymentByMoMo());
    }

    @Then("Verify total with value is {string}")
    public void verify_total_with_value_is(String total) {
        Assert.assertEquals(total,new DepositCODMomoPage().getTextTotalPaymentMoMo().replace("\u00a0", ""));
    }

    @Then("Verify display button payment by Momo")
    public void verify_display_button_payment_by_momo() {
       Assert.assertTrue(new DepositCODMomoPage().isDisplayedPaymentByMomoBtn());
    }

    @Then("Verify display button Not now")
    public void verify_display_button_not_now() {
        Assert.assertTrue(new DepositCODMomoPage().isDisplayedNotNowBtn());
    }

    @When("I click button Not now")
    public void i_click_button_not_now() {
        new DepositCODMomoPage().clickToNotNowBtn();
    }

    @Then("Verify text transaction unsuccessful {string}")
    public void verify_text_transaction_unsuccessful(String text) {
        Assert.assertEquals(text,new DepositCODMomoPage().getTextTransactionFail());
    }

    @Then("Verify text please retry {string}")
    public void verify_text_please_retry(String text) {
        Assert.assertEquals(text,new DepositCODMomoPage().getTextRetry());
    }

    @Then("Verify display button Retry")
    public void verify_display_button_retry() {
        Assert.assertTrue(new DepositCODMomoPage().isDisplayedRetryBtn());
    }

    @Then("Verify display button Return assets")
    public void verify_display_button_return_assets() {
        Assert.assertTrue(new DepositCODMomoPage().isDisplayedBackToAssetPageBtn());
    }

    @When("I click button Payment by Momo in Momo App")
    public void i_click_button_payment_by_momo() {
        new DepositCODMomoPage().clickToPaymentByMomoBtn();
    }

    @When("I input password of app momo is {string}")
    public void i_input_password_of_app_momo_is(String pass) {
//        new DepositCODMomoPage().inputToPasswordLoginTxt1(pass);
//        new DepositCODMomoPage().inputToPasswordLoginTxt2(pass);
//        new DepositCODMomoPage().inputToPasswordLoginTxt3(pass);
//        new DepositCODMomoPage().inputToPasswordLoginTxt4(pass);
//        new DepositCODMomoPage().inputToPasswordLoginTxt5(pass);
//        new DepositCODMomoPage().inputToPasswordLoginTxt6(pass);
        new DepositCODMomoPage().inputToPassMomoTxt(pass);
    }

    @When("I click button confirm in Momo")
    public void i_click_button_confirm_in_momo() {
        new DepositCODMomoPage().clickToConfirmPaymentMoMoBtn();
    }

    @When("I input password confirm of app Momo {string}")
    public void i_input_password_confirm_of_app_momo(String password) {
        new DepositCODMomoPage().inputToPasswordConfirmTxt(password);
    }


    @Then("Verify text saving success {string}")
    public void verify_text_saving_success(String text) {
        Assert.assertEquals(text,new DepositCODMomoPage().getTextSuccess());
    }

    @Then("Display button return home page")
    public void display_button_return_home_page() {
        Assert.assertTrue(new DepositCODMomoPage().isDisplayedReturnHomeBtn());
    }

    @When("Reset user deposit by momo")
    public void reset_user_deposit_by_momo() throws SQLException {
        DepositCODMomoPage.deleteTransactionDeposit();
        DepositCODMomoPage.deleteAssetUser();

    }

    @Given("I delete transaction momo")
    public void i_delete_transaction_momo() throws SQLException {
    DepositCODMomoPage.deleteTransactionDeposit();
    }

    @When("I click button Payment by Momo in MoMo App")
    public void i_click_button_payment_by_momo_in_mo_mo_app() {
        new DepositCODMomoPage().clickToPaymentByMomoBtn();
    }

    @Then("Verify text paid order {string}")
    public void verify_text_paid_order(String text) {

        Assert.assertEquals(text,new DepositCODMomoPage().getTextPaidSuccess());
    }

    @When("I click button return home page")
    public void i_click_button_return_home_page() {
        new DepositCODMomoPage().clickToReturnHomeBtn();
    }

    @When("I input pass confirm of app Momo {string}")
    public void i_input_pass_confirm_of_app_momo(String pass) {
        new DepositCODMomoPage().inputToPasswordConfirmTxt(pass);
    }
    @When("I click number zero in keyboard")
    public void i_click_number_zero_in_keyboard() {
       new DepositCODMomoPage().clickToKeyBoard0();
    }
    @Then("Verify display fee after free deposit one million with value {string}")
    public void verify_display_fee_after_free_deposit_one_million_with_value(String text) {
        Assert.assertEquals(text,new DepositCODMomoPage().getTextFeeAfterBonusDeposit1M().replace("\u00a0", ""));
    }

    @Then("Verify display fee after free with value two million {string}")
    public void verify_display_fee_after_free_with_value_two_million(String text) {
        Assert.assertEquals(text,new DepositCODMomoPage().getTextFeeAfterBonusDeposit2M().replace("\u00a0", ""));
    }

    @Then("Verify total deposit two million  with value is {string}")
    public void verify_total_deposit_two_million_with_value_is(String text) {
        Assert.assertEquals(text,new DepositCODMomoPage().getTextTotalPaymentMoMoDeposit2M().replace("\u00a0", ""));
    }
    @Then("Verify display fee no bonus with value {string}")
    public void verify_display_fee_no_bonus_with_value(String fee) {
        Assert.assertEquals(fee,new DepositCODMomoPage().getTextFeeNoBonus().replace("\u00a0", ""));
    }
}
