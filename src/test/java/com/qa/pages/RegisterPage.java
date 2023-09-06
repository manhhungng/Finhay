package com.qa.pages;

import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    TestUtils utils = new TestUtils();
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Don’t Allow\"]")
    private static MobileElement doNotAllowBtn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Allow\"]")
    private static MobileElement allowTrackingBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvSkip")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeStaticText[@name=\"Bỏ qua\"]\n")
    private static MobileElement skipBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_register")
    private static MobileElement registerBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/googleLogin")
    private static MobileElement registerByGoogle;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_register_by_phone")
    private static MobileElement registerByPhone;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='oanh.nguyen@finhay.com.vn']")
    private static MobileElement accountNameGoogle;
    @AndroidFindBy(id = "android:id/message")
    private static MobileElement popupMessageError;
    @AndroidFindBy(id = "vn.finhay.finhay:id/email_error")
    private static MobileElement emailError;
    @AndroidFindBy(id = "vn.finhay.finhay:id/et_phone")
    private static MobileElement phoneTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/et_email")
    private static MobileElement emailTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/phoneStatus")
    private static MobileElement iconPhoneError;
    @AndroidFindBy(id = "vn.finhay.finhay:id/step1_cont")
    private static MobileElement continue1Btn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/emailStatus")
    private static MobileElement iconEmailError;
    @AndroidFindBy(id = "vn.finhay.finhay:id/phone_error")
    private static MobileElement phoneError;
    @AndroidFindBy(id = "android:id/button1")
    private static MobileElement okPopUp;
    @AndroidFindBy(id = "vn.finhay.finhay:id/status5")
    private MobileElement iconSteps2;
    @AndroidFindBy(id = "vn.finhay.finhay:id/et_first_name")
    private static MobileElement firstName;
    @AndroidFindBy(id = "vn.finhay.finhay:id/et_name")
    private static MobileElement name;
    @AndroidFindBy(id = "vn.finhay.finhay:id/status9")
    private static MobileElement iconSteps3;
    @AndroidFindBy(id = "vn.finhay.finhay:id/step2_cont")
    private static MobileElement continueBtn2;
    @AndroidFindBy(id = "vn.finhay.finhay:id/et_password")
    private static MobileElement passwordTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/check_policy")
    private static MobileElement checkPolicy;
    @AndroidFindBy(id = "vn.finhay.finhay:id/check_old")
    private static MobileElement checkOld;
    @AndroidFindBy(id = "vn.finhay.finhay:id/step3_cont")
    private static MobileElement continueBtn3;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_active_phone")
    private static MobileElement activePhoneBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_active_email")
    private static MobileElement activeEmail;
    @AndroidFindBy(id = "vn.finhay.finhay:id/cancel")
    private static MobileElement cancelBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/introVideo")
    private MobileElement introVideo;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_continue")
    private static MobileElement discoverNowBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_active")
    private static MobileElement seenOTPSMS;
    @AndroidFindBy(id = "vn.finhay.finhay:id/hasCode")
    private static MobileElement haveOtp;
       @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
 private static MobileElement backBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_invite")
    private static MobileElement agreeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_time")
    private static MobileElement CountdownTime;
    @AndroidFindBy(id = "vn.finhay.finhay:id/step3_back")
    private static MobileElement backStep3Btn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/step2_back")
    private static MobileElement backStep2;
    @AndroidFindBy(id = "vn.finhay.finhay:id/pdfView")
    private static MobileElement filePDFTermsOfUse;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private static MobileElement backTermsOfUse;
    @AndroidFindBy(id = "vn.finhay.finhay:id/policy")
    private static MobileElement policyLink;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ivHomeHeaderIcldUser")
    private static MobileElement avatarBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_close")
    private static MobileElement iconClose;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_pincode")
    private static MobileElement pinCodeTextbox;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_resend")
    private static MobileElement resendCodeViaSMSButton;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_resend_by_call")
    private static MobileElement resendCodeViaPhone;



    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_logout")
    private static MobileElement logOutProfileBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/message")
    private static MobileElement notice;

    @AndroidFindBy(id = "vn.finhay.finhay:id/lnStep1")
    private static MobileElement steps1;
    @AndroidFindBy(id = "vn.finhay.finhay:id/lnStep2")
    private static MobileElement steps2;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_leng_characters")
    private static MobileElement lengChar;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_caps_characters")
    private static MobileElement capsChar;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_special_characters")
    private static MobileElement specialChar;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_characters")
    private static MobileElement nomarlChar;
    @AndroidFindBy(id = "vn.finhay.finhay:id/et_again_password")
    private static MobileElement confirmPassTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/passwordShow")
    private static MobileElement showPassBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/again_passwordShow")
    private static MobileElement showConfirmPassBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/pass_again_error")
    private static MobileElement confirmPassError;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_content")
    private static MobileElement contentCodeText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_ok")
    private static MobileElement okActiveBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_close_this_step")
    private static MobileElement stillSkipBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/secondary_button")
    private static MobileElement skipsPopup;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_active")
    private static MobileElement activeNow;
    @AndroidFindBy(id = "vn.finhay.finhay:id/root")
    private static MobileElement hideKeyBoard;
    @AndroidFindBy(id = "com.google.android.gms:id/account_picker_container")
    private static MobileElement webviewGoogle;


    public void clickToSkipsBtn() {
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
        click(skipBtn);
                break;
            case "iOS":
                click(doNotAllowBtn);
                click(allowTrackingBtn);
                click(skipBtn);

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }

    }

    public void clickToRegisterBtn() {
        click(registerBtn);
    }

    public boolean isDisplayRegisterByGoogleBtn() {
        return isElementDisplayed(registerByGoogle);
    }

    public boolean isDisplayRegisterByPhoneBtn() {
        return isElementDisplayed(registerByPhone);
    }

    public void inputToFirstName(String value) {
        sendKeys(firstName, value);
    }

    public void inputToName(String value) {
        sendKeys(name, value);
    }

    public boolean isEnableContinue1Btn() {
        return isElementEnable(continue1Btn);
    }

    public void clickToContinue1Btn() {
        click(continue1Btn);
    }
    public boolean isEnableContinue2Btn() {
        return isElementEnable(continueBtn2);
    }

    public void clickToContinue2Btn() {
        click(continueBtn2);
    }
