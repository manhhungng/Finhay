package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OpenPortfolioPage extends BasePage{
    TestUtils utils = new TestUtils();
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Rùa Hoàn Kiếm']/following-sibling::android.widget.TextView[@text='Bắt đầu đầu tư']")
    private MobileElement startInVestTurtleBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_start_investment")
    private MobileElement startInVestStorkBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_start_investment")
    private MobileElement startInVestElephantBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_start_investment")
    private MobileElement openPortfolioSaoLaBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_start_investment")
    private MobileElement openPortfolioBuffaloBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_start_investment")
    private MobileElement startInvestBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cấu trúc tự chọn 1']/following-sibling::android.widget.TextView[@text='Mở cấu trúc']")
    private MobileElement openPortfolioElectiveBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Cò Trắng']")
    private MobileElement portfolioStorkBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Voi Rừng']")
    private MobileElement portfolioElephantBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sao La']")
    private MobileElement portfolioSaoLaBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Trâu Nước']")
    private MobileElement portfolioBuffaloBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_icon")
    private MobileElement iconInvest;
    @AndroidFindBy(xpath =  "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")
    private MobileElement backBtn;
    @AndroidFindBy(xpath =  "//android.widget.TextView[@text='Dành cho thành viên Vàng trở lên']")
    private MobileElement textOptionalPortfolio;

    public  String getTextOptionalPortlofio() {

        return getText(textOptionalPortfolio);
    }
    public void clickToBackBtn()  {
        click(backBtn);
    }
    public void clickToStartInvestBtn()  {
    click(startInvestBtn);
    }
    public  boolean isDisplayedPortfolioStorkBtn(){
        return isElementDisplayed(portfolioStorkBtn);
    }
    public  boolean isDisplayedPortfolioElephantBtn(){
        return isElementDisplayed(portfolioElephantBtn);
    }
    public  boolean isDisplayedPortfolioSaoLaBtn(){
        return isElementDisplayed(portfolioSaoLaBtn);
    }
    public  boolean isDisplayedPortfolioBuffaloBtn() throws Exception {
      scrollToElement(textOptionalPortfolio,"up");
        return isElementDisplayed(portfolioBuffaloBtn);
    }
    public boolean isEnableStartInVestStorkBtn() throws Exception {
scrollToElement(startInVestTurtleBtn,"up");
sleepInSecond(1);
swipeScreen(Direction.LEFT);
//swipeElementAndroid(startInVestStorkBtn,Direction.LEFT);
        return isElementEnable(startInVestStorkBtn);
    }
    public boolean isEnableStartInVestElephantBtn()  {
        swipeScreen(Direction.LEFT);
        //swipeElementAndroid(startInVestStorkBtn,Direction.LEFT);
        return isElementEnable(startInVestElephantBtn);
    }
    public boolean isEnableOpenPortfolioSaoLaBtn()  {
        swipeScreen(Direction.LEFT);
        return isElementEnable(openPortfolioSaoLaBtn);
    }
    public boolean isEnableOpenPortfolioBuffaloBtn()  {
        swipeScreen(Direction.LEFT);
        return isElementEnable(openPortfolioBuffaloBtn);
    }
    public boolean isEnableOpenPortfolioElectiveBtn() {
        swipeScreen(Direction.LEFT);
        return isElementEnable(openPortfolioElectiveBtn);
    }
}
