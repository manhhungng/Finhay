package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Random;

public class RegisterStepDef {
    String mail,phoneNumber;

    @Given("I Click button Skips")
    public void i_click_button_skips() {
        new RegisterPage().clickToSkipsBtn();
    }
    @When("I click button Register")
    public void i_click_button_register() {
new RegisterPage().clickToRegisterBtn();
    }
    @Then("Verify button Register by Google display")
    public void verify_button_register_by_google_display() {
        Assert.assertTrue(new RegisterPage().isDisplayRegisterByGoogleBtn());
    }
    @Then("Verify button Register by Phone display")
    public void verify_button_register_by_phone_display() {
        Assert.assertTrue(new RegisterPage().isDisplayRegisterByPhoneBtn());
    }

    @When("I input last name {string}")
    public void i_input_last_name(String lastName) {
        new RegisterPage().inputToFirstName(lastName);
    }
    @When("I input first name {string}")
    public void i_input_first_name(String name) {
        new RegisterPage().inputToName(name);
    }
    @Then("Verify button Continue step one enable")
    public void verify_button_continue_step_one_enable() {
       Assert.assertFalse(new RegisterPage().isEnableContinue1Btn());
    }
    @When("I click button Continue steps one")
    public void i_click_button_continue_steps_one() {
       new RegisterPage().clickToContinue1Btn();
    }
    @Then("Verify button Continue step two disable")
    public void verify_button_continue_step_two_disable() {
        Assert.assertFalse(new RegisterPage().isEnableContinue2Btn());
    }
    
    @When("I click button Continue step two")
    public void i_click_button_continue_step_two() {
        new RegisterPage().clickToContinue2Btn();
    }
    @Then("Verify error email message {string}")
    public void verify_error_email_message(String error) {
       Assert.assertEquals(error,new RegisterPage().getTextErrorEmail());
    }
    @Then("Verify icon email error display")
    public void verify_icon_email_error_display() {
        Assert.assertTrue(new RegisterPage().isDisplayIconErrorEmail());
    }
    
    @When("I input to Phone {string}")
    public void i_input_to_phone(String phone) {
       new RegisterPage().inputToPhoneTxt(phone);
    }
    @Then("Verify error message Phone display {string}")
    public void verify_error_message_phone_display(String error) {
        Assert.assertEquals(error,new RegisterPage().getTextErrorPhone());
    }

    @When("I input to Phone correct")
    public void i_input_to_phone_correct() {
        phoneNumber = "098" + randomNumber();
        new RegisterPage().inputToPhoneTxt(phoneNumber);
    }
    @When("I input to Email correct")
    public void i_input_to_email_correct() {
        mail = "johnterry" + randomNumber() + "@gmail.vn";
        new RegisterPage().inputToEmailTxt(mail);
    }

    @Then("Verify button Complete Register disable")
    public void verify_button_complete_register_disable() {
       Assert.assertFalse(new RegisterPage().isEnableContinue3Btn());
    }
    @Then("Verify display text Minimum of {int} characters")
    public void verify_display_text_minimum_of_characters(Integer int1) {
       Assert.assertTrue(new RegisterPage().isDisplayLengChar());
    }
    @Then("Verify display text There is {int} capital letter")
    public void verify_display_text_there_is_capital_letter(Integer int1) {
        Assert.assertTrue(new RegisterPage().isDisplayCapChar());
    }
    @Then("Verify display text MThere is {int} special character")
    public void verify_display_text_m_there_is_special_character(Integer int1) {
        Assert.assertTrue(new RegisterPage().isDisplaySpecialChar());
    }
    @Then("Verify display text There is {int} lower case letter")
    public void verify_display_text_there_is_lower_case_letter(Integer int1) {
        Assert.assertTrue(new RegisterPage().isDisplayNomalChar());
    }

