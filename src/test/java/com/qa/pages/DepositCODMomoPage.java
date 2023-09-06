package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DepositCODMomoPage extends BasePage{
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/root")
    private MobileElement paymentMoMoTab;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cập nhật ngay']")
    private MobileElement textUpdateNow;
    @AndroidFindBy(id = "vn.finhay.finhay:id/feeBonus")
    private MobileElement textFeeBonus;
    @AndroidFindBy(id = "vn.finhay.finhay:id/feeRaw")
    private MobileElement textFeeBeforeFree;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'4')]/following-sibling::android.widget.TextView[contains(@text,'0')]")
    private MobileElement textFeeAfterFree;
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'Thanh toán dịch vụ')]")
    private MobileElement textPaymentByMoMo;
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'1.016')]")
    private MobileElement textTotalPaymentMoMoDeposit1M;
    @AndroidFindBy(xpath = "//android.view.View[@text='Thanh toán bằng ứng dụng MoMo']")
    private MobileElement paymentByMomoBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Lúc khác']")
    private MobileElement notNowBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Giao dịch không thành công']")
    private MobileElement textTransactionFail;
    @AndroidFindBy(xpath = "//android.view.View[@text='THỬ LẠI']")
    private MobileElement retryBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Về trang tài sản']")
    private MobileElement backToAssetPageBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Giao dịch của bạn không thành công vui lòng thử lại.']")
    private MobileElement textRetry;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Nhập mật khẩu/Input/Typing\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]")
    private MobileElement passwordLoginTxt1;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Nhập mật khẩu/Input/Typing\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")
    private MobileElement passwordLoginTxt2;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Nhập mật khẩu/Input/Typing\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]")
    private MobileElement passwordLoginTxt3;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Nhập mật khẩu/Input/Typing\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[4]")
    private MobileElement passwordLoginTxt4;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Nhập mật khẩu/Input/Typing\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[5]")
    private MobileElement passwordLoginTxt5;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Nhập mật khẩu/Input/Typing\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[6]")
    private MobileElement passwordLoginTxt6;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Xác nhận/Button']/android.view.ViewGroup")
    private MobileElement confirmPaymentMoMoBtn;
    @AndroidFindBy(xpath = "//android.view.ViewGroup/child::android.widget.EditText/following-sibling::android.view.ViewGroup[1]")
    private MobileElement passwordConfirmTxt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chúc mừng bạn đã tích lũy thành công!']")
    private MobileElement textSuccess;
    @AndroidFindBy(id = "vn.finhay.finhay:id/homeBtn")
    private MobileElement returnHomeBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Đơn hàng đã thanh toán']")
    private MobileElement textPaidSuccess;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='0']")
    private MobileElement keyBoard0 ;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'21')]/following-sibling::android.widget.TextView[contains(@text,'16')]")
    private MobileElement textFeeAfterBonusDeposit1M ;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'41')]/following-sibling::android.widget.TextView[contains(@text,'36')]")
    private MobileElement textFeeAfterBonusDeposit2M ;
    @AndroidFindBy(xpath = "//android.view.View[contains(@text,'2.036')]")
    private MobileElement textTotalPaymentMoMoDeposit2M;
    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'41.000')]")
    private MobileElement textFeeNoBonus;
    @AndroidFindBy(xpath = "//android.view.ViewGroup/following-sibling::\t\n" +
            "android.widget.EditText")
    private MobileElement passMomoTxt ;


    public void inputToPassMomoTxt(String value){
        sendKeys(passMomoTxt,value);
    }

    public String getTextFeeNoBonus(){
        return getText(textFeeNoBonus);
    }
    public String getTextFeeAfterBonusDeposit2M(){
        return getText(textFeeAfterBonusDeposit2M);
    }
    public String getTextFeeAfterBonusDeposit1M(){
        return getText(textFeeAfterBonusDeposit1M);
    }
    public void clickToKeyBoard0() {
        click(keyBoard0);
    }
    public String getTextPaidSuccess(){
        sleepInSecond(20);
        return getText(textPaidSuccess);
    }
    public void clickToReturnHomeBtn() {
        click(returnHomeBtn);
    }
    public  boolean isDisplayedReturnHomeBtn(){
        return isElementDisplayed(returnHomeBtn);
    }
    public String getTextSuccess(){
        return getText(textSuccess);
    }
    public void inputToPasswordConfirmTxt(String value)
    {sendKeys(passwordConfirmTxt,value);}
    public void clickToConfirmPaymentMoMoBtn() {
        click(confirmPaymentMoMoBtn);
    }
   public void inputToPasswordLoginTxt1(String value){
        ((AndroidDriver<MobileElement>) driver).pressKey(new KeyEvent(AndroidKey.DIGIT_0));
   //  sendKeys(passwordLoginTxt1,value);
        }
    public void inputToPasswordLoginTxt2(String value){

   // {sendKeys(passwordLoginTxt2,value);
    }
    public void inputToPasswordLoginTxt3(String value)
    {sendKeys(passwordLoginTxt3,value);}
    public void inputToPasswordLoginTxt4(String value)
    {sendKeys(passwordLoginTxt4,value);}
    public void inputToPasswordLoginTxt5(String value)
    {sendKeys(passwordLoginTxt5,value);}
    public void inputToPasswordLoginTxt6(String value)
    {sendKeys(passwordLoginTxt6,value);}
    public  boolean isDisplayedRetryBtn(){
        return isElementDisplayed(retryBtn);
    }
    public  boolean isDisplayedBackToAssetPageBtn(){
        return isElementDisplayed(backToAssetPageBtn);
    }
    public String getTextRetry(){
        return getText(textRetry);
    }
    public String getTextTransactionFail(){
        return getText(textTransactionFail);
    }
    public void clickToPaymentByMomoBtn() {
        click(paymentByMomoBtn);
    }
    public void clickToNotNowBtn() {
        click(notNowBtn);
    }
    public  boolean isDisplayedNotNowBtn(){
        return isElementDisplayed(notNowBtn);
    }
    public  boolean isDisplayedPaymentByMomoBtn(){
        return isElementDisplayed(paymentByMomoBtn);
    }
    public String getTextTotalPaymentMoMo(){
        return getText(textTotalPaymentMoMoDeposit1M);
    }
    public String getTextTotalPaymentMoMoDeposit2M(){
        return getText(textTotalPaymentMoMoDeposit2M);
    }
    public String getTextFeePaymentByMoMo(){
        return getText(textPaymentByMoMo);
    }
    public String getTextFeeAfterFree(){
        return getText(textFeeAfterFree);
    }
    public String getTextFeeBeforeFree(){
        return getText(textFeeBeforeFree);
    }
    public String getTextFeeBonus(){
        return getText(textFeeBonus);
    }
    public String getTextUpdateNow(){
        return getText(textUpdateNow);
    }
    public void clickToPaymentMoMoTab() {
        click(paymentMoMoTab);
    }
    public static void deleteTransactionDeposit() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb_cod.cod_transactions where user_id = 37355";
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
            String querySql = "DELETE FROM finhaydb_cod.cod_user_assets where user_id = 37355;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
}
