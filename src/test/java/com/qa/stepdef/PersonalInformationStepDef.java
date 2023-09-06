package com.qa.stepdef;

import com.qa.pages.BasePage;
import com.qa.pages.PersonalInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PersonalInformationStepDef {

    PersonalInformationPage personalInfo = new PersonalInformationPage();

    @When("I click button profile")
    public void i_click_button_profile() {
        new PersonalInformationPage().clickToProfileBtn();
    }

    @Then("Verify button Active Now display")
    public void verify_button_active_now_display() {
        Assert.assertTrue(new PersonalInformationPage().isDisplayActiveNowBtn());
    }

    @Then("Display phone number is {string}")
    public void display_phone_number_is(String phone) {
        Assert.assertEquals(phone,new PersonalInformationPage().getTextPhone());
    }

    @Then("display email is {string}")
    public void display_email_is(String email) {
        Assert.assertEquals(email,new PersonalInformationPage().getTextEmail());
    }

    @Then("display  text is {string}")
    public void display_text_is(String notice) {
        Assert.assertEquals(notice,new PersonalInformationPage().getTextNoticeActive());
    }

    @Then("Verify display full name is {string}")
    public void verify_display_full_name_is(String fullName) throws Exception {
        Assert.assertEquals(fullName,new PersonalInformationPage().getTextFullName());
    }

    @Then("Verify display gender is {string}")
    public void verify_display_gender_is(String gender) throws Exception {
        Assert.assertEquals(gender,new PersonalInformationPage().getTextGender());
    }

    @Then("Verify display date of birth is {string}")
    public void verify_display_date_of_birth_is(String date) {
        Assert.assertEquals(date,new PersonalInformationPage().getTextDateOfBirth());
    }

    @Then("Verify display address is {string}")
    public void verify_display_address_is(String address) throws Exception {
        Assert.assertEquals(address,new PersonalInformationPage().getTextAddress());
    }

    @Then("Verify display tax code is {string}")
    public void verify_display_tax_code_is(String code) throws Exception {
        Assert.assertEquals(code,new PersonalInformationPage().getTextTaxNumber());
    }

    @Then("Verify display job is {string}")
    public void verify_display_job_is(String job) throws Exception {
        Assert.assertEquals(job,new PersonalInformationPage().getTextJob());
    }

    @When("I click button update info")
    public void i_click_button_update_info() throws Exception {
        new PersonalInformationPage().clickToUpdateBtn();
    }

    @When("I click button Save info")
    public void i_click_button_save_info() throws Exception {
        new PersonalInformationPage().clickToSaveBtn();
    }

    @When("display error message no input field required {string}")
    public void display_error_message_no_input_field_required(String errorMessage) {
        Assert.assertEquals(errorMessage,new PersonalInformationPage().getTextMessagePopup());
    }

    @Given("I click button ok in popup error message")
    public void i_click_button_ok_in_popup_error_message() {
        new PersonalInformationPage().clickToOkPopup();
    }


    @When("I click button District")
    public void i_click_button_district() throws Exception {
        new PersonalInformationPage().clickIconDistrict();
    }
    
    @When("I click button Ward")
    public void i_click_button_ward() throws Exception {
        new PersonalInformationPage().clickIconWard();
    }

    @When("I click province")
    public void i_click_province() {
        new PersonalInformationPage().clickIconProvince();
    }

    @When("I click button OK in dropdown")
    public void i_click_button_ok_in_dropdown() {
        new PersonalInformationPage().clickOkDropDown();
    }

    @When("I input detail address is {string}")
    public void i_input_detail_address_is(String address) throws Exception {
        new PersonalInformationPage().inputToAddressText(address);
    }

    @Then("Verify display province is {string}")
    public void verify_display_province_is(String province) {
        Assert.assertEquals(province,new PersonalInformationPage().getTextProvinceTxt());
    }

    @Then("Verify display District is {string}")
    public void verify_display_district_is(String district) {
        Assert.assertEquals(district,new PersonalInformationPage().getTextDistrictTxt());
    }

    @Then("Verify display Ward is {string}")
    public void verify_display_ward_is(String ward) {
        Assert.assertEquals(ward,new PersonalInformationPage().getTextWardTxt());
    }


    @When("I click icon date of birth")
    public void i_click_icon_date_of_birth() {
        new PersonalInformationPage().clickIconDateOfBirth();
    }

    @Then("display date of birth is {string}")
    public void display_date_of_birth_is(String date) {
        Assert.assertEquals(date,new PersonalInformationPage().getTextDateOfBirthTxt());
    }
    
    @When("I click gender")
    public void i_click_gender() {
        new PersonalInformationPage().clickIconGender();
    }

    @When("I choose female")
    public void i_choose_female() {
        new PersonalInformationPage().clickChooseFemale();
    }

    @When("I click button Done")
    public void i_click_button_done() {
        new PersonalInformationPage().clickToDone();
    }

    @Then("Verify textbox gender display {string}")
    public void verify_textbox_gender_display(String gender) {
        Assert.assertEquals(gender,new PersonalInformationPage().getTextGenderTxt());
    }
    
    @Then("display message notice is {string}")
    public void display_message_notice_is(String message) {
        Assert.assertEquals(message,new PersonalInformationPage().getTextMessagePopup());
    }

    @Then("Verify button cancel display")
    public void verify_button_cancel_display() {
        Assert.assertTrue(new PersonalInformationPage().isDisplayCancelInfoBtn());
    }

    @Then("Verify button confirm display")
    public void verify_button_confirm_display() {
        Assert.assertTrue(new PersonalInformationPage().isDisplayConfirmInfoBtn());
    }

    @When("I click button cancel in info")
    public void i_click_button_cancel_in_info() {
        new PersonalInformationPage().clickCancelInfoBtn();
    }

    @Then("verify screen display is {string}")
    public void verify_screen_display_is(String screen) {
        Assert.assertEquals(screen,new PersonalInformationPage().getTextScreenUpdatePF());
    }

    @When("I click button confirm")
    public void i_click_button_confirm() {
        new PersonalInformationPage().clickConfirmInfoBtn();
    }

    @Then("Verify message update personal information success display is {string}")
    public void verify_message_update_personal_information_success_display_is(String success) {
        Assert.assertEquals(success,new PersonalInformationPage().getTextMessagePopup());
    }

    @When("I click button phone number")
    public void i_click_button_phone_number() {
        new PersonalInformationPage().clickPhoneNumberBtn();
    }

    @Then("Display phone number is phone registered {string}")
    public void display_phone_number_is_phone_registered(String phone) {
        Assert.assertEquals(phone,new PersonalInformationPage().getTextPhoneTxt());
    }

    @Then("Display button resend OTP SMS")
    public void display_button_resend_otp_sms() {
        Assert.assertTrue(new PersonalInformationPage().isDisplayOtpSMSBtn());
    }

    @Then("Display button I have code active")
    public void display_button_i_have_code_active() {
        Assert.assertTrue(new PersonalInformationPage().isDisplayHaveCodeBtn());
    }

    @When("I input phone is {string}")
    public void i_input_phone_is(String phone) {
        new PersonalInformationPage().inputToPhoneTxt(phone);
    }

    @When("I click button resend OTP SMS")
    public void i_click_button_resend_otp_sms() throws Exception {
        new PersonalInformationPage().clickToOtpSMSBtn();
    }

    @When("I click button submit in popup")
    public void i_click_button_submit_in_popup() {
        new PersonalInformationPage().clickToSubmitActiveBtn();
    }

    @Then("display error message active account {string}")
    public void display_error_message_active_account(String message) {
        Assert.assertEquals(message,new PersonalInformationPage().getTextMessagePopup());
    }
    
    @Then("Verify button resend SMS disable")
    public void verify_button_resend_sms_disable() {
        Assert.assertFalse(new PersonalInformationPage().isEnableResendSMSBtn());
    }

    @Then("Verify button resend Phone disable")
    public void verify_button_resend_phone_disable() {
        Assert.assertFalse(new PersonalInformationPage().isEnableResendPhoneBtn());
    }

    @Then("Verify display message Facebook display")
    public void verify_display_message_facebook_display() {
        Assert.assertTrue(new PersonalInformationPage().isDisplaySupportFBBtn());
    }

    @When("I input OTP textbox is {string}")
    public void i_input_otp_textbox_is(String otp) {
        new PersonalInformationPage().inputToOtpTxt(otp);
    }

    @When("I click  button Active Now")
    public void i_click_button_active_now() {
        new PersonalInformationPage().clickToActiveNowBtn();
    }

    @Then("Verify phone number display activated is {string}")
    public void verify_phone_number_display_activated_is(String phone) {
        Assert.assertEquals(phone,new PersonalInformationPage().getTextPhone());
    }

    @Then("Verify display notice active success {string}")
    public void verify_display_notice_active_success(String notice) {
        Assert.assertEquals(notice,new PersonalInformationPage().getTextNotiActivated());
    }

    @Given("Click button return page")
    public void click_button_return_page() {
        new PersonalInformationPage().clickToReturnPage();
    }

    @When("I click button email")
    public void i_click_button_email() {
        new PersonalInformationPage().clickEmailBtn();
    }

    @Then("Verify display notice active email is {string}")
    public void verify_display_notice_active_email_is(String notice) {
        Assert.assertEquals(notice,new PersonalInformationPage().getTextNotiCheckMail());
    }

    @Then("Display button send")
    public void display_button_send() {
        Assert.assertTrue(new PersonalInformationPage().isDisplaySendBtn());
    }

    @Given("I click button send")
    public void i_click_button_send() {
        new PersonalInformationPage().clickToSendBtn();
    }

    @Then("Display message send email {string}")
    public void display_message_send_email(String message) {
        Assert.assertEquals(message,new PersonalInformationPage().getTextMessageSentEmail());
    }

    @When("I click button input OTP")
    public void i_click_button_input_otp() {
        new PersonalInformationPage().clickToInputOTPBtn();
    }
    
    @Then("Verify button Switch to activation by Phone display")
    public void verify_button_switch_to_activation_by_phone_display() {
        Assert.assertTrue(new PersonalInformationPage().isDisplayActiveBtn());
    }

    @When("I click button Switch to activation by Phone")
    public void i_click_button_switch_to_activation_by_phone() {
        new PersonalInformationPage().clickToChangeActivePhoneBtn();
    }
    
    @When("I delete profile")
    public void i_delete_profile() {
        PersonalInformationPage.deleteProfileInDB();
    }

    @When("I delete user id activated phone and email")
    public void i_delete_user_id_activated_phone_and_email() {
        PersonalInformationPage.deleteUserIDActivePhoneAndEmail();
        PersonalInformationPage.updateOTP();
    }
    @Given("Push file")
    public void push_file() throws Exception {
       new BasePage().pushFileToDevice("image.jpeg");
    }

    @When("I click button Change avatar")
    public void i_click_button_change_avatar() {
new PersonalInformationPage().clickToChangeAvatarBtn();
    }

    @When("I click button choose from gallery")
    public void i_click_button_choose_from_gallery() {
        new PersonalInformationPage().clickToChooseFromGalley();
    }


    @When("I click camera")
    public void i_click_camera() {
        new PersonalInformationPage().clickToCameraBtn();
    }

    @When("I click confirm choose button")
    public void i_click_confirm_choose_button() {
        new PersonalInformationPage().clickToConfirmChooseBtn();
    }
    @When("I click button allow to take picture")
    public void i_click_button_allow_to_take_picture() {
        new PersonalInformationPage().clickToAllowTakePictureBtn();
    }

    @When("I click button allow finhay to access photo")
    public void i_click_button_allow_finhay_to_access_photo() {
        new PersonalInformationPage().clickToAllowTakePictureBtn();
    }
    @When("I click choose image")
    public void i_click_choose_image() {
        new PersonalInformationPage().clickToChooseImage();
    }

    @And("Verify profile screen displayed")
    public void verifyProfileScreenDisplayed() {
        Assert.assertTrue(personalInfo.verifyTitle());
    }
}
