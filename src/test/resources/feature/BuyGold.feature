#@BuyGold
#Feature: Check when user buy gold
#
#  Scenario: Check when click button pot of gold (user has not bought gold) + (user have saving COD)
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "0984236255"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#   # And I click icon close popup use credit
#    And I click button pot of gold
#    Then Verify display amount gold is "0"
#    And Display button start buy gold
#
#  Scenario: Check click button buy gold
#    When I click button start buy gold
#    Then Verify display text term of use "Điều khoản mua bán"
#
#    Scenario: Check click button continue term of use
#      When I click button continue term of use
#    And Verify disable button continue buy gold
#
#  Scenario:  Check when make gold buy
#    ##When I input amount gold is "1"
#    When I input amount gold "2"
#    Then Verify display equivalent is "= 1,0"
#    And Verify display expected payment
#    And Verify enable button continue buy gold
#
#  Scenario: Check click button continue buy gold
#    When I click button continue buy gold
#    Then Verify display type transaction is "Mua vàng"
#    And Verify display equivalent confirm "1,0 chỉ"
#    And Verify display need payment
#    And Verify display payment "TL không kỳ hạn"
#
#  Scenario: Check when click button confirm buy gold
#    When I click button confirm buy gold
#    Then Verify display message buy gold success "Đặt mua vàng thành công!"
#    And Verify display button buy gold more
#    And Verify display button go to pot of gold page
#
#    Scenario: Check when click button go to pot of gold page & history gold
#      When I click button go to pot of gold page
#     And I click button history gold
#      And Verify gold amount history is "+1"
#
#
#      Scenario: Delete order and asset
#        Given Delete order and asset
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
#
#
#
