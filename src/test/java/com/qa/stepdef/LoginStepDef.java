package com.qa.stepdef;



import com.qa.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.sql.SQLException;
import java.util.List;
import java.util.Map;


public class LoginStepDef {
    @When("I Click button Login in welcome screen")
    public void i_click_button_login_in_welcome_screen() {
     new LoginPage().clickToLoginWelcomeBtn();
    }

    @Then("Verify button Login disable")
    public void verify_button_login_disable() {
     Assert.assertFalse(new LoginPage().isEnbledLoginBtn());
    }

    @When("I input email {string}")
    public void i_input_email(String username) {
     new LoginPage().inputToUsername(username);
    }

    @When("I input password1 {string}")
    public void i_input_password1(String password) {
     new LoginPage().inputToPasswordLogin(password);
    }

    @When("I click button Login")
    public void i_click_button_login() {
        new LoginPage().clickToLogin();
    }

    @Then("Verify error message under password {string}")
    public void verify_error_message_under_password(String message) {
     Assert.assertEquals(message,new LoginPage().getTextmessageErrorPassword());
    }

    @Then("Verify error message popup display {string}")
    public void verify_error_message_display(String messagePopup) {
     Assert.assertEquals(messagePopup,new LoginPage().getTextmessageError());
    }

    @Given("I Click ok in popup")
    public void i_click_ok_in_popup() {
     new LoginPage().clickOkInPopupError();
    }

    @When("I input phone {string}")
    public void i_input_phone(String phone) {
     new LoginPage().inputToUsername(phone);
    }

    @When("I click button show password")
    public void i_click_button_show_password() {
        new LoginPage().clickShowPassLogin();
    }

    @Then("Verify password display {string}")
    public void verify_password_display(String pass) {
     Assert.assertEquals(pass,new LoginPage().getTextPasswordLogin());
    }

    @When("I click button hide password")
    public void i_click_button_hide_password() {
        new LoginPage().clickShowPassLogin();
    }

    @Then("verify home screen display")
    public void verify_home_screen_display() {
     Assert.assertTrue(new LoginPage().isDisplayedNameTextInHome());
    }
    
    @When("I click forgot password")
    public void i_click_forgot_password() throws Exception {
     new LoginPage().clickToForgotPassword();
    }

    @Then("Verify button confirm forgot password disable")
    public void verify_button_confirm_forgot_password_disable() {
     Assert.assertFalse(new LoginPage().isEnabledConfirmForgotPass());
    }

    @When("I input email forgot password with value {string}")
    public void i_input_email_forgot_password_with_value(String email) {
     new LoginPage().inputToemailForgotPass(email);
    }

    @When("I click button confirm forgot password")
    public void i_click_button_confirm_forgot_password() {
     new LoginPage().clickToConfirmForgotPass();
    }

    @Then("Verify error message wrong email display {string}")
    public void verify_error_message_wrong_email_display(String message) {
     Assert.assertEquals(message,new LoginPage().getTextEmailErrorForgotPass());
    }

    @Then("Verify message sent otp code to gmail display {string}")
    public void verify_message_sent_otp_code_to_gmail_display(String message) {
        Assert.assertEquals(message,new LoginPage().getTextMessageSeenOTP());
    }

    @Given("I click button ok in popup")
    public void i_click_button_ok_in_popup() {
     new LoginPage().clickToOkPopupSeenOTP();
    }

    @When("I input otp with value {string}")
    public void i_input_otp_with_value(String otp) {
     new LoginPage().inputToPinCodeTxt(otp);
    }

    @When("I click button confirm OTP")
    public void i_click_button_confirm_otp() {
     new LoginPage().clickToConfirmOTPBtn();
    }

    @Then("Verify display error message OTP {string}")
    public void verify_display_error_message_otp(String error) {
     Assert.assertEquals(error,new LoginPage().getTextmessageError());
    }

    @When("I input new password {string}")
    public void i_input_new_password(String pass) throws Exception {
     new LoginPage().inputToNewPass(pass);
    }

    @When("I input confirm password is {string}")
    public void i_input_confirm_password_is(String confirmPass) {
     new LoginPage().inputToConfirmNewPass(confirmPass);
    }
    

    @When("I click button show new password")
    public void i_click_button_show_new_password() {
     new LoginPage().clickToShowNewPassBtn();
    }

    @When("I click button show confirm new password")
    public void i_click_button_show_confirm_new_password() {
     new LoginPage().clickToShowConfirmPass();
    }

    @Then("Verify new pass show {string}")
    public void verify_new_pass_show(String newPass) {
     Assert.assertEquals(newPass,new LoginPage().getTextNewPass());
    }

    @Then("Verify confirm password show {string}")
    public void verify_confirm_password_show(String confirmPass) {
     Assert.assertEquals(confirmPass,new LoginPage().getTextConfirmPass());
    }

    @When("I click button confirm change pass")
    public void i_click_button_confirm_change_pass() {
     new LoginPage().clickToConfirmChangePassword();
    }

    @Then("Verify error message confirm password is {string}")
    public void verify_error_message_confirm_password_is(String message) {
     Assert.assertEquals(message,new LoginPage().getTextErrorConfirmPassword());
    }

    @Then("Verify message change pass successful {string}")
    public void verify_message_change_pass_successful(String success) {
        Assert.assertEquals(success,new LoginPage().getTextChangePassSuccess());
    }

    @Given("I click button return home screen")
    public void i_click_button_return_home_screen() {
     new LoginPage().clickToReturnHome();
    }


    @Given("I update password_attempts in database is four time wrong")
    public void i_update_password_attempts_in_database_is_four_time_wrong() throws SQLException {
   new LoginPage().passwordAttemptsFourTimesInDB();
    }

    @Then("display message {string}")
    public void display_message(String message) {
        Assert.assertEquals(message,new LoginPage().getTextMessageWrongPassTimes());
    }

    @Given("I update password_attempts in database is nine time wrong")
    public void i_update_password_attempts_in_database_is_nine_time_wrong() throws SQLException {
     new LoginPage().passwordAttemptsNineTimesInDB();
    }

    @Given("I update password_attempts in database is fourteen time wrong")
    public void i_update_password_attempts_in_database_is_fourteen_time_wrong() throws SQLException {
     new LoginPage().passwordAttemptsFourteenTimesInDB();
    }
    

    @Given("Verify display Button confirm change Pass disable")
    public void verify_display_button_confirm_change_pass_disable() throws Exception {
     Assert.assertFalse(new LoginPage().isEnabledConfirChangePassword());
    }

    @Then("Verify button error message display {string}")
    public void verify_button_error_message_display(String messageError) {
       Assert.assertEquals(messageError,new LoginPage().getTextmessageError());
    }



}

