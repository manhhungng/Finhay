package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class FundInvestmentPage {
    TestUtils utils = new TestUtils();

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Đầu tư Quỹ']")
    private MobileElement fundInvestmentHomeBtn;

    @AndroidFindBy(id ="vn.finhay.finhay:id/tvInvestmentIntroNewFlowStartInvestment")
    private MobileElement fundInvestmentStartBtn;

    @AndroidFindBy(id ="vn.finhay.finhay:id/edtInputLayout")
    private MobileElement fundDepositInputFld;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvInputMoneyContinue\n")
    private MobileElement continueInvestBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/investMore")
    private MobileElement inputOtherNumberBtn;

    @AndroidFindBy(id="vn.finhay.finhay:id/goalCard")
    private MobileElement turtleBtn;

    @AndroidFindBy(id="vn.finhay.finhay:id/rlBankDropdownLayoutName")
    private MobileElement dropListBank;

    @AndroidFindBy(id="vn.finhay.finhay:id/rlBankDropdownLayoutName")
    private MobileElement bankOptionTCB;

    @AndroidFindBy(id="vn.finhay.finhay:id/rlBankDropdownLayoutName")
    private MobileElement bankOption;




    //    public boolean isDisplayTurtleBtn(){
//        return isElementDisplayed(turtleBtn);
//    }
//    public void clickToTurtleBtn()  {
//        click(turtleBtn);
//    }
//    public void clickToInputOtherNumberBtn()  {
//        click(inputOtherNumberBtn);
//    }
//    public void clickToContinueInvestBtn()  {
//        click(continueInvestBtn);
//    }
//    public void clickToStartInvestBtn()  {
//        click(startInvestBtn);
//    }
//    public void clickToInvestBtn() throws Exception {
//        scrollToElement(investBtn,"up");
//        click(investBtn);
//    }
//    public String getTextTotalInvest(){
//        return getText(totalInvestValue);
//    }
//    public static void deleteTransactionDepositInvestCIMB() throws SQLException {
//        try{
//            Connection conn = MySQLConnUtils.getMySQLConnection();
//            String querySql = "DELETE FROM finhaydb_investment.investment_history where user_id = 37485";
//            Statement statement = conn.createStatement();
//            int result = statement.executeUpdate(querySql);
//            System.out.println(querySql);
//            conn.close();
//        } catch(SQLException e){
//            e.printStackTrace();
//        }
//
//    }
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
    public static void deleteUserPortfolios() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb_investment.user_portfolios where user_id = 37485;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
}
