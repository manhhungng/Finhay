#@CODCIMB
#Feature: Check deposit for COD by CIMB
#Scenario: Check account is blocked
#Given I Click button Skips
#When I Click button Login in welcome screen
#And I input email "0985802384"
#And I input password1 "Ab@12345"
#And I click button Login
#And I click button looking for more information
#And I click button continue
#And I click button continue
#And I click button continue
#And I click button saving no date
#And I click button start saving
#And I click button continue saving
#And I input amount "100000"
#And I click button continue deposit
#Then Verify button CIMB payment disable
#
#  Scenario:  Check account dormant
#    Given I click button back from deposit screen
#    And I click button back from deposit screen
#    And I click back to homepage
#    And I click back to homepage
#    And I click back to homepage
#    And I Click to Avatar
#    And I Click button Logout
#    And I Click button OK
#    When I Click button Login in welcome screen
#    And I input email "0985802385"
#    And I input password1 "Ab@12345"
#    And I click button Login
#    And I click button looking for more information
#    And I click button continue
#    And I click button continue
#    And I click button continue
#    And I click button saving no date
#    And I click button start saving
#    And I click button continue saving
#    And I input amount "100000"
#    And I click button continue deposit
#    Then Verify button CIMB no display
#
#  Scenario:  Check account is closed
#    Given I click button back from deposit screen
#    And I click button back from deposit screen
#    And I click back to homepage
#    And I click back to homepage
#    And I click back to homepage
#    And I Click to Avatar
#    And I Click button Logout
#    And I Click button OK
#    When I Click button Login in welcome screen
#    And I input email "0985802386"
#    And I input password1 "Ab@12345"
#    And I click button Login
#    And I click button looking for more information
#    And I click button continue
#    And I click button continue
#    And I click button continue
#    And I click button saving no date
#    And I click button start saving
#    And I click button continue saving
#    And I input amount "100000"
#    And I click button continue deposit
#    Then Verify button CIMB no display
#
#  Scenario: Check screen saving (Account active)
#    Given I click button back from deposit screen
#    And I click button back from deposit screen
#    And I click back to homepage
#    And I click back to homepage
#    And I click back to homepage
#    And I Click to Avatar
#    And I Click button Logout
#    And I Click button OK
##    And I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "0985802407"
#    And I input password1 "Ab@12345"
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
#  Scenario: Check input amount < 50.000 vnd
#    When I click button continue saving
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
#  Scenario: Check when user input amount > balance CIMB
#    When I input amount "500000000"
#    And I click button continue deposit
##    Then Verify payment method CIMB disable
#    And Verify display text no enough money "Tài khoản không đủ tiền"
#
#  Scenario: Check click button amount = 100000 vnd
#    Given I click button back from deposit screen
#    When I input amount "100000"
#    Then Verify textbox amount is "100.000đ"
#
#  Scenario: Check click button continue deposit
#    When I click button continue deposit
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
#  Scenario: Check click button forgot password
#    When I click button forgot password when deposit by CIMB
#    And Verify text find password "Tìm lại mật khẩu"
#
#  Scenario: Check input wrong password
#    Given I click button back from deposit screen
#    When I input password is "12345"
#    And I click button confirm password
#    Then Verify error message popup display "[ERR_PWC_INVALID_DATA] Mật khẩu không đúng. Vui lòng thử lại"
#
#  Scenario: Check input correct password
#    Given I Click ok in popup
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
#  Scenario: Check input wrong confirm pincode
#    When I input create pin one "0"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "1"
#    Then Verify display message error confirm pin code "Mã Pin xác nhận không đúng"
#
#  Scenario:  Check input correct pin code
#    Given Click button OK when confirm wrong pin code
#    When I input create pin one "0"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "0"
#    Then Verify text input OTP "Nhập mã OTP đã được gửi đến số điện thoại"
#
#  Scenario: Check input otp incorrect
#    When I input create pin one "0"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "0"
#    Then Verify display message error otp is "Mã OTP không đúng. Xin hãy thử lại"
#
#  Scenario: Check input correct otp
#    Given I click button ok when input inccorect opt
#    And Get otp
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
#    Then Verify amount transfer from CIMB "100,000đ"
#
#  Scenario: Check when click button ok transfer
#    When I click button ok transfer
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
#    Then Verify popup first saving success is  "Yay! Chúc mừng!"
#
#  Scenario: Check click continue saving in popup
#    When I click continue saving in popup
#    Then Verify textbox amount display
#
#  Scenario: Check display 100.000 in home screen
#    Given I click button back from deposit screen
#    When I click home page menu
#    Then Verify display value in saving is "100.000"
#
#  Scenario: Check forgot pin step 1
#    Given I click icon add
#    And I click button saving
#    And I click button saving no date
#    And I click button deposit more
#    And I input amount "100000"
#    And I click button continue deposit
#    And I click button payment method CIMB
#    And I click button confirm transaction
#    And Verify amount transfer from CIMB "100,000đ"
#    And I click button ok transfer
#    When I click button forgot pin
#    Then Verify message set again pin "Nhấn nút ở dưới để tiến hành cài đặt lại mã PIN"
#
#  Scenario: Check when click reset pin now
#    When I click button reset pin now
#    Then Verify display popup message please input password "Bạn vui lòng nhập lại mật khẩu đăng nhập trên ứng dụng"
#
#  Scenario: Check input correct password
#    When I click button OK input password
#    And I input password is "Ab@12345"
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
#    And Get otp
#    When I input otp index one
#    And I input otp index two
#    And I input otp index three
#    And I input otp index four
#    And I input otp index five
#    And I input otp index six
#    Then verify display message when input correct otp "Bạn đã tạo Octo PIN thành công. Bắt đầu sử dụng nào!"
#
#  Scenario: Check reset app
#    Given Delete transaction COD CIMB
#    And Reset app
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
#
#
#
#
#
