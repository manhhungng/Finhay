package com.qa.stepdef;

import com.qa.pages.MVP3_CreateReviPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MVP3_CreateReviStepDef {
    @When("I click bank CIMB")
    public void i_click_bank_cimb() throws Exception {
       new MVP3_CreateReviPage().clickToBankCIMB();
    }

    @Then("Verify display button Credit CIMB - Finhay")
    public void verify_display_button_credit_cimb_finhay() throws Exception {
        Assert.assertTrue(new MVP3_CreateReviPage().isDisplayReviCIMBBtn());
    }

    @Then("Verify display content text one CIMB {string}")
    public void verify_display_content_text_one_cimb(String text1) throws Exception {
       Assert.assertEquals(text1,new MVP3_CreateReviPage().getTextContentTextRevi1());
    }

    @Then("Verify display content text two CIMB {string}")
    public void verify_display_content_text_two_cimb(String text2) {
        Assert.assertEquals(text2,new MVP3_CreateReviPage().getTextContentTextRevi2());
    }

    @When("I click button Credit CIMB - Finhay")
    public void i_click_button_credit_cimb_finhay() {
       new MVP3_CreateReviPage().clickToReviCIMBBtn();
    }

    @Then("Verify button Start open credit CIMB disable")
    public void verify_button_start_open_credit_cimb_disable() {
       Assert.assertFalse(new MVP3_CreateReviPage().isEnableStartOpenCardBtn());
    }

    @When("I check in checkbox policy")
    public void i_check_in_checkbox_policy() {
       new MVP3_CreateReviPage().clickToCheckboxPolicy();
    }

    @Then("Verify button Start open credit CIMB enable")
    public void verify_button_start_open_credit_cimb_enable() {
        Assert.assertTrue(new MVP3_CreateReviPage().isEnableStartOpenCardBtn());
    }

    @When("I click button Start open credit CIMB")
    public void i_click_button_start_open_credit_cimb() {
        new MVP3_CreateReviPage().clickToStartOpenCardBtn();
    }

    @Then("Verify display icon visa card")
    public void verify_display_icon_visa_card() {
        Assert.assertTrue(new MVP3_CreateReviPage().isDisplayIconVisaCard());
    }

    @Then("Verify display seekbar")
    public void verify_display_seekbar() {
        Assert.assertTrue(new MVP3_CreateReviPage().isDisplaySeekBar());
    }

    @Then("Verify display button continue create revi")
    public void verify_display_button_continue_create_revi() {
        Assert.assertTrue(new MVP3_CreateReviPage().isDisplayContinueCreateRevi());
    }

    @When("I long press seekbar")
    public void i_long_press_seekbar() {
       new MVP3_CreateReviPage().longPressSeekBar();
    }

    @Then("I get text card limit is {string}")
    public void i_get_text_card_limit_is(String cardLimit) {
        Assert.assertEquals(cardLimit,new MVP3_CreateReviPage().getTextAmountLimitCardText().replace("\u00a0", ""));
    }
    @When("I click button continue create revi")
    public void i_click_button_continue_create_revi() {
        new MVP3_CreateReviPage().clickToContinueCreateRevi();
    }

    @When("Verify display steps one")
    public void verify_display_steps_one() {
        Assert.assertTrue(new MVP3_CreateReviPage().isDisplayTextStepOne());
    }

    @Given("I click button check in id front")
    public void i_click_button_check_in_id_front() {
        new MVP3_CreateReviPage().clickToIdFrontBtn();
    }

    @Given("I click button allow")
    public void i_click_button_allow() {
        new MVP3_CreateReviPage().clickToAllowCameraBtn();
        new MVP3_CreateReviPage().clickToAllowCameraBtn();
    }

    @Given("I click button camera")
    public void i_click_button_camera() {
        new MVP3_CreateReviPage().clickToCameraBtn();

    }

    @Given("I click button tick image")
    public void i_click_button_tick_image() {
        new MVP3_CreateReviPage().clickToTickImageBtn();
    }

    @Given("I chose image just check in")
    public void i_chose_image_just_check_in() {
        new MVP3_CreateReviPage().clickToChooseImageBtn();
    }

    @Given("I click button check in id back")
    public void i_click_button_check_in_id_back() throws Exception {
        new MVP3_CreateReviPage().clickToIdBackBtn();
    }

    @Given("I click button check in Portrait")
    public void i_click_button_check_in_portrait() throws Exception {
        new MVP3_CreateReviPage().clickToSelfieBtn();
    }

    @Then("Verify display step two")
    public void verify_display_step_two() {
        Assert.assertTrue(new MVP3_CreateReviPage().isDisplayTextStepTwo());
    }
    @When("I click button continue in step one")
    public void i_click_button_continue_in_step_one() {
        new MVP3_CreateReviPage().clickToContinueStepOneBtn();
    }
    @When("I input fullname is {string}")
    public void i_input_fullname_is(String fullname ) {
        new MVP3_CreateReviPage().inputToFullnameTxt(fullname);
    }

    @When("I choose gender is female")
    public void i_choose_gender_is_female() {
      new MVP3_CreateReviPage().clickToGenderTxt();
        new MVP3_CreateReviPage().clickToCheckboxFemale();
        new MVP3_CreateReviPage().clickToOkBtnInCheckbox();
    }

    @When("I choose date of birth")
    public void i_choose_date_of_birth() {
        new MVP3_CreateReviPage().clickToBirthdayTxt();
        new MVP3_CreateReviPage().clickToOkBtnInCheckbox();
    }

    @When("I choose supply date")
    public void i_choose_supply_date() throws Exception {
        new MVP3_CreateReviPage().clickToSupplyDateTxt();
        new MVP3_CreateReviPage().clickToOkBtnInCheckbox();
    }

    @When("I input permanent address is {string}")
    public void i_input_permanent_address_is(String address) {
        new MVP3_CreateReviPage().inputToPermanentAddressTxt(address);
    }

    @When("I check now address same permanent")
    public void i_check_now_address_same_permanent() throws Exception {
        new MVP3_CreateReviPage().clickToCheckboxNowAddress();
    }

    @When("I choose city")
    public void i_choose_city() throws Exception {
        new MVP3_CreateReviPage().clickToCityTxt();
        new MVP3_CreateReviPage().clickToCheckboxHN();
        new MVP3_CreateReviPage().clickToOkBtnInCheckbox();

    }

    @When("I choose academic level")
    public void i_choose_academic_level() {
        new MVP3_CreateReviPage().clickToEducationTxt();
        new MVP3_CreateReviPage().clickToCheckboxUniversity();
        new MVP3_CreateReviPage().clickToOkBtnInCheckbox();
    }

    @When("I choose business")
    public void i_choose_business() {
        new MVP3_CreateReviPage().clickToBusinessTxt();
        new MVP3_CreateReviPage().clickToCheckboxBeerCompany();
        new MVP3_CreateReviPage().clickToOkBtnInCheckbox();
    }

    @When("I choose job")
    public void i_choose_job() throws Exception {
        new MVP3_CreateReviPage().clickToJobTxt();
        new MVP3_CreateReviPage().clickToCheckboxAccountant();
        new MVP3_CreateReviPage().clickToOkBtnInCheckbox();
    }

    @When("I choose status job")
    public void i_choose_status_job() {
        new MVP3_CreateReviPage().clickToJobStatusTxt();
        new MVP3_CreateReviPage().clickToCheckboxAllTime();
        new MVP3_CreateReviPage().clickToOkBtnInCheckbox();
    }

    @When("I input work place is {string}")
    public void i_input_work_place_is(String workPlace) {
      new MVP3_CreateReviPage().inputToWorkPlaceTxt(workPlace);
    }

    @When("I choose position")
    public void i_choose_position() throws Exception {
        new MVP3_CreateReviPage().clickToPositionTxt();
        new MVP3_CreateReviPage().clickToCheckboxLead();
        new MVP3_CreateReviPage().clickToOkBtnInCheckbox();
    }

    @When("I input monthly income is {string}")
    public void i_input_monthly_income_is(String salary) {
        new MVP3_CreateReviPage().inputToSalaryMonthTxt(salary);
    }

    @When("I choose marital status")
    public void i_choose_marital_status() {
        new MVP3_CreateReviPage().clickToMaritalTxt();
        new MVP3_CreateReviPage().clickToCheckboxSingle();
        new MVP3_CreateReviPage().clickToOkBtnInCheckbox();
    }


    @When("I click button continue in step two")
    public void i_click_button_continue_in_step_two() {
        new MVP3_CreateReviPage().clickToContinueStepTwoBtn();
    }

    @Then("Verify display step three")
    public void verify_display_step_three() {
      Assert.assertTrue(new MVP3_CreateReviPage().isDisplayTextStepThree());
    }

    @When("I input relative's name is {string}")
    public void i_input_relative_s_name_is(String name) {
        new MVP3_CreateReviPage().inputToFullnameRelativesTxt(name);
    }

    @When("I input relative's phone is {string}")
    public void i_input_relative_s_phone_is(String phone) {
        new MVP3_CreateReviPage().inputToPhoneRelativesTxt(phone);
    }

    @When("I input friends name is {string}")
    public void i_input_friends_name_is(String name) throws Exception {
        new MVP3_CreateReviPage().inputToFullnameFriendTxt(name);
    }

    @When("I input friend phone is {string}")
    public void i_input_friend_phone_is(String phone) {
        new MVP3_CreateReviPage().inputToPhoneFriendTxt(phone);
    }

    @When("I click button continue in step three")
    public void i_click_button_continue_in_step_three() {
        new MVP3_CreateReviPage().clickToContinueStepThreeBtn();
    }

    @Then("Verify display step four")
    public void verify_display_step_four() {
      Assert.assertTrue(new MVP3_CreateReviPage().isDisplayTextStepFour());
    }

    @When("I click button wrong information")
    public void i_click_button_wrong_information() {
        new MVP3_CreateReviPage().clickToErrorInfoBtn();
    }
    @When("I click button confirm info")
    public void i_click_button_confirm_info() {
        new MVP3_CreateReviPage().clickToConfirmInfoBtn();
    }

    @Then("Verify display message notification success")
    public void verify_display_message_notification_success() {
       Assert.assertTrue(new MVP3_CreateReviPage().isDisplaySuccessNotificationText());
    }

    @Then("Verify display message result notification {string}")
    public void verify_display_message_result_notification(String notification) {
       Assert.assertEquals(notification,new MVP3_CreateReviPage().getTextResultNotificationText());
    }

    @When("I click button close created revi success")
    public void i_click_button_close_created_revi_success() {
        new MVP3_CreateReviPage().clickToCloseBtn();
    }

    @Then("Verify display fullname is {string}")
    public void verify_display_fullname_is(String fullname) {
        Assert.assertEquals(fullname,new MVP3_CreateReviPage().getTextFullName());
    }

    @Then("Verify display supply date is {string}")
    public void verify_display_supply_date_is(String supplyDate) throws Exception {
        Assert.assertEquals(supplyDate,new MVP3_CreateReviPage().getTextSupplyDate());
    }

    @Then("Verify display permanent address is {string}")
    public void verify_display_permanent_address_is(String address) {
        Assert.assertEquals(address,new MVP3_CreateReviPage().getTextPermanentAddress());
    }

    @Then("Verify display now address is {string}")
    public void verify_display_now_address_is(String address) {
        Assert.assertEquals(address,new MVP3_CreateReviPage().getTextNowAddress());
    }

    @Then("Verify display city is {string}")
    public void verify_display_city_is(String city) throws Exception {
        Assert.assertEquals(city,new MVP3_CreateReviPage().getTextCity());
    }

    @Then("Verify display work place is {string}")
    public void verify_display_work_place_is(String place) throws Exception {
        Assert.assertEquals(place,new MVP3_CreateReviPage().getTextWorkPlace());
    }

    @Then("Verify display position is {string}")
    public void verify_display_position_is(String position) {
        Assert.assertEquals(position,new MVP3_CreateReviPage().getTextPosition());
    }

    @Then("Verify display marital status is {string}")
    public void verify_display_marital_status_is(String marital) throws Exception {
        Assert.assertEquals(marital,new MVP3_CreateReviPage().getTextMaritalStatus());
    }
    @Then("Verify display gender {string}")
    public void verify_display_gender(String gender) {
        Assert.assertEquals(gender,new MVP3_CreateReviPage().getTextGender());
    }
    @Then("Verify display birthday is {string}")
    public void verify_display_birthday_is(String birthday) {
        Assert.assertEquals(birthday,new MVP3_CreateReviPage().getTextDateOfBirth());
    }
    @Then("Verify display business is {string}")
    public void verify_display_business_is(String business) {
        Assert.assertEquals(business,new MVP3_CreateReviPage().getTextBusiness());

    }

}
