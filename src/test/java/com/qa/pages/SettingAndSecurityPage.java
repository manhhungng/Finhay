package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class SettingAndSecurityPage extends BasePage {
    TestUtils testUtils = new TestUtils();
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cài đặt và bảo mật']")
    private  MobileElement settingAndSecurityBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_connect_fb")
    private  MobileElement connectFBtext;
    @AndroidFindBy(id = "vn.finhay.finhay:id/switch_facebook")
    private  MobileElement switchFB;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_sub_connect_fb")
    private  MobileElement useFBLogin;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_app_lock")
    private  MobileElement lockApp;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_sub_header")
    private  MobileElement noSetup;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_sub_app_lock")
    private  MobileElement textPin;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_change_password")
    private  MobileElement changePassBtn;
    @AndroidFindBy(id = "android:id/alertTitle")
    private  MobileElement titleFB;
    @AndroidFindBy(id = "android:id/message")
    private  MobileElement messagePopup;
    @AndroidFindBy(id = "android:id/button2")
    private  MobileElement cancelFB;
    @AndroidFindBy(id = "android:id/button1")
    private  MobileElement confirmFB;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Tiếp tục dưới tên Bibi']")
    private  MobileElement userFB;
    @AndroidFindBy(id = "android:id/message")
    private  MobileElement messageFBSuccess;
    @AndroidFindBy(id = "android:id/button1")
    private  MobileElement okBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_lock_status")
    private  MobileElement setUpPinCode;
    @AndroidFindBy(id = "vn.finhay.finhay:id/pin_update")
    private  MobileElement changePinCode;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Luôn luôn cảnh giác, bảo vệ thật kỹ mật khẩu và các thông tin cá nhân.']")
    private  MobileElement textWanning;
    @AndroidFindBy(id = "vn.finhay.finhay:id/indicator_dots")
    private  MobileElement pinTextbox;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Xác nhận mã PIN mới']")
    private  MobileElement confirmNewPinText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/indicator_dots_confirm")
    private  MobileElement confirmPinTextbox;
    @AndroidFindBy(id = "vn.finhay.finhay:id/text_error_pin_confirm")
    private  MobileElement errorMessagePin;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Thiết lập thành công']")
    private  MobileElement messageSucessPin;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='1']")
    private  MobileElement pin1Btn;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='2']")
    private  MobileElement pin2Btn;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Tiếp tục']")
    private  MobileElement continueFB;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Đã khóa']")
    private  MobileElement textLock;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='5']")
    private  MobileElement pinChange5Btn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/text_error_pin")
    private  MobileElement messageChangePin;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='1']")
    private  MobileElement pinChange1Btn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nhập mã PIN mới']")
    private  MobileElement textInputNewPin;
    @AndroidFindBy(id = "vn.finhay.finhay:id/text_error_pin_set")
    private  MobileElement messageSameOldPin;
    @AndroidFindBy(id = "vn.finhay.finhay:id/deletePin")
    private  MobileElement deletePinBtn;
    @AndroidFindBy(id = "android:id/message")
    private  MobileElement messageDeletePin;
    @AndroidFindBy(id = "android:id/button1")
    private  MobileElement okPopupDeletePin;
    @AndroidFindBy(xpath =  "//android.widget.ImageButton[@content-desc='Navigate up']")
    private  MobileElement backBtn;
    @AndroidFindBy(id =  "vn.finhay.finhay:id/facebookLogin")
    private  MobileElement facebookLoginBtn;
    @AndroidFindBy(id =  "android:id/message")
    private  MobileElement messageDisconnectFB;
    @AndroidFindBy(id =  "android:id/button1")
    private  MobileElement okDisconnectFB;
    @AndroidFindBy(id =  "android:id/message")
    private  MobileElement messageErrorLoginFb;
    @AndroidFindBy(id =  "android:id/button1")
    private  MobileElement okPopupLoginFb;
    @AndroidFindBy(id =  "vn.finhay.finhay:id/txt_confirm")
    private  MobileElement confirmChangePass;
    @AndroidFindBy(id =  "vn.finhay.finhay:id/edt_password")
    private  MobileElement currentPass;
    @AndroidFindBy(id =  "vn.finhay.finhay:id/edt_new_password")
    private  MobileElement newPass;
    @AndroidFindBy(id ="vn.finhay.finhay:id/edt_again_new_password")
    private  MobileElement confirmNewPass;
    @AndroidFindBy(id ="vn.finhay.finhay:id/txt_pass_error")
    private  MobileElement messageErrorCurrentPass;
    @AndroidFindBy(id ="vn.finhay.finhay:id/txt_show_password")
    private  MobileElement showCurrentPass;
    @AndroidFindBy(id ="vn.finhay.finhay:id/txt_show_new_password")
    private  MobileElement showNewPass;
    @AndroidFindBy(id ="vn.finhay.finhay:id/txt_show_again_new_password")
    private  MobileElement showConfirmNewPass;
    @AndroidFindBy(id ="vn.finhay.finhay:id/txt_new_pass_again_error")
    private  MobileElement errorMessConfirmPass;
    @AndroidFindBy(id ="vn.finhay.finhay:id/txt_new_pass_error")
    private  MobileElement errorMessNewPass;
    @AndroidFindBy(id ="vn.finhay.finhay:id/spName")
    private  MobileElement changPassSuccess;
    @AndroidFindBy(id ="vn.finhay.finhay:id/txt_confirm")
    private  MobileElement returnHome;
    @AndroidFindBy(id ="android:id/message")
    private  MobileElement errorMessLogin;
    @AndroidFindBy(id ="android:id/button1")
    private  MobileElement okErrorLogin;
    @AndroidFindBy(id ="vn.finhay.finhay:id/header")
    private  MobileElement activeOTP;

    public  boolean isDisplayActiveOTP(){
        return  isDisplayed(By.id("vn.finhay.finhay:id/header"));
    }
    public  String getTextErrorMessLogin() {
        return getText(errorMessLogin);
    }
    public  void clickToOkErrorLogin() {
  click(okErrorLogin);
    }
    public  void clickToReturnHome() {
      click(returnHome);
    }
    public  String getTextErrorMessConfirmPass() {
        return getText(errorMessConfirmPass);
    }
    public  String getTextChangPassSuccess() {
        return getText(changPassSuccess);
    }
    public  String getTextErrorMessNewPass() {
        return getText(errorMessNewPass);
    }
    public  void clickToShowCurrentPass() {
    click(showCurrentPass);
    }
    public  void clickToShowNewPass() {
      click(showNewPass);
    }
    public  void clickToShowConfirmNewPass() {
      click(showConfirmNewPass);
    }
    public  String getTextFormatHideCurrentPass() {
        return getText(currentPass);
    }
    public  String getTextFormatHideNewPass() {
        return getText(newPass);
    }
    public  String getTextFormatHideConfirmPass() {
        return getText(confirmNewPass);
    }
    public  String getTextMessageErrorCurrentPass() {
        return getText(messageErrorCurrentPass);
    }
    public  void inputToCurrentPass(String value) {
        sendKeys(currentPass,value);
    }
    public  void inputToNewPass(String value) {
       sendKeys(newPass,value);
    }
    public  void inputToConfirmNewPass(String value) throws Exception {
        scrollToElement(confirmNewPass,"up");
        sendKeys(confirmNewPass,value);
    }
    public  boolean isEnabledConfirmChangePassword() throws Exception {
        scrollToElement(confirmChangePass,"up");
        return isElementEnable(confirmChangePass);
    }
    public  void clickToChangePass() {
       click(changePassBtn);
    }
    public  void clickToOkLoginFb() {
        isVisibleAndClickable(By.id("android:id/button1"));
        okPopupLoginFb.click();
    }
    public  void clickToConfirmChangePass()  {
        click(confirmChangePass);
    }
    public  String getTextMessageErrorLoginFb() {
        return messageErrorLoginFb.getText();
    }
    public  String getTextMessageDisconnectFB() {
        return messageDisconnectFB.getText();
    }
    public  void clickToFacebookLoginBtn() {
        isVisibleAndClickable(By.id("vn.finhay.finhay:id/facebookLogin"));
        facebookLoginBtn.click();
    }
    public  void clickToOkDisconnectFB() {
        isVisibleAndClickable(By.id("android:id/button1"));
        okDisconnectFB.click();
    }
    public  void clickToBackBtn() {
        click(backBtn);
    }
    public  void clickToOkPopupDeletePin() {
       click(okPopupDeletePin);
    }
    public  String getTextMessageDeletePin() {
        return getText(messageDeletePin);
    }
    public  void clickToDeletePinBtn() {
    click(deletePinBtn);
    }
    public  String getTextMessageSameOldPin() {
        return getText(messageSameOldPin);
    }
    public  String getTextInputNewPin() {
        return getText(textInputNewPin);
    }
    public  String getTextMessageChangePin() {
        return getText(messageChangePin);
    }
    public  void clickToPinChange5Btn() {
       click(pinChange5Btn);
    }
    public  void clickToPinChange1Btn() {
      click(pinChange1Btn);
    }
    public  void clickToPinChange2Btn() {
     click(pin2Btn);
    }
    public  void clickToChangePin() {
       click(changePinCode);
    }
    public  String getTextLock() {
        return textLock.getText();
    }
    public  void clickToContinueFB() {
        isVisibleAndClickable(By.xpath("//android.widget.Button[@text='Tiếp tục']"));
        continueFB.click();
    }
    public  void clickToButtonPin2() {
       click(pin2Btn);
    }
    public  void clickToButtonPin1() {
      click(pin1Btn);
    }
    public  String getTextMessageSucessPin() {
        return getText(messageSucessPin);
    }
    public  String getTextConfirmNewPinText() {
        return getText(confirmNewPinText);
    }
    public  String getTextErrorMessagePin() {
        return getText(errorMessagePin);
    }
    public  void inputToNewPin(String value) {
        pinTextbox.clear();
        pinTextbox.sendKeys(value);
    }
    public  void inputToConfirmPinTextbox(String value) {
        confirmNewPinText.clear();
        confirmNewPinText.sendKeys(value);
    }
    public  void clickToSetUpPinCode() {
   click(setUpPinCode);
    }
    public  String getTextWanning() {
        return getText(textWanning);
    }
    public  boolean isEnbledSetUpPinCode() {
        return isElementEnable(setUpPinCode);
    }
    public  boolean isEnbledChangePinCode() {
        return isElementEnable(changePinCode);
    }
    public  void clickToLockApp() {
       click(lockApp);
    }
    public  String getTextMessageFBSuccess() {
        return messageFBSuccess.getText();
    }
    public  void clickToOkBtn() {
        isVisibleAndClickable(By.id("android:id/button1"));
        okBtn.click();
    }
    public  void clickToUserFB() {
        isVisibleAndClickable(By.xpath("//android.widget.Button[@text='Tiếp tục dưới tên Bibi']"));
        useFBLogin.click();
    }
    public  void clickToConfirmFB() {
        click(confirmFB);
    }
    public  void clickToCancelFB() {
      click(cancelFB);
    }
    public  String getTextSwitchConnectFB() {
        return getText(switchFB);
    }
    public  void clickToSwitchFB() {
       click(switchFB);
    }
    public  String getTextTitleFB() {
        return getText(titleFB);
    }
    public  String getTextMessageConfirmFB() {
        return getText(messagePopup);
    }
    public  boolean isDisplayCancelFB(){
        return  isElementDisplayed(cancelFB);
    }
    public  boolean isDisplayConfirmFB(){
        return  isElementDisplayed(confirmFB);
    }
    public  boolean isDisplayChangePassBtn(){
        return  isElementDisplayed(changePassBtn);
    }
    public  String getTextPin() {
        return getText(textPin);
    }
    public  void clickToSettingAndSecurityBtn() throws Exception {
      scrollToElement(settingAndSecurityBtn,"up");
        click(settingAndSecurityBtn);
    }
    public  boolean isDisplayConnectFB(){
        return  isElementDisplayed(connectFBtext);
    }
    public  boolean isDisplayLockApp(){
        return  isElementDisplayed(lockApp);
    }
    public  boolean isDisplaySwitchFB(){
        return  isElementDisplayed(switchFB);
    }
    public  String getTextUseFBLogin() {
        return getText(useFBLogin);
    }
    public  String getTextNoSetup() {

        return getText(noSetup);
    }
}


