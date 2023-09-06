#@WithdrawGold
#Feature: Check when user sell gold
#
#  Scenario: Check amount gold of user have
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "0982446251"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    When I click button pot of gold
#    Then Verify display amount gold UI same asset in Database
#
#  Scenario: Check click button Register Withdraw Gold
#    When I click button Register Withdraw Gold
#    And I input amount gold withdraw is "1"
#    Then Verify total volume received is "1,0"
#
#  Scenario: Check click button continue withdraw gold
#    When I click button continue withdraw gold
#    Then Verify confirm request amount "1,0 chỉ"
#
#  Scenario: Check click button confirm request
#    When I click button confirm request
#    #Then Verify message success "Đặt lịch nhận vàng thành công!"
#    And Verify message see list "Đặt lịch nhận vàng thành công. Bạn có thể xem lại chi tiết trong phần Danh sách yêu cầu."
#
#  Scenario: Check click button Open list request
#    When I click button Open list request
#    And Verify due date is "Chưa đến hạn"
#
#  Scenario: Check request when due to receive gold
#    When I call job submit undue to submit due
#    And I click button detail request withdraw
#    Then Verify message due "Đến hạn nhận vàng"
#    And Verify button confirm receive disable
#    And Verify request code same in Database
#
#  Scenario: Check request change from due to shop confirm
#    Given I click one back button
#    When I call job api from submit due to shop confirm
#    And I click button detail request withdraw
#    Then Verify message due "Xác nhận tại cửa hàng"
#    And Verify button confirm receive enable
#
#  Scenario: Check request when user click confirm
#    When I click button confirm receive gold
#    Then Verify message due "Nhận vàng thành công!"
#
#    Scenario: Check amount gold after withdraw success
#      Given I click two back button
#      When I click button return pot of gold page
#      Then Verify display amount gold UI same asset in Database
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
