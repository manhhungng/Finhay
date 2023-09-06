package com.qa.stepdef;

import com.qa.pages.LoyaltyPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoyaltyStepDef {
    @When("I Click to button skip active account")
    public void i_click_to_button_skip_active_account() {
  new LoyaltyPage().clickToSkipActiveAccBtn();
    }

    @When("I click to button confirm skip")
    public void i_click_to_button_confirm_skip() {
  new LoyaltyPage().clickToConfirmSkipBtn();
    }

    @Then("Verify display text new member {string}")
    public void verify_display_text_new_member(String levelMember) {
        Assert.assertEquals(levelMember,new LoyaltyPage().getTextLevelMember());
    }

    @Then("Verify display progress bar")
    public void verify_display_progress_bar() {
  Assert.assertTrue(new LoyaltyPage().isDisplayProgressBar());
    }


    @Then("Verify icon rank display")
    public void verify_icon_rank_display() {
        Assert.assertTrue(new LoyaltyPage().isDisplayIConRank());

    }

    @When("I click go to level member")
    public void i_click_go_to_level_member() {
  new LoyaltyPage().clickToGotoDetail();
    }

    @Then("Verify text level member display {string}")
    public void verify_text_level_member_display(String levelName) {
  Assert.assertEquals(levelName,new LoyaltyPage().getTextLevelName());
    }

    @Then("Verify icon level display")
    public void verify_icon_level_display() {
      Assert.assertTrue(new LoyaltyPage().isDisplayLevelIcon());
    }

    @Then("Verify point have value {string}")
    public void verify_point_have_value(String point) {
  Assert.assertEquals(point,new LoyaltyPage().getTextPointValue().replace("\u00a0", ""));
    }

    @Then("display tool tip point info")
    public void display_tool_tip_point_info() {
  Assert.assertTrue(new LoyaltyPage().isDisplayToolTipPoint());
    }

    @Then("display tab my preference")
    public void display_tab_my_preference() {
      Assert.assertTrue(new LoyaltyPage().isDisplayMyPreference());
    }

    @Then("display tab Point history")
    public void display_tab_point_history() {
      Assert.assertTrue(new LoyaltyPage().isDisplayPointHistory());
    }

    @Then("display progress bar")
    public void display_progress_bar() {
      Assert.assertTrue(new LoyaltyPage().isDisplayProgressBarDetail());
    }

    @Then("display suggest point to next level {string}")
    public void display_suggest_point_to_next_level(String point) {
  Assert.assertEquals(point,new LoyaltyPage().getTextPointToLevel());
    }

    @When("I click tool tip point")
    public void i_click_tool_tip_point() {
  new LoyaltyPage().clickToToolTip();
    }

    @Then("Verify total point value display {string}")
    public void verify_total_point_value_display(String total) {
      Assert.assertEquals(total,new LoyaltyPage().getTextTotalPoint().replace("\u00a0", ""));
    }

    @Then("Verify display reward point display {string}")
    public void verify_display_reward_point_display(String reward) {
      Assert.assertEquals(reward,new LoyaltyPage().getTextRewardPoint().replace("\u00a0", ""));
    }

    @Then("Verify display friendly point display {string}")
    public void verify_display_friendly_point_display(String friendly) {
      Assert.assertEquals(friendly,new LoyaltyPage().getTextFriendlyPoint().replace("\u00a0", ""));
    }

    @Then("I Click button close")
    public void i_click_button_close() {
  new LoyaltyPage().clickToCloseBtn();
    }

    @When("I click bronze medal")
    public void i_click_bronze_medal() throws Exception {
      new LoyaltyPage().clickToBroze();
    }

    @Then("Verify unlook text {string}")
    public void verify_unlook_text(String youHere) throws Exception {
  Assert.assertEquals(youHere,new LoyaltyPage().getTextYouHere());
    }

    @When("I click silver medal")
    public void i_click_silver_medal() throws Exception {
  new LoyaltyPage().clickToSilver();
    }

    @When("I click gold medal")
    public void i_click_gold_medal() throws Exception {
  new LoyaltyPage().clickToGold();
    }

    @When("I click new medal")
    public void i_click_new_medal() throws Exception {
  new LoyaltyPage().clickToNewMedal();
    }


  @When("Verify display text level of user {string}")
  public void verify_display_text_level_of_user(String level) throws Exception {
Assert.assertEquals(level,new LoyaltyPage().getTextYouHere());
  }

  @Given("I click button back")
  public void i_click_button_back() {
    new LoyaltyPage().clickToBack();
  }


  @Then("Verify display text bronze member {string}")
  public void verify_display_text_bronze_member(String bronze) {
  Assert.assertEquals(bronze,new LoyaltyPage().getTextBronzeMember());
  }

  @Then("Verify display text silver member {string}")
  public void verify_display_text_silver_member(String silver) {
    Assert.assertEquals(silver,new LoyaltyPage().getTextMemberSilver());
  }

  @Then("Verify display text gold member {string}")
  public void verify_display_text_gold_member(String gold) {
    Assert.assertEquals(gold,new LoyaltyPage().getTextGoldMember());
  }
  @Then("Verify display text suggest point {string}")
  public void verify_display_text_suggest_point(String success) {
    Assert.assertEquals(success,new LoyaltyPage().getTextSuggestPoint());
  }
  @Given("I verify display request title {string}")
  public void i_verify_display_request_title(String title) {
   Assert.assertEquals(title,new LoyaltyPage().getTextRequestTitle());
  }


}
