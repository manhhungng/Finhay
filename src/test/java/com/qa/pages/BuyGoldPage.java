package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BuyGoldPage extends BasePage{
    TestUtils utils = new TestUtils();
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Cần thanh toán\"]")
    private MobileElement textNeedPay;
    @AndroidFindBy(id = "vn.finhay.finhay:id/iv_close")
    @iOSXCUITFindBy(id = "Bỏ qua")
    private MobileElement iconClose;

    @AndroidFindBy(id = "vn.finhay.finhay:id/clHomeGold")
    @iOSXCUITFindBy(xpath = " //XCUIElementTypeApplication[@name=\"Finhay\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeButton\n")
    private MobileElement homeGoldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvSummaryGoldItmNumber")
    @iOSXCUITFindBy(id = "gold_quantity")
    private MobileElement amountGoldValue;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ivActionGoldBuyGold")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Bắt đầu mua vàng\"]")
    private MobileElement startBuyGoldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvTermsBuyGoldTitle")
    @iOSXCUITFindBy(id =  "Điều khoản mua bán")
    private MobileElement termOfUseTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvTermsBuyGoldAccept")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Tôi đồng ý\"]")
    private MobileElement continueTermOfUseBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivActionGoldBuyGold")
    @iOSXCUITFindBy(id = "ic add")
    private MobileElement buyMoreBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldTransactionDescription")
    @iOSXCUITFindBy(xpath = " //XCUIElementTypeStaticText[@name=\"Nhẫn vàng 24K - 0,5 chỉ\"]")
    private MobileElement nameProductGoldText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldTransactionNext")
    @iOSXCUITFindBy(xpath  =  "//XCUIElementTypeButton[@name=\"Tiếp tục\"]")
    private MobileElement continueTransactionGoldBtn;

    @iOSXCUITFindBy(id = "gold_quantity")
    private MobileElement amountGoldTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ivGoldTransactionAdd")
    @iOSXCUITFindBy(id = "icon gold quantity plus")
    private MobileElement plusAmountGoldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldTransactionEquivalent")
    @iOSXCUITFindBy(id = "gold_equivalent_quantity")
    private MobileElement equivalentText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldTransactionMoney")
    @iOSXCUITFindBy(id = "gold_expected_payment")
    private MobileElement expectedPaymentText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmGoldTransactionType")
    @iOSXCUITFindBy(id = "trans_type")
    private MobileElement typeTransactionConfirmText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmGoldTransactionProduct")
    @iOSXCUITFindBy(id = "product_name")
    private MobileElement nameProductConfirmText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmGoldTransactionAmout")
    @iOSXCUITFindBy(id = "quantity")
    private MobileElement amountGoldConfirmText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmGoldTransactionEquivalent")
    @iOSXCUITFindBy(id = "equivalent_quantity")
    private MobileElement equivalentConfirmText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmGoldTransactionPayType")
    @iOSXCUITFindBy(id = "payment_type")
    private MobileElement payTypeConfirmText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmGoldTransactionMoney")
    @iOSXCUITFindBy(id = "expected_payment")
    private MobileElement needMoneyPaymentConfirmText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmGoldTransactionConfirm")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Xác nhận mua vàng\"]")
    private MobileElement confirmTransactionGold;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStatusGoldTitle")
    @iOSXCUITFindBy(id = "title")
    private MobileElement messageBuyGoldSuccess;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStatusGoldBuyMore")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Mua thêm\"]\n")
    private MobileElement buyMoreInTransactionSuccessBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmDealGoldBack")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Về trang Hũ vàng\"]\n")
    private MobileElement goToPotOfGoldPageBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvTabGoldItmHistory")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeStaticText[@name=\"Lịch sử\"]\n")
    private MobileElement historyGoldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvHistoryGoldBottomItmAmount")
    @iOSXCUITFindBy(xpath =  "(//XCUIElementTypeStaticText[@name=\"gold_amount\"])[1]")
    private MobileElement amountGoldHistoryText;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[1]\n")
    @iOSXCUITFindBy(xpath =  "(//XCUIElementTypeStaticText[@name=\"trans_type\"])[1]")
    private MobileElement sttTransTypeText;



    public String getTextSttTransTypeText(){
        return getText(sttTransTypeText);
    }
    public String getTextAmountGoldHistoryText(){
        return getText(amountGoldHistoryText);
    }
    public void clickToHistoryGoldBtn() {
        click(historyGoldBtn);
    }
    public void clickToIconClose() {
        click(iconClose);
    }
    public void clickToPlusAmountGoldBtn() {
        click(plusAmountGoldBtn);
    }
    public void inputToAmountGoldTxt(String value) {
        sendKeys(amountGoldTxt,value);
    }
    public void clickToContinueTermOfUseBtn() {
                click(continueTermOfUseBtn);
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
                click(continueTermOfUseBtn);
                break;
            case "iOS":
                click(continueTermOfUseBtn);
                click(textNeedPay);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
    }


    public String getTextTermOfUseTxt(){
        return getText(termOfUseTxt);
    }
    public void clickToStartBuyGoldBtn() {
        click(startBuyGoldBtn);
    }
    public boolean isDisplayStartBuyGoldBtn(){
        return isElementDisplayed(startBuyGoldBtn);
    }
    public void clickToGoToPotOfGoldPageBtn() {
        click(goToPotOfGoldPageBtn);
        sleepInSecond(4);
    }
    public boolean isDisplayGoToPotOfGoldPageBtn(){
        return isElementDisplayed(goToPotOfGoldPageBtn);
    }
    public boolean isDisplayBuyMoreInTransactionSuccessBtn(){
        return isElementDisplayed(buyMoreInTransactionSuccessBtn);
    }
    public String getTextMessageBuyGoldSuccess(){
        return getText(messageBuyGoldSuccess);
    }
    public void clickToConfirmTransactionGold() {
        click(confirmTransactionGold);
        sleepInSecond(4);
    }
    public String getTextNeedMoneyPaymentConfirmText(){
        return getText(needMoneyPaymentConfirmText);
    }
    public String getTextPayTypeConfirmText(){
        return getText(payTypeConfirmText);
    }
    public String getTextEquivalentConfirmText(){
        return getText(equivalentConfirmText);
    }
    public String getTextAmountGoldConfirmText(){
        return getText(amountGoldConfirmText);
    }
    public String getTextNameProductConfirmText(){
        return getText(nameProductConfirmText);
    }
    public String getTextTypeTransactionConfirmText(){
        return getText(typeTransactionConfirmText);
    }

    public void clickToContinueTransactionGoldBtn() {
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
                click(continueTransactionGoldBtn);
                break;
            case "iOS":
                click(textNeedPay);
                click(continueTransactionGoldBtn);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }
    }
    public String getTextExpectedPaymentText(){
        return getText(expectedPaymentText);
    }
    public String getTextEquivalent(){
        return getText(equivalentText);
    }
    public boolean isEnableContinueTransactionGoldBtn(){
        return isElementEnable(continueTransactionGoldBtn);
    }
    public String getTextNameProductGold(){
        return getText(nameProductGoldText);
    }
    public boolean isDisplayHomeGoldBtn(){
        return isElementDisplayed(homeGoldBtn);
    }
    public void clickToHomeGoldBtn() {
        click(homeGoldBtn);
    }
    public String getTextAmountGoldValue(){
        return getText(amountGoldValue);
    }
    public void clickToBuyMoreBtn() {
        click(buyMoreBtn);
    }


    public static void deleteOrderBuyGold() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE from finhaydb_gold.orders where user_id = 37343 ;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void deleteUserGoldBags() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE from finhaydb_gold.user_gold_bags where user_id = 37343 ;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void updateTermOfUserBuyGold() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE finhaydb.user_configs set terms_buying_gold = 0 where user_id =37343;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
}
