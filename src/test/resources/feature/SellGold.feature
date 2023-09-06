#@SellGold
#Feature: Check when user sell gold
#  Scenario: Check amount gold of user have
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "0982446251"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    When I click button pot of gold
#    Then Verify display amount gold UI same asset in Database
#
#  Scenario: Check when user click sell gold
#      When I click button sell gold
#     And I input amount gold "2"
#      Then Verify display equivalent is "= 1,0"
#      And Verify display expected payment
#      And Verify enable button continue sell gold
#     # And Verify display text money sell gold switch to cod "Số tiền bán vàng sẽ được chuyển về Tích luỹ không kỳ hạn."
#
#      Scenario: Check user click continue sell gold
#        When I click button continue sell gold
#        Then Verify display type transaction is "Bán vàng"
#        And Verify display equivalent confirm "1,0 chỉ"
#        And Verify display need payment
#        And Verify display payment "TL không kỳ hạn"
#
#  Scenario: Check when click button confirm buy gold
#    When I click button confirm sell gold
#    Then Verify display message sell gold success "Bán vàng thành công!"
#    And Verify display button sell gold more
#    And Verify display button go to pot of gold page
#
#
#  Scenario: Check when click button go to pot of gold page & history gold
#    When I click button go to pot of gold page
#    And I click button history gold
#    And Verify display type transaction "Bán vàng"
#    And Verify gold amount sell gold history is "-1"
#    Then Verify display amount gold UI same asset in Database
#
#
#    Scenario: Check detail 1 history transaction
#      When I click detail one history transaction
#      Then Verify display contract Code same database
#      And Verify display request code same database
#
#
##    Scenario: Check money saving cod after sell gold
##      When I click button back to home page
##      Then Verify money saving cod UI same database
#
#  Scenario: Delete order and asset
#    Given Delete order sell gold and asset
#
#
#
#
#
#
#
