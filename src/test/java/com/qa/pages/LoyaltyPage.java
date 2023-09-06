package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

public class LoyaltyPage extends BasePage {
    TestUtils utils = new TestUtils();
    @AndroidFindBy(id = "vn.finhay.finhay:id/cancel")
    private  MobileElement skipActiveAccBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_close_this_step")
    private  MobileElement confirmSkipBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Thành viên mới']")
    private  MobileElement levelMemberText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/progressBar")
    private  MobileElement progressBar;
    @AndroidFindBy(id = "vn.finhay.finhay:id/img_icon_rank")
    private  MobileElement iconRank;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_suggest")
    private  MobileElement suggestPointText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/item_point")
    private  MobileElement gotoDetailBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/levelName")
    private  MobileElement levelNameText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/levelIcon")
    private  MobileElement levelIcon;
    @AndroidFindBy(id = "vn.finhay.finhay:id/pointValue")
    private  MobileElement pointValue;
    @AndroidFindBy(id = "vn.finhay.finhay:id/pointInfo")
    private  MobileElement tooltipPoint;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ưu đãi của tôi']")
    private  MobileElement myPreference;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lịch sử điểm']")
    private  MobileElement pointHistory;
    @AndroidFindBy(id = "vn.finhay.finhay:id/progressBar")
    private  MobileElement progressBarDetail;
    @AndroidFindBy(id = "vn.finhay.finhay:id/numToNextLevel")
    private  MobileElement pointToLevel;
    @AndroidFindBy(id = "vn.finhay.finhay:id/totalPoint")
    private  MobileElement totalPoint;
    @AndroidFindBy(id = "vn.finhay.finhay:id/rewardPoint")
    private  MobileElement rewardPoint;
    @AndroidFindBy(id = "vn.finhay.finhay:id/friendlyPoint")
    private  MobileElement friendlyPoint;
    @AndroidFindBy(id = "vn.finhay.finhay:id/btnClose")
    private  MobileElement closeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/levelStatus")
    private  MobileElement youHere;
    @AndroidFindBy(id = "vn.finhay.finhay:id/levelPoint")
    private  MobileElement underPoint;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phí bảo trì tài khoản: 0.09% (tối đa 1.100đ)/tháng']")
    private  MobileElement feeMaintain;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phí rút từ Tích luỹ: Miễn phí']")
    private  MobileElement withdrawlFee;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phí rút đầu tư: Miễn phí sau 18 tháng']")
    private  MobileElement investFee;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí rút']")
    private  MobileElement investToSaving;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chuyển từ Tích luỹ sang Đầu Tư: Miễn phí (Coming Soon)']")
    private  MobileElement savingToInvest;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)']")
    private  MobileElement shopping;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ']")
    private  MobileElement savingProd;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Thêm cấu trúc đầu tư (Smart Portfolio)']")
    private  MobileElement investmentStructure;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sản phẩm Bảo Vệ']")
    private  MobileElement protectedProd;
    @AndroidFindBy(id = "vn.finhay.finhay:id/newLayout")
    private  MobileElement newMedal;
    @AndroidFindBy(id = "vn.finhay.finhay:id/bronzeLayout")
    private  MobileElement bronze;
    @AndroidFindBy(id = "vn.finhay.finhay:id/silverLayout")
    private  MobileElement silver;
    @AndroidFindBy(id = "vn.finhay.finhay:id/goldLayout")
    private  MobileElement gold;
    @AndroidFindBy(id = "vn.finhay.finhay:id/back")
    private  MobileElement backBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/levelMedal")
    private  MobileElement iconLevelMedal;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Thành viên đồng']")
    private  MobileElement bronzeMember;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Yêu cầu xét hạng và quyền lợi']")
    private  MobileElement requestTitle;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phí bảo trì tài khoản: 0.09% (tối đa 2.200đ)/tháng']")
//    private  MobileElement feeMaintainBronze;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí']")
//    private  MobileElement investToSavingBronze;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chuyển từ Tích luỹ sang Đầu Tư(Coming Soon)']")
//    private  MobileElement savingToInvestBronze;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phí rút đầu tư: Miễn phí sau 18 tháng']")
//    private  MobileElement feeInvestBronze;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phí bảo trì tài khoản: 0.07% (tối đa 7.700đ)/tháng']")
//    private  MobileElement feeMaintainSilver;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phí rút đầu tư: Miễn phí sau 9 tháng']")
//    private  MobileElement feeInvestSilver;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chuyển Đầu tư sang Tích luỹ hoặc cấu trúc khác(0,1% thuế): 0,5% (1 lần chuyển/tháng)']")
//    private  MobileElement investToSavingSilver;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chuyển khoản định kỳ']")
//    private  MobileElement periodicTransferSilver;
   @AndroidFindBy(xpath = "//android.widget.TextView[@text='Thành viên bạc']")
   private  MobileElement memberSilver;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sản phẩm Tích luỹ: tiết kiệm chỉ từ 50.000đ']")
//    private  MobileElement savingSilver;
   @AndroidFindBy(xpath = "//android.widget.TextView[@text='Thành viên vàng']")
  private  MobileElement goldMember;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phí bảo trì tài khoản: 0.05% (tối đa 22.000đ)/tháng']")
