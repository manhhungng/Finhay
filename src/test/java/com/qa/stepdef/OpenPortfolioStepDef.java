package com.qa.stepdef;

import com.qa.pages.OpenPortfolioPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class OpenPortfolioStepDef {
    @Then("I Verify button enable start invest in White Stork portfolio")
    public void i_verify_button_enable_start_invest_in_white_stork_portfolio() throws Exception {
        Assert.assertTrue( new OpenPortfolioPage().isEnableStartInVestStorkBtn());
    }

    @Then("I Verify button enable start invest in Forest Elephant portfolio")
    public void i_verify_button_enable_start_invest_in_forest_elephant_portfolio()  {
        Assert.assertTrue( new OpenPortfolioPage().isEnableStartInVestElephantBtn());
    }

    @Then("I Verify button enable open portfolio in Sao La portfolio")
    public void i_verify_button_enable_open_portfolio_in_sao_la_portfolio() {
        Assert.assertTrue( new OpenPortfolioPage().isEnableOpenPortfolioSaoLaBtn());
    }

    @Then("I Verify button enable open portfolio in Water Buffalo portfolio")
    public void i_verify_button_enable_open_portfolio_in_water_buffalo_portfolio() {
        Assert.assertTrue( new OpenPortfolioPage().isEnableOpenPortfolioBuffaloBtn());
    }

    @Then("I Verify button open portfolio in elective portfolio disable")
    public void i_verify_button_open_portfolio_in_elective_portfolio_disable() {
        Assert.assertFalse( new OpenPortfolioPage().isEnableOpenPortfolioElectiveBtn());
    }
    @When("I click Start invest button")
    public void i_click_start_invest_button()  {
    new OpenPortfolioPage().clickToStartInvestBtn();
    }


    @Then("Verify display place deposit While Stork")
    public void verify_display_place_deposit_while_stork() {
        Assert.assertTrue( new OpenPortfolioPage().isDisplayedPortfolioStorkBtn());
    }

    @Then("Verify display place deposit Forest Elephant")
    public void verify_display_place_deposit_forest_elephant() {
        Assert.assertTrue( new OpenPortfolioPage().isDisplayedPortfolioElephantBtn());
    }

    @Then("Verify display place deposit Sao La")
    public void verify_display_place_deposit_sao_la() {
        Assert.assertTrue( new OpenPortfolioPage().isDisplayedPortfolioSaoLaBtn());
    }

    @Then("Verify display place deposit Water Buffalo")
    public void verify_display_place_deposit_water_buffalo() throws Exception {
        Assert.assertTrue( new OpenPortfolioPage().isDisplayedPortfolioBuffaloBtn());
    }

    @Given("I click back btn")
    public void i_click_back_btn() {
        new OpenPortfolioPage().clickToBackBtn();
    }

    @Then("Verify display text optional portfolio is {string}")
    public void verify_display_text_optional_portfolio_is(String optional) {
       Assert.assertEquals(optional,new OpenPortfolioPage().getTextOptionalPortlofio());
    }

}