    @When("I input password {string}")
    public void i_input_password(String pass) {
       new RegisterPage().inputToPasswordTxt(pass);
    }
    @When("I selected checkbox terms of use")
    public void i_selected_checkbox_terms_of_use() {
       new RegisterPage().clickToCheckboxPolicy();
    }
    @When("I selected checkbox commitment")
    public void i_selected_checkbox_commitment() {
        new RegisterPage().clickToCheckboxOld();
    }
    @When("I input confirm password {string}")
    public void i_input_confirm_password(String confirmPass) {
       new RegisterPage().inputToConfirmPasswordTxt(confirmPass);
    }
  
    @Then("Verify password textbox display {string}")
    public void verify_password_textbox_display(String textPass ) {
       Assert.assertEquals(textPass,new RegisterPage().getTextPasswortTxt());
    }
    @Then("Verify confirm password textbox display {string}")
    public void verify_confirm_password_textbox_display(String textConfirmPass) {
        Assert.assertEquals(textConfirmPass,new RegisterPage().getTextConfirmPasswordTxt());
    }
    @When("I Click button Show password")
    public void i_click_button_show_password() {
       new RegisterPage().clickToShowPasswordBtn();
    }
    @When("I Click button Show confirm password")
    public void i_click_button_show_confirm_password() {
        new RegisterPage().clickToShowConfirmPasswordBtn();
    }
    @Then("Verify password textbox show {string}")
    public void verify_password_textbox_show(String passShow ) {
        Assert.assertEquals(passShow,new RegisterPage().getTextPasswortTxt());
    }
    @Then("Verify confirm password textbox show {string}")
    public void verify_confirm_password_textbox_show(String confirmPassShow) {
        Assert.assertEquals(confirmPassShow,new RegisterPage().getTextConfirmPasswordTxt());
    }

    @When("I click button Completed Register")
    public void i_click_button_completed_register() {
       new RegisterPage().clickToContinue3Btn();
    }
    @Then("verify error message wrong confirm password {string}")
    public void verify_error_message_wrong_confirm_password(String errorConfirmPass) {
       Assert.assertEquals(errorConfirmPass,new RegisterPage().getTextConfirmPasswordError());
    }
    @When("I click link terms of use")
    public void i_click_link_terms_of_use() {
       new RegisterPage().clickToPolicyLink();
    }
    @Then("Verify file pdf display")
    public void verify_file_pdf_display() {
       Assert.assertTrue(new RegisterPage().isDisplayFilePDFPolicy());
    }
    @Then("Click button back out terms of use")
    public void click_button_back_out_terms_of_use() {
       new RegisterPage().clickToBackBtn();
    }
    
    @Then("Verify button Active now display")
    public void verify_button_active_now_display() {
       Assert.assertTrue(new RegisterPage().isDisplayActiveNowBtn());
    }
    @Then("Verify button Skip display")
    public void verify_button_skip_display() {
        Assert.assertTrue(new RegisterPage().isDisplaySkipBtn());
    }

    @When("I Click button Skip")
    public void i_click_button_skip() {
       new RegisterPage().clickToSkipActiveBtn();
    }
    @Then("Verify button OK, I will validate the OTP display")
    public void verify_button_ok_i_will_validate_the_otp_display() {
        Assert.assertTrue(new RegisterPage().isDisplayOKActiveBtn());
    }
    @Then("I still want to skip this step display")
    public void i_still_want_to_skip_this_step_display() {
        Assert.assertTrue(new RegisterPage().isDisplayStillSkipBtn());
    }

    @When("I Click button confirm skip")
    public void i_click_button_confirm_skip() {
       new RegisterPage().clickToStillSkipBtn();
    }
    @Then("Verify button Discover Now display")
    public void verify_button_discover_now_display() {
        Assert.assertTrue(new RegisterPage().isDisplayDiscoverNowBtn());
    }

    @When("I Click button Discover Now")
    public void i_click_button_discover_now() {
       new RegisterPage().clickToDiscoverNowBtn();
    }
    @Then("Verify avatar display")
    public void verify_avatar_display() {
        Assert.assertTrue(new RegisterPage().isDisplayAvatarBtn());
    }
    @When("I Click to Avatar")
    public void i_click_to_avatar()  {
        new RegisterPage().clickToAvatarBtn();


    }
    @When("I Click button Logout")
    public void i_click_button_logout() throws Exception {
       new RegisterPage().clickToLogoutBtn();
    }
    @When("I Click button OK")
    public void i_click_button_ok() {
       new RegisterPage().clickToOkInPopUp();
    }


