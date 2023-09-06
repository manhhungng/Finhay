package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CDxMDetailPage {

    //Top card

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDetailSummaryItmAsset")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cdxmPckBlcTxt;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivCdxmDetailSummaryItmDeposit")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cdxmPckDepositBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivCdxmDetailSummaryItmWithdrawBg")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cdxmPckWithdrawBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivCdxmDetailSummaryItmTransactionBg")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cdxmPckTransHisBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvProfitPaymentMethodItm")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement profitPaymentDropDown;





}
