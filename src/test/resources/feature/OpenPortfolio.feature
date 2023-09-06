#@Open_Portfolio
#Feature: Check deposit for COD by CIMB
#
#
#  Scenario: Check enable all portfolio in part introduce invest
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "0912364483"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I click button invest
#    Then I Verify button enable start invest in White Stork portfolio
#    And I Verify button enable start invest in Forest Elephant portfolio
#    And I Verify button enable open portfolio in Sao La portfolio
#    And I Verify button enable open portfolio in Water Buffalo portfolio
#    And I Verify button open portfolio in elective portfolio disable
#
#  Scenario: Check open full portfolio when click button start invest
#    Given I click back btn
#    And I click button invest
#    When I click Start invest button
#    And I click button continue invest
#    Then Verify display place deposit While Stork
#    And Verify display place deposit Forest Elephant
#    And Verify display place deposit Sao La
#    And Verify display place deposit Water Buffalo
#    And Verify display text optional portfolio is "Dành cho thành viên Vàng trở lên"
#
#    Scenario: Reset App
#     # Given Reset app
#
#
#
#
#
#
#
#
#
#
#
