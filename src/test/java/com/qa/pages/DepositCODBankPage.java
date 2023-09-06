package com.qa.pages;

import com.qa.connection.MySQLConnUtils;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;

import java.sql.*;
import java.util.Map;

public class DepositCODBankPage extends BasePage{
    public MySQLConnUtils query = new MySQLConnUtils();
    private Connection con = null;
    private PreparedStatement stmt = null;
    private ResultSet kq = null;
    Map<String, Object> maps;
    TestUtils utils = new TestUtils();


    @AndroidFindBy(id = "vn.finhay.finhay:id/asset_intro")
    private MobileElement investText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/homeHdtgReadmore")
    private MobileElement lookingForInfoBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/lnNext")
    private MobileElement continueBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/assets")
    private MobileElement savingTotalValue;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tích lũy không kỳ hạn']")
    private MobileElement savingNoDateText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/demandTotal")
    private MobileElement startFrom50Text;
    @AndroidFindBy(id = "vn.finhay.finhay:id/demandSaving")
    private MobileElement savingNoDateBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/investMoreNoneAssets")
    private MobileElement startSavingBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edtReferralCode")
    private MobileElement referralCodeTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/btnInvestMore")
    private MobileElement continueSavingBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/infoBody1")
    private MobileElement cannotDepositText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_xacthucngay")
    private MobileElement activeNowBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/autoCompleteTextView")
    private MobileElement amountDepositTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_investMore")
    private MobileElement noticeAmountDepositText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/suggFive")
    private MobileElement suggest1MBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/suggSix")
    private MobileElement suggest5MBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/suggSeven")
    private MobileElement suggest10MBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/next")
    private MobileElement continueDepositBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Chuyển khoản ngân hàng']")
    private MobileElement bankTransferText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ví điện tử MoMo']")
    private MobileElement momoText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/bank_tranfer")
    private MobileElement bankTransferBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtSoTien")
    private MobileElement amountValueText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/fee")
    private MobileElement feeValueText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/total")
    private MobileElement totalValueText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtOK")
    private MobileElement confirmTransactionBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtFooter")
    private MobileElement securityText;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hãy để Finhay hướng dẫn bạn cách chuyển khoản nhé.']")
    private MobileElement noticeGuideText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/btn_skip_tutorial")
    private MobileElement skipGuideBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Số tiền bạn muốn nạp']/following-sibling::android.widget.TextView")
    private MobileElement amountWantDepositText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtBank")
    private MobileElement bankText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtSoTaiKhoan")
    private MobileElement accountNumberText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtCopyNumberAccount")
    private MobileElement copyAccountNumberBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtCopyContent")
    private MobileElement copyContentBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtTentaikhoan")
    private MobileElement accountNameText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/alert_txt")
    private MobileElement noticeContentTransferText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/info")
    private MobileElement tooltipBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tài khoản này được Finhay kết hợp với VPBank để tạo riêng cho bạn nên nó sẽ mang tên bạn. Mỗi khi bạn chuyển tiền đến tài khoản này, Finhay sẽ tự động nhận ra và đưa tiền của bạn đến đúng yêu cầu nạp tiền của bạn.']")
    private MobileElement contentTooltip;
    @AndroidFindBy(id = "vn.finhay.finhay:id/btnClose")
    private MobileElement closeTooltipBtn;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Techcombank']")
    private MobileElement techcombankBtn;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc='Vietcombank']")
    private MobileElement vietcombankBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/invest_bank_btnClose")
    private MobileElement closeBankBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/hdtg_request_num")
    private MobileElement requestNumberValue;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ln_hdtg_request")
    private MobileElement savingMoreBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/hdtgCount")
    private MobileElement savingNoDateCountText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvPending")
    private MobileElement noticePendingTransferText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/hdtgPendingLayout")
    private MobileElement savingNoDateinRequestBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/invest_bank_btnMenu")
    private MobileElement iconMenu;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hướng dẫn thanh toán']")
    private MobileElement paymentGuideBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Báo cáo lỗi']")
    private MobileElement errorReportBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Hủy lệnh này']")
    private MobileElement cancelThisOrderBtn;
    @AndroidFindBy(id = "android:id/message")
    private MobileElement messagePopup;
    @AndroidFindBy(id = "android:id/button2")
    private MobileElement cancelPopupBtn;
    @AndroidFindBy(id = "android:id/button1")
    private MobileElement confirmPopupBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/fab")
    private MobileElement iconAdd;
    @AndroidFindBy(id = "vn.finhay.finhay:id/chooseHdtg")
    private MobileElement savingBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/btn_skip")
    private MobileElement skipNoticeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvPending")
    private MobileElement noticeLine1;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Finhay có gì để bạn tin tưởng']")
    private MobileElement finhayBeliveText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ivBack")
    private MobileElement backToHomeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/exchange")
    private MobileElement menuExchange;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_cheeseparings")
    private MobileElement savingHistoryBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nạp tiền-Tích lũy']")
    private MobileElement textSavingDepositHistory;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_amount")
    private MobileElement amountHistoryText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_status")
    private MobileElement statusHistoryText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/navigation_Asset")
    private MobileElement homePageMenu;
    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView/child::android.widget.TextView[@text='Nạp tiền']")
    private MobileElement depositHistoryBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_turns_receive")
    private MobileElement messageDepositSuccess;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tv_receive")
    private MobileElement continueDepositPopupBtn;
    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    private MobileElement backBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/hdtg_total")
    private MobileElement valueSavingInHome;
    @AndroidFindBy(id = "vn.finhay.finhay:id/hdtg_layout")
    private MobileElement savingInHomeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/lai_tam_tinh")
    private MobileElement valueProvisionalInterest;
    @AndroidFindBy(id = "vn.finhay.finhay:id/lai_da_nhan")
    private MobileElement valueInterestReceived;
    @AndroidFindBy(id = "vn.finhay.finhay:id/investMore")
    private MobileElement depositMoreBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/phanbo")
    private MobileElement allocationBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/changeToCuulong")
    private MobileElement transferBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/withdraw")
    private MobileElement withdrawBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/asset_total")
    private MobileElement valueInvestInHome;
    @AndroidFindBy(id = "vn.finhay.finhay:id/back")
    private MobileElement backFromSavingNoDateBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/layout_item_exchange")
    private MobileElement detailTransactionBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_processing")
    private MobileElement textProcessing;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_recived_request")
    private MobileElement textReceivedRequest;
    @AndroidFindBy(id = "vn.finhay.finhay:id/money")
    private MobileElement textMoney;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txt_paymentType")
    private MobileElement textPaymentType;
    @AndroidFindBy(id = "vn.finhay.finhay:id/contractId")
    private MobileElement textContractID;
    @AndroidFindBy(id = "vn.finhay.finhay:id/rate")
    private MobileElement textRate;
    @AndroidFindBy(id = "vn.finhay.finhay:id/typeStatus")
    private MobileElement textTypeStatus;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtSupport")
    private MobileElement supportBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Ngân hàng đang xử lý']")
    private MobileElement textBankProcessing;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Kiểm tra số tài khoản nhận tiền']")
    private MobileElement textCheckAccountNumber;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lý do khác. Gửi tin nhắn cho Finhay']")
    private MobileElement textReasonOther;


    @AndroidFindBy(id = "vn.finhay.finhay:id/llHomeCheeseAmount")
    private MobileElement savingOldHomeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/demandSaving")
    private MobileElement savingNoDateOldHomeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/investMore")
    private MobileElement depositMoreHomeOldBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtOK")
    private MobileElement paymentBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvBankDropdownLayoutName")
    private MobileElement receiveBankText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/invest_bank_btnClose")
    private MobileElement closeBtn;
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Nạp thêm']")
    private MobileElement addDepositNHBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edtInputLayout")
    private MobileElement amountDepositNHTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvInputMoneyContinue")
    private MobileElement continueDepositCODNHBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ivFhbagFundedItmRepeat")
    private MobileElement iconConvertInNewHomeBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/rlAccumulationConvertCd3m")
    private MobileElement convertToCd3mBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edtEnterMoneyConvertMoney")
    private MobileElement amountConvertTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvEnterMoneyConvertNext")
    private MobileElement continueConvertBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmConvertAccumulationConfirm")
    private MobileElement confirmConvertBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/edtInputLayout")
    private MobileElement passwordConvertTxt;
    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmPasswordBottomDlgComplete")
    private MobileElement completedConvertBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/txtLoading")
    private MobileElement convertSuccessText;
    @AndroidFindBy(id = "vn.finhay.finhay:id/ok")
    private MobileElement okScreenConvertSuccessBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/rlAccumulationConvertCd12m")
    private MobileElement convertToCd12mBtn;
    @AndroidFindBy(id = "vn.finhay.finhay:id/rlAccumulationConvertInvestment")
    private MobileElement convertToInvestmentBtn;
    @AndroidFindBy(xpath = "//android.widget.LinearLayout/child::androidx.recyclerview.widget.RecyclerView/child::android.view.ViewGroup[1]")
    private MobileElement convertToTurtleBtn;


    
    public void clickToConvertToTurtleBtn() {
        click(convertToTurtleBtn);
    }
    public void clickToConvertToInvestmentBtn() {
        click(convertToInvestmentBtn);
    }
    public void clickToConvertToCd12mBtn() {
        click(convertToCd12mBtn);
    }
    public void clickToOkScreenConvertSuccessBtn() {
        click(okScreenConvertSuccessBtn);
    }
    public String getTextConvertSuccess(){
        return getText(convertSuccessText);
    }
    public void clickToCompletedConvertBtn() {
        click(completedConvertBtn);
    }
    public void inputToPasswordConvertTxt(String value){
        sendKeys(passwordConvertTxt,value);
    }
    public void clickToConfirmConvertBtn() {
        click(confirmConvertBtn);
    }
    public void clickToContinueConvertBtn() {
        click(continueConvertBtn);
    }
    public void inputToAmountConvertTxt(String value){
        sendKeys(amountConvertTxt,value);
    }
    public void clickToConvertToCd3mBtn() {
        click(convertToCd3mBtn);
    }
    public void clickIconConvertInNewHomeBtn() {
        click(iconConvertInNewHomeBtn);
    }
    public void clickToContinueDepositCODNHBtn() {
        click(continueDepositCODNHBtn);
    }
