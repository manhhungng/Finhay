#@buystock
#Feature: Check user buy stock
#
#  Scenario: Check user buy stock
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "0985802341"
#    And I input password1 "Ab@12345"
#    And I click button Login
#    And I click button stock in homepage
#    And I click button market
#    And I choose AAA symbol
#    Then Verify display button Buy stock
#
#  Scenario: Check user click button buy stock
#    When I click button Buy stock
#    Then Verify estimated amount is "0 đ"
#    And Verify button Buy disable
#
#  Scenario: Check when input amount stock validate
#    When I input amount stock is "100"
#    Then Verify button Buy enable
#
#  Scenario: Check when click button Buy
#    When I click button Buy
#    Then Verify button Confirm Otp disable
#
#  Scenario: Check input otp incorrect
#    When I input otp index one "0"
#    And I input otp index two "0"
#    And I input otp index three "0"
#    And I input otp index four "1"
#    And I click button Confirm Otp
#    Then Verify display error message "Mã xác thực bạn vừa nhập không chính xác"
#
#  Scenario: Check input otp correct
#    When I input otp index one "0"
#    And I input otp index two "0"
#    And I input otp index three "0"
#    And I input otp index four "0"
#    And I click button Confirm Otp
#    Then Verify display message success "Bạn đã đặt lệnh mua thành công. Hãy thư giãn và chờ đợi kết quả nhé!"
#    And Verify button Done display
#    And Verify button Order book display
#
#