//    private  MobileElement feemaintainGold;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Phí rút Đầu tư: Miễn phí sau 6 tháng']")
//    private  MobileElement feeInvestGold;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chuyển Đầu tư sang Tích luỹ hoặc cấu trúc khác(0,1% thuế): Miễn phí (1 lần chuyển/tháng)']")
//    private  MobileElement investToSavingGold;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ưu tiên sử dụng các sản phẩm mới']")
//    private  MobileElement priorityGold;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tự chọn phân bổ theo ý muốn (Coming soon)']")
//    private  MobileElement optionalGold;
//    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hỗ trợ Hotline: 1900 29 29 91']")
//    private  MobileElement supportGold;


//    public  String getTextFeemaintainGold(){
//        return feemaintainGold.getText();
//    }
//    public  String getTextFeeInvestGold(){
//        return feeInvestGold.getText();
//    }
//    public  String getTextInvestToSavingGold(){
//        return investToSavingGold.getText();
//    }
//    public  String getTextPriorityGold(){
//        return priorityGold.getText();
//    }
//    public  String getTextOptionalGold(){
//        return optionalGold.getText();
//    }
//    public  String getTextSupportGold(){
//        return supportGold.getText();
//    }
  public  String getTextGoldMember(){
       return getText(goldMember);
  }
    public  String getTextRequestTitle() {
        return getText(requestTitle);

    }
//    public  String getTextSavingSilver(){
//        return savingSilver.getText();
//    }
   public  String getTextMemberSilver(){
        return getText(memberSilver);
   }
//    public  String getTextFeeMaintainSilver(){
//        return feeMaintainSilver.getText();
//    }
//    public  String getTextFeeInvestSilver(){
//        return feeInvestSilver.getText();
//    }
//    public  String getTextInvestToSavingSilver(){
//        return investToSavingSilver.getText();
//    }
//    public  String getTextPeriodicTransferSilver(){
//        return periodicTransferSilver.getText();
//    }
//    public  String getTextFeeInvestBronze(){
//        return feeInvestBronze.getText();
//    }
//    public  String getTextFeeMaintainBronze(){
//        return feeMaintainBronze.getText();
//    }
//    public  String getTextInvestToSavingBronze(){
//        return investToSavingBronze.getText();
//    }
//    public  String getTextSavingToInvestBronze(){
//        return savingToInvestBronze.getText();
  //  }
    public  String getTextBronzeMember(){
        return getText(bronzeMember);
    }

    public  void clickToBack(){
  click(backBtn);
    }
    public  void clickToNewMedal() throws Exception {
      scrollToElement(newMedal,"up");
      click(newMedal);
    }
    public  void clickToBroze() throws Exception {
        scrollToElement(bronze,"up");
         click(bronze);
    }
    public  void clickToSilver() throws Exception {
        scrollToElement(silver,"up");
       click(silver);
    }
    public  void clickToGold() throws Exception {
        scrollToElement(gold,"up");
      click(gold);
    }
    public  String getTextYouHere() throws Exception {
      scrollToElement(youHere,"up");
        return getText(youHere);
    }
    public  String getTextUnderPoint(){
        return underPoint.getText();
    }
    public  String getTextFeeMaintain(){
        return feeMaintain.getText();
    }
    public  String getTextWithdrawlFee(){
        return withdrawlFee.getText();
    }
    public  String getTextInvestmentStructure(){
        return investmentStructure.getText();
    }
    public  String getTextInvestFee(){
        return investFee.getText();
    }
    public  String getTextInvestToSaving(){
        return investToSaving.getText();
    }
    public  String getTextSavingtoInvest(){
        return savingToInvest.getText();
    }
    public  String getTextShopping(){
        return shopping.getText();
    }
    public  String getTextSavingProd(){
        return savingProd.getText();
    }
    public  String getTextProtecedProd(){
        return protectedProd.getText();
    }

    public  void clickToCloseBtn(){
        click(closeBtn);
    }
    public  String getTextRewardPoint(){
        return getText(rewardPoint);
    }
    public  String getTextFriendlyPoint(){
        return getText(friendlyPoint);
    }
    public  String getTextTotalPoint(){
        return getText(totalPoint);
    }
    public  void clickToToolTip(){
      click(tooltipPoint);
    }
    public  String getTextPointToLevel(){
        return getText(pointToLevel);
    }
    public  boolean isDisplayProgressBarDetail() {
        return isElementDisplayed(progressBarDetail);
    }
    public  boolean isDisplayMyPreference() {
        return isElementDisplayed(myPreference);
    }
    public  boolean isDisplayPointHistory() {
        return isElementDisplayed(pointHistory);
    }
    public  boolean isDisplayToolTipPoint() {
        return isElementDisplayed(tooltipPoint);
    }
    public  String getTextPointValue(){
        return getText(pointValue);
    }
    public  boolean isDisplayLevelIcon() {
        return isElementDisplayed(levelIcon);
    }
    public  String getTextLevelName(){
       return getText(levelNameText);
    }
    public  void clickToGotoDetail(){
      click(gotoDetailBtn);
    }
    public  boolean isDisplayProgressBar() {
        return isElementDisplayed(progressBar);
    }
    public  boolean isDisplayIConRank() {
        return isElementDisplayed(iconRank);
    }
    public  String getTextSuggestPoint(){
        return getText(suggestPointText);
    }
    public void clickToSkipActiveAccBtn(){
     click(skipActiveAccBtn);
    }
    public  void clickToConfirmSkipBtn(){
        confirmSkipBtn.click();
    }
    public  String getTextLevelMember(){
        return getText(levelMemberText);
    }
}


