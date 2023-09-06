package com.qa.stepdef;

import com.qa.pages.SellStockPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SellStockStepDef {
    SellStockPage sellStock = new SellStockPage();
    @When("I click TVS symbol")
    public void i_click_tvs_symbol() {
     sellStock.clickToTVSymbol();
    }

    @When("I click button sell even lot")
    public void i_click_button_sell_even_lot() {
       sellStock.clickToSellEvenLotBtn();
    }

    @Then("verify button Sell stock disable")
    public void verify_button_sell_stock_disable() {
        Assert.assertFalse(sellStock.isEnableSellBtn());
    }

    @Then("Verify button Sell enable")
    public void verify_button_sell_enable() {
        Assert.assertTrue(sellStock.isEnableSellBtn());

    }

    @When("I click button sell")
    public void i_click_button_sell() {
       sellStock.clickToSellBtn();
    }

    @Then("Verify display message sell successful {string}")
    public void verify_display_message_sell_successful(String message) {
       Assert.assertEquals(message,sellStock.getTextMessageSellSuccessText());
    }

}
