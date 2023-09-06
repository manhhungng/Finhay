package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DepositCODCIMBPage  extends BasePage{
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/rut_nhanh_layout")
    private MobileElement CIMBPaymentBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_error_amount")
    private MobileElement noEnoughMoneyText;
    @AndroidFindBy(xpath = "//android.view.View[@text='Vui lòng tạo mã PIN để sử dụng các tính năng với CIMB thuận tiện hơn.']")
    private MobileElement textCreatePin;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Tạo PIN ngay']")
    private MobileElement createPinNowBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Bạn vui lòng nhập lại mật khẩu đăng nhập trên ứng dụng']")
    private MobileElement textInputPassword;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private MobileElement okInputPasswordBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edt_password")
    private MobileElement passwordTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_confirm")
    private MobileElement confirmPasswordBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_find_password")
    private MobileElement findPasswordBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tìm lại mật khẩu']")
    private MobileElement textFindPassword;
    @AndroidFindBy(xpath = "//android.view.View[@text='Tạo mã PIN của bạn']")
    private MobileElement textCreatePinOfYou;
    @AndroidFindBy(xpath = "//android.widget.EditText/parent::android.view.View")
    private MobileElement pinTxt;
    @AndroidFindBy(xpath = "//android.view.View[@text='Nhập lại mã PIN']")
    private MobileElement textConfirmPin;
    @AndroidFindBy(xpath = "//android.view.View[@text='Mã Pin xác nhận không đúng']")
    private MobileElement messageErrorConfirmPin;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private MobileElement okErrorConfirmPinBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Nhập mã OTP đã được gửi đến số điện thoại']")
    private MobileElement textInputOTP;
    @AndroidFindBy(xpath = "//android.view.View/child::android.widget.EditText[1]")
    private MobileElement pinIndex1Txt;
    @AndroidFindBy(xpath = "//android.view.View/child::android.widget.EditText[2]")
    private MobileElement pinIndex2Txt;
    @AndroidFindBy(xpath = "//android.view.View/child::android.widget.EditText[3]")
    private MobileElement pinIndex3Txt;
    @AndroidFindBy(xpath = "//android.view.View/child::android.widget.EditText[4]")
    private MobileElement pinIndex4Txt;
    @AndroidFindBy(xpath = "//android.view.View/child::android.widget.EditText[5]")
    private MobileElement pinIndex5Txt;
    @AndroidFindBy(xpath = "//android.view.View/child::android.widget.EditText[6]")
    private MobileElement pinIndex6Txt;
    @AndroidFindBy(xpath = "//android.widget.Image/following-sibling::android.view.View[4]")
    private MobileElement otpText;
    @AndroidFindBy(xpath = "//android.view.View[@text='Mã OTP không đúng. Xin hãy thử lại']")
    private MobileElement errorOTPText;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private MobileElement okErrorOTPBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Bạn đã tạo Octo PIN thành công. Bắt đầu sử dụng nào!']")
    private MobileElement correctOTPText;
    @AndroidFindBy(xpath = "//android.view.View[@text='Chuyển tiền hoàn tất']")
    private MobileElement textComplete;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Trở về ứng dụng đối tác']")
    private MobileElement returnAppFinhayBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/investMore")
    private MobileElement depositMoreBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Nhấn nút ở dưới để tiến hành cài đặt lại mã PIN']")
    private MobileElement textResetPin;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Đặt lại mã PIN ngay']")
    private MobileElement resetPinNowBtn;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Ok']")
    private MobileElement okTransferBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Quên mã PIN?']")
    private MobileElement forgotPinBtn;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private MobileElement okCorrectOTPBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/back")
    private MobileElement backHomeBtn;




    public void clickToBackHomeBtn() {
        click(backHomeBtn);

    }
    public boolean isDisplayedCIMBPaymentBtn(){
    return  isElementDisplayed(CIMBPaymentBtn);
    }
    public void clickToOkCorrectOTPBtn() {
        click(okCorrectOTPBtn);
        sleepInSecond(30);
    }
    public void clickToForgotPinBtn() {
        click(forgotPinBtn);
    }
    public boolean isDisplayedOkTransferBtn(){
        sleepInSecond(10);
        return isElementDisplayed(okTransferBtn);
    }
    public void clickToResetPinNowBtn() {
        click(resetPinNowBtn);
    }
    public String getTextResetPin(){
        return getText(textResetPin);
    }
    public void clickToDepositMoreBtn() {
        click(depositMoreBtn);
    }
    public void clickToReturnAppFinhayBtn() throws Exception {
      swipeScreen(Direction.UP);
        click(returnAppFinhayBtn);
    }
    public String getTextComplete(){
        return getText(textComplete);
    }
    public String getTextCorrectOTP(){
        return getText(correctOTPText);
    }
    public void clickToOkErrorOTPBtn() {
        click(okErrorOTPBtn);
    }
    public String getTextErrorOTP(){
        return getText(errorOTPText);
    }
    public void clearToPinIndex6Txt(){
        clear(pinIndex6Txt);
    }
    public void inputToPinIndex1Txt(String value){
        sendKeysNoClear(pinIndex1Txt,value);
    }
    public void inputToPinIndex2Txt(String value){
        sendKeysNoClear(pinIndex2Txt,value);
    }
    public void inputToPinIndex3Txt(String value){
        sendKeysNoClear(pinIndex3Txt,value);
    }
    public void inputToPinIndex4Txt(String value){
        sendKeysNoClear(pinIndex4Txt,value);
    }
    public void inputToPinIndex5Txt(String value){
        sendKeysNoClear(pinIndex5Txt,value);
    }
    public void inputToPinIndex6Txt(String value){
        sendKeysNoClear(pinIndex6Txt,value);
    }
    public String getTextInputOTP(){
        return getText(textInputOTP);
    }
    public void clickToOkErrorConfirmPinBtn() {
        click(okErrorConfirmPinBtn);
    }
    public String getTextMessageErrorConfirmPin(){
        return getText(messageErrorConfirmPin);
    }
    public String getTextConfirmPin(){
        return getText(textConfirmPin);
    }
    public void inputToPinTxt(String value){
        sendKeys(pinTxt,value);
    }
    public boolean isDisplayedPinTxt(){
        return isElementDisplayed(pinTxt);
    }
    public String getTextCreatePinOfYou(){
        return getText(textCreatePinOfYou);
    }
    public void clickToConfirmPasswordBtn() {
        click(confirmPasswordBtn);
    }
    public void inputToPasswordTxt(String value){
        sendKeys(passwordTxt,value);
    }
    public String getTextFindPassword(){
        return getText(textFindPassword);
    }
    public boolean isDisplayedPasswordTxt(){
        return isElementDisplayed(passwordTxt);
    }
    public boolean isEnableConfirmPasswordBtn(){
        return isElementEnable(confirmPasswordBtn);
    }
    public boolean isDisplayedFindPasswordBtn(){
        return isElementDisplayed(findPasswordBtn);
    }
    public void clickToFindPasswordBtn() {
        click(findPasswordBtn);
    }
    public void clickToOkInputPasswordBtn() {
        click(okInputPasswordBtn);
    }
    public String getTextInputPassword(){
        return getText(textInputPassword);
    }
    public void clickToCreatePinNowBtn() {
        click(createPinNowBtn);
    }
    public void clickToCIMBPaymentBtn() {
        click(CIMBPaymentBtn);
    }
    public boolean isEnableCIMBPaymentBtn(){

        return isElementEnable(CIMBPaymentBtn);
    }
    public String getTextNoEnoughMoney(){
        return getText(noEnoughMoneyText);
    }
    public String getTextCreatePin(){
       sleepInSecond(50);
        return getText(textCreatePin);
    }

    public String getTextOtp() {

        return getText(otpText);
    }

    public String getOtpCharacterAt(String otp, int index) {
        try {
            return Character.toString(otp.charAt(index));
        } catch (Exception e) {
            return "0";
        }
    }



//    AndroidKey
    public String getOTPIndex1(){
        String otp1 = getOtpCharacterAt(getTextOtp(),0);
        return otp1;
    }
    public String getOTPIndex2(){
        String otp1 = getOtpCharacterAt(getTextOtp(),1);
        return otp1;
    }
    public String getOTPIndex3(){
        String otp1 = getOtpCharacterAt(getTextOtp(),2);
        return otp1;
    }
    public String getOTPIndex4(){
        String otp1 = getOtpCharacterAt(getTextOtp(),3);
        return otp1;
    }
    public String getOTPIndex5(){
        String otp1 = getOtpCharacterAt(getTextOtp(),4);
        return otp1;
    }
    public String getOTPIndex6(){
        String otp1 = getOtpCharacterAt(getTextOtp(),5);
        return otp1;
    }
     public void inputOTP1(){
        String otp1= getOTPIndex1();
    sendKeys(pinIndex1Txt,otp1);
     }
    public void inputOTP2(){
        String otp2= getOTPIndex2();
        sendKeys(pinIndex2Txt,otp2);
    }
    public void inputOTP3(){
        String otp3= getOTPIndex3();
        sendKeys(pinIndex3Txt,otp3);
    }
    public void inputOTP4(){
        String otp4= getOTPIndex4();
        sendKeys(pinIndex4Txt,otp4);
    }
    public void inputOTP5(){
        String otp5= getOTPIndex5();
        sendKeys(pinIndex5Txt,otp5);
    }
    public void inputOTP6(){
        String otp6= getOTPIndex6();
        sendKeys(pinIndex6Txt,otp6);
    }

        public boolean isEnableCreatePinNowBtn(){
        return isElementEnable(createPinNowBtn);
    }
    public static void deleteTransactionDepositCIMB() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb_cod.cod_transactions where user_id = 37485";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void updateCashInvestUser() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE finhaydb.users SET cash = 0 ,invest =0 WHERE id =37485;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void deleteAssetUser() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb_cod.cod_user_assets where user_id = 37485;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
}
