package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.GlobalParams;
import com.qa.utils.TestUtils;
import com.qa.utils.configPath;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.remote.HideKeyboardStrategy;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class WithdrawGoldPage extends BasePage {
    public MySQLConnUtils query = new MySQLConnUtils();
    private Connection con =  null;
    private PreparedStatement stmt = null;
    private ResultSet kq = null;
    Map<String,Object> maps ;
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvRegisterWithdrawGoldItmRequestList\n")
    private MobileElement listRequestBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvRegisterWithdrawGoldItmRegister")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Đăng ký\"]")
    private MobileElement registerWithdrawGoldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/iedtGoldInputQuantityInput")
    @iOSXCUITFindBy(id =  "gold_quantity")
    private MobileElement amountWithdrawTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldReceiveAmount")
    @iOSXCUITFindBy(id =  "total_maces")
    private MobileElement goldReceiveValue;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldReceiveNext")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Tiếp tục\"]")
    private MobileElement nextWithdrawGoldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmGoldTransactionGoldReceive")
    @iOSXCUITFindBy(id =  "total_maces")
    private MobileElement goldReceiveConfirmValue;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmGoldTransactionConfirm")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Xác nhận yêu cầu\"]")
    private MobileElement confirmRequestBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStatusGoldTitle")
    private MobileElement messageSuccessText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStatusGoldDescription")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeStaticText[@name=\"Đặt lịch nhận vàng thành công. Bạn có thể xem lại chi tiết trong phần Danh sách yêu cầu.\"]")
    private MobileElement messageDescriptionText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStatusGoldBuyMore")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Mở danh sách yêu cầu\"]")
    private MobileElement openListRequestBtn;
    @AndroidFindBy(xpath = "//android.widget.ImageView/preceding-sibling::android.widget.TextView[@text='Chưa đến hạn']")
    @iOSXCUITFindBy(xpath =  "(//XCUIElementTypeStaticText[@name=\"status\"])[1]")
    private MobileElement submitUndueText;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeTable/child::XCUIElementTypeCell[1]")
    private MobileElement detailRequestWithdrawBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldReceiveRequestDetailStatus")
    @iOSXCUITFindBy(id =  "title")
    private MobileElement sttMessageWithdrawText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldReceiveRequestDetailConfirm")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Xác nhận\"]")
    private MobileElement userConfirmReceiveGoldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvGoldReceiveRequestDetailCode")
    @iOSXCUITFindBy(id =  "request_id")
    private MobileElement codeRequestIDText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmDealGoldBack")
    @iOSXCUITFindBy(xpath =  "//XCUIElementTypeButton[@name=\"Về trang Hũ vàng\"]")
    private MobileElement returnPotOfGoldBtn;



    public void clickToRegisterWithdrawGoldBtn() throws Exception {
        scrollToElement(registerWithdrawGoldBtn,"up");
        click(registerWithdrawGoldBtn);
    }
    public void inputToAmountWithdrawTxt(String value)  {
        switch (new GlobalParams().getPlatformName()) {
            case "Android":
                sendKeys(amountWithdrawTxt,value);
                break;
            case "iOS":
                sendKeys(amountWithdrawTxt,value);
                amountWithdrawTxt.sendKeys(Keys.ENTER);

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
        }


    }
    public String getTextGoldReceiveValue(){
        return getText(goldReceiveValue);
    }
    public void clickToNextWithdrawGoldBtn() {
        click(nextWithdrawGoldBtn);
    }
    public String getTextGoldReceiveConfirmValue(){
        return getText(goldReceiveConfirmValue);
    }
    public void clickToConfirmRequestBtn() {
        click(confirmRequestBtn);
    }
    public String getTextMessageSuccessText(){
        return getText(messageSuccessText);
    }
    public String getTextMessageDescriptionText(){
        return getText(messageDescriptionText);
    }
    public void clickToOpenListRequestBtn() {
        click(openListRequestBtn);
    }
    public String getTextSubmitUndueText(){
        return getText(submitUndueText);
    }
    public void clickToDetailRequestWithdrawBtn() throws Exception {
     swipeScreen(Direction.DOWN);
        click(detailRequestWithdrawBtn);
    }
    public String getTextSttMessageWithdrawText(){
        return getText(sttMessageWithdrawText);
    }
    public Boolean isEnableUserConfirmReceiveGoldBtn(){
        return isElementEnable(userConfirmReceiveGoldBtn);
    }
    public String getTextCodeRequestIDText(){
        return getText(codeRequestIDText);
    }
    public void clickToUserConfirmReceiveGoldBtn() {
        click(userConfirmReceiveGoldBtn);
    }
    public void clickToNavigate() {
       back();
    }
    public void clickToReturnPotOfGoldBtn() {
        click(returnPotOfGoldBtn);
    }
    public String runJobChangeStatusSubmitUndueToSubmitDue() {
        String message = given().header("Content-Type", "application/json")
                .when()
                .put(configPath.PUT_JOB_FROM_SUBMIT_UNDUE_TO_SUBMIT_DUE)
                .then()
                .statusCode(200)
                .assertThat().extract().response().getBody().jsonPath().getJsonObject("message");
        System.out.println(message);
        return message;
    }
    public String runJobChangeStatusSubmitDueToShopConfirmed() {
        JSONObject request = new JSONObject();
        request.put("user_id",getUserIDWithdrawOrder());
        request.put("request_id",getRequestIDWithdrawOrder());
        String message = given().header("Content-Type", "application/json")
                .body(request.toJSONString())
                .when()
                .put(configPath.PUT_JOB_FROM_SUBMIT_DUE_TO_SHOP_CONFIRMED)
                .then()
                .statusCode(200)
                .assertThat().extract().response().getBody().jsonPath().getJsonObject("message");
        System.out.println(message);
        return message;
    }
    public void updateRequestTimeNow() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();

            String querySql = "UPDATE finhaydb_gold.withdraw_orders set request_date = CURDATE() WHERE user_id = 37345 ORDER BY id DESC LIMIT 1;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public String getRequestIDWithdrawOrder() {
        String sql = "SELECT request_id from finhaydb_gold.withdraw_orders WHERE user_id = 37345 ORDER BY id DESC limit 1;";
        String stt = null;

        try {
            con = query.extracted(query);
            stmt = con.prepareStatement(sql);
            kq = stmt.executeQuery();
            //  System.out.println(stmt.toString());

            while (kq.next()) {
                stt = kq.getString("request_id");
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
    public String getUserIDWithdrawOrder() {
        String sql = "SELECT user_id  from finhaydb_gold.withdraw_orders ORDER BY id DESC limit 1;";
        String stt = null;

        try {
            con = query.extracted(query);
            stmt = con.prepareStatement(sql);
            kq = stmt.executeQuery();
            //  System.out.println(stmt.toString());

            while (kq.next()) {
                stt = kq.getString("user_id");
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
