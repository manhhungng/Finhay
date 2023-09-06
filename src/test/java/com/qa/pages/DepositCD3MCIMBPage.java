package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DepositCD3MCIMBPage extends BasePage{
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/cd3Months")
    private MobileElement cd3mTab;
    @AndroidFindBy(id = "vn.finhay.finhay:id/cd3mFirstInvest")
    private MobileElement startSavingCD3MBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/autoCompleteTextView")
    private MobileElement amountTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/next")
    private MobileElement startSavingBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='100,000đ']")
    private MobileElement textAmountTransfer;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Ok']")
    private MobileElement okTransferBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Vui lòng nhập mã PIN của bạn']")
    private MobileElement textInputPin;
    @AndroidFindBy(xpath = "//android.view.View[@text='PIN không chính xác. Vui lòng thử lại']")
    private MobileElement textErrorPin;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
    private MobileElement okErrorPinBtn;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Để sau']")
    private MobileElement laterBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='PIN của bạn đã bị khóa do nhập sai nhiều lần. Vui lòng đặt lại Octo PIN']")
    private MobileElement textErrorPin5Time;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='OK']")
    private MobileElement okErrorPin5TimeBtn;
    @AndroidFindBy(xpath = "//android.view.View[@text='Mã PIN của bạn đã hết hạn, vui lòng ấn Cài Đặt lại bên dưới']")
    private MobileElement textResetPin;
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Đặt lại mã PIN ngay']")
    private MobileElement resetPinBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/hdtg_layout")
    private MobileElement savingInHomeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_error_amount")
    private MobileElement textTooLimit;

    public String getTextTooLimit(){
        return getText(textTooLimit);
    }
    public void clickToSavingInHomeBtn() {
        click(savingInHomeBtn);
    }
    public void clickToStartSavingBtn() {
        click(startSavingBtn);
    }
    public void clickToResetPinBtn() {
        click(resetPinBtn);
    }
    public boolean isDisplayResetPinBtn(){
        return isElementDisplayed(resetPinBtn);
    }
    public String getTextResetPin(){
        sleepInSecond(40);
        return getText(textResetPin);
    }
    public void clickToOkErrorPin5TimeBtn() {
        click(okErrorPin5TimeBtn);
    }
    public String getTextErrorPin5Time(){
        return getText(textErrorPin5Time);
    }
    public void clickToLaterBtn() {
        click(laterBtn);
    }
    public void clickToOkErrorPinBtn() {
        click(okErrorPinBtn);
    }
    public String getTextErrorPin(){
        return getText(textErrorPin);
    }
    public String getTextInputPin(){
        return getText(textInputPin);
    }
    public void clickToOkTransferBtn() throws Exception {
        sleepInSecond(10);
      swipeScreen(Direction.UP);
       // scrollToElement(okTransferBtn,"up");
        click(okTransferBtn);
    }
    public String getTextAmountTransfer(){
        sleepInSecond(15);
        return getText(textAmountTransfer);
    }
    public boolean isEnableStartSavingBtn(){
        return isElementEnable(startSavingBtn);
    }
public void inputToAmountTxt(String value){
    sendKeys(amountTxt,value);
}

    public void clickToStartSavingCD3MBtn() {
        click(startSavingCD3MBtn);
    }
    public void clickToCd3mTab() {
        click(cd3mTab);
    }

    public static void deleteTransactionCD3MCIMB() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM dev_newcd.term_transactions where user_id = 37486";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void deleteUserAssetsCD3MCIMB() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM dev_newcd.user_assets where user_id = 37486";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
}

