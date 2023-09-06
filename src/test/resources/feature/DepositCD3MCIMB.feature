#@CIMB_CD3M
#Feature: Check deposit for COD by CIMB
#
#  Scenario: Check when click CD3M
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "0985802374"
#    And I input password1 "Ab@123456"
#    And I click button Login
#    And I click button saving in homepage
#    And I click saving three month
#    Then Verify display total vnd saving no date is "0"
#
#  Scenario: Check when input amount < 50k
#    When I click button start saving three month
#    And I input amount three month is "49000"
#    Then Verify button start saving disable
#
#  Scenario: Check when input amount > 500 million
#    When I input amount three month is "500000001"
#    Then Verify button start saving disable
#
#
#  Scenario: Check deposit 100.000.001 vnd
#    When I input amount three month is "100000001"
#    And I click button start saving cd three month
#    Then verify error message too limit "Không áp dụng cho giao dịch lớn hơn 100.000.000đ"
#
#Scenario: Check deposit 100.000 vnd
#    Given I click button back from deposit screen
#  When I input amount three month is "100000"
#  And I click button start saving cd three month
#    And I click button payment method CIMB
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
#    When I input password is "Ab@123456"
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
#
##  Scenario: Check amount transfer
##    When I click button ok when input correct otp
##    When I click button confirm transaction
##    Then Verify amount transfer from CIMB "100,000đ"
#
#  Scenario: Check when click button ok transfer
#    When I click button ok when input correct otp
#    And I click button ok transfer
#    Then Verify text input pin for transfer "Vui lòng nhập mã PIN của bạn"
#
#  Scenario: Check when input wrong pin code 1 time
#    When I input create pin one "1"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "0"
#    Then Verify text input pin incorrect "PIN không chính xác. Vui lòng thử lại"
#
#  Scenario: Check when input wrong pin code 2 time
#    Given I click button ok when input pin incorrect
#    When I input create pin one "1"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "0"
#    Then Verify text input pin incorrect "PIN không chính xác. Vui lòng thử lại"
#
#  Scenario: Check when input wrong pin code 3 time
#    Given I click button ok when input pin incorrect
#    When I input create pin one "1"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "0"
#    Then Verify text input pin incorrect "PIN không chính xác. Vui lòng thử lại"
#
#  Scenario: Check when input wrong pin code 4 time
#    Given I click button ok when input pin incorrect
#    When I input create pin one "1"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "0"
#    Then Verify text input pin incorrect "PIN không chính xác. Vui lòng thử lại"
#
#  Scenario: Check when input wrong pin code 5 time
#    Given I click button ok when input pin incorrect
#    When I input create pin one "1"
#    And I input create pin two "0"
#    And I input create pin three "0"
#    And I input create pin four "0"
#    And I input create pin five "0"
#    And I input create pin six "0"
#    Then Verify text input pin incorrect five time "PIN của bạn đã bị khóa do nhập sai nhiều lần. Vui lòng đặt lại Octo PIN"
#
#  Scenario: Check when click button later
#    When I click button later
#    And I click button ok when input wrong pin five time
#    And I click button start saving cd three month
#    And I click button payment method CIMB
#    And I click button confirm transaction
#    Then Verify display text reset pin code "Mã PIN của bạn đã hết hạn, vui lòng ấn Cài Đặt lại bên dưới"
#    And Verify button Reset pin code display
#
#  Scenario: Check click reset pin code
#    When I click button Reset pin code
#    Then Verify display popup message please input password "Bạn vui lòng nhập lại mật khẩu đăng nhập trên ứng dụng"
#
#  Scenario: Check click button ok input password
#    When I click button OK input password
#    Then Verify textbox password display
#    And Verify button confirm password disable
#    And Verify button Forgot password display
#
#  Scenario: Check input correct password
#    When I input password is "Ab@123456"
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
#     Given Get otp
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
#  Scenario: Check when click button return app of partner & reset app
#    Given I click button Return app of partner
#     And Delete transaction
#    And Reset app
#
#
#
#
#
#
#
