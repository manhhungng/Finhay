package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SellStockPage extends BasePage{
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TVS']")
    private MobileElement TVSymbol;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStockOwningDetailSellEvent")
    private MobileElement sellEvenLotBtn;
    @AndroidFindBy(xpath = "vn.finhay.finhay:id/tvStockTransaction")
    private MobileElement sellBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='TVS']")
    private MobileElement stockInHomeBtn;
    @AndroidFindBy(xpath = "vn.finhay.finhay:id/tvConfirmDlgDes")
    private MobileElement messageSellSuccessText;



    public void clickToTVSymbol(){
        click(TVSymbol);
    }
    public void clickToSellEvenLotBtn(){
        click(sellEvenLotBtn);
    }
    public boolean isEnableSellBtn(){
        return isElementEnable(sellBtn);
    }
    public void clickToSellBtn(){
        click(sellBtn);
    }
    public String getTextMessageSellSuccessText(){
        return getText(messageSellSuccessText);

    }

}
