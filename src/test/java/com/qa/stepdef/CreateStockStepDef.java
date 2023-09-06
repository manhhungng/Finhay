package com.qa.stepdef;

import com.qa.pages.CreateStockPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CreateStockStepDef {
    CreateStockPage createStock = new CreateStockPage();

    @Then("Verify display text {string}")
    public void verify_estimated_amount_is(String value) {
        Assert.assertEquals(value,createStock.getHeaderText());
    }

    @And("Verify display button accept")
    public void verifyDisplayButtonAccept() {
        Assert.assertTrue(createStock.checkAcceptButton());
    }

    @And("Verify display TAC link {string}")
    public void verifyDisplayLink(String value) {
        Assert.assertEquals(value,createStock.getTACText());
    }

    @And("Verify display contract link {string}")
    public void verifyDisplayContractLink(String value) {
        Assert.assertEquals(value,createStock.getContractText());
    }

    @And("Verify display appendix link {string}")
    public void verifyDisplayAppendixLink(String value) {
        Assert.assertEquals(value,createStock.getAppendixText());
    }

    @And("Verify display guide link {string}")
    public void verifyDisplayGuideLink(String value) {
        Assert.assertEquals(value,createStock.getIntroLinkText());
    }

    @When("User click TAC link")
    public void userClickTACLink() {
        createStock.clickTacLink();
    }

    @Then("Verify term of use link")
    public void verifyTermOfUseLink() {
    }

    @When("User click contract link")
    public void userClickContractLink() {
        createStock.clickContractLink();
    }

    @Then("Verify contract info")
    public void verifyContractInfo() {

    }

    @When("User click appendix link")
    public void userClickAppendixLink() {
        createStock.clickAppendixLink();
    }

    @Then("Verify appendix link")
    public void verifyAppendixLink() {
    }

    @When("User click intro link")
    public void userClickIntroLink() {
        createStock.clickIntroLink();
    }

    @Then("Navigate to info link")
    public void navigateToInfoLink() {

    }

    @And("Click button accept")
    public void clickButtonAccept() {
        createStock.clickAccept();
    }

    @Then("Verify alert dialog {string}")
    public void verifyAlertDialog(String value) {
        Assert.assertEquals(value,createStock.getConfirmAlertTitle());
    }

    @And("Verify action button {string}")
    public void verifyActionButton(String value) {
        Assert.assertEquals(value,createStock.getConfirmAlertBtnText());
    }

    @And("Verify close button {string}")
    public void verifyCloseButton(String value) {
        Assert.assertEquals(value,createStock.getConfirmCloseBtnText());
    }

    @Then("Click action button")
    public void clickActionButton() {
        createStock.clickActionError();
    }
}
