package com.qa.pages;

import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CDxMWithdrawPage {
    TestUtils testUtils = new TestUtils();

    //Withdrawable list

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmChooseBookToWithdrawProductName")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement withdrawPageTitle;

    @AndroidFindBy(id = "vn.finhay.finhay:id/rclvCdxmChooseBookToWithdraw")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement withdrawBookLst;

    @AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id = 'vn.finhay.finhay:id/rclvCdxmChooseBookToWithdraw']/child::android.view.ViewGroup[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement firstWithdrawBook;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id = 'vn.finhay.finhay:id/tvCdxmSavingBookToWithdrawItmAmount'])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement firstWithdrawBookAmount;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@resource-id ='vn.finhay.finhay:id/tvCdxmSavingBookToWithdrawItmEndDate'])[1]")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement firstWithdrawBookDueDate;

    //Withdrawal confirmation

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmConfirmWithdrawFrom")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement withdrawCDxMSrc;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmConfirmWithdrawTo")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement withdrawCDxMDest;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Số tiền']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement withdrawCDXMAmount;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Số tiền']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement withdrawCDxMFee;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Số tiền']/following-sibling::android.widget.TextView")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement withdrawCDxMFinal;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmConfirmWithdrawConfirm")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement withdrawCDxMConfirmBtn;

    //Password Bottom layout

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvCdxmConfirmWithdrawCancel")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement withdrawCDxMCancelBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/design_bottom_sheet")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement pwdConfirmationSheet;

    @AndroidFindBy(id = "vn.finhay.finhay:id/edtInputLayout")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement pwdInputFld;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmPasswordBottomDlgForgotPass")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement forgotPwdBtn;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmPasswordBottomDlgForgotPass")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement confirmPwdWithdrawCDxMBtn;

    //Success screen

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmPasswordBottomDlgForgotPass")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement successWithdrawCDxM;

    @AndroidFindBy(id = "vn.finhay.finhay:id/tvConfirmPasswordBottomDlgForgotPass")
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name='Tích lũy siêu cấp']/../..")
    private MobileElement returnHomeCDxM;

    //Check danh sách sổ rút

    public String getPageTitle() {
        return withdrawPageTitle.getText();
    }

    public boolean checkWithdrawListVisible() {
        return withdrawBookLst.isDisplayed();
    }

    public String getFirstBookAmount() {
        return firstWithdrawBookAmount.getText();
    }

    public String getFirstBookDueDate() {
        return firstWithdrawBookDueDate.getText();
    }

    //Thực hiện rút

    public void clickFirstWithdrawBook() {
        firstWithdrawBook.click();
    }

    public String getWithdrawSrc() {
        return withdrawCDxMSrc.getText();
    }

    public String getWithdrawDest() {
        return withdrawCDxMDest.getText();
    }

    public String getTransferFee() { return withdrawCDxMFee.getText(); }

    public String getFinalBalance() { return withdrawCDxMFinal.getText(); }

    public void clickConfirmBtn() { withdrawCDxMConfirmBtn.click(); }

    public void clickCancelBtn() { withdrawCDxMCancelBtn.click(); }

    //popup nhập mật khẩu

    public boolean checkPopupPwd() { return pwdConfirmationSheet.isDisplayed(); }

    public void inputPwd(String value) { pwdInputFld.sendKeys(value); }

    public void clickForgetPwd() { forgotPwdBtn.click(); }

    public void clickConfirmPwd() { confirmPwdWithdrawCDxMBtn.click(); }

    //check màn thành công

    public boolean checkSuccessWithdrawText() { return successWithdrawCDxM.isDisplayed(); }

    public void clickReturnHome() { returnHomeCDxM.click(); }

}
