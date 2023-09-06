package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class BuyStockPage extends BasePage {
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/llHomeStock")
    private MobileElement stockInHomeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/navigation_market")
    private MobileElement marketBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='AAA']")
    private MobileElement AAASymbolText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStockTransactionDlgStockBuy")
    private MobileElement buyStockBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/sedtStockTransactionStock")
    private MobileElement amountStockTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStockTransactionMoney")
    private MobileElement estimateAmountTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvStockTransaction")
    private MobileElement buyBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmOTPDlgConfirm")
    private MobileElement otpConfirmBtn;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[1]")
    private MobileElement otpTxt1;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    private MobileElement otpTxt2;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[3]")
    private MobileElement otpTxt3;
    @AndroidFindBy(xpath = "//android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView[4]")
    private MobileElement otpTxt4;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmOTPDlgStockError")
    private MobileElement errorMessageOtp;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmDlgDes")
    private MobileElement successMessageBuyStock;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmDlgConfirm")
    private MobileElement doneBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmDlgAction")
    private MobileElement orderBookBtn;



    public boolean isDisplayOrderBookBtn(){
        return isElementDisplayed(orderBookBtn);
    }
    public boolean isDisplayDoneBtn(){
        return isElementDisplayed(doneBtn);
    }

    public String getTextSuccessMessageBuyStock(){
        return getText(successMessageBuyStock);

    }
    public String getTextErrorMessageOtp(){
        return getText(errorMessageOtp);

    }
    public void inputToOtpTxt1(String value){
        sendKeys(otpTxt1,value);
    }
    public void inputToOtpTxt2(String value){
        sendKeys(otpTxt2,value);
    }
    public void inputToOtpTxt3(String value){
        sendKeys(otpTxt3,value);
    }
    public void inputToOtpTxt4(String value){
        sendKeys(otpTxt4,value);
    }

    public boolean isEnableOtpConfirmBtn(){
        return isElementEnable(otpConfirmBtn);
    }
    public void clickToOtpConfirmBtn(){
        click(otpConfirmBtn);
    }
    public void clickToStockInHomeBtn(){
        click(stockInHomeBtn);
    }
    public void clickToMarketBtn(){
        click(marketBtn);
 }
    public void clickToAAASymbolText(){
        click(AAASymbolText);
}
    public void clickToBuyStockBtn(){
        click(buyStockBtn);
    }
    public void inputToAmountStockTxt(String value){
  sendKeys(amountStockTxt,value);
    }
    public String getTextEstimateAmountTxt(){
        return getText(estimateAmountTxt);

    }
    public void clickToBuyBtn(){
        click(buyBtn);
    }
    public boolean isDisplayBuyStockBtn(){
        return isElementDisplayed(buyStockBtn);
    }
    public boolean isEnableBuyBtn(){
        return isElementEnable(buyBtn);
    }
}
