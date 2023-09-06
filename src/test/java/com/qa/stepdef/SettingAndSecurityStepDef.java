package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.SettingAndSecurityPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SettingAndSecurityStepDef {
    @When("I click setting and security")
    public void i_click_setting_and_security() throws Exception {
  new SettingAndSecurityPage().clickToSettingAndSecurityBtn();
    }

    @Then("Verify connect facebook display")
    public void verify_connect_facebook_display() {
        Assert.assertTrue(new SettingAndSecurityPage().isDisplayConnectFB());
    }

    @Then("Verify swich facebook display")
    public void verify_switch_facebook_display() {
        Assert.assertTrue(new SettingAndSecurityPage().isDisplaySwitchFB());
    }

    @Then("Verify text use facebook login to Finhay {string}")
    public void verify_text_use_facebook_login_to_finhay(String useFB) {
  Assert.assertEquals(useFB,new SettingAndSecurityPage().getTextUseFBLogin());
    }

    @Then("Verify display text lock app")
    public void verify_display_text_lock_app() {
  Assert.assertTrue(new SettingAndSecurityPage().isDisplayLockApp());
    }

    @Then("Verify text button lock app {string}")
    public void verify_text_button_lock_app(String noSet) {
        Assert.assertEquals(noSet,new SettingAndSecurityPage().getTextNoSetup());
    }

    @Then("Verify text lock app Finhay by Pin {string}")
    public void verify_text_lock_app_finhay_by_pin(String pin) {
        Assert.assertEquals(pin,new SettingAndSecurityPage().getTextPin());
    }

    @Then("Verify button change password display")
    public void verify_button_change_password_display() {
  Assert.assertTrue(new SettingAndSecurityPage().isDisplayChangePassBtn());
    }

    @When("I click switch Facebook")
    public void i_click_switch_facebook() {
  new SettingAndSecurityPage().clickToSwitchFB();
    }

    @Then("Display title connect to Facebook {string}")
    public void display_title_connect_to_facebook(String title) {
        Assert.assertEquals(title,new SettingAndSecurityPage().getTextTitleFB());
    }

    @Then("Display message text confirm connect to FB {string}")
    public void display_message_text_confirm_connect_to_fb(String message) {
        Assert.assertEquals(message,new SettingAndSecurityPage().getTextMessageConfirmFB());
    }

    @Then("Display button Cancel")
    public void display_button_cancel() {
 Assert.assertTrue(new SettingAndSecurityPage().isDisplayCancelFB());
    }

    @Then("Display button Confirm")
    public void display_button_confirm() {
        Assert.assertTrue(new SettingAndSecurityPage().isDisplayConfirmFB());
    }

    @When("I click cancel button")
    public void i_click_cancel_button() {
        new SettingAndSecurityPage().clickToCancelFB();
    }

    @Then("Verify text connect to FB {string}")
    public void verify_text_connect_to_fb(String text) {
  Assert.assertEquals(text,new SettingAndSecurityPage().getTextSwitchConnectFB());
    }


    @When("I Click button look app")
    public void i_click_button_look_app() {
  new SettingAndSecurityPage().clickToLockApp();
    }

    @Then("Verify display button setup PIN code enable")
    public void verify_display_button_setup_pin_code_enable() {
  Assert.assertTrue(new SettingAndSecurityPage().isEnbledSetUpPinCode());
    }

    @Then("Verify display button change PIN code disable")
    public void verify_display_button_change_pin_code_disable() {
        Assert.assertFalse(new SettingAndSecurityPage().isEnbledChangePinCode());
    }

    @Then("Verify text wanning {string}")
    public void verify_text_wanning(String text) {
  Assert.assertEquals(text,new SettingAndSecurityPage().getTextWanning());
    }

    @When("I click button setup Pin code")
    public void i_click_button_setup_pin_code() {
  new SettingAndSecurityPage().clickToSetUpPinCode();
    }

    @When("I click button Pin one")
    public void i_click_button_pin_one() {
  new SettingAndSecurityPage().clickToButtonPin1();
    }

    @Then("Verify display screen confirm Pin {string}")
    public void verify_display_screen_confirm_pin(String confirm) {
  Assert.assertEquals(confirm,new SettingAndSecurityPage().getTextConfirmNewPinText());
    }

    @When("I click button confirm Pin two")
    public void i_click_button_confirm_pin_two() {
        new SettingAndSecurityPage().clickToButtonPin2();
    }

    @Then("Display message confirm pin wrong {string}")
    public void display_message_confirm_pin_wrong(String error) {
        Assert.assertEquals(error,new SettingAndSecurityPage().getTextErrorMessagePin());
    }

    @Then("Display message successful confirm Pin {string}")
    public void display_message_successful_confirm_pin(String success) {
        Assert.assertEquals(success,new SettingAndSecurityPage().getTextMessageSucessPin());
    }

    @Then("I Click button Back")
    public void i_click_button_back() {
     new BasePage().back();
    }

    @Then("I click Back")
    public void i_click_back() {
  new SettingAndSecurityPage().clickToBackBtn();
    }

    @Then("Verify text after lock app {string}")
    public void verify_text_after_lock_app(String text) {
  Assert.assertEquals(text,new SettingAndSecurityPage().getTextNoSetup());
    }

    @Then("And Verify display button change PIN code enable")
    public void and_verify_display_button_change_pin_code_enable() {
  Assert.assertTrue(new SettingAndSecurityPage().isEnbledChangePinCode());
    }

    @When("I click button change pin")
    public void i_click_button_change_pin() {
  new SettingAndSecurityPage().clickToChangePin();
    }

    @When("I click button change pin five")
    public void i_click_button_change_pin_five() {
        new SettingAndSecurityPage().clickToPinChange5Btn();
    }

    @Then("Verify error message change pin {string}")
    public void verify_error_message_change_pin(String pin) {
  Assert.assertEquals(pin,new SettingAndSecurityPage().getTextMessageChangePin());
    }

    @When("I click button change pin one")
    public void i_click_button_change_pin_one() {
        new SettingAndSecurityPage().clickToPinChange1Btn();    }

    @Then("Verify go to screen input new pin display {string}")
    public void verify_go_to_screen_input_new_pin_display(String newPin) {
        Assert.assertEquals(newPin,new SettingAndSecurityPage().getTextInputNewPin());
    }

    @Then("Verify display message the same old pin {string}")
    public void verify_display_message_the_same_old_pin(String old) {
        Assert.assertEquals(old,new SettingAndSecurityPage().getTextMessageSameOldPin());
    }

    @When("I click button Pin two")
    public void i_click_button_pin_two() {
  new SettingAndSecurityPage().clickToPinChange2Btn();
    }

    @When("I click clear Pin")
    public void i_click_clear_pin() {
        new SettingAndSecurityPage().clickToDeletePinBtn();
    }

    @Then("Verify message clear pin {string}")
    public void verify_message_clear_pin(String message) {
        Assert.assertEquals(message,new SettingAndSecurityPage().getTextMessageDeletePin());
    }

    @Given("I click button ok popup clear pin")
    public void i_click_button_ok_popup_clear_pin() {
        new SettingAndSecurityPage().clickToOkPopupDeletePin();
    }

    @When("I click button pin login two")
    public void i_click_button_pin_login_two() {
  new SettingAndSecurityPage().clickToPinChange2Btn();
    }


    @When("I click button off Pin code")
    public void i_click_button_off_pin_code() {
        new SettingAndSecurityPage().clickToSetUpPinCode();
    }


    @When("I click button change password")
    public void i_click_button_change_password() {
        new SettingAndSecurityPage().clickToChangePass();
    }

    @Then("Verify button confirm change password disable")
    public void verify_button_confirm_change_password_disable() throws Exception {
  Assert.assertFalse(new SettingAndSecurityPage().isEnabledConfirmChangePassword());
    }

    @When("I input current password is {string}")
    public void i_input_current_password_is(String current) {
        new SettingAndSecurityPage().inputToCurrentPass(current);
    }

    @When("I input new password is {string}")
    public void i_input_new_password_is(String newPass) {
        new SettingAndSecurityPage().inputToNewPass(newPass);
    }

    @When("I input confirm new password is {string}")
    public void i_input_confirm_new_password_is(String confirm) throws Exception {
        new SettingAndSecurityPage().inputToConfirmNewPass(confirm);
    }

    @When("I click button confirm change password")
    public void i_click_button_confirm_change_password() {
        new SettingAndSecurityPage().clickToConfirmChangePass();
    }

    @Then("Verify display message current password {string}")
    public void verify_display_message_current_password(String message) {
        Assert.assertEquals(message,new SettingAndSecurityPage().getTextMessageErrorCurrentPass());
    }

    @Then("Verify current password have format {string}")
    public void verify_current_password_have_format(String current) {
        Assert.assertEquals(current,new SettingAndSecurityPage().getTextFormatHideCurrentPass());
    }

    @Then("Verify new password have format {string}")
    public void verify_new_password_have_format(String newPass) {
        Assert.assertEquals(newPass,new SettingAndSecurityPage().getTextFormatHideNewPass());
    }

    @Then("Verify confirm new pass have format {string}")
    public void verify_confirm_new_pass_have_format(String confirm) {
        Assert.assertEquals(confirm,new SettingAndSecurityPage().getTextFormatHideConfirmPass());
    }

    @When("I click button show current new pass")
    public void i_click_button_show_current_new_pass() {
        new SettingAndSecurityPage().clickToShowCurrentPass();
    }

    @When("I click button show new pass")
    public void i_click_button_show_new_pass() {
        new SettingAndSecurityPage().clickToShowNewPass();
    }

    @When("I click button show confirm new pass")
    public void i_click_button_show_confirm_new_pass() {
        new SettingAndSecurityPage().clickToShowConfirmNewPass();
    }

    @Then("Verify current pass show {string}")
    public void verify_current_pass_show(String pass) {
        Assert.assertEquals(pass,new SettingAndSecurityPage().getTextFormatHideCurrentPass());
    }

    @Then("Verify new password show {string}")
    public void verify_new_password_show(String newPass) {
        Assert.assertEquals(newPass,new SettingAndSecurityPage().getTextFormatHideNewPass());
    }

    @Then("Verify confirm new pass show {string}")
    public void verify_confirm_new_pass_show(String confirm) {
        Assert.assertEquals(confirm,new SettingAndSecurityPage().getTextFormatHideConfirmPass());
    }

    @Then("Verify error message confirm new password {string}")
    public void verify_error_message_confirm_new_password(String message) {
        Assert.assertEquals(message,new SettingAndSecurityPage().getTextErrorMessConfirmPass());
    }

    @Then("Verify error message new password {string}")
    public void verify_error_message_new_password(String error) {
        Assert.assertEquals(error,new SettingAndSecurityPage().getTextErrorMessNewPass());
    }

    @Then("Verify message change password successful {string}")
    public void verify_message_change_password_successful(String success) {
        Assert.assertEquals(success,new SettingAndSecurityPage().getTextChangPassSuccess());
    }

    @Given("I click button return homepage")
    public void i_click_button_return_homepage() {
        new SettingAndSecurityPage().clickToReturnHome();
    }

    @Then("Verify error login wrong pass is {string}")
    public void verify_error_login_wrong_pass_is(String wrong) {
        Assert.assertEquals(wrong,new SettingAndSecurityPage().getTextErrorMessLogin());
    }

    @Given("I click button ok popup error message login")
    public void i_click_button_ok_popup_error_message_login() {
        new SettingAndSecurityPage().clickToOkErrorLogin();
    }

}
