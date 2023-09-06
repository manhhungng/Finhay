package com.qa.stepdef;

import com.qa.pages.BankAccountPage;
import com.qa.pages.BasePage;
import com.qa.utils.TestUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLException;

public class BankAccountStepDef {
    BankAccountPage bank = new BankAccountPage();

    @Then("Verify text bank account {string}")
    public void verify_text_bank_account(String text) throws Exception {
        Assert.assertEquals(text, bank.getTextNoAddBank());
    }

    @When("I click button withdraw account")
    public void i_click_button_withdraw_account() {
        bank.clickToWithdrawAccBtn();
    }

    @Then("Verify button completed disable")
    public void verify_button_completed_disable() {
        Assert.assertFalse(bank.isEnabledCompletedBtn());
    }

    @Then("Verify display text warning {string}")
    public void verify_display_text_warning(String text) {
        Assert.assertEquals(text, bank.getTextWarning());
    }

    @When("I click icon choose bank")
    public void i_click_icon_choose_bank() {
        bank.clickToIconChooseBankName();
    }

    @Then("Verify textbox search bank display")
    public void verify_textbox_search_bank_display() {
        Assert.assertTrue(bank.isDisplaySearchBankNameTxt());
    }

    @When("I input textbox search bank is {string}")
    public void i_input_textbox_search_bank_is(String nameBank) {
        bank.inputToSearchBankNameTxt(nameBank);
    }

    @Then("Verify display name bank {string}")
    public void verify_display_name_bank(String bankName) {
        Assert.assertEquals(bankName, bank.getTextBankNameText());
    }

    @When("I click choose agribank")
    public void i_click_choose_agribank() {
        bank.clickToBankNameAgriBankText();
    }

    @Then("Verify textbox bank display {string}")
    public void verify_textbox_bank_display(String bankName) {
        Assert.assertEquals(bankName, bank.getTextBankNameTxt());
    }

    @When("I click choose An Giang location")
    public void i_click_choose_an_giang_location() {
        bank.clickToAnGiangLocationText();
    }

    @When("I click choose Chi Lang branch")
    public void i_click_choose_chi_lang_branch() {
        bank.clickToChiLangBranchText();
    }

    @When("I input account number is {string}")
    public void i_input_account_number_is(String accountNumber) throws InterruptedException {
        bank.clickToAccountNumberTxt();
        bank.inputToAccountNumberTxt(accountNumber);
        bank.clickToBankTitleText();
        Thread.sleep(2000);
    }

    @Then("Verify textbox account name display {string}")
    public void verify_textbox_account_name_display(String accountName) {
        Assert.assertEquals(accountName, bank.getTextAccountNameTxt());
    }

    @When("I click choose techcombank")
    public void i_click_choose_techcombank() {
        bank.clickToTechcombankText();
    }

    @Then("Verify display error message account number {string}")
    public void verify_display_error_message_account_number(String error) {
        Assert.assertEquals(error, bank.getTextErrorMessage());
    }

    @Given("I click button OK in popup")
    public void i_click_button_ok_in_popup() {
        bank.clickToOkButtonInPopup();
    }

    @Then("Verify button completed enable")
    public void verify_button_completed_enable() {
        Assert.assertTrue(bank.isEnabledCompletedBtn());
    }

    @When("I click button completed add bank account")
    public void i_click_button_completed_add_bank_account() {
        bank.clickToCompletedBtn();
    }

    @Then("Verify message account verification successful {string}")
    public void verify_message_account_verification_successful(String message) {
        Assert.assertEquals(message, bank.getTextMessageSuccess());
    }

    @When("I click button Done in popup")
    public void i_click_button_done_in_popup() {
        bank.clickDoneBtn();
    }

    @Then("I Verify information bank with database")
    public void i_verify_information_bank_with_database() {
        Assert.assertEquals(bank.getBankNameUserID38327(), bank.getTextBankNameSuccessTxt());
    }

    @Then("I Verify information account number with database")
    public void i_verify_information_account_number_with_database() {
        Assert.assertEquals(bank.getAccountNumberUserID38327(), bank.getTextAccountNumberSuccessTxt());
    }

    @Then("I Verify information account name with database")
    public void i_verify_information_account_name_with_database() {
        Assert.assertEquals(bank.getAccountNameUserID38327(), bank.getTextAccountNameSuccessTxt());
    }

    @When("Delete bank account")
    public void delete_bank_account() throws SQLException {
        bank.deleteBankAccount();
        bank.deleteBankAccountHistory();
    }

    @When("I click icon choose location")
    public void i_click_icon_choose_location() {
        bank.clickToIconChooseLocation();
    }

    @When("I click icon choose branch")
    public void i_click_icon_choose_branch() {
        bank.clickToIconChooseBranch();
    }
    @When("I Click to Avatar in homepage")
    public void i_click_to_avatar_in_homepage() {
       bank.clickToIconAvatar();
    }
}
