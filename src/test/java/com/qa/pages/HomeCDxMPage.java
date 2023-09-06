package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeCDxMPage extends BasePage {
    TestUtils testUtils = new TestUtils();

    //Home screen CDxM

    @AndroidFindBy(id = "vn.finhay.finhay:id/llHomeCdxm")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement homeCardCdxm;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvActionBarLayoutTitle")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name='Tích lũy siêu cấp']")
    private MobileElement pageCdxmTitle;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmAssetItm")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tổng tích luỹ']/following-sibling::XCUIElementTypeStaticText[2]")
    private MobileElement assetNumber;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmAssetItmInvestNow")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name='Tích luỹ ngay']")
    private MobileElement depositCdxmBtn;

    //Lợi nhuận

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lợi nhuận tạm tính']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@text='Lợi nhuận tạm tính']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement estimatedInterest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lợi nhuận đã nhận']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@text='Lợi nhuận đã nhận']/following-sibling::XCUIElementTypeStaticText")
    private MobileElement receivedInterest;

    //Chọn sản phẩm

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]")
    private MobileElement cdxmPacket1;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]")
    private MobileElement cdxmPacket1Name;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[4]")
    private MobileElement cdxmPacket1Balance;

    //Popup chọn sản phẩm

    @AndroidFindBy(id = "vn.finhay.finhay:id/rclvCdxmProductListBottomSheetDlg")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tổng tích luỹ']/following-sibling::XCUIElementTypeStaticText[2]")
    private MobileElement prodBtmList;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeNavigationBar[@name='Chọn sản phẩm tích luỹ']/following-sibling::XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]")
    private MobileElement prodBtmListPck1;

    //Lấy thông tin tổng quan

    public String getPageTitle(){
        return getText(pageCdxmTitle);
    }

    public Boolean isTotalCdxmAssetDisplayed(){
        return isElementDisplayed(prodBtmList);
    }


    public String getTotalCdxmAsset(){
        return getText(assetNumber);
    }

    public String getTextDepositButton(){
        return getText(depositCdxmBtn);
    }

    //Thao tác nút chức năng

    public void clickHomeCardCdxm(){
        click(homeCardCdxm);
    }

    public void clickHomeCdxmDepositBtn(){
        click(depositCdxmBtn);
    }

    //lấy thông tin lãi

    public String getEstimatedInterest(){
        return getText(estimatedInterest);
    }

    public String getReceivedInterest(){
        return getText(receivedInterest);
    }

    public Boolean checkDepositSrcLstDisplay(){
        return isElementDisplayed(prodBtmList);
    }

    //Thao tác với gói

    public void clickProduct1(){
        click(cdxmPacket1);
    }

    public void clickProduct1BtmLst(){
        click(prodBtmListPck1);
    }


}
