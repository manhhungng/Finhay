package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeFinhayPage extends BasePage {
    TestUtils testUtils = new TestUtils();

    //Cash Account portion in HomePage

    @AndroidFindBy(id = "vn.finhay.finhay:id/constFinhayBagFoundedItmBag")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAccountNonFunded;

    @AndroidFindBy(id = "vn.finhay.finhay:id/constFinhayBagFoundedItmBag")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAccountFunded;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvFhbagFundedItmMoney")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAccountBalance;

    //Cash Account buttons in HomePage

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivFhbagFundedItmCharge")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAccountHomeDepositBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivFhbagFundedItmTransferMoney")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAccountHomeConvertBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/ivFhbagFundedItmWithDraw")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement cashAccountHomeWithdrawBtn;

    



}
