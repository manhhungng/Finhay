package com.qa.stepdef;

import com.qa.pages.CDxMDepositPage;
import com.qa.pages.HomeCDxMPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CDxMDepositStepDef {
    @When("Click CdxM card")
    public void clickCdxMCard() { new HomeCDxMPage().clickHomeCardCdxm();
    }

    @Then("Verify display CDxM home screen")
    public void verifyDisplayCDxMHomeScreen() {
        Assert.assertTrue(new HomeCDxMPage().isTotalCdxmAssetDisplayed());
    }


    @And("I choose Tích lũy siêu khủng CDxM product")
    public void iChooseIntentProductCDxMProduct() {
        new HomeCDxMPage().clickProduct1();
    }

    @And("I click deposit more in CDxM product screen")
    public void iClickDepositMoreInCDxMProductScreen() {

    }
}
