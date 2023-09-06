package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonalInformationPage extends BasePage{
    TestUtils testUtils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/layout_infor_profile")
    private  MobileElement profileBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/identify_selfie")
    private  MobileElement activeNowBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Số điện thoại']/following-sibling::android.widget.TextView")
    private  MobileElement textPhone;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Email']/following-sibling::android.widget.TextView")
    private  MobileElement textEmail;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_notice")
    private  MobileElement noticeActive;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Họ và tên']/following-sibling::android.widget.TextView")
    private  MobileElement textFullName;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Giới tính']/following-sibling::android.widget.TextView")
    private  MobileElement textGender;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ngày sinh']/following-sibling::android.widget.TextView")
    private  MobileElement textDateofBirth;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Địa chỉ']/following-sibling::android.widget.TextView")
    private  MobileElement textAddress;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mã số thuế']/following-sibling::android.widget.TextView")
    private  MobileElement textTaxNumber;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nghề nghiệp']/following-sibling::android.widget.TextView")
    private  MobileElement textJob;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_change")
    private  MobileElement updateBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_sub_header_full_name")
    private  MobileElement fullNameTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_save")
    private  MobileElement saveBtn;
    @AndroidFindBy(id = "android:id/message")
    private  MobileElement messagePopup;
    @AndroidFindBy(id = "android:id/button1")
    private  MobileElement okPopup;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_icon_show_district")
    private  MobileElement iconDistrict;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_icon_show_wards")
    private  MobileElement iconWard;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_icon_show_province")
    private  MobileElement iconProvince;
    @AndroidFindBy(id = "android:id/button1")
    private  MobileElement okDropDown;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_sub_header_address")
    private  MobileElement addressTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_sub_header_province")
    private  MobileElement provinceTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_sub_header_district")
    private  MobileElement districtTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_sub_header_wards")
    private  MobileElement wardTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_icon_show_date_of_birth")
    private  MobileElement iconDateOfBirth;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_sub_header_date_of_birth")
    private  MobileElement dateofbirthTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_icon_show_sex")
    private  MobileElement iconGender;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_sub_header_sex")
    private  MobileElement genderTxt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nữ']")
    private  MobileElement chooseFemale;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_done")
    private  MobileElement doneBtn;
    @AndroidFindBy(id = "android:id/button1")
    private  MobileElement confirmInfoBtn;
    @AndroidFindBy(id = "android:id/button2")
    private  MobileElement cancelInfoBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sửa Thông tin cá nhân']")
    private  MobileElement screenUpdatePF;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_close")
    private  MobileElement iconCloseRefer;
    @AndroidFindBy(id = "vn.finhay.finhay:id/phone_number")
    private  MobileElement phoneNumberBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/email")
    private  MobileElement emailBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_phone")
    private  MobileElement phoneTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_active")
    private  MobileElement otpSMSBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/hasCode")
    private  MobileElement haveCodeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_invite")
    private  MobileElement submitPopupBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_resend")
    private  MobileElement resendSMSBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_resend_by_call")
    private  MobileElement resendPhoneBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_active")
    private  MobileElement activeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_msg")
    private  MobileElement messageActive;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_support")
    private  MobileElement supportFBBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_pincode")
    private MobileElement otpTxt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Số điện thoại']/following-sibling::android.widget.TextView")
    private  MobileElement textPhoneActive;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Thông tin này đã được xác thực và không thể thay đổi']")
    private  MobileElement notiActivated;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private  MobileElement returnPage;
    @AndroidFindBy(id = "vn.finhay.finhay:id/check_email")
    private  MobileElement notiCheckMail;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_resend")
    private  MobileElement sendBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Gửi lại']")
    private  MobileElement textResendBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_email")
    private  MobileElement emailTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_email_sent")
    private  MobileElement messageSentEmail;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_confirm_otp")
    private  MobileElement inputOTPBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/changePic")
    private  MobileElement changeAvatarBtn;
    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    private  MobileElement allowTakePictureBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chọn từ gallery']")
    private  MobileElement chooseFromGalleyBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_change_active_phone")
    private  MobileElement changeActivePhoneBtn;
    @AndroidFindBy(id = "com.google.android.apps.photos:id/image")
    private  MobileElement cameraBtn;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Photo taken on May 14, 2021 2:21:26 PM']")
    private  MobileElement chooseImage;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ok")
    private  MobileElement confirmChooseBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Thông tin cá nhân']")
    private  MobileElement personalInfoPageTitle;

    public boolean verifyTitle() {
        return isElementDisplayed(personalInfoPageTitle);
    }
    public  void clickToAllowTakePictureBtn() {
        click(allowTakePictureBtn);
    }
    public  void clickToConfirmChooseBtn() {
        click(confirmChooseBtn);
    }
    public  void clickToChooseImage() {
        click(chooseImage);
    }
    public  void clickToCameraBtn() {
        click(cameraBtn);
    }
    public  void clickToChooseFromGalley() {
        click(chooseFromGalleyBtn);
    }
    public  void clickToChangeAvatarBtn() {
      click(changeAvatarBtn);
    }
    public  boolean isDisplaySendBtn(){
        return isElementDisplayed(sendBtn);
    }
    public  void clickToEmailTxt() {
        isVisibleAndClickable(By.id("vn.finhay.finhay:id/edt_email"));
        emailTxt.click();
    }
    public  void clickToActiveNowBtn() {
      click(activeBtn);
    }
    public  void clickToSubmitActiveBtn() {
    click(submitPopupBtn);
    }
    public  boolean isDisplayChangeActivePhoneBtn(){
        return isDisplayed(By.id("vn.finhay.finhay:id/txt_change_active_phone"));
    }
    public  void clickToChangeActivePhoneBtn() {
     click(changeActivePhoneBtn);
    }
    public  void clickToInputOTPBtn() {
      click(inputOTPBtn);
    }
    public  String getTextMessageSentEmail() {
        return getText(messageSentEmail);
    }
    public  void inputToEmailTxt(String value) {
        emailTxt.clear();
        emailTxt.sendKeys(value);
    }
    public  boolean isDisplayTextResendBtn(){
        return isDisplayed(By.xpath("//android.widget.TextView[@text='Gửi lại']"));
    }
    public  boolean isDisplayInputOTPBtn(){
        return isDisplayed(By.id("vn.finhay.finhay:id/txt_confirm_otp"));
    }
    public  void clickToSendBtn() {
   click(sendBtn);
    }
    public  String getTextNotiCheckMail() {

        return getText(notiCheckMail);
    }
    public  void clickToReturnPage() {
       click(returnPage);
    }
    public  String getTextNotiActivated() {

        return getText(notiActivated);
    }
    public  String getTextPhoneActive() {
        return textPhoneActive.getText();
    }
    public  void inputToOtpTxt(String value) {
     sendKeys(otpTxt,value);
    }
    public  boolean isDisplaySupportFBBtn(){

        return isElementDisplayed(supportFBBtn);
    }
    public  String getTextMessageActive() {
        return messageActive.getText();
    }
    public  boolean isDisplayActiveBtn(){

        return isElementDisplayed(activeBtn);
    }
    public  boolean isEnableResendSMSBtn(){
        return isElementEnable(resendSMSBtn);

    }
    public  boolean isEnableResendPhoneBtn(){
        return isElementEnable(resendPhoneBtn);

    }
    public  void clickToOtpSMSBtn() throws Exception {
        scrollToElement(otpSMSBtn,"up");
      click(otpSMSBtn);
    }
    public  void inputToPhoneTxt(String value) {
        sendKeys(phoneTxt,value);
    }
    public  boolean isDisplayOtpSMSBtn(){

        return isElementDisplayed(otpSMSBtn);
    }
    public  boolean isDisplayHaveCodeBtn(){
        return isElementDisplayed(haveCodeBtn);
    }
    public  String getTextPhoneTxt() {

        return getText(phoneTxt);
    }
    public  void clickPhoneNumberBtn() {
        click(phoneNumberBtn);
    }
    public  void clickEmailBtn() {
 click(emailBtn);
    }
    public  void clickIconCloseRefer() {
        isVisibleAndClickable(By.id("vn.finhay.finhay:id/img_close"));
        iconCloseRefer.click();
    }
    public  void clickIconWard() throws Exception {
        scrollToElement(iconWard,"up");
    click(iconWard);
    }
    public  String getTextScreenUpdatePF() {

        return getText(screenUpdatePF);
    }
    public  void clickConfirmInfoBtn() {
      click(confirmInfoBtn);
    }
    public  void clickCancelInfoBtn() {
      click(cancelInfoBtn);
    }
    public  boolean isDisplayConfirmInfoBtn(){

        return isElementDisplayed(confirmInfoBtn);
    }
    public  boolean isDisplayCancelInfoBtn(){

        return isElementDisplayed(cancelInfoBtn);
    }
    public  void clickChooseFemale() {
        click(chooseFemale);
    }
    public  void clickToDone() {
      click(doneBtn);
    }
    public  void clickIconGender() {
      click(iconGender);
    }
    public  String getTextGenderTxt() {

        return getText(genderTxt);
    }
    public  String getTextDateOfBirthTxt() {

        return getText(dateofbirthTxt);
    }
    public  void clickIconDateOfBirth() {
       click(iconDateOfBirth);
    }
    public  String getTextProvinceTxt() {

        return getText(provinceTxt);
    }
    public  String getTextDistrictTxt() {

        return getText(districtTxt);
    }
    public  String getTextWardTxt() {

        return getText(wardTxt);
    }
    public  void inputToAddressText(String value) throws Exception {
        scrollToElement(addressTxt,"up");
       sendKeys(addressTxt,value);
    }
    public  void clickOkDropDown() {
        isVisibleAndClickable(By.id("android:id/button1"));
        click(okDropDown);
    }
    public  void clickIconProvince() {
   click(iconProvince);
    }
    public  void clickIconDistrict() throws Exception {
        scrollToElement(iconDistrict,"up");
     click(iconDistrict);
    }
    public  void clickToOkPopup() {
        click(okPopup);
    }
    public  String getTextMessagePopup() {
        return getText(messagePopup);
    }
    public  void clickToUpdateBtn() throws Exception {
        scrollToElement(updateBtn,"down");
     click(updateBtn);
    }
    public  void clickToSaveBtn() throws Exception {
        scrollToElement(saveBtn,"down");
       click(saveBtn);
    }
    public  String getTextFullNameTxt() {

        return getText(textFullName);
    }
    public  String getTextPhone() {

        return getText(textPhone);
    }
    public  String getTextEmail() {

        return getText(textEmail);
    }
    public  String getTextNoticeActive() {
        return getText(noticeActive);
    }
    public  String getTextFullName() throws Exception {
scrollToElement(textFullName,"up");
        return getText(textFullName);
    }
    public  String getTextGender() throws Exception {
        scrollToElement(textFullName,"up");
        return getText(textGender);
    }
    public  String getTextDateOfBirth() {

        return getText(dateofbirthTxt);
    }
    public  String getTextAddress() throws Exception {
scrollToElement(textAddress,"up");
        return getText(textAddress);
    }
    public  String getTextTaxNumber() throws Exception {
scrollToElement(textTaxNumber,"up");
        return getText(textTaxNumber);
    }
    public  String getTextJob() throws Exception {
        scrollToElement(textJob,"up");
        return getText(textJob);
    }

    public  void clickToProfileBtn() {
      click(profileBtn);
    }
    public  boolean isDisplayActiveNowBtn(){
        return isElementDisplayed(activeNowBtn);
    }

    public static void deleteProfileInDB(){
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb.profiles where user_id = 3439";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void deleteUserIDActivePhoneAndEmail(){
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb.verifies where user_id = 3439";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }

    public static void updateOTP(){
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE finhaydb_notifications.otps SET has_response = 0 WHERE user_id =3439;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
}