public void inputToAmountDepositNHTxt(String value){
    sendKeys(amountDepositTxt,value);
}
    public void clickToAddDepositNHBtn() {
        click(addDepositNHBtn);
    }
    public  boolean isDisplayedSavingOldHomeBtn(){
        return isElementDisplayed(savingOldHomeBtn);
    }
    public void clickToSavingOldHomeBtn() {
        click(savingOldHomeBtn);
    }

    public void clickToSavingNoDateOldHomeBtn() {
        click(savingNoDateOldHomeBtn);
    }

    public void clickToDepositMoreHomeOldBtn() {
        click(depositMoreHomeOldBtn);
    }

    public void clickToPaymentBtn() {
        click(paymentBtn);
    }
    public String getTextReceiveBank(){
        return getText(receiveBankText);
    }

    public void clickToCloseBtn() {
        click(closeBtn);
    }


    public String getTextReasonOther(){
        return getText(textReasonOther);
    }
    public String getTextCheckAccountNumber(){
        return getText(textCheckAccountNumber);
    }
    public String getTextBankProcessing(){
        return getText(textBankProcessing);
    }
    public void clickToSupportBtn() {
        click(supportBtn);
    }
    public boolean isDisplayedSupportBtn() throws Exception {
        scrollToElement(supportBtn,"up");
        return isElementDisplayed(supportBtn);
    }
    public String getTextTypeStatus(){
        return getText(textTypeStatus);
    }
    public String getTextRate(){
        return getText(textRate);
    }
    public String getTextContractID(){
        return getText(textContractID);
    }
    public String getTextPaymentType(){
        return getText(textPaymentType);
    }
    public String getTextMoney(){
        return getText(textMoney);
    }
    public String getTextProcessing(){
        return getText(textProcessing);
    }
    public String getTextReceivedRequest(){
        return getText(textReceivedRequest);
    }

    public void clickToDetailTransactionBtn() {
        click(detailTransactionBtn);
    }
    public void clickToBackFromSavingNoDateBtn() {
        click(backFromSavingNoDateBtn);
    }
    public String getTextValueInvestInHome(){
        return getText(valueInvestInHome);
    }
    public void clickToDepositMoreBtn() {
        click(depositMoreBtn);
    }
    public boolean isDisplayedDepositMoreBtn(){
        return isElementDisplayed(depositMoreBtn);
    }
    public boolean isDisplayedAllocationBtn(){
        return isElementDisplayed(allocationBtn);
    }
    public boolean isDisplayedTransferBtn(){
        return isElementDisplayed(transferBtn);
    }
    public boolean isDisplayedWithdrawBtn(){
        return isElementDisplayed(withdrawBtn);
    }

    public String getTextValueProvisionalInterest(){
        return getText(valueProvisionalInterest);
    }
    public String getTextValueInterestReceived(){
        return getText(valueInterestReceived);
    }
    public void clickToSavingInHomeBtn() {
        click(savingInHomeBtn);
    }
    public String getTextValueSavingInHome(){
        return getText(valueSavingInHome);
    }
    public boolean isDisplayedStatusHistoryText(){
        return isElementDisplayed(statusHistoryText);
    }
    public void clickToBackBtn() {
        sleepInSecond(1);
        click(backBtn);
    }
    public void clickToContinueDepositPopupBtn() {
        click(continueDepositPopupBtn);
    }
    public String getTextMessageDepositSuccess(){
        sleepInSecond(5);
        return getText(messageDepositSuccess);
    }
    public void clickToDepositHistoryBtn() {
        click(depositHistoryBtn);
    }
    public  boolean isDisplayedTextSavingDepositHistory(){
        return isElementDisplayed(textSavingDepositHistory);
    }
    public void clickToHomePageMenu() {
        click(homePageMenu);
    }
    public String getTextStatusHistory(){
        return getText(statusHistoryText);
    }

    public String getTextAmountHistoryText(){
        return getText(amountHistoryText);
    }
    public String getTextSavingDepositHistory(){
        return getText(textSavingDepositHistory);
    }
    public void clickToSavingHistoryBtn() {
        click(savingHistoryBtn);
    }
    public void clickToMenuExchange() {
        click(menuExchange);
    }
    public void clickToBackToHomeBtn() {
        click(backToHomeBtn);
    }
    public void clickToSkipNoticeBtn() {
        click(skipNoticeBtn);
    }
    public void clickToSkipGuideBtn() {
        click(skipGuideBtn);
    }
    public String getTextNoticeGuide(){
        return getText(noticeGuideText);
    }
