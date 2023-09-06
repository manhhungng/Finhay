package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginPage extends BasePage {
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_login")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Đăng nhập\"]")
    private MobileElement loginWelcomeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/googleLogin")
    private MobileElement loginWithGoogleBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/facebookLogin")
    private MobileElement loginWithFacebookBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/editEmail")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Finhay\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField\n")
    private  MobileElement usernameTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/editPass")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Finhay\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField")
    private  MobileElement passwordLoginBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/loginBtn")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Đăng nhập\"]")
    private  MobileElement loginBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/backBtn")
    private MobileElement backBtn;
    @AndroidFindBy(id = "android:id/message")
    private  MobileElement messageError;
    @AndroidFindBy(id = "android:id/button1")
    private  MobileElement okInPopupError;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_show_pass")
    private  MobileElement showPassBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/password_error")
    private  MobileElement errorPass;
    @AndroidFindBy(id = "vn.finhay.finhay:id/navigation_Asset")
    private  MobileElement homePageText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='oanh.nguyen@finhay.com.vn']")
    private  MobileElement accountNameGoogle ;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_find_password")
    private  MobileElement forgotPassBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_confirm")
    private  MobileElement confirmForgotPassBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/et_email")
    private  MobileElement emailForgotPass;
    @AndroidFindBy(id = "vn.finhay.finhay:id/email_error")
    private  MobileElement emailErrorForgotPass;
    @AndroidFindBy(id = "android:id/message")
    private  MobileElement messageSeenOTP;
    @AndroidFindBy(id = "android:id/button1")
    private  MobileElement okPopupSeenOTP;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_pincode")
    private  MobileElement pinCodeTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_confirm")
    private  MobileElement confirmChangePassword;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_new_password")
    private  MobileElement newPass;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_again_new_password")
    private  MobileElement confirmPass;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_show_new_password")
    private  MobileElement showNewPass;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_show_again_new_password")
    private  MobileElement showConfirmPass;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_new_pass_again_error")
    private  MobileElement errorConfirmPassword;
    @AndroidFindBy(id = "vn.finhay.finhay:id/spName")
    private  MobileElement changePassSuccess;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_confirm")
    private  MobileElement returnHome;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_active_phone")
    private  MobileElement activeOTP;
    @AndroidFindBy(id = "android:id/message")
    private  MobileElement messageWrongPassTimes;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_confirm")
    private  MobileElement confirmOTPBtn;


    public void clickToConfirmOTPBtn() {
        confirmOTPBtn.click();
    }
    public void clickToLoginWelcomeBtn() {
        sleepInSecond(2);
        loginWelcomeBtn.click();
    }
    
    
    public  String getTextMessageWrongPassTimes(){
        return getText(messageWrongPassTimes);
    }
    public  boolean isDisplayedNameTextInHome(){
        sleepInSecond(3);
        return isElementDisplayed(homePageText);
    }

    public  void clickToReturnHome() {
       click(returnHome);
    }
    public String getTextChangePassSuccess(){
        return getText(changePassSuccess);
    }
    public String getTextErrorConfirmPassword(){
        return getText(errorConfirmPassword);
    }
    public String getTextNewPass(){
        return getText(newPass);
    }
    public String getTextConfirmPass(){
        return getText(confirmPass);
    }
    public void clickToShowNewPassBtn() {
       click(showNewPass);
    }
    public void clickToShowConfirmPass() {
      click(showConfirmPass);
    }
    public void inputToConfirmNewPass(String value) {
        sendKeys(confirmPass,value);
    }
    public void inputToNewPass(String value) throws Exception {
        scrollToElement(confirmChangePassword,"up");
      sendKeys(newPass,value);
    }
    public  void clickToConfirmChangePassword() {
       click(confirmChangePassword);
    }
    public  boolean isEnabledConfirChangePassword() throws Exception {
        scrollToElement(confirmChangePassword,"up");
        return isElementEnable(confirmChangePassword);
    }
    public  void inputToPinCodeTxt(String value) {
   sendKeys(pinCodeTxt,value);
    }
    public void clickToOkPopupSeenOTP() {
     click(okPopupSeenOTP);
    }
    public String getTextMessageSeenOTP(){
        return getText(messageSeenOTP);
    }
    public  String getTextEmailErrorForgotPass(){
        return getText(emailErrorForgotPass);
    }
    public void clickToConfirmForgotPass() {
   click(confirmForgotPassBtn);
    }
    public void inputToemailForgotPass(String value) {
      sendKeys(emailForgotPass,value);
    }
    public boolean isEnabledConfirmForgotPass()  {
     return isElementEnable(confirmForgotPassBtn);
    }

    public void clickToForgotPassword() throws Exception {
      click(forgotPassBtn);
        scrollToElement(confirmForgotPassBtn,"up");
    }
    public void clickAccountNameGoogle() {
        isVisibleAndClickable(By.xpath("//android.widget.TextView[@text='oanh.nguyen@finhay.com.vn']"));
        accountNameGoogle.click();
    }

    public void clickOkInPopupError() {
       click(okInPopupError);
    }
    public void clickShowPassLogin() {
     click(showPassBtn);
    }
    public String getTextmessageError(){
        return getText(messageError);
    }
    public String getTextmessageErrorPassword(){
        return getText(errorPass);
    }
    public String getTextPasswordLogin(){
        return getText(passwordLoginBtn);
    }

    public void clickBackBtn() {
        backBtn.click();
    }
    public void inputToUsername(String value) {
      sendKeys(usernameTxt,value);
    }
    public void inputToPasswordLogin(String value) {
      sendKeys(passwordLoginBtn,value);
    }
    public boolean isEnbledLoginBtn() {
        return isElementEnable(loginBtn);
    }
    public void clickToLogin() {
        click(loginBtn);
    }

    public void passwordAttemptsFourTimesInDB() throws SQLException {
        try{
            Connection conn =  MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE finhaydb.users SET password_attempts = 4,password_timer = NULL WHERE id = 3424";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public void passwordAttemptsNineTimesInDB() throws SQLException {
        try{
            Connection conn =  MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE finhaydb.users SET password_attempts = 9,password_timer = '2021-04-06 09:44:10' WHERE id = 3424";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public void passwordAttemptsFourteenTimesInDB() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE finhaydb.users SET password_attempts = 14,password_timer = '2021-04-06 01:44:10' WHERE id = 3424";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
}