public String getTextErrorEmail(){
     return getText(emailError);
}
    public boolean isDisplayIconErrorEmail() {
        return isElementDisplayed(iconEmailError);
    }
    public void inputToPhoneTxt(String value) {
        sendKeys(phoneTxt, value);
    }
    public String getTextErrorPhone(){
        return getText(phoneError);
    }
    public void inputToEmailTxt(String value) {
        sendKeys(emailTxt, value);
    }
    public boolean isEnableContinue3Btn() {
        return isElementEnable(continueBtn3);
    }
    public boolean isDisplayLengChar(){
        return isElementDisplayed(lengChar);
    }
    public boolean isDisplayCapChar(){
        return isElementDisplayed(capsChar);
    }
    public boolean isDisplayNomalChar(){
        return isElementDisplayed(nomarlChar);
    }
    public boolean isDisplaySpecialChar(){
        return isElementDisplayed(specialChar);
    }
    public void inputToPasswordTxt(String value) {
        sendKeys(passwordTxt, value);
    }
    public void clickToCheckboxPolicy(){
        click(checkPolicy);
    }
    public void clickToCheckboxOld(){
        click(checkOld);
    }
    public void inputToConfirmPasswordTxt(String value) {
        sendKeys(confirmPassTxt, value);
    }
    public String getTextPasswortTxt(){
        return getText(passwordTxt);
    }
    public String getTextConfirmPasswordTxt(){
        return getText(confirmPassTxt);
    }
    public void clickToShowPasswordBtn() {
        click(showPassBtn);
    }
    public void clickToShowConfirmPasswordBtn() {
        click(showConfirmPassBtn);
    }
    public void clickToContinue3Btn() {
        click(continueBtn3);
    }
    public String getTextConfirmPasswordError(){
        return getText(confirmPassError);
    }
    public void clickToPolicyLink() {
        click(policyLink);
    }
    public boolean isDisplayFilePDFPolicy() {
        return isElementDisplayed(filePDFTermsOfUse);
    }
    public void clickToBackBtn() {
        click(backBtn);
    }
    public boolean isDisplayActiveNowBtn() {
        return isElementDisplayed(activePhoneBtn);
    }
    public boolean isDisplaySkipBtn() {
        return isElementDisplayed(cancelBtn);
    }
    public void clickToSkipActiveBtn() {
        click(cancelBtn);
    }
    public boolean isDisplayOKActiveBtn() {
        return isElementDisplayed(okActiveBtn);
    }
    public boolean isDisplayStillSkipBtn() {
        return isElementDisplayed(stillSkipBtn);
    }
    public void clickToStillSkipBtn() {
        click(stillSkipBtn);
    }
    public boolean isDisplayDiscoverNowBtn() {
        return isElementDisplayed(discoverNowBtn);
    }
    public void clickToDiscoverNowBtn() {
        click(discoverNowBtn);
    }
    public boolean isDisplayAvatarBtn() {
        return isElementDisplayed(avatarBtn);
    }
    public void clickToAvatarBtn()  {
        sleepInSecond(3);
        click(avatarBtn);

    }
    public void clickToLogoutBtn() throws Exception {
        scrollToElement(logOutProfileBtn, "up");
        sleepInSecond(1);
        click(logOutProfileBtn);
    }
    public void clickToOkInPopUp() {
        click(okPopUp);
    }
    public void clickToRegisterByPhone() {
        click(registerByPhone);
    }
    public String getTextErorrMessagePopup(){
        return getText(popupMessageError);
    }
    public void clickToBackStep3Btn() {
        click(backStep3Btn);
    }
    public void clickToActiveBtn() {
        click(activePhoneBtn);
    }
    public boolean isDisplaySeenOTPSMSBtn() {
        return isElementDisplayed(seenOTPSMS);
    }
    public boolean isDisplayHaveOTP() {
        return isElementDisplayed(haveOtp);
    }
    public void clickToSeenOTPSMSBtn() {
        click(seenOTPSMS);
    }
    public boolean isDisplayContentCodeText() {
        return isElementDisplayed(contentCodeText);
    }
    public void clickToIconClose() {
        click(iconClose);
    }
    public void clickToAgreeBtn() {
        click(agreeBtn);
    }
    public boolean isDisplayPinCodeTxt() {
        return isElementDisplayed(pinCodeTextbox);
    }
    public void inputToPinCodeTxt(String value) {
        sendKeys(pinCodeTextbox, value);
    }
    public boolean isDisplayIconPhoneError() {
        return isElementDisplayed(iconPhoneError);
    }
}