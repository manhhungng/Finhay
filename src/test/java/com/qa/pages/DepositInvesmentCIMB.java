package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DepositInvesmentCIMB extends BasePage{
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/asset")
    private MobileElement investBtn;
    @AndroidFindBy(id ="vn.finhay.finhay:id/txt_start_investment")
    private MobileElement startInvestBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/btnInvestMore")
    private MobileElement continueInvestBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/investMore")
    private MobileElement inputOtherNumberBtn;
    @AndroidFindBy(id="vn.finhay.finhay:id/goalCard")
    private MobileElement turtleBtn;
    @AndroidFindBy(id="vn.finhay.finhay:id/asset_total")
    private MobileElement totalInvestValue;


    public boolean isDisplayTurtleBtn(){
        return isElementDisplayed(turtleBtn);
    }
    public void clickToTurtleBtn()  {
        click(turtleBtn);
    }
    public void clickToInputOtherNumberBtn()  {
        click(inputOtherNumberBtn);
    }
    public void clickToContinueInvestBtn()  {
        click(continueInvestBtn);
    }
    public void clickToStartInvestBtn()  {
        click(startInvestBtn);
    }
    public void clickToInvestBtn() throws Exception {
        scrollToElement(investBtn,"up");
        click(investBtn);
    }
    public String getTextTotalInvest(){
        return getText(totalInvestValue);
    }
    public static void deleteTransactionDepositInvestCIMB() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb_investment.investment_history where user_id = 37485";
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