public void clickToSuggest5MBtn() {
    click(suggest5MBtn);
}
    public void clickToSavingBtn() {
        click(savingBtn);
    }
public void clickToIconAdd() {
    click(iconAdd);
}
    public void clickToConfirmPopupBtn() {
        click(confirmPopupBtn);
    }
public void clickToIconMenu() {
    click(iconMenu);
}
public void clickToSavingNoDateInRequestBtn() {
    click(savingNoDateinRequestBtn);
}
public String getTextMessagePopup(){
    return getText(messagePopup);
}
public void clickToCancelThisOrderBtn() {
    click(cancelThisOrderBtn);
}
    public  boolean isDisplayedSavingMoreBtn(){
        return isElementDisplayed(savingMoreBtn);
    }
public  boolean isDisplayedPaymentGuideBtn(){
    return isElementDisplayed(paymentGuideBtn);
}
    public  boolean isDisplayedErrorReportBtn(){
        return isElementDisplayed(errorReportBtn);
    }
    public  boolean isDisplayedCancelThisOrderBtn(){
        return isElementDisplayed(cancelThisOrderBtn);
    }
    public String getTextNoticeLine1(){
        return getText(noticeLine1);
    }
    public String getTextSavingNoDateCountText(){
        return getText(savingNoDateCountText);
    }
