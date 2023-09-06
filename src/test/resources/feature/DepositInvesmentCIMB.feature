#@InvestCIMB
#Feature: Check deposit for COD by CIMB
#
#  Scenario: Check screen saving
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "0985802373"
#    And I input password1 "Ab@12345"
#    And I click button Login
#    And I click button invest
#    And I click button start invest
#    And I click button continue invest
#    And I click button I want input other number
#    Then Verify display turtle Hoan Kiem
#
#  Scenario: Check input amount < 50000
#    When I click button turtle Hoan Kiem
#    And I input amount "49000"
#    Then button continue deposit disable
#
#  Scenario: Check when user input amount > balance CIMB
#    When I input amount "50000000"
#    And I click button continue deposit
##    Then Verify payment method CIMB disable
#    Then Verify display text no enough money "Tài khoản không đủ tiền"
#
#  Scenario: Check click button amount = 100000 vnd
#    Given I click button back from deposit screen
#    When I input amount "100000"
#    And I click button continue deposit
#    Then verify payment method bank transfer display
#    And  Verify payment method momo display
#    And Verify payment method CIMB enable
#
#  Scenario: Check click choose payment method CIMB
#    When I click button payment method CIMB
#    Then Display amount deposit is "100.000đ"
#    And Display fee transfer is "0đ"
#    And Display total deposit is "100.000đ"
#    And Display button confirm transaction
#    And Display text security "Mọi giao dịch trên Finhay đều được bảo mật"
#
#  Scenario: Check when click button confirm transaction (not have pin code )
#    When I click button confirm transaction
#    Then Verify display text please create pin code "Vui lòng tạo mã PIN để sử dụng các tính năng với CIMB thuận tiện hơn."
#    And Verify display button Create Pin Now
#
#  Scenario: Check click button create pin now
#    When I click button Create Pin Now
#    Then Verify display popup message please input password "Bạn vui lòng nhập lại mật khẩu đăng nhập trên ứng dụng"
#
#  Scenario: Check click button ok input password
#    When I click button OK input password
#    Then Verify textbox password display
#    And Verify button confirm password disable
#    And Verify button Forgot password display
#
#  Scenario: Check input correct password
#    When I input password is "Ab@12345"
#    And I click button confirm password
#    Then Verify display text create pin code of you "Tạo mã PIN của bạn"
#    And Verify Display textbox create pin
#
#  Scenario: Check input pin code
#    When I input create pin one "0"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "0"
#    Then Verify text confirm pin code "Nhập lại mã PIN"
#
#  Scenario:  Check input correct pin code
#    When I input create pin one "0"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "0"
#    Then Verify text input OTP "Nhập mã OTP đã được gửi đến số điện thoại"
#
#  Scenario: Check input correct otp
#    Given Get otp
#    When I input otp index one
#    And I input otp index two
#    And I input otp index three
#    And I input otp index four
#    And I input otp index five
#    And I input otp index six
#    Then verify display message when input correct otp "Bạn đã tạo Octo PIN thành công. Bắt đầu sử dụng nào!"
#
#  Scenario: Check amount transfer
#    When I click button ok when input correct otp
#    And I click button ok transfer
#    Then Verify text input pin for transfer "Vui lòng nhập mã PIN của bạn"
#
#  Scenario: Check input correct pin for transfer
#    When I input create pin one "0"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "0"
#    Then Verify text input OTP "Nhập mã OTP đã được gửi đến số điện thoại"
#
#  Scenario: Check input correct otp for transfer money
#    Given Get otp
#    When I input otp index one
#    And I input otp index two
#    And I input otp index three
#    And I input otp index four
#    And I input otp index five
#    And I input otp index six
#    Then Verify display text transfer complete "Chuyển tiền hoàn tất"
#
#  Scenario: Check when click button return app of partner
#    When I click button Return app of partner
#    Then Verify asset total display "100.000"
#
#  Scenario: Check reset app
#      Given Delete transaction Invest CIMB
#
#
#
#
