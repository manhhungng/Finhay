package com.qa.stepdef;

import com.qa.pages.DepositCODBankPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.sql.SQLException;

public class DepositCODBankStepDef {
    @When("I click button looking for more information")
    public void i_click_button_looking_for_more_information() throws Exception {
      new DepositCODBankPage().clickToLookingForInfoBtn();
    }

    @When("I click button continue")
    public void i_click_button_continue() {
        new DepositCODBankPage().clickToContinueBtn();
    }

    @Then("verify saving total is {string}")
    public void verify_saving_total_is(String valueSaving) {
        Assert.assertEquals(valueSaving,new DepositCODBankPage().getTextSavingTotalValue().replace("\u00a0", ""));
    }

    @Then("verify text saving no date {string}")
    public void verify_text_saving_no_date(String text) {
        Assert.assertEquals(text,new DepositCODBankPage().getTextSavingNoDate());
    }

    @Then("verify text start from {string}")
    public void verify_text_start_from(String start) {
        Assert.assertEquals(start,new DepositCODBankPage().getTextstartFrom50());
    }

    @When("I click button saving no date")
    public void i_click_button_saving_no_date() {
        new DepositCODBankPage().clickToSavingNoDateBtn();
    }

    @Then("Verify display total vnd saving no date is {string}")
    public void verify_display_total_vnd_saving_no_date_is(String totalNoDate) {
        Assert.assertEquals(totalNoDate,new DepositCODBankPage().getTextSavingTotalValue().replace("\u00a0", ""));
    }

