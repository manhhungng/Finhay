package com.qa.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CashAccountFinhayPage {
    //Cash Account action bar

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvActionBarLayoutTitle")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAcctTitle;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivActionBarLayoutRight")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAcctInfo;

    //Cash Account onboard

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCardOnBoardingItmIntro")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAcctOnboardTitle;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCardOnBoardingItmContent")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAcctOnboardContent;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivCardOnBoardingItmProduct")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAcctIcon;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCardOnBoardingItmHideInfo")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement onboardHideInfo;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCardOnBoardingItmOnBoard")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement onboardSlide;


}