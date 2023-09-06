package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CDxMDepositPage extends BasePage {

    //Màn hình nhập số tiền

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDepositFromCdAccumulationTo")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeImage[@name='ic_cdxm_product']/following-sibling::XCUIElementTypeStaticText[2]")
    private MobileElement destDepositProd;

    @AndroidFindBy(id = "vn.finhay.finhay:id/edtInputLayoutMoney")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Nạp tiền']/following-sibling::XCUIElementTypeTextField")
    private MobileElement inputAmountFld;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDepositFromCdMoney")
    @iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name='Tích luỹ không kỳ hạn'])[2]/following-sibling::XCUIElementTypeStaticText")
    private MobileElement availableFund;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDepositFromCdOk")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Tiếp tục']")
    private MobileElement contDepositBtn;

    //Màn xác nhận

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmRequestDepositConfirmMoney")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Số tiền']/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement confirmDepositAmount;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmRequestDepositConfirmFee")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Phí']/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement transFee;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmRequestDepositConfirmMoneyReceive")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Số tiền thực nhận']/following-sibling::XCUIElementTypeStaticText[1]")
    private MobileElement finalDepositAmount;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmRequestDepositConfirmConfirm")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Tiếp tục']")
    private MobileElement confirmBtn;

    //Màn thành công

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivAlertResource")
    @iOSXCUITFindBy(id = "ic_mascot")
    private MobileElement successMascot;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvAlertHeader")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích luỹ thành công!']")
    private MobileElement successTitle;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvAlertOK")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích luỹ thành công!']")
    private MobileElement returnHmCdxmBtn;

    //Tạo lệnh nạp

    public String getDestDepositProd() {
        return getText(destDepositProd);
    }

    public String getAvailableFund() {
        return getText(availableFund);
    }

    public void selectInputAmountFld(String value) {
        inputAmountFld.sendKeys(value);
    }

    public boolean checkContinueBtnEnable() {
        return isElementEnable(contDepositBtn);
    }

    public void clickContCDxMBtn() {
        click(contDepositBtn);
    }

    //Thực hiện xác nhận

    public String getConfirmDepositAmount() {
        return getText(confirmDepositAmount);
    }

    public String getTransFee() {
        return getText(transFee);
    }

    public String getFinalDepositAmount() {
        return getText(finalDepositAmount);
    }

    public boolean isConfirmBtnDisplayed() {
        return isElementDisplayed(confirmBtn);
    }

    public void clickConfirm() {
        click(confirmBtn);
    }

    //Thao tác trên màn thành công

    public boolean checkIconSuccessVisible() {
        return isElementDisplayed(successMascot);
    }

    public String checkSuccessTitle() {
        return getText(successTitle);
    }

    public boolean checkReturnHomeBtnDisplayed() {
        return isElementDisplayed(returnHmCdxmBtn);
    }

    public void clickReturnHome() {
        click(returnHmCdxmBtn);
    }
}