public void clickToSavingMoreBtn() throws Exception {
        scrollToElement(finhayBeliveText,"up");
    click(savingMoreBtn);
}
    public String getTextRequestNumberValue() throws Exception {
        scrollToElement(requestNumberValue,"up");
        return getText(requestNumberValue);
    }

    public void clickToCloseBankBtn() {
    click(closeBankBtn);
}
public void clickToTechcombankBtn() {
    click(techcombankBtn);
}
    public void clickToVietcombankBtn() {
        click(vietcombankBtn);
    }
public void clickToTooltipBtn() {
    click(tooltipBtn);
}
    public void clickToCloseTooltipBtn() {
        click(closeTooltipBtn);
    }
public String getTextNoticeContentTooltip(){
    return getText(contentTooltip);
}
    public String getTextNoticeContentTransfer(){
        return getText(noticeContentTransferText);
    }
public  boolean isDisplayedCopyAccountNumberBtn(){
    return isElementDisplayed(copyAccountNumberBtn);
}
    public  boolean isDisplayedCopyContentBtn(){
        return isElementDisplayed(copyContentBtn);
    }
    public String getTextAccountNameTxt(){
        return getText(accountNameText);
    }
    public String getTextAccountNumberText(){
        return getText(accountNumberText);
    }
public String getTextAmountWantDeposit(){
    return getText(amountWantDepositText);
}
    public String getTextBank(){
        return getText(bankText);
    }
    public String getTextSecurityText(){
        return getText(securityText);
    }
    public void clickToConfirmTransactionBtn() {
        click(confirmTransactionBtn);
    }
    public  boolean isDisplayedConfirmTransactionBtn(){
        return isElementDisplayed(confirmTransactionBtn);
    }
    public String getTextAmountValue(){
        return getText(amountValueText);
    }
    public String getTextFeeValue(){
        return getText(feeValueText);
    }
    public String getTextTotalValue(){
        return getText(totalValueText);
    }
    public void clickToBankTransferBtn() {
        click(bankTransferBtn);
    }
    public  boolean isDisplayedBankTransferBtn(){
        return isElementDisplayed(bankTransferText);
    }
    public  boolean isDisplayedMomoBtn(){
        return isElementDisplayed(momoText);
    }
    public void clickToContinueDepositBtn() {
        click(continueDepositBtn);
    }
    public String getTextAmountDepositTxt(){
        return getText(amountDepositTxt);
    }
    public void clickToSuggest1MBtn() {
        click(suggest1MBtn);
    }
    public void inputToAmountDepositTxt(String value) {
        sendKeys(amountDepositTxt,value);
    }
    public boolean isEnabledContinueDepositBtn()  {
        return isElementEnable(continueDepositBtn);
    }
    public  boolean isDisplayedSuggest1MBtn(){
        return isElementDisplayed(suggest1MBtn);
    }
    public  boolean isDisplayedSuggest5MBtn(){
        return isElementDisplayed(suggest5MBtn);
    }
    public  boolean isDisplayedSuggest10MBtn(){
        return isElementDisplayed(suggest10MBtn);
    }

    public String getTextNoticeAmountDeposit(){
        return getText(noticeAmountDepositText);
    }
    public  boolean isDisplayedAmountDepositTxt(){
        return isElementDisplayed(amountDepositTxt);
    }
    public void clickToLookingForInfoBtn() throws Exception {
       sleepInSecond(6);
 scrollToElement(investText,"up");
   sleepInSecond(2);
        click(lookingForInfoBtn);

    }
    public void clickToContinueBtn() {
        click(continueBtn);
    }
    public String getTextSavingTotalValue(){
        sleepInSecond(1);
        return getText(savingTotalValue);
    }
    public String getTextSavingNoDate(){
        return getText(savingNoDateText);
    }
    public String getTextstartFrom50(){
        return getText(startFrom50Text);
    }
    public void clickToSavingNoDateBtn() {
        click(savingNoDateBtn);
    }
    public  boolean isDisplayedStartSavingBtn(){
        return isElementDisplayed(startSavingBtn);
    }
    public void clickToStartSavingBtn() {
        click(startSavingBtn);
    }
    public  boolean isDisplayedReferralCodeTxt(){
        return isElementDisplayed(referralCodeTxt);
    }
    public  boolean isDisplayedContinueSavingBtn(){
        return isElementDisplayed(continueSavingBtn);
    }
    public void clickToContinueSavingBtn() {
        click(continueSavingBtn);
    }
    public String getTextCannotDepositText(){
        return getText(cannotDepositText);
    }
    public  boolean isDisplayedActiveNowBtn(){
        return isElementDisplayed(activeNowBtn);
    }
    public void clickToActiveNowBtn() {
        click(activeNowBtn);
    }


    public static void deleteTransactionDeposit() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb_cod.cod_transactions where user_id = 37354";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }

    public String getTransactionID() {
        try {
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "SELECT id FROM finhaydb_cod.cod_transactions where user_id = 37354 order by id DESC limit 1";
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(querySql);
            while (result.next()) {
                String trans_id = result.getString(1);
                System.out.println("result is :" + trans_id);
                return trans_id;
            }

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ;
      return null;
    }

    public String putCodSuccess(){
        String trans_id = getTransactionID();
        RequestSpecification request = RestAssured.given();
        System.out.println(trans_id);
        request.header("Content-Type","application/json");
        JSONObject requestParams = new JSONObject();
        requestParams.put("paid_amount", "1000000");
        requestParams.put("user_id", "37354");
        requestParams.put("transaction_id",trans_id);
        requestParams.put("payment_type","0");
        requestParams.put("trans_ref",trans_id);
        request.body(requestParams.toJSONString());
        Response response = request.put("https://stg.finhay.app/gw/cod/v1/ms/transactions/buy/received");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
    return null;
    }
    public String putCodSuccessMore500000000(){
        String trans_id = getTransactionID();
        RequestSpecification request = RestAssured.given();
        System.out.println(trans_id);
        request.header("Content-Type","application/json");
        JSONObject requestParams = new JSONObject();
        requestParams.put("paid_amount", "500000000");
        requestParams.put("user_id", "37354");
        requestParams.put("transaction_id",trans_id);
        requestParams.put("payment_type","0");
        requestParams.put("trans_ref",trans_id);
        request.body(requestParams.toJSONString());
        Response response = request.put("https://stg.finhay.app/gw/cod/v1/ms/transactions/buy/received");
        int statusCode = response.getStatusCode();
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
        return null;
    }

    public static void deleteVerifyUser() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb.verifies where user_id = 37354;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void deleteOTPUser() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb.otps where user_id = 37354;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void updateOTPUser() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE finhaydb_notifications.otps SET has_response = 0 WHERE user_id =37354;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void updateCashInvestUser() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "UPDATE finhaydb.users SET cash = 0 ,invest =0 WHERE id =37354;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }

    public static void deleteInvestHistoryUser() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb_investment.investment_history where user_id = 37354;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void deleteOTPUserInNotification() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb_notifications.otps where user_id = 37353;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public static void deleteAssetUser() throws SQLException {
        try{
            Connection conn = MySQLConnUtils.getMySQLConnection();
            String querySql = "DELETE FROM finhaydb_cod.cod_user_assets where user_id = 37354;";
            Statement statement = conn.createStatement();
            int result = statement.executeUpdate(querySql);
            System.out.println(querySql);
            conn.close();
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
    public String getStatusTransactionCODInDB() {
        String sql = "select status from finhaydb_cod.cod_transactions where user_id = 37354 limit 1;";
        String stt = null;

        try {
            con = query.extracted(query);
            stmt = con.prepareStatement(sql);
            kq = stmt.executeQuery();
            //  System.out.println(stmt.toString());

            while (kq.next()) {
                stt = kq.getString("status");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return stt;

    }
}