    @Then("Verify display button start saving")
    public void verify_display_button_start_saving() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedStartSavingBtn());
    }

    @When("I click button start saving")
    public void i_click_button_start_saving() {
        new DepositCODBankPage().clickToStartSavingBtn();
    }

    @Then("verify display textbox referral code")
    public void verify_display_textbox_referral_code() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedReferralCodeTxt());
    }

    @Then("Display button continue saving display")
    public void display_button_continue_saving_display() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedContinueSavingBtn());
    }

    @When("I click button continue saving")
    public void i_click_button_continue_saving() {
        new DepositCODBankPage().clickToContinueSavingBtn();
    }

    @Then("Display text cannot deposit {string}")
    public void display_text(String textDeposit) {
        Assert.assertEquals(textDeposit,new DepositCODBankPage().getTextCannotDepositText());
    }

    @Then("Display button active now")
    public void display_button_active_now() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedActiveNowBtn());
    }

    @When("I click button active now")
    public void i_click_button_active_now() {
        new DepositCODBankPage().clickToActiveNowBtn();
    }


    @Then("Verify textbox amount display")
    public void verify_textbox_amount_display() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedAmountDepositTxt());
    }

    @Then("Verify notice deposit more display is {string}")
    public void verify_notice_deposit_more_display_is(String notice) {
        Assert.assertEquals(notice,new DepositCODBankPage().getTextNoticeAmountDeposit().replace("\u00a0", ""));
    }

    @Then("Verify button one million vnd display")
    public void verify_button_one_million_vnd_display() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedSuggest1MBtn());
    }

    @Then("Verify button five million vnd  display")
    public void verify_button_five_million_vnd_display() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedSuggest5MBtn());
    }

    @Then("Verify button ten million vnd display")
    public void verify_button_ten_million_vnd_display() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedSuggest10MBtn());
    }

    @Then("button continue deposit disable")
    public void button_continue_deposit_disable() {
        Assert.assertFalse(new DepositCODBankPage().isEnabledContinueDepositBtn());
    }

    @When("I input amount {string}")
    public void i_input_amount(String amount) {
        new DepositCODBankPage().inputToAmountDepositTxt(amount);
    }

    @Then("button continue deposit enable")
    public void button_continue_deposit_enable() {
        Assert.assertTrue(new DepositCODBankPage().isEnabledContinueDepositBtn());
    }

    @When("I click button one million vnd")
    public void i_click_button_one_million_vnd() {
        new DepositCODBankPage().clickToSuggest1MBtn();
    }

    @Then("Verify textbox amount is {string}")
    public void verify_textbox_amount_is(String amount) {
        Assert.assertEquals(amount,new DepositCODBankPage().getTextAmountDepositTxt());
    }

    @When("I click button continue deposit")
    public void i_click_button_continue_deposit() {
        new DepositCODBankPage().clickToContinueDepositBtn();
    }

    @Then("verify payment method bank transfer display")
    public void verify_payment_method_bank_transfer_display() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedBankTransferBtn());
    }

    @Then("Verify payment method momo display")
    public void verify_payment_method_momo_display() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedMomoBtn());
    }

    @When("I click button bank transfer")
    public void i_click_button_bank_transfer() {
        new DepositCODBankPage().clickToBankTransferBtn();
    }

    @Then("Display amount deposit is {string}")
    public void display_amount_deposit_is(String amount) {
        Assert.assertEquals(amount,new DepositCODBankPage().getTextAmountValue().replace("\u00a0", ""));
    }

    @Then("Display fee transfer is {string}")
    public void display_fee_transfer_is(String fee) {
        Assert.assertEquals(fee,new DepositCODBankPage().getTextFeeValue().replace("\u00a0", ""));
    }

    @Then("Display total deposit is {string}")
    public void display_total_deposit_is(String total) {
        Assert.assertEquals(total,new DepositCODBankPage().getTextTotalValue().replace("\u00a0", ""));
    }

    @Then("Display button confirm transaction")
    public void display_button_confirm_transaction() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedConfirmTransactionBtn());
    }

    @Then("Display text security {string}")
    public void display_text_security(String security) {
        Assert.assertEquals(security,new DepositCODBankPage().getTextSecurityText());
    }

    @When("I click button confirm transaction")
    public void i_click_button_confirm_transaction() {
        new DepositCODBankPage().clickToConfirmTransactionBtn();
    }

    @Then("Verify amount deposit {string}")
    public void verify_amount_deposit(String amount) {
        Assert.assertEquals(amount,new DepositCODBankPage().getTextAmountWantDeposit().replace("\u00a0", ""));
    }

    @Then("Verify bank accept is {string}")
    public void verify_bank_accept_is(String bank) {
        Assert.assertEquals(bank,new DepositCODBankPage().getTextBank());
    }

    @Then("Verify account number {string}")
    public void verify_account_number_bank(String number) {
        Assert.assertEquals(number,new DepositCODBankPage().getTextAccountNumberText());
    }

    @Then("Verify receiver {string}")
    public void verify_receiver(String receiver) {
        Assert.assertEquals(receiver,new DepositCODBankPage().getTextAccountNameTxt());
    }

    @Then("Display button copy in account number")
    public void display_button_copy_in_account_number() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedCopyAccountNumberBtn());
    }

    @Then("Display button copy in transfer content")
    public void display_button_copy_in_transfer_content() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedCopyContentBtn());
    }

    @Then("Display notice transfer content is {string}")
    public void display_notice_transfer_content_is(String content) {
        Assert.assertEquals(content,new DepositCODBankPage().getTextNoticeContentTransfer());
    }

    @When("I click icon tooltip receiver")
    public void i_click_icon_tooltip_receiver() {
        new DepositCODBankPage().clickToTooltipBtn();
    }

    @Then("Verify content tooltip display {string}")
    public void verify_content_tooltip_display(String content) {
        Assert.assertEquals(content,new DepositCODBankPage().getTextNoticeContentTooltip());
    }

    @Given("I click close tooltip")
    public void i_click_close_tooltip() {
        new DepositCODBankPage().clickToCloseTooltipBtn();
    }

    @When("I click tab Techcombank")
    public void i_click_tab_techcombank() {
        new DepositCODBankPage().clickToTechcombankBtn();
    }

    @When("I click tab Vietcombank")
    public void i_click_tab_vietcombank() {
        new DepositCODBankPage().clickToVietcombankBtn();
    }

    @When("I click button close")
    public void i_click_button_close() {
        new DepositCODBankPage().clickToCloseBankBtn();
    }

    @Then("Verify your request display is {string}")
    public void verify_your_request_display_is(String number) throws Exception {
        Assert.assertEquals(number,new DepositCODBankPage().getTextRequestNumberValue());
    }

    @When("I click button saving more")
    public void i_click_button_saving_more() throws Exception {
        new DepositCODBankPage().clickToSavingMoreBtn();
    }

    @Then("Display saving no date is {string}")
    public void display_saving_no_date_is(String number) {
        Assert.assertEquals(number,new DepositCODBankPage().getTextSavingNoDateCountText());
    }

    @Then("Display notice when bank transfer {string}")
    public void display_notice_when_bank_transfer(String notice) {
        Assert.assertEquals(notice,new DepositCODBankPage().getTextNoticeLine1());
    }

    @When("I click icon menu")
    public void i_click_icon_menu() {
        new DepositCODBankPage().clickToIconMenu();
    }

    @Then("Display category Payment Guide")
    public void display_category_payment_guide() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedPaymentGuideBtn());
    }

    @Then("Display category Error report")
    public void display_category_error_report() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedErrorReportBtn());
    }

    @Then("Display category Cancel this order")
    public void display_category_cancel_this_order() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedCancelThisOrderBtn());
    }

    @When("I click button Cancel this order")
    public void i_click_button_cancel_this_order() {
        new DepositCODBankPage().clickToCancelThisOrderBtn();
    }

    @Then("verify message popup {string}")
    public void verify_message_popup(String message) {
        Assert.assertEquals(message,new DepositCODBankPage().getTextMessagePopup());
    }

    @When("I click button confirm cancel")
    public void i_click_button_confirm_cancel() {
        new DepositCODBankPage().clickToConfirmPopupBtn();
    }

    @Then("No display button saving more")
    public void no_display_button_saving_more() {
        Assert.assertFalse(new DepositCODBankPage().isDisplayedSavingMoreBtn());
    }

    @When("I click icon add")
    public void i_click_icon_add() {
        new DepositCODBankPage().clickToIconAdd();
    }

    @When("I click button saving")
    public void i_click_button_saving() {
        new DepositCODBankPage().clickToSavingBtn();
    }

    @When("I click button five million")
    public void i_click_button_five_million() {
        new DepositCODBankPage().clickToSuggest5MBtn();
    }
    @Then("Verify notice guide is {string}")
    public void verify_notice_guide_is(String guide) {
        Assert.assertEquals(guide,new DepositCODBankPage().getTextNoticeGuide());
    }

    @When("I click button skip guide")
    public void i_click_button_skip_guide() {
        new DepositCODBankPage().clickToSkipGuideBtn();
    }

    @When("I click button saving no date in request")
    public void i_click_button_saving_no_date_in_request() {
        new DepositCODBankPage().clickToSavingNoDateInRequestBtn();
    }
    @Given("I click button no display")
    public void i_click_button_no_display() {
        new DepositCODBankPage().clickToSkipNoticeBtn();
    }
    @When("Click button back home page")
    public void click_button_back_home_page() {
        new DepositCODBankPage().clickToBackToHomeBtn();
    }
    @When("I click menu exchange")
    public void i_click_menu_exchange() {
        new DepositCODBankPage().clickToMenuExchange();
    }

    @When("I click tab saving history")
    public void i_click_tab_saving_history() {
        new DepositCODBankPage().clickToSavingHistoryBtn();
    }

    @Then("Verify display text deposit saving history {string}")
    public void verify_display_text_deposit_saving_history(String text) {
        Assert.assertEquals(text, new DepositCODBankPage().getTextSavingDepositHistory());
    }

    @Then("Verify display text amount history {string}")
    public void verify_display_text_amount_history(String amount) {
        Assert.assertEquals(amount, new DepositCODBankPage().getTextAmountHistoryText().replace("\u00a0", ""));
    }

    @Then("Verify display text status history {string}")
    public void verify_display_text_status_history(String stt) {
        Assert.assertEquals(stt, new DepositCODBankPage().getTextStatusHistory());
    }

    @When("I click button deposit history")
    public void i_click_button_deposit_history() {
        new DepositCODBankPage().clickToDepositHistoryBtn();
    }

    @Given("I click home page menu")
    public void i_click_home_page_menu() {
        new DepositCODBankPage().clickToHomePageMenu();
    }

    @Then("Verify no display text deposit saving history")
    public void verify_no_display_text_deposit_saving_history() {
       Assert.assertFalse(new DepositCODBankPage().isDisplayedTextSavingDepositHistory());
    }
    @When("I transfer bank successful is one million")
    public void i_transfer_bank_successful_is_one_million() throws InterruptedException {
        new DepositCODBankPage().getTransactionID();
        new DepositCODBankPage().putCodSuccess();
        Thread.sleep(3000);
    }

    @Then("Verify popup first saving success is  {string}")
    public void verify_popup_first_saving_success_is(String text) {
        Assert.assertEquals(text, new DepositCODBankPage().getTextMessageDepositSuccess());
    }

    @When("I click continue saving in popup")
    public void i_click_continue_saving_in_popup() {
        new DepositCODBankPage().clickToContinueDepositPopupBtn();
    }
    @Given("I delete transaction just cancel")
    public void i_delete_transaction_just_cancel() throws SQLException {
       DepositCODBankPage.deleteTransactionDeposit();
    }

    @Given("I click button back from deposit screen")
    public void i_click_button_back_from_deposit_screen() {
   new DepositCODBankPage().clickToBackBtn();
    }

    @Then("verify no display text status")
    public void verify_no_display_text_status() {
   Assert.assertFalse(new DepositCODBankPage().isDisplayedStatusHistoryText());
    }

    @Then("Verify display value in saving is {string}")
    public void verify_display_value_in_saving_is(String value) {
   Assert.assertEquals(value,new DepositCODBankPage().getTextValueSavingInHome().replace("\u00a0", ""));
    }

    @When("I click button saving in home")
    public void i_click_button_saving_in_home() {
        new DepositCODBankPage().clickToSavingInHomeBtn();
    }

    @Then("Verify provisional interest is {string}")
    public void verify_provisional_interest_is(String value) {
        Assert.assertEquals(value,new DepositCODBankPage().getTextValueProvisionalInterest().replace("\u00a0", ""));
    }

    @Then("Verify interest received is {string}")
    public void verify_interest_received_is(String value) {
        Assert.assertEquals(value,new DepositCODBankPage().getTextValueInterestReceived().replace("\u00a0", ""));
    }

    @Then("display button deposit more")
    public void display_button_deposit_more() {
   Assert.assertTrue(new DepositCODBankPage().isDisplayedDepositMoreBtn());
    }

    @Then("display button allocation")
    public void display_button_allocation() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedAllocationBtn());
    }

    @Then("display button transfer")
    public void display_button_transfer() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedTransferBtn());
    }

    @Then("display button withdraw")
    public void display_button_withdraw() {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedWithdrawBtn());
    }

    @When("I click button deposit more")
    public void i_click_button_deposit_more() {
   new DepositCODBankPage().clickToDepositMoreBtn();
    }

    @When("I call API transfer success")
    public void i_call_api_transfer_success() {
        new DepositCODBankPage().putCodSuccessMore500000000();
    }

    @Then("Verify display amount invest is {string}")
    public void verify_display_amount_invest_is(String value) {
   Assert.assertEquals(value,new DepositCODBankPage().getTextValueInvestInHome().replace("\u00a0", ""));
    }

    @Given("I click button back from saving no date")
    public void i_click_button_back_from_saving_no_date() {
        new DepositCODBankPage().clickToBackFromSavingNoDateBtn();
    }
    @When("I order by in database in cod transaction table")
    public void i_order_by_in_database_in_cod_transaction_table() {
        new DepositCODBankPage().getTransactionID();
    }
    @When("Reset user")
    public void reset_user() throws SQLException {
       DepositCODBankPage.deleteTransactionDeposit();
        DepositCODBankPage.deleteVerifyUser();
        DepositCODBankPage.deleteOTPUser();
        DepositCODBankPage.updateOTPUser();
        DepositCODBankPage.updateCashInvestUser();
        DepositCODBankPage.deleteInvestHistoryUser();
        DepositCODBankPage.deleteOTPUserInNotification();
        DepositCODBankPage.deleteAssetUser();

    }
    @When("I click detail transaction history")
    public void i_click_detail_transaction_history() {
        new DepositCODBankPage().clickToDetailTransactionBtn();
    }

    @Then("Verify status detail is {string}")
    public void verify_status_detail_is(String stt) {
        Assert.assertEquals(stt,new DepositCODBankPage().getTextProcessing());
    }

    @Then("Verify text received request is {string}")
    public void verify_text_received_request_is(String request) {
        Assert.assertEquals(request,new DepositCODBankPage().getTextReceivedRequest());
    }

    @Then("Verify amount was deposit is {string}")
    public void verify_amount_was_deposit_is(String amount) {
        Assert.assertEquals(amount,new DepositCODBankPage().getTextMoney().replace("\u00a0", ""));
    }

    @Then("Verify payment type is {string}")
    public void verify_payment_type_is(String paymentType) {
        Assert.assertEquals(paymentType,new DepositCODBankPage().getTextPaymentType());
    }

    @Then("Verify status type is {string}")
    public void verify_status_type_is(String sttType) {
        Assert.assertEquals(sttType,new DepositCODBankPage().getTextTypeStatus());
    }

    @Then("Verify contract is {string}")
    public void verify_contract_is(String contract) {
        Assert.assertEquals(contract,new DepositCODBankPage().getTextContractID());
    }

    @Then("Verify rate is {string}")
    public void verify_rate_is(String rate) {
        Assert.assertEquals(rate,new DepositCODBankPage().getTextRate());
    }

    @Then("Verify display button support")
    public void verify_display_button_support() throws Exception {
        Assert.assertTrue(new DepositCODBankPage().isDisplayedSupportBtn());
    }

    @When("I click button Support")
    public void i_click_button_support() {
        new DepositCODBankPage().clickToSupportBtn();
    }

    @Then("Verify display bank process is {string}")
    public void verify_display_bank_process_is(String text) {
        Assert.assertEquals(text,new DepositCODBankPage().getTextBankProcessing());
    }

    @Then("Verify text check account number received money {string}")
    public void verify_text_check_account_number_received_money(String text) {
        Assert.assertEquals(text,new DepositCODBankPage().getTextCheckAccountNumber());
    }

    @Then("Verify text Reason other {string}")
    public void verify_text_reason_other(String text) {
        Assert.assertEquals(text,new DepositCODBankPage().getTextReasonOther());
    }
    @Then("Verify status in database is {string}")
    public void verify_status_in_database_is(String stt) {
     Assert.assertEquals(stt,new DepositCODBankPage().getStatusTransactionCODInDB());
    }



