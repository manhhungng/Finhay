package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CashAccountFinhayDepositPage {

    //Input page

    @AndroidFindBy(id = "vn.finhay.finhay:id/imgLogo")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement depositIcon;

    @AndroidFindBy(id = "vn.finhay.finhay:id/autoCompleteTextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAcctInputFld;

    @AndroidFindBy(id = "vn.finhay.finhay:id/suggFive")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAcctRecAmount1;

    @AndroidFindBy(id = "vn.finhay.finhay:id/suggSix")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAcctRecAmount2;

    @AndroidFindBy(id = "vn.finhay.finhay:id/suggSeven")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAcctRecAmount3;

    @AndroidFindBy(id = "vn.finhay.finhay:id/next")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement depositConfirmBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/investCancel")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement depositCancel;

    //payment option

    @AndroidFindBy(id = "vn.finhay.finhay:id/bank_tranfer")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement manualBankOption;

    @AndroidFindBy(id = "vn.finhay.finhay:id/rut_nhanh_layout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cimbBankOption;


}
