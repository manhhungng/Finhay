#@sellstock
#Feature: Check user buy stock
#
#  Scenario: Check user click sell stock
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "0985802341"
#    And I input password1 "Ab@12345"
#    And I click button Login
#    And I click button stock in homepage
#    And I click TVS symbol
#    And I click button sell even lot
#    Then verify button Sell stock disable
#
#    Scenario: Check when input correct amount even lot
#      When I input amount stock is "100"
#      Then Verify button Sell enable
#
#      Scenario: Check click button Sell
#        When I click button sell
#        Then Verify display message sell successful "Bạn đã đặt lệnh bán thành công. Hãy thư giãn và chờ đợi kết quả nhé!"
#        And Verify button Done display
#        And Verify button Order book display
#
#
#
#
#
#
#
#
#
