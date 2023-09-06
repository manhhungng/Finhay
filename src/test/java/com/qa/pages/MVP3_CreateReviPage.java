package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MVP3_CreateReviPage extends BasePage{
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/cimbLayout")
    private MobileElement bankCIMBBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/layout_information_credit_card")
    private MobileElement reviCIMBBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/cimbLayout")
    private MobileElement bankCIMB;
    @AndroidFindBy(id = "vn.finhay.finhay:id/content_create_credit_cimb1")
    private MobileElement contentTextRevi1;
    @AndroidFindBy(id = "vn.finhay.finhay:id/content_create_credit_cimb2")
    private MobileElement contentTextRevi2;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_create_card")
    private MobileElement startOpenCardBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/check_policy")
    private MobileElement checkboxPolicy;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_icon_visa_card")
    private MobileElement iconVisaCard;
    @AndroidFindBy(id = "vn.finhay.finhay:id/seekBar")
    private MobileElement seekBar;
    @AndroidFindBy(id = "vn.finhay.finhay:id/btn_continue")
    private MobileElement continueCreateRevi;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_amount")
    private MobileElement amountLimitCardText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bước 1']")
    private MobileElement textStepOne;
    @AndroidFindBy(id = "vn.finhay.finhay:id/done")
    private MobileElement continueStepOneBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/template_front")
    private MobileElement idFrontBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/template_back")
    private MobileElement idBackBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/template_selfie_front")
    private MobileElement selfieBtn;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private MobileElement allowCameraBtn;
    @AndroidFindBy(id = "com.android.camera2:id/shutter_button")
    private MobileElement cameraBtn;
    @AndroidFindBy(id = "com.android.camera2:id/done_button")
    private MobileElement tickImageBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ok")
    private MobileElement chooseImageBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bước 2']")
    private MobileElement textStepTwo;
    @AndroidFindBy(id = "vn.finhay.finhay:id/cimb_label")
    private MobileElement cimbLabel;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edtName")
    private MobileElement fullnameTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtGender")
    private MobileElement genderTxt;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Nữ']")
    private MobileElement checkboxFemale;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement okBtnInCheckbox;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtBirthday")
    private MobileElement birthdayTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtIssueDate")
    private MobileElement supplyDateTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edtHoKhau")
    private MobileElement permanentAddressTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/cbAddress")
    private MobileElement checkboxNowAddress;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtCity")
    private MobileElement cityTxt;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Thành phố Hà Nội']")
    private MobileElement checkboxHN;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtEducation")
    private MobileElement educationTxt;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Đại học']")
    private MobileElement checkboxUniversity;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtBusiness")
    private MobileElement businessTxt;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Công Ty Bia']")
    private MobileElement checkboxBeerCompany;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtJob")
    private MobileElement jobTxt;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Kế toán']")
    private MobileElement checkboxAccountant;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_employment_status")
    private MobileElement jobStatusTxt;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Toàn thời gian']")
    private MobileElement checkboxAllTime;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edtCompany")
    private MobileElement workPlaceTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtJobPosition")
    private MobileElement positionTxt;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='TRƯỞNG BỘ PHẬN']")
    private MobileElement checkboxLead;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_mothly_salary")
    private MobileElement salaryMonthTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtMarital")
    private MobileElement maritalTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/done")
    private MobileElement continueStepTwoBtn;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='Độc thân']")
    private MobileElement checkboxSingle;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bước 3']")
    private MobileElement textStepThree;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_full_name_relatives")
    private MobileElement fullnameRelativesTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_phone_relatives")
    private MobileElement phoneRelativesTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_full_name_friends")
    private MobileElement fullnameFriendTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_phone_friends")
    private MobileElement phoneFriendTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/done")
    private MobileElement continueStepThreeBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bước 4']")
    private MobileElement textStepFour;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_error_infor")
    private MobileElement errorInfoBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/done")
    private MobileElement confirmInfoBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_success_notification")
    private MobileElement successNotificationText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_result_notification")
    private MobileElement resultNotificationText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/btn_close")
    private MobileElement closeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edtAddress")
    private MobileElement nowAddressTxt;


    public String getTextBusiness(){
        return getText(businessTxt);
    }
    public String getTextMaritalStatus() throws Exception {
        scrollToElement(maritalTxt,"up");
        return getText(maritalTxt);
    }
    public String getTextPosition(){
        return getText(positionTxt);
    }
    public String getTextWorkPlace() throws Exception {
        scrollToElement(positionTxt,"up");
        return getText(workPlaceTxt);
    }
    public String getTextCity() throws Exception {
        scrollToElement(businessTxt,"up");
        return getText(cityTxt);
    }
    public String getTextNowAddress(){
        return getText(nowAddressTxt);
    }
    public String getTextPermanentAddress(){
        return getText(permanentAddressTxt);
    }
    public String getTextSupplyDate() throws Exception {

                scrollToElement(nowAddressTxt,"up");
                sleepInSecond(2);
                return getText(supplyDateTxt);
        }


    public String getTextDateOfBirth(){
        return getText(birthdayTxt);
    }
    public String getTextGender(){
        return getText(genderTxt);
    }
    public String getTextFullName(){
        return getText(fullnameTxt);
    }

    public void clickToCloseBtn()  {
        click(closeBtn);
    }
    public String getTextResultNotificationText(){
        return getText(resultNotificationText);
    }
    public boolean isDisplaySuccessNotificationText()  {
        return isElementDisplayed(successNotificationText);
    }
    public void clickToConfirmInfoBtn()  {
        click(confirmInfoBtn);
    }
    public void clickToErrorInfoBtn()  {
        click(errorInfoBtn);
    }
    public boolean isDisplayTextStepFour()  {
        return isElementDisplayed(textStepFour);
    }
    public void clickToContinueStepThreeBtn()  {
        click(continueStepThreeBtn);
    }
    public void inputToPhoneFriendTxt(String value)  {
        sendKeys(phoneFriendTxt,value);
    }
    public void inputToFullnameFriendTxt(String value) throws Exception {
        scrollToElement(phoneFriendTxt,"up");
        sendKeys(fullnameFriendTxt,value);
    }
    public void inputToPhoneRelativesTxt(String value)  {
        sendKeys(phoneRelativesTxt,value);
    }
    public void inputToFullnameRelativesTxt(String value)  {
        sendKeys(fullnameRelativesTxt,value);
    }
    public boolean isDisplayTextStepThree()  {
        return isElementDisplayed(textStepThree);
    }
    public void clickToContinueStepTwoBtn()  {
        sleepInSecond(2);
        click(continueStepTwoBtn);
    }
    public void clickToCheckboxSingle()  {
        click(checkboxSingle);
    }
    public void clickToMaritalTxt()  {
        click(maritalTxt);
    }
    public void inputToSalaryMonthTxt(String value)  {
        sendKeys(salaryMonthTxt,value);
    }
    public void clickToCheckboxLead()  {
        click(checkboxLead);
    }
    public void clickToPositionTxt() throws Exception {
        scrollToElement(maritalTxt,"up");
        click(positionTxt);
    }
    public void inputToWorkPlaceTxt(String value)  {
        sendKeys(workPlaceTxt,value);
    }
    public void clickToCheckboxAllTime()  {
        click(checkboxAllTime);
    }
    public void clickToJobStatusTxt()  {
        click(jobStatusTxt);
    }
    public void clickToCheckboxAccountant()  {
        click(checkboxAccountant);
    }
    public void clickToJobTxt() throws Exception {
        scrollToElement(workPlaceTxt,"up");
        click(jobTxt);
    }
    public void clickToCheckboxBeerCompany()  {
        click(checkboxBeerCompany);
    }
    public void clickToBusinessTxt()  {
        click(businessTxt);
    }
    public void clickToCheckboxUniversity()  {
        click(checkboxUniversity);
    }
    public void clickToEducationTxt()  {
        click(educationTxt);
    }
    public void clickToCheckboxHN()  {
        click(checkboxHN);
    }
    public void clickToCityTxt() throws Exception {
        scrollToElement(businessTxt,"up");
        click(cityTxt);
    }
    public void clickToCheckboxNowAddress() throws Exception {
        scrollToElement(checkboxNowAddress,"up");
        click(checkboxNowAddress);
    }
    public void inputToPermanentAddressTxt(String value)  {
        sendKeys(permanentAddressTxt,value);
    }
    public void clickToSupplyDateTxt() throws Exception {
        scrollToElement(permanentAddressTxt,"up");
        click(supplyDateTxt);
    }
    public void clickToBirthdayTxt()  {
        click(birthdayTxt);
    }
    public void clickToOkBtnInCheckbox()  {
        click(okBtnInCheckbox);
    }
    public void clickToCheckboxFemale()  {
        click(checkboxFemale);
    }
    public void clickToGenderTxt()  {
        click(genderTxt);
    }
    public void inputToFullnameTxt(String value)  {
        sendKeys(fullnameTxt,value);
    }
    public boolean isDisplayTextStepTwo()  {
        return isElementDisplayed(textStepTwo);
    }
    public void clickToChooseImageBtn()  {
        click(chooseImageBtn);
    }
    public void clickToTickImageBtn()  {
        click(tickImageBtn);
    }
    public void clickToCameraBtn()  {
        click(cameraBtn);
    }
    public void clickToAllowCameraBtn()  {
        click(allowCameraBtn);
    }
    public void clickToSelfieBtn() throws Exception {
        scrollToElement(selfieBtn,"up");
        sleepInSecond(2);
        click(selfieBtn);
    }
    public void clickToIdBackBtn() throws Exception {
        scrollToElement(idBackBtn,"up");
        sleepInSecond(2);
        click(idBackBtn);
    }
    public void clickToIdFrontBtn()  {
        click(idFrontBtn);
    }
    public void clickToContinueStepOneBtn()  {
        click(continueStepOneBtn);
    }
    public boolean isDisplayTextStepOne()  {
        sleepInSecond(2);
        return isElementDisplayed(textStepOne);
    }
    public void clickToContinueCreateRevi()  {
        click(continueCreateRevi);
    }
    public String getTextAmountLimitCardText(){
        return getText(amountLimitCardText);
    }
    public void longPressSeekBar()  {
       longPressToElement(seekBar);
    }
    public boolean isDisplayContinueCreateRevi()  {
        return isElementDisplayed(continueCreateRevi);
    }
    public boolean isDisplaySeekBar()  {
        return isElementDisplayed(seekBar);
    }
    public boolean isDisplayIconVisaCard()  {
        sleepInSecond(6);
      return isElementDisplayed(iconVisaCard);
    }
    public void clickToStartOpenCardBtn()  {
        click(startOpenCardBtn);
    }
    public void clickToCheckboxPolicy()  {
        click(checkboxPolicy);
    }
    public boolean isEnableStartOpenCardBtn() {
        return isElementEnable(startOpenCardBtn);
    }
    public void clickToReviCIMBBtn()  {
        click(reviCIMBBtn);
    }
    public String getTextContentTextRevi1() throws Exception {
        scrollToElement(contentTextRevi1,"up");
        return getText(contentTextRevi1);
    }
    public String getTextContentTextRevi2(){
        return getText(contentTextRevi2);
    }
    public boolean isDisplayReviCIMBBtn() throws Exception {
        scrollToElement(reviCIMBBtn,"up");
      //  swipeScreen(Direction.UP);
        sleepInSecond(1);
        return isElementDisplayed(reviCIMBBtn);
    }
    public void clickToBankCIMB() throws Exception {
        scrollToElement(cimbLabel,"up");
       // swipeScreen(Direction.UP);
        click(cimbLabel);
    }

    }

