package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

public class HomeCODPage extends BasePage{
    public MySQLConnUtils query = new MySQLConnUtils();
    private Connection con = null;
    private PreparedStatement stmt = null;
    private ResultSet kq = null;
    Map<String, Object> maps;
    TestUtils utils = new TestUtils();

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tích Lũy']")
    private MobileElement homeCardCOD;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCheeseparingIntroNewFlowStartCheese")
    private MobileElement startBtnCOD;

    @AndroidFindBy(id = "vn.finhay.finhay:id/edtInputLayout")
    private MobileElement txtFieldDepositAmount;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvInputMoneyContinue")
    private MobileElement btnContinueDeposit;

    @AndroidFindBy(id = "vn.finhay.finhay:id/invest_bank_btnClose")
    private MobileElement btnCloseInfo;

    @AndroidFindBy(id = "vn.finhay.finhay:id/rlBankDropdownLayoutName")
    private MobileElement dropDownBankName;

    @AndroidFindBy(id = "vn.finhay.finhay:id/rclvDropdownLayoutBank")
    private MobileElement lstBankName;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankDetailNewLayoutContent")
    private MobileElement txtTransferDetail;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankDetailNewLayoutNumber")
    private MobileElement txtTransBankNumber;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankDetailNewLayoutMoney")
    private MobileElement txtPlaceAmount;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankDetailNewLayoutName")
    private MobileElement txtTransName;

    @AndroidFindBy(id = "vn.finhay.finhay:id/title")
    private MobileElement btnTransferGuide;

    @AndroidFindBy(id = "vn.finhay.finhay:id/llBankIntroDlgIntroContainer")
    private MobileElement popUpGuide;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankIntroDlgNextStepOne")
    private MobileElement btnPopUpContinue;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankIntroDlgNext")
    private MobileElement btnGuideNextStep;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankIntroDlgAgain")
    private MobileElement btnGuideRecheck;


    public void clickHomeCODCard() {
        click(homeCardCOD);
    }

    public void clickStartBtn() {
        click(startBtnCOD);
    }

    public void inputDepositAmount(String value) {
        sendKeys(txtFieldDepositAmount, value);
    }

    public boolean enableContinueBtn() {
        return isElementEnable(btnContinueDeposit);
    }

    public void clickContinueBtn() {
        click(btnContinueDeposit);
    }

    public String getAccountNumberTxt() {
        return getText(txtTransBankNumber);
    }

    public String getTransferDetailTxt() {
        return getText(txtTransferDetail);
    }

    public String getPlaceAmountTxt() {
        return getText(txtPlaceAmount);
    }

    public String getTransferNameTxt() {
        return getText(txtTransName);
    }

    public void clickBtnPopupContinue() {
        click(btnPopUpContinue);
    }

    public void clickNextStepGuide() {
        click(btnGuideNextStep);
    }



}
