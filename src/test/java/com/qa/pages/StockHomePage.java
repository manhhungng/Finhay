package com.qa.pages;

import com.qa.utils.TestUtils;
import com.qa.utils.configPath;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import static io.restassured.RestAssured.given;

public class StockHomePage extends BasePage{
    TestUtils testUtils = new TestUtils();

    @AndroidFindBy (id = "vn.finhay.finhay:id/idvHomeProductHighlightItm")
    private MobileElement homeCardStockHighlight;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Chứng khoán']")
    private MobileElement homeCardStockNormal;

    //Asset & value
    @AndroidFindBy (id = "vn.finhay.finhay:id/tvStockAssetItmTotalMoney")
    private MobileElement textTotalStockAsset;
    @AndroidFindBy (id = "vn.finhay.finhay:id/tvStockAssetItmStockAssetMoney")
    private MobileElement textStockValue;
    @AndroidFindBy (id = "vn.finhay.finhay:id/tvStockAssetItmMoneyAsset")
    private MobileElement textTotalCashValue;

    //Detail Cash value
    @AndroidFindBy (id = "vn.finhay.finhay:id/tvStockAssetItmMoneyAvailable")
    private MobileElement textAvailableCashValue;
    @AndroidFindBy (id = "vn.finhay.finhay:id/tvStockAssetItmMoneyAssetWaiting")
    private MobileElement textPendingCashValue;
    @AndroidFindBy (id = "vn.finhay.finhay:id/tvStockAssetItmMoneyAssetPaid")
    private MobileElement textPrepaidCashValue;

    //Deposit & withdraw

    @AndroidFindBy (id = "vn.finhay.finhay:id/tvStockAssetItmRecharge")
    private MobileElement buttonFirstDeposit;

    @AndroidFindBy (id = "vn.finhay.finhay:id/ivStockAssetItmRechange")
    private MobileElement buttonDeposit;

    @AndroidFindBy (id = "vn.finhay.finhay:id/ivStockAssetItmWithdraw")
    private MobileElement buttonWithdraw;

    //Order & Portfolio

    @AndroidFindBy (id = "vn.finhay.finhay:id/tvTabStockItmOwning")
    private MobileElement tabPortfolio;

    @AndroidFindBy (id = "vn.finhay.finhay:id/tvTabStockItmStockCommand")
    private MobileElement tabOrderBook;

    @AndroidFindBy (id = "vn.finhay.finhay:id/tvStockOwningEmptyContent")
    private MobileElement assetEmptyContent;

    //Stock Tab menu

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Tài sản']")
    private MobileElement assetTab;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Thị trường']")
    private MobileElement marketTab;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Mở rộng']")
    private MobileElement augmentTab;

    //Market Tab

    @AndroidFindBy (id = "vn.finhay.finhay:id/edtSearchViewLayout")
    private MobileElement searchBar;

    @AndroidFindBy (id = "vn.finhay.finhay:id/wrclvStockMarket")
    private MobileElement marketList;

    @AndroidFindBy (xpath = "//android.widget.TextView[@text='Không có kết quả phù hợp']")
    private MobileElement marketEmptyContent;

    @AndroidFindBy (xpath = "//androidx.recyclerview.widget.RecyclerView/child::android.view.ViewGroup[1]")
    private MobileElement firstStock;

    //Augment tab

    @AndroidFindBy (id = "vn.finhay.finhay:id/constStockRightsIssueItm")
    private MobileElement rightList;

    //Get Asset info

    public String getTotalStockAsset() {
        return getText(textTotalStockAsset);
    }

    public String getStockValue() {
        return getText(textStockValue);
    }

    public String getTotalCashValue() {
        return getText(textTotalCashValue);
    }

    public String getAvailableCashValue() {
        return getText(textAvailableCashValue);
    }

    public String getPendingCashValue() {
        return getText(textPendingCashValue);
    }

    public String getPrepaidCashValue() {
        return getText(textPrepaidCashValue);
    }

    //portfolio action

    public void clickPortfolioTab() {
        click(tabPortfolio);
    }

    //order book action
    public void clickOrderBookTab() {
        click(tabOrderBook);
    }

    public boolean checkEmptyContent() {
        return isElementDisplayed(assetEmptyContent);
    }

    //get API data












}
