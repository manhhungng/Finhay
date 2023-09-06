package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;

public class FinhayWalletPage extends BasePage {
    public MySQLConnUtils query = new MySQLConnUtils();
    private Connection con = null;
    private PreparedStatement stmt = null;
    private ResultSet kq = null;
    Map<String, Object> maps;
    TestUtils utils = new TestUtils();

    //Finhay wallet for new user

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvFinhayBagNewbieItmRechargeNow")
    private MobileElement btnDepositWalletNew;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivFinhayBagNewbieItmAvatar")
    private MobileElement iconWalletNew;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvFinhayBagNewbieItmFinhayBagTitle")
    private MobileElement titleWalletNew;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvFinhayBagNewbieItmContent")
    private MobileElement descWalletNew;

    //Finhay wallet for funded user

    @AndroidFindBy(id = "vn.finhay.finhay:id/flFhbagFundedItmRecharge")
    private MobileElement btnFinhayWalletDepositFunded;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivFhbagFundedItmRepeat")
    private MobileElement btnFinhayWalletConvertFunded;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivFhbagFundedItmWithdraw")
    private MobileElement btnFinhayWalletWithdrawFunded;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvFhbagFundedItmMoney")
    private MobileElement txtFinhayWalletBalance;

    //Wallet Deposit

    @AndroidFindBy(id = "vn.finhay.finhay:id/edtInputLayout")
    private MobileElement txtFieldDepositAmount;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvInputMoneySuggestionAmount1")
    private MobileElement btnRecommendedAmount1;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvInputMoneySuggestionAmount2")
    private MobileElement btnRecommendedAmount2;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvInputMoneySuggestionAmount3")
    private MobileElement btnRecommendedAmount3;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvInputMoneyContinue")
    private MobileElement btnContinueDeposit;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvInputMoneyContinue")
    private MobileElement btnBack;

    //Error popup

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivAlertDlgIcon")
    private MobileElement iconError;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivAlertDlgIcon")
    private MobileElement descError;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivAlertDlgIcon")
    private MobileElement closeError ;

    //Transfer detail

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

    //new wallet action

    public boolean isFinhayWalletIconDisplayed() {
        sleepInSecond(3);
        return isElementDisplayed(iconWalletNew);
    }

    public boolean isFinhayWalletTitleDisplayed() {
        sleepInSecond(3);
        return isElementDisplayed(titleWalletNew);
    }

    public boolean isFinhayWalletDescDisplayed() {
        sleepInSecond(3);
        return isElementDisplayed(descWalletNew);
    }

    public void newUserFinhayWalletStart() {
        click(btnDepositWalletNew);
    }

    //funded wallet action

    public String getFinhayWalletBalance() {
        return getText(txtFinhayWalletBalance);
    }

    public void fundedUserFinhayWalletDeposit() {
        click(btnFinhayWalletDepositFunded);
    }

    public void fundedUserFinhayWalletConvert() {
        click(btnFinhayWalletConvertFunded);
    }

    public void fundedUserFinhayWalletWithdraw() {
        click(btnFinhayWalletWithdrawFunded);
    }

    //deposit action

    public void inputDepositAmount(String value) {
        sendKeys(txtFieldDepositAmount, value);
    }

    public boolean enableContinueBtn() {
        return isElementEnable(btnContinueDeposit);
    }

    public void clickContinueBtn() {
        click(btnContinueDeposit);
    }

    //transaction detail

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

    //withdraw action


}
