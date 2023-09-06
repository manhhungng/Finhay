#@DepositMoMo
#Feature: Check deposit for COD by Momo
#
#  Scenario: Check screen saving
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "johnterry5370086@finhay.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I click button looking for more information
#    And I click button continue
#    And I click button continue
#    And I click button continue
#    Then verify saving total is "0"
#    And verify text saving no date "Tích lũy không kỳ hạn"
#    And verify text start from "Bắt đầu chỉ từ 50.000"
#
#  Scenario: Check when click saving no date
#    When I click button saving no date
#    Then Verify display total vnd saving no date is "0"
#    And Verify display button start saving
#
#  Scenario: Check when click button start saving
#    When I click button start saving
#    Then verify display textbox referral code
#    And Display button continue saving display
#
#  Scenario: Check when click button continue saving ( User not active)
#    When I click button continue saving
#    Then Verify textbox amount display
#    And Verify button one million vnd display
#    And Verify button five million vnd  display
#    And Verify button ten million vnd display
#    And button continue deposit disable
#
#  Scenario: Check input amount < 50.000 vnd
#    When I input amount "49000"
#    Then button continue deposit disable
#
#  Scenario: Check input amount > 500.000.000 vnd
#    When I input amount "500000001"
#    Then button continue deposit disable
#
#  Scenario: Check input amount = 50.000 vnd
#    When I input amount "50000"
#    Then button continue deposit enable
#
#  Scenario: Check input amount = 500000000 vnd
#    When I input amount "500000000"
#    Then button continue deposit enable
#
#  Scenario: Check payment method momo disable
#    When I input amount "5000000"
#    Then I click button continue deposit
#    And verify payment method bank transfer display
#
#  Scenario: Check click payment method momo when disable
#    When I click button payment method momo
#    Then verify message popup "Phương thức thanh toán này hỗ trợ tối đa 2.000.000d. Vui lòng chọn phương thức thanh toán khác"
#
#  Scenario:Scenario: Check payment method momo fee < 5000 vnd
#    Given I click button ok in popup
#    And I click button back from deposit screen
#    When I input amount "100000"
#    And I click button continue deposit
#    Then  verify payment method bank transfer display
#    And  Verify payment method momo display
#    And Verify display text Update now "Cập nhật ngay"
#    And Verify display Free maximum first recharge with value "5.000đ"
#    And Verify display fee before free with value "4.000đ"
#    And Verify display fee after free with value "0đ"
#
#    Scenario: Check payment method momo fee > 5000 vnd
#    When I click button back from deposit screen
#    And I input amount "1000000"
#    And I click button continue deposit
#    Then verify payment method bank transfer display
#    And  Verify payment method momo display
#    And Verify display text Update now "Cập nhật ngay"
#    And Verify display Free maximum first recharge with value "5.000đ"
#    And Verify display fee before free with value "21.000đ"
#    And Verify display fee after free deposit one million with value "16.000đ"
#
#  Scenario: Check click payment method momo when enable
#    When I click button payment method momo
#    Then Display amount deposit is "1.000.000đ"
#    And Display fee transfer is "16.000đ"
#    And Display total deposit is "1.016.000đ"
#    And Display button confirm transaction
#    And Display text security "Mọi giao dịch trên Finhay đều được bảo mật"
#
#  Scenario: Check when click button confirm transaction
#    When I click button confirm transaction
##    Then Verify text payment by momo is "Thanh toán dịch vụ Finhay Qua ví điện tử MoMo"
#    Then Verify total with value is "1.016.000đ"
#    And Verify display button payment by Momo
#    And Verify display button Not now
#
#  Scenario: Check when click button Not now
#    When I click button Not now
#    And I click menu exchange
#    And I click tab saving history
#    Then Verify display text deposit saving history "Nạp tiền-Tích lũy"
#    And Verify display text amount history "+1.000.000"
#    And Verify display text status history "Chưa thanh toán"
#
#  Scenario: Check history saving no date deposit
#    When I click button deposit history
#    Then Verify display text deposit saving history "Nạp tiền-Tích lũy"
#    And Verify display text amount history "+1.000.000"
#    And Verify display text status history "Chưa thanh toán"
#
#  Scenario: Check create order = 2 million
#    Given I delete transaction momo
#    When I click icon add
#    And I click button saving
#    And I click button saving no date
#    And I click button start saving
#    And I click button continue saving
#    And I input amount "2000000"
#    And I click button continue deposit
#    Then Verify display fee before free with value "41.000đ"
#    And Verify display fee after free with value two million "36.000đ"
#
#  Scenario: Check click payment method momo when enable
#    When I click button payment method momo
#    Then Display amount deposit is "2.000.000đ"
#    And Display fee transfer is "36.000đ"
#    And Display total deposit is "2.036.000đ"
#
#  Scenario: Check when click button confirm transaction
#    When I click button confirm transaction
##    Then Verify text payment by momo is "Thanh toán dịch vụ Finhay Qua ví điện tử MoMo"
#    Then Verify total deposit two million  with value is "2.036.000đ"
#    And Verify display button payment by Momo
#    And Verify display button Not now
#
#  Scenario: Check when click button payment by Momo
#    When I click button Payment by Momo in MoMo App
#    And I input password of app momo is "000000"
#    And I click button confirm in Momo
#   # And I input pass confirm of app Momo "000000"
#    And I click number zero in keyboard
#    And I click number zero in keyboard
#    And I click number zero in keyboard
#    And I click number zero in keyboard
#    And I click number zero in keyboard
#    And I click number zero in keyboard
# Then Verify text paid order "Đơn hàng đã thanh toán"
#
#  Scenario: Check when click button back
#    When I click button back from deposit screen
#    Then Verify text saving success "Chúc mừng bạn đã tích lũy thành công!"
#    And Display button return home page
#
#  Scenario: Check click button return homepage
##    When I click button return home page
##    Then Verify popup first saving success is  "Yay! Chúc mừng!"
#
#  Scenario: Check click continue saving in popup
##    When I click continue saving in popup
##    Then Verify textbox amount display
#
##  Scenario: Check create order again
##    When I input amount "2000000"
##    And I click button continue deposit
##    Then Verify display fee no bonus with value "41.000đ"
##
##  Scenario: Check click payment method momo when enable
##    When I click button payment method momo
##    Then Display amount deposit is "2.000.000đ"
##    And Display fee transfer is "41.000đ"
##    And Display total deposit is "2.041.000đ"
##
##  Scenario: Check when click button confirm transaction
##    When I click button confirm transaction
##    And I click button Payment by Momo in MoMo App
###    And I input password of app momo is "000000"
##    And I click button confirm in Momo
##   # And I input pass confirm of app Momo "000000"
##    And I click number zero in keyboard
##    And I click number zero in keyboard
##    And I click number zero in keyboard
##    And I click number zero in keyboard
##    And I click number zero in keyboard
##    And I click number zero in keyboard
##    Then Verify text paid order "Đơn hàng đã thanh toán"
##
##    Scenario: Check click button back
##    When I click button back from deposit screen
##      Then Verify text saving success "Chúc mừng bạn đã tích lũy thành công!"
##    And Display button return home page
#
#  Scenario: Check click button return homepage
#    When I click button return home page
#     Then  Verify display value in saving is "1.000.000"
#
#  Scenario: Logout and reset user
#    When I Click to Avatar
#    And I Click button Logout
#    And I Click button OK
#    And Reset user deposit by momo
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
#
#
