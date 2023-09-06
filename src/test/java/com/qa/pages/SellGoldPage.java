package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.sql.*;
import java.util.Map;

import static com.qa.connection.MySQLConnUtils.extracted;

public class SellGoldPage extends BasePage {
    private MySQLConnUtils query = new MySQLConnUtils();
    private Connection con = null;
    private PreparedStatement stmt = null;
    private ResultSet kq = null;
    Map<String, Object> maps;
    TestUtils utils = new TestUtils();
    @iOSXCUITFindBy(xpath = " //XCUIElementTypeStaticText[@name=\"Tương đương\"]")
    private MobileElement textEquivalent;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ivActionGoldSellGold")
    @iOSXCUITFindBy(id = "icon vnd gray")
    private MobileElement sellGoldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvSummaryGoldItmNumber")
    @iOSXCUITFindBy(id = "gold_quantity")
    private MobileElement amountGoldValue;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldTransactionNext")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Tiếp tục\"]")
    private MobileElement continueSellGoldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldTransactionWarning")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Số tiền bán vàng sẽ được chuyển về Tích lũy không kỳ hạn.\"]")
    private MobileElement textWarningSellGold;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmGoldTransactionConfirm")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Xác nhận bán vàng\"]")
    private MobileElement confirmSellGoldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStatusGoldTitle")
    @iOSXCUITFindBy(id = "title")
    private MobileElement sttSellGoldSuccessText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStatusGoldBuyMore")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Bán thêm\"]")
    private MobileElement sellMoreBtn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"gold_amount\"])[1]")
    private MobileElement amountSellGoldHistoryText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Bán vàng']")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"trans_type\"])[1]")
    private MobileElement typeTransactionSellGoldText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ivActionBarLayoutBack")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name=\"Hũ vàng\"]/XCUIElementTypeButton[1]")
    private MobileElement backHomePageBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/hdtg_total")
    @iOSXCUITFindBy(id = "money_saving_amount")
    private MobileElement amountSavingHomePageValue;
    @AndroidFindBy(id = "vn.finhay.finhay:id/iedtGoldInputQuantityInput")
    @iOSXCUITFindBy(id = "gold_quantity")
    private MobileElement amountGoldTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldInputEquivalent")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"CHỈ\"]/preceding-sibling::\t\n" +
            "XCUIElementTypeStaticText[1]")
    private MobileElement equivalentValue;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"Finhay\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[3]/XCUIElementTypeOther[3]/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther\n")
    private MobileElement detailHistoryTransactionBtn;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"time\"])[1]")
    private MobileElement contractCode;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView[2]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"user_request\"]")
    private MobileElement requestCode;


    public void clickToDetailHistoryTransactionBtn() {
        click(detailHistoryTransactionBtn);
    }

    public String getTextRequestCode() {
        return getText(requestCode);
    }

    public String getTextContractCode() {
        return getText(contractCode);
    }

    public String getTextEquivalentValue() {
        return getText(equivalentValue);
    }

    public void inputToAmountGoldTxt(String value) {
        sendKeys(amountGoldTxt, value);
    }


    public boolean isDisplaySellMoreBtn() {
        return isElementDisplayed(sellMoreBtn);
    }

    public String getTextAmountSavingHomePageValue() {
        return getText(amountSavingHomePageValue);
    }

    public void clickToBackHomePageBtn() {
        click(backHomePageBtn);
    }

    public String getTextTypeTransactionSellGold() {
        return getText(typeTransactionSellGoldText);
    }

    public String getTextAmountSellGoldHistoryText() {
        return getText(amountSellGoldHistoryText);
    }

    public void clickToSellMoreBtn() {
        click(sellMoreBtn);
    }

    public String getTextSttSellGoldSuccessText() {
        return getText(sttSellGoldSuccessText);
    }

    public void clickToConfirmSellGoldBtn() {
        click(confirmSellGoldBtn);
    }

    public String getTextWarningSellGold() {
        return getText(textWarningSellGold);
    }

    public String getTextSttTransTypeText() {
        return getText(typeTransactionSellGoldText);
    }

    public String getTextAmountGoldValue() {
        return getText(amountGoldValue);
    }

    public void clickToSellGoldBtn() {
       click(sellGoldBtn);

    }
    public void clickToContinueSellGoldBtn() {
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
                click(continueSellGoldBtn);
                break;
            case "iOS":
                click(amountGoldTxt);
                click(continueSellGoldBtn);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }

    }
    public boolean isEnableContinueSellGoldBtn() {
    return  isElementEnable(continueSellGoldBtn);
    }

    public Float getAmountGoldInDataBase() {
        String sql = "Select SUM(quantity) from finhaydb_gold.user_gold_bags where user_id =37345 ;";
        float quantity = 0;

        try {
            con = extracted(query);
            stmt = con.prepareStatement(sql);
            kq = stmt.executeQuery();
            System.out.println(stmt.toString());

            while (kq.next()) {
                quantity = kq.getFloat("SUM(quantity)");
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
        return quantity;

    }

    public String getContractCodeInDatabase() {
        String sql = "SELECT id from finhaydb_gold.orders WHERE user_id =37345 order by id desc limit 1;";
     String id = null;

        try {
            con = extracted(query);
            stmt = con.prepareStatement(sql);
            kq = stmt.executeQuery();
            System.out.println(stmt.toString());

            while (kq.next()) {
                id = kq.getString("id");
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
        return id;

    }
    public String getRequestCodeInDatabase() {
        String sql = "SELECT user_request_id from finhaydb_gold.orders WHERE user_id =37345 order by id desc limit 1;";
        String id = null;

        try {
            con = extracted(query);
            stmt = con.prepareStatement(sql);
            kq = stmt.executeQuery();
            System.out.println(stmt.toString());

            while (kq.next()) {
                id = kq.getString("user_request_id");
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
        return id;

    }
    public static void deleteOrderSellGold() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE from finhaydb_gold.orders where user_id = 37345 and order_type =\"SELL\" ;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }

}
