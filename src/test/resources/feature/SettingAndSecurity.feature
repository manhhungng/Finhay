#@Setting
#Feature: Setting and security
#  Scenario: Verify display when click button Setting and security
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    When I input email "oanh.nguyen50@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I Click to button skip active account
#    And I click to button confirm skip
#    When I Click to Avatar
#    When I click setting and security
#    Then Verify connect facebook display
#    And Verify swich facebook display
#    And Verify text use facebook login to Finhay "Dùng Facebook để đăng nhập Finhay"
#    And Verify display text lock app
#    And Verify text button lock app "Chưa thiết lập"
#    And Verify text lock app Finhay by Pin "Khóa ứng dụng Finhay bằng Mã PIN"
#    And Verify button change password display
#
#  Scenario: Check connect with Facebook
#    When I click switch Facebook
#    Then Display title connect to Facebook "Kết nối tới Facebook"
#    And Display message text confirm connect to FB "Bạn có muốn kết nối Facebook để đăng nhập Finhay?"
#    And Display button Cancel
#    And Display button Confirm
#
#  Scenario: Check when click cancel
#    When I click cancel button
#    Then Verify text connect to FB "OFF"
#
##  Scenario: Check when click button confirm connect with FaceBook
##    When I click switch Facebook
##    And I Click confirm with FaceBook
##    And I Click button continue Facebook
##    Then Verify display message success "Kết nối với Facebook thành công"
##    And I click button ok
##    And Verify text connect to FB "ON"
#
#  Scenario: Verify when click Setup app
#    When I Click button look app
#    Then Verify display button setup PIN code enable
#    And Verify display button change PIN code disable
#    And Verify text wanning "Luôn luôn cảnh giác, bảo vệ thật kỹ mật khẩu và các thông tin cá nhân."
#
#  Scenario: Verify when click button setup pin
#    When I click button setup Pin code
#    And I click button Pin one
#    And I click button Pin one
#    And I click button Pin one
#    And I click button Pin one
#    Then Verify display screen confirm Pin "Xác nhận mã PIN mới"
#
#  Scenario: Verify when input confirm pin wrong
#    When I click button confirm Pin two
#    And I click button confirm Pin two
#    And I click button confirm Pin two
#    And I click button confirm Pin two
#    Then Display message confirm pin wrong "Mã PIN xác nhận không chính xác"
#
#  Scenario:  Verify when input correct confirm Pin
#    When I click button Pin one
#    And I click button Pin one
#    And I click button Pin one
#    And I click button Pin one
#    Then Display message successful confirm Pin "Thiết lập thành công"
#    And I Click button Back
#    And I click Back
#    And Verify text after lock app "Đã khóa"
#
#  Scenario: Verify after setup Pin
#    When I Click button look app
#    Then And Verify display button change PIN code enable
#
#  Scenario: Verify when input change pin code wrong
#    When I click button change pin
#    And I click button change pin five
#    And I click button change pin five
#    And I click button change pin five
#    And I click button change pin five
#    Then Verify error message change pin "Sai mã PIN"
#
#  Scenario: Verify when input correct change pin
#    When I click button change pin one
#    And I click button change pin one
#    And I click button change pin one
#    And I click button change pin one
#    Then Verify go to screen input new pin display "Nhập mã PIN mới"
#
#  Scenario: Verify when change pin Enter the same old pin code
#    When I click button Pin one
#    And I click button Pin one
#    And I click button Pin one
#    And I click button Pin one
#    Then Verify display message the same old pin "Không được trùng mã PIN cũ"
#
#  Scenario:  Verify when change pin successful
#    When I click button Pin two
#    And I click button Pin two
#    And I click button Pin two
#    And I click button Pin two
#    And I click button confirm Pin two
#    And I click button confirm Pin two
#    And I click button confirm Pin two
#    And I click button confirm Pin two
#    Then Display message successful confirm Pin "Thiết lập thành công"
#    And I Click button Back
#
#  Scenario: Verify when click clear Pin ,forgot Pin
#    When I click button change pin
#    And I click clear Pin
#    Then Verify message clear pin "Một email đã được gửi đến bạn, vui lòng kiểm tra và làm theo hướng dẫn."
#
#  Scenario: Check when login succesful with facebook and input correct pin
#    Given I click button ok popup clear pin
#    And I click Back
#    And I click Back
#    And I click Back
#    And I Click button Logout
#    And I Click button OK
#    When I Click button Login in welcome screen
#    And I input email "oanh.nguyen50@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
##    When I click login with facebook
##    And I Click button continue Facebook
#    And I Click to button skip active account
#    And I click to button confirm skip
#    And I click button pin login two
#    And I click button pin login two
#    And I click button pin login two
#    And I click button pin login two
#
#  Scenario: OFF conncect with facebook
#    Given I Click to Avatar
#    And I click setting and security
##    When I click switch Facebook
##    Then Verify message disconnect with fackbook successful "Ngắt kết nối với Facebook thành công"
##    And I click button ok popup disconnect with facebook
##    Then Verify text connect to FB "OFF"
#
#  Scenario: OFF lock app
#    When I Click button look app
#    And I click button off Pin code
#    And I click button pin login two
#    And I click button pin login two
#    And I click button pin login two
#    And I click button pin login two
#    Then Verify display button setup PIN code enable
#    And Verify display button change PIN code disable
#    And I click Back
#    And I click Back
#  Scenario: Login with facbook was disconnect
#    Given I Click button Logout
#    And I Click button OK
#    And I Click button Login in welcome screen
##    When I click login with facebook
##    And I Click button continue Facebook
##    Then Verify display error message login with facebook "Tài khoản của bạn chưa được gắn kết với tài khoản Facebook"
##    And I click button ok in popup login with facebook
#
#  Scenario: Verify when click button Change Password
#    Given I input email "oanh.nguyen49@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I Click to button skip active account
#    And I click to button confirm skip
#    When I Click to Avatar
#    And I click setting and security
#    When I click button change password
#    Then Verify button confirm change password disable
#
#  Scenario: Check input wrong current password
#    When I input current password is "Oanhkim3010"
#    And I input new password is "O@nhkim3010"
#    And I input confirm new password is "O@nhkim3010"
#    And I click button confirm change password
#    Then Verify display message current password "Mật khẩu cũ không đúng, vui lòng kiểm tra lại"
#    And Verify current password have format "•••••••••••"
#    And Verify new password have format "•••••••••••"
#    And Verify confirm new pass have format "•••••••••••"
#
#  Scenario: Check when click button show password
#    When I click button show current new pass
#    And I click button show new pass
#    And I click button show confirm new pass
#    Then Verify current pass show "Oanhkim3010"
#    And Verify new password show "O@nhkim3010"
#    And Verify confirm new pass show "O@nhkim3010"
#
#  Scenario: Check when input wrong format password (least 8 char)
#    When I input current password is "O@nhkim3010"
#    And I input new password is "O"
#    And I input confirm new password is "O"
#    Then Verify button confirm change password disable
#
#  Scenario: Check when input wrong format password (no have special characters + least 8 char)
#    When I input new password is "Oanhkim"
#    And I input confirm new password is "Oanhkim"
#    Then Verify button confirm change password disable
#
#  Scenario: Check when input wrong format password (no have special characters)
#    When I input new password is "Oanhkim3010"
#    And I input confirm new password is "Oanhkim3010"
#    Then Verify button confirm change password disable
#
#  Scenario: Check when input wrong format password (no have special characters + least 8 char + no have capital letter)
#    When I input new password is "oanhkim"
#    And I input confirm new password is "oanhkim"
#    Then Verify button confirm change password disable
#
#  Scenario: Check when input wrong format password ( no have capital letter)
#    When I input new password is "o@nhkim3010"
#    And I input confirm new password is "o@nhkim3010"
#    Then Verify button confirm change password disable
#
#  Scenario: Check when input wrong format password ( no have lowercase characters)
#    When I input new password is "OANHKIM3010"
#    And I input confirm new password is "OANHKIM3010"
#    Then Verify button confirm change password disable
#
#  Scenario: Check when input confirm new password least 8 char
#    When I input new password is "OANHKIM3010"
#    And I input confirm new password is "OANH"
#    Then Verify button confirm change password disable
#
#  Scenario: Check input confirm new pass wrong
#    When I input new password is "O@nhkim3010"
#    And I input confirm new password is "OANHKIM3010"
#    And I click button confirm change password
#    Then Verify error message confirm new password "Mật khẩu không trùng khớp"
#
#  Scenario: Check input new password same old password
#    When I input new password is "O@nhkim3010"
#    And I input confirm new password is "O@nhkim3010"
#    And I click button confirm change password
#    Then Verify error message new password "Mật khẩu cũ không được trùng với mật khẩu mới."
#
#  Scenario: Verify when change password successful
#    When I input new password is "O@nhkim301096"
#    And I input confirm new password is "O@nhkim301096"
#    And I click button confirm change password
#    Then Verify message change password successful "Đổi mật khẩu thành công"
#
#  Scenario: Verify when change again password
#    Given I click button return homepage
#    And I Click to Avatar
#    And I click setting and security
#    When I click button change password
#    And I input current password is "O@nhkim301096"
#    And I input new password is "O@nhkim3010"
#    And I input confirm new password is "O@nhkim3010"
#    And I click button confirm change password
#    Then Verify message change password successful "Đổi mật khẩu thành công"
#
#  Scenario: Verify when login old password
#    Given I click button return homepage
#    And I Click to Avatar
#    And I Click button Logout
#    And I Click button OK
#    And I Click button Login in welcome screen
#    When I input email "oanh.nguyen49@finhay.com.vn"
#    And I input password1 "O@nhkim301096"
#    And I click button Login
#    Then Verify error login wrong pass is "Tài khoản hoặc mật khẩu không đúng. Vui lòng thử lại"
#
#  Scenario: Check input correct password
#    Given I click button ok popup error message login
#    When I input email "oanh.nguyen49@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I Click to button skip active account
#    And I click to button confirm skip
#    When I Click to Avatar
#    And I Click button Logout
#    And I Click button OK
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