    @Given("I click button Regiser by Phone")
    public void i_click_button_regiser_by_phone() {
       new RegisterPage().clickToRegisterByPhone();
    }

  
    @Then("Verify error message popup {string}")
    public void verify_error_message_popup(String errorMessage) {
       Assert.assertEquals(errorMessage,new RegisterPage().getTextErorrMessagePopup());
    }
    @Then("I Click button ok in popup")
    public void i_click_button_ok_in_popup() {
        new RegisterPage().clickToOkInPopUp();
    }
    @Then("I Click Back in steps {int}")
    public void i_click_back_in_steps(Integer int1) {
       new RegisterPage().clickToBackStep3Btn();
    }
   
    @When("I click Active now")
    public void i_click_active_now() {
        new RegisterPage().clickToActiveBtn();
    }

    @Then("Verify display button seen OTP SMS")
    public void verify_display_button_seen_otp_sms() {
       Assert.assertTrue(new RegisterPage().isDisplaySeenOTPSMSBtn());
    }
    @Then("Verify button I had code")
    public void verify_button_i_had_code() {
       Assert.assertTrue(new RegisterPage().isDisplayHaveOTP());
    }

    @When("I click button seen OTP SMS")
    public void i_click_button_seen_otp_sms() {
       new RegisterPage().clickToSeenOTPSMSBtn();
    }
    @Then("Verify content code display")
    public void verify_content_code_display() {
       Assert.assertTrue(new RegisterPage().isDisplayContentCodeText());
    }
    @Then("I click icon Close")
    public void i_click_icon_close() {
      new RegisterPage().clickToIconClose();
    }

    @When("I Click button Agree")
    public void i_click_button_agree() {
       new RegisterPage().clickToAgreeBtn();
    }
    @Then("Verify textbox input pincode display")
    public void verify_textbox_input_pincode_display() {
       Assert.assertTrue(new RegisterPage().isDisplayPinCodeTxt());
    }

    @When("I input pincode {string}")
    public void i_input_pincode(String pinCode) {
       new RegisterPage().inputToPinCodeTxt(pinCode);
    }
    @When("I click Active when input code")
    public void i_click_active_when_input_code() {
       new RegisterPage().clickToSeenOTPSMSBtn();
    }

    @When("I click button Register by Phone")
    public void i_click_button_register_by_phone() {
     new RegisterPage().clickToRegisterByPhone();
    }

    @Then("Veriry button Continue step one disable")
    public void veriry_button_continue_step_one_disable() {
   Assert.assertFalse(new RegisterPage().isEnableContinue1Btn());
    }

    @When("I input last name is {string}")
    public void i_input_last_name_is(String name) {
     new RegisterPage().inputToName(name);
    }

    @Then("Veriry button Continue step one enable")
    public void veriry_button_continue_step_one_enable() {
       Assert.assertTrue(new RegisterPage().isEnableContinue1Btn());
    }

    @Then("Verify icon phone error display")
    public void verify_icon_phone_error_display() {
       Assert.assertTrue(new RegisterPage().isDisplayIconPhoneError());
    }

    @When("I click button Continue in step two")
    public void i_click_button_continue_in_step_two() {
        new RegisterPage().clickToContinue2Btn();
    }

    @Then("Verify display text There is {int} special character")
    public void verify_display_text_there_is_special_character(Integer int1) {
      Assert.assertTrue(new RegisterPage().isDisplaySpecialChar());
    }

    public int randomNumber() {
        Random rand = new Random();
        return rand.nextInt(9999999);
    }
    @When("I input to Email {string}")
    public void i_input_to_email(String email) {
     new RegisterPage().inputToEmailTxt(email);
    }


}
