package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStockPage extends BasePage {
    @AndroidFindBy(id = "vn.finhay.finhay:id/llHomeStock")
    private MobileElement homeCardStock;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvAlertHeader")
    private MobileElement headerCreateStock;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStockPolicyContentLayoutRule")
    private MobileElement tacLink;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStockPolicyContentLayoutContract")
    private MobileElement contractLink;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStockPolicyContentLayoutNote")
    private MobileElement appendixLink;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvAlertOK")
    private MobileElement acceptButton;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvAlertCancel")
    private MobileElement introLink;

    @AndroidFindBy(id = "vn.finhay.finhay:id/dvStockSignContractDrawSignContact")
    private MobileElement signPad;


    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStockSignContractDrawSignContactAgain")
    private MobileElement clearSignButton;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStockSignContractComplete")
    private MobileElement signProceedButton;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmDlgTitle")
    private MobileElement confirmAlertTitle;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmDlgDes")
    private MobileElement confirmAlertText;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmDlgConfirm")
    private MobileElement confirmActionButton;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmDlgAction")
    private MobileElement closeActionButton;

    public String getHeaderText() {
        return getText(headerCreateStock);
    }

    public void clickTacLink() {
        click(tacLink);
        sleepInSecond(5);
    }

    public String getTACText() {
        return getText(tacLink);
    }

    public String getTACLink() {
        return driver.getCurrentUrl();
    }

    public void clickIntroLink() {
        click(introLink);
        sleepInSecond(5);
    }

    public String getIntroLinkText() {
        return getText(introLink);
    }

    public void clickContractLink() {
        click(contractLink);
        sleepInSecond(5);
    }

    public String getContractText() {
        return getText(contractLink);
    }

    public void clickAppendixLink() {
        click(appendixLink);
        sleepInSecond(5);
    }

    public String getAppendixText() {
        return getText(appendixLink);
    }

    public boolean checkAcceptButton() {
        return isElementDisplayed(acceptButton);
    }

    public void clickAccept() {
        click(acceptButton);
        sleepInSecond(5);
    }

    public String getConfirmAlertTitle() {
        return getText(confirmAlertTitle);
    }

    public String getConfirmAlertText() {
        return getText(confirmAlertText);
    }

    public String getConfirmAlertBtnText() {
        return getText(confirmActionButton);
    }

    public String getConfirmCloseBtnText() {
        return getText(closeActionButton);
    }

    public void clickActionError() {
        click(confirmActionButton);
        sleepInSecond(5);
    }

    public void clickCloseError() {
        click(closeActionButton);
        sleepInSecond(5);
    }

    public void drawSignature() {
        draw(signPad);
        sleepInSecond(3);
    }

    public Boolean checkSignProceedButton() {
        return isElementEnable(signProceedButton);
    }

    public void clickSignProceedButton() {
        click(signProceedButton);
        sleepInSecond(5);
    }

    //Change type to create test case without eKYC

    public static void changeUidProfile() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE `finhaydb`.`profiles` SET `user_id` = '38781' WHERE (`id` = '3360');";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }

    //Change gender to null for lack personal info testcase

    public static void setGenderToNull() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE `finhaydb`.`profiles` SET `user_id` = '38780', `gender` = NULL WHERE (`id` = '3360');";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void changeUidBank() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE `finhaydb`.`profiles` SET `gender` = '1' WHERE (`id` = '3360');";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }


}


