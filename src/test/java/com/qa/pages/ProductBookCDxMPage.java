package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProductBookCDxMPage {



    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDetailSummaryItmAsset")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[3]")
    private MobileElement productTotalAmount;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDetailSummaryItmDeposit")
    @iOSXCUITFindBy(id = "ic add")
    private MobileElement topUpBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivCdxmDetailSummaryItmWithdrawBg")
    @iOSXCUITFindBy(id = "ic rut")
    private MobileElement withdrawBtn;

    //Product info

    @AndroidFindBy(xpath = "//android.widget.TextView[@text = 'Thông tin gói Tích luỹ']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement productInfoSign;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDetailInfoItmRate")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement hlInfoTitle;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDetailInfoItmContent")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement hlInfoDesc;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDetailInfoItmFirstTitle")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement firstInfoTitle;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDetailInfoItmFirstContent")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement firstInfoDesc;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDetailInfoItmSecondTitle")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement secondInfoTitle;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmDetailInfoItmSecondContent")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement secondInfoDesc;

    //Hiển thị lãi

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lợi nhuận tạm tính']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement pendingInterest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lợi nhuận đã nhận']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement receivedInterest;

    //Danh sách sổ

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sổ tích luỹ đang có']/../following-sibling::androidx.appcompat.widget.LinearLayoutCompat[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement firstActiveBookInLine;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sổ tích luỹ đang có']/../following-sibling::androidx.appcompat.widget.LinearLayoutCompat[1]/*/*/android.widget.TextView[@resource-id='vn.finhay.finhay:id/tvLeftRightTextViewRight']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement firstActiveBookAmount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sổ tích luỹ đang có']/../following-sibling::androidx.appcompat.widget.LinearLayoutCompat[1]/*/*/android.widget.TextView[@resource-id='vn.finhay.finhay:id/tvLeftRightTextViewRight']")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement firstActiveBookId;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sổ đã đóng']/../following-sibling::androidx.appcompat.widget.LinearLayoutCompat[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Thông tin gói Tích luỹ']")
    private MobileElement firstClosedBookInLine;

    //


}