// new

    @Then("Verify Saving display")
    public void verify_saving_display() {
       Assert.assertTrue(new DepositCODBankPage().isDisplayedSavingOldHomeBtn());
    }
    @When("I click button Saving Old Home")
    public void i_click_button_saving_old_home() {
new DepositCODBankPage().clickToSavingOldHomeBtn();
    }

    @When("I click button Saving No Date Old Home")
    public void i_click_button_saving_no_date_old_home() {
new DepositCODBankPage().clickToSavingNoDateOldHomeBtn();
    }


    @When("I click button More Deposit")
    public void i_click_button_more_deposit() {
     new DepositCODBankPage().clickToDepositMoreHomeOldBtn();
    }

    @When("I click button Payment")
    public void i_click_button_payment() {
        new DepositCODBankPage().clickToPaymentBtn();
    }

    @Then("Verify display receiver bank is {string}")
    public void verify_display_receiver_bank_is(String text) {
Assert.assertEquals(text,new DepositCODBankPage().getTextReceiveBank());
    }


    @Given("I click button Close Guide deposit Screen")
    public void i_click_button_close_guide_deposit_screen() {
        new DepositCODBankPage().clickToCloseBtn();
    }



    @When("I click button Add Deposit new Home")
    public void i_click_button_add_deposit_new_home() {
        new DepositCODBankPage().clickToAddDepositNHBtn();
    }

    @When("I input amount in new home is {string}")
    public void i_input_amount_in_new_home_is(String amount) {
       new DepositCODBankPage().inputToAmountDepositNHTxt(amount);
    }

    @When("I click button continue deposit new home")
    public void i_click_button_continue_deposit_new_home() {
        new DepositCODBankPage().clickToContinueDepositCODNHBtn();
    }

    @When("I click icon convert in new home")
    public void i_click_icon_convert_in_new_home() {
        new DepositCODBankPage().clickIconConvertInNewHomeBtn();
    }

    @When("I click convert to saving three month")
    public void i_click_convert_to_saving_three_month() {
        new DepositCODBankPage().clickToConvertToCd3mBtn();
    }

    @When("I input amount convert is {string}")
    public void i_input_amount_convert_is(String amount) {
        new DepositCODBankPage().inputToAmountConvertTxt(amount);
    }

    @When("I click button continue convert")
    public void i_click_button_continue_convert() {
        new DepositCODBankPage().clickToContinueConvertBtn();
    }

    @When("I click button confirm convert")
    public void i_click_button_confirm_convert() {
        new DepositCODBankPage().clickToConfirmConvertBtn();
    }

    @When("I input pass for convert is {string}")
    public void i_input_pass_for_convert_is(String password) {
        new DepositCODBankPage().inputToPasswordConvertTxt(password);
    }

    @When("I click button completed convert")
    public void i_click_button_completed_convert() {
        new DepositCODBankPage().clickToCompletedConvertBtn();
    }

    @Then("Verify convert success {string}")
    public void verify_convert_success(String text) {
        Assert.assertEquals(text,new DepositCODBankPage().getTextConvertSuccess());
    }

    @Given("I click button ok in screen convert success")
    public void i_click_button_ok_in_screen_convert_success() {
        new DepositCODBankPage().clickToOkScreenConvertSuccessBtn();
    }

    @When("I click convert to saving twelve month")
    public void i_click_convert_to_saving_twelve_month() {
        new DepositCODBankPage().clickToConvertToCd12mBtn();
    }

    @When("I click convert to fund investment")
    public void i_click_convert_to_fund_investment() {
        new DepositCODBankPage().clickToConvertToInvestmentBtn();
    }

    @When("I click convert to turtle Hoan Kiem")
    public void i_click_convert_to_turtle_hoan_kiem() {
        new DepositCODBankPage().clickToConvertToTurtleBtn();
    }


}
