package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.By;

import java.sql.*;
import java.util.Map;

public class BankAccountPage extends BasePage{
    public MySQLConnUtils query = new MySQLConnUtils();
    private Connection con = null;
    private PreparedStatement stmt = null;
    private ResultSet kq = null;
    Map<String, Object> maps;
    TestUtils testUtils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/civToolbarHomeLayoutAvatar")
    @iOSXCUITFindBy(xpath  =  "//XCUIElementTypeApplication[@name=\"Finhay\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton[1]\n")
    private  MobileElement iconAvatar;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chưa nhập']")
    @iOSXCUITFindBy(xpath  =  "//XCUIElementTypeStaticText[@name=\"Chưa nhập\"]")
    private  MobileElement textNoAddBank;
    @AndroidFindBy(id = "vn.finhay.finhay:id/withdrawal_acc")
    @iOSXCUITFindBy(xpath  =  "//XCUIElementTypeStaticText[@name=\"Tài khoản rút tiền\"]")
    private  MobileElement withdrawAccBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankVerifyComplete")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeButton[@name=\"Hoàn thành\"]")
    private  MobileElement completedBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankVerifyWarning")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeStaticText[@name=\"*Tên chủ tài khoản phải trùng với tên giấy tờ tuỳ thân\"]\n")
    private  MobileElement textWarning;
    @AndroidFindBy(id = "vn.finhay.finhay:id/invBankVerifyBankName")
    @iOSXCUITFindBy(id  = "bank")
    private  MobileElement iconChooseBankName;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edtSearchViewLayoutSearch")
    @iOSXCUITFindBy(id  = "bank")
    private  MobileElement searchBankNameTxt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='AGRIBANK - NH NONG NGHIEP VA PHAT TRIEN NONG THON VIET NAM']")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeStaticText[@name=\"AGRIBANK - NH NONG NGHIEP VA PHAT TRIEN NONG THON VIET NAM\"]")
    private  MobileElement bankNameAgriBankText;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='AGRIBANK - NH NONG NGHIEP VA PHAT TRIEN NONG THON VIET NAM']")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeTextField[@name=\"bank\"]")
    private  MobileElement bankNameTxt;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Chọn khu vực']/following-sibling::android.widget.ImageView")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeTextField[@name=\"location\"]")
    private  MobileElement iconChooseLocation;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='AN GIANG']")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeStaticText[@name=\"AN GIANG\"]")
    private  MobileElement anGiangLocationText;
    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Chọn chi nhánh']/following-sibling::android.widget.ImageView")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeTextField[@name=\"branch\"]")
    private  MobileElement iconChooseBranch;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='CN CHI LANG']")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeStaticText[@name=\"CN CHI LANG\"]")
    private  MobileElement chiLangBranchText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Số tài khoản *']/preceding-sibling::android.widget.RelativeLayout/child::android.widget.EditText")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeTextField[@name=\"account_number\"]")
    private  MobileElement accountNumberTxt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tên tài khoản của bạn *']/preceding-sibling::android.widget.RelativeLayout/child::android.widget.EditText")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeTextField[@name=\"account_name\"]\n")
    private  MobileElement accountNameTxt;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TECHCOMBANK - NH KY THUONG']")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeStaticText[@name=\"TECHCOMBANK - NH KY THUONG\"]")
    private  MobileElement techcombankText;
    @AndroidFindBy(id = "android:id/message")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeStaticText[@name=\"Lỗi xảy ra khi tra cứu người dùng trên VCCB\"]\n")
    private MobileElement errorMessage;
    @AndroidFindBy(id = "android:id/button1")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeButton[@name=\"OK\"]")
    private MobileElement okButtonInPopup;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvAlertDlgTitle")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeStaticText[@name=\"Xác thực tài khoản thành công!\"]")
    private MobileElement messageSuccess;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvAlertDlgClose")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeButton[@name=\"Xong\"]")
    private MobileElement doneBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/input_bank_name")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeApplication[@name=\"Finhay\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField[1]\n")
    private MobileElement bankNameSuccessTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/input_number")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeApplication[@name=\"Finhay\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
    private MobileElement accountNumberSuccessTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/input_name")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeApplication[@name=\"Finhay\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeTextField[2]")
    private MobileElement accountNameSuccessTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankVerifyTitle")
    @iOSXCUITFindBy(xpath  = "//XCUIElementTypeStaticText[@name=\"Thông tin ngân hàng\"]")
    private MobileElement bankTitleText;






    @AndroidFindBy(id = "vn.finhay.finhay:id/input_number")
    private  MobileElement accNumberTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/input_name")
    private  MobileElement accNameTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/message")
    private  MobileElement notice;
    @AndroidFindBy(id = "android:id/message")
    private  MobileElement errorMesAccName;
    @AndroidFindBy(id = "android:id/button1")
    private  MobileElement okButtonPopup;
    @AndroidFindBy(id = "vn.finhay.finhay:id/alertTitle")
    private  MobileElement titleBankName;
    @AndroidFindBy(id = "android:id/button2")
    private  MobileElement cancelBtn;
    @AndroidFindBy(id = "android:id/button1")
    private  MobileElement confirmChooseBank;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='ACB - NH A CHAU']")
    private  MobileElement chooseACB;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_close")
    private  MobileElement iconClosePopup;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='ANZ - NH ANZ VIET NAM']")
    private  MobileElement bankANZ;
    @AndroidFindBy(id = "vn.finhay.finhay:id/input_number_check")
    private  MobileElement inputAgainAccountNumber;
    @AndroidFindBy(id = "vn.finhay.finhay:id/textinput_error")
    private  MobileElement errorUnderTextbox;
    @AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='AGRIBANK - NH NONG NGHIEP VA PHAT TRIEN NONG THON VIET NAM']")
    private  MobileElement chooseAgribank;
    @AndroidFindBy(id = "vn.finhay.finhay:id/input_location")
    private  MobileElement addressTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/input_branch")
    private MobileElement branchTxt;



    public  void clickToBankTitleText() {
        click(bankTitleText);
    }
    public  void clickToIconAvatar() {
        click(iconAvatar);
    }

    public  String getTextWarning(){
        return getText(textWarning);
    }

    public  void clickToIconChooseBankName() {
        click(iconChooseBankName);
    }

    public  boolean isDisplaySearchBankNameTxt() {
        return isElementDisplayed(searchBankNameTxt);
    }

    public  void inputToSearchBankNameTxt(String value) {
        sendKeys(searchBankNameTxt,value);
    }

    public  String getTextBankNameTxt(){
        return getText(bankNameTxt);
    }
    public  String getTextBankNameText(){
        return getText(bankNameAgriBankText);
    }
    public  void clickToBankNameAgriBankText() {
        click(bankNameAgriBankText);
    }

    public  void clickToIconChooseLocation() {
        click(iconChooseLocation);
    }

    public  void clickToIconChooseBranch() {
        click(iconChooseBranch);
    }
    public  void clickToAnGiangLocationText() {
        click(anGiangLocationText);
    }
    public  void clickToChiLangBranchText() {
        click(chiLangBranchText);
    }
    public  void clickToAccountNumberTxt() {
        click(accountNumberTxt);
    }
    public  void inputToAccountNumberTxt(String value) {
        sendKeys(accountNumberTxt,value);
    }
    public  String getTextAccountNameTxt(){
        return getText(accountNameTxt);
    }
    public  void clickToTechcombankText() {
        click(techcombankText);
    }
    public  String getTextErrorMessage(){
        return getText(errorMessage);
    }
    public  void clickToOkButtonInPopup() {
        click(okButtonInPopup);
    }
    public void clickToCompletedBtn() {
        click(completedBtn);
    }
    public String getTextMessageSuccess(){
        return getText(messageSuccess);
    }
    public void clickDoneBtn() {
        click(doneBtn);
    }
    public  String getTextBankNameSuccessTxt(){
        return getText(bankNameSuccessTxt);
    }
    public  String getTextAccountNumberSuccessTxt(){
        return getText(accountNumberSuccessTxt);
    }
    public  String getTextAccountNameSuccessTxt(){
        return getText(accountNameSuccessTxt);
    }



    public  boolean isDisplayTextNoAddBank() {
        return isElementDisplayed(textNoAddBank);
    }
    public  String getTextAccountName(){
        return getText(accNameTxt);
    }
    public  String getTextBranchTxt(){

        return getText(branchTxt);
    }
    public  String getTextAddressTxt(){

        return getText(addressTxt);
    }
    public  void clickbranchTxt() {
     click(branchTxt);
    }
    public  void clickAddressTxt() {
       click(addressTxt);
    }
    public  boolean isDisplayAddressTxt() {

        return isElementDisplayed(addressTxt);
    }
    public  boolean isDisplayBranchTxt() {

        return isElementDisplayed(branchTxt);
    }
    public  void selectedAgriBank() throws Exception {
        scrollToElement(chooseAgribank,"down");
      click(chooseAgribank);
    }
    public  void inputToAgainAccountNumber(String value) {
        sendKeys(inputAgainAccountNumber,value);
    }
    public  void inputToAccountName(String value) {
           sendKeys(accNameTxt,value);
    }
    public  String getTextUnderTextBox(){

        return getText(errorUnderTextbox);
    }
    public  boolean isDisplayInputAgainAccountNumber() {
        return isElementDisplayed(inputAgainAccountNumber);
    }
    public  void clickToIconClosePopup() {
        isVisibleAndClickable(By.id("vn.finhay.finhay:id/img_close"));
        iconClosePopup.click();
    }
    public  void clickToAccNumberTxt() {
 click(accNumberTxt);
    }
    public  void selectedACBBank() throws Exception {
       scrollToElement(chooseACB,"down");
        click(chooseACB);
    }
    public  void selectedANZBank() {
        click(bankANZ);
    }
    public  void clickToConfirmChooseBank() {
      click(confirmChooseBank);
    }

    public  void clickToCancelBtn() {
       click(cancelBtn);
    }
    public  String getTextTitleBankName(){

        return getText(titleBankName);
    }
    public  void clickToBankNameTxt() {
       click(bankNameTxt);
    }
    public  void inputToAccountNumber(String value) {
     sendKeys(accNumberTxt,value);
    }
    public  void clickToOkButtonPopup() {
       click(okButtonPopup);
    }
    public  String getTextErrorMesAccName(){

        return getText(errorMesAccName);
    }
    public  void clickToAccNameTxt() {
       click(accNameTxt);
    }
    public  String getTextNotice(){
        return notice.getText();
    }
    public  boolean isDisplayAccNameTxt() {

        return isElementDisplayed(accNameTxt);
    }
    public  boolean isDisplayBankNameTxt() {

        return isElementDisplayed(bankNameTxt);
    }
    public  boolean isDisplayAccNumberTxt() {

        return isElementDisplayed(accNumberTxt);
    }
    public  boolean isEnabledCompletedBtn() {
        return isElementEnable(completedBtn);
    }
    public  void clickToWithdrawAccBtn() {
       click(withdrawAccBtn);
    }
    public  String getTextNoAddBank() throws Exception {
        scrollToElement(textNoAddBank,"up");
        return getText(textNoAddBank);
    }

    public  void deleteBankAccount() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb.bank_accounts where user_id = 38327";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public void deleteBankAccountHistory() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb.user_bank_history where user_id = 38327";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public String getAccountNumberUserID38327() {
        String sql = "SELECT account_number from finhaydb.bank_accounts WHERE user_id = 38327;";
        String stt = null;

        try {
            con = query.extracted(query);
            stmt = con.prepareStatement(sql);
            kq = stmt.executeQuery();
            //  System.out.println(stmt.toString());

            while (kq.next()) {
                stt = kq.getString("account_number");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return stt;

    }
    public String getAccountNameUserID38327() {
        String sql =" SELECT account_name from finhaydb.bank_accounts WHERE user_id = 38327 ;";
        String stt = null;

        try {
            con = query.extracted(query);
            stmt = con.prepareStatement(sql);
            kq = stmt.executeQuery();
            //  System.out.println(stmt.toString());

            while (kq.next()) {
                stt = kq.getString("account_name");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return stt;

    }
    public String getBankNameUserID38327() {
        String sql ="SELECT bank_name from finhaydb.bank_accounts WHERE user_id = 38327;";
        String stt = null;

        try {
            con = query.extracted(query);
            stmt = con.prepareStatement(sql);
            kq = stmt.executeQuery();
            //  System.out.println(stmt.toString());

            while (kq.next()) {
                stt = kq.getString("bank_name");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return stt;

    }
}


