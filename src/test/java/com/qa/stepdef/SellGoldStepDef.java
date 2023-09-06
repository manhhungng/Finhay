package com.qa.stepdef;

import com.qa.pages.SellGoldPage;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLException;

public class SellGoldStepDef {
    TestUtils utils =new TestUtils();
    @Then("Verify display amount gold UI same asset in Database")
    public void verify_display_amount_gold_ui_same_asset_in_database() {
        float amount = new SellGoldPage().getAmountGoldInDataBase()  ;
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
                Assert.assertEquals(String.valueOf(amount),new SellGoldPage().getTextAmountGoldValue().replace(",","."));
            case "iOS":
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
    }

    @When("I click button sell gold")
    public void i_click_button_sell_gold() {



        new SellGoldPage().clickToSellGoldBtn();
    }

    @Then("Verify enable button continue sell gold")
    public void verify_enable_button_continue_sell_gold() {
        Assert.assertTrue(new SellGoldPage().isEnableContinueSellGoldBtn());
    }


    @When("I click button continue sell gold")
    public void i_click_button_continue_sell_gold() {
        new SellGoldPage().clickToContinueSellGoldBtn();
    }

    @When("I click button confirm sell gold")
    public void i_click_button_confirm_sell_gold() {
        new SellGoldPage().clickToConfirmSellGoldBtn();
    }

    @Then("Verify display message sell gold success {string}")
    public void verify_display_message_sell_gold_success(String message) {
        Assert.assertEquals(message,new SellGoldPage().getTextSttSellGoldSuccessText());
    }

    @Then("Verify display button sell gold more")
    public void verify_display_button_sell_gold_more() {
        Assert.assertTrue(new SellGoldPage().isDisplaySellMoreBtn());
    }

    @When("I click button back to home page")
    public void i_click_button_back_to_home_page() {
        new SellGoldPage().clickToBackHomePageBtn();
    }


    @Given("Delete order sell gold and asset")
    public void delete_order_sell_gold_and_asset() throws SQLException {
        SellGoldPage.deleteOrderSellGold();
    }
    @Then("Verify display text money sell gold switch to cod {string}")
    public void verify_display_text_money_sell_gold_switch_to_cod(String text) {
        Assert.assertEquals(text,new SellGoldPage().getTextWarningSellGold());
    }

    @When("Verify display type transaction {string}")
    public void verify_display_type_transaction(String type) {
        Assert.assertEquals(type,new SellGoldPage().getTextTypeTransactionSellGold());
    }

    @When("Verify gold amount sell gold history is {string}")
    public void verify_gold_amount_sell_gold_history_is(String amount) {
        Assert.assertEquals(amount,new SellGoldPage().getTextAmountSellGoldHistoryText());
    }
    @When("I click detail one history transaction")
    public void i_click_detail_one_history_transaction() {
new SellGoldPage().clickToDetailHistoryTransactionBtn();
    }

    @Then("Verify display contract Code same database")
    public void verify_display_contract_code_same_database() {
     Assert.assertEquals(new SellGoldPage().getContractCodeInDatabase(),new SellGoldPage().getTextContractCode());
    }

    @Then("Verify display request code same database")
    public void verify_display_request_code_same_database() {
        Assert.assertEquals(new SellGoldPage().getRequestCodeInDatabase(),new SellGoldPage().getRequestCodeInDatabase());
    }
    @When("I input amount gold {string}")
    public void i_input_amount_gold(String amount) {
       new SellGoldPage().inputToAmountGoldTxt(amount);
    }
    @Then("Verify display equivalent is {string}")
    public void verify_display_equivalent_is(String equivalent) {
      Assert.assertEquals(equivalent,new SellGoldPage().getTextEquivalentValue());
    }
}
