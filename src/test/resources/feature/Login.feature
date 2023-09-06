@Login
Feature: Login
  Scenario: Login screen display
    Given I Click button Skips
    When I Click button Login in welcome screen
    Then Verify button Login disable

  Scenario: Login successful with email and password
    When I input email "oanh.nguyen72@finhay.com.vn"
    And I input password1 "O@nhkim3010"
    And I click button Login
    Then verify home screen display

  Scenario:  Check when click button logout
    When I Click to Avatar
    And I Click button Logout
    And I Click button OK
    And I Click button Login in welcome screen
   When I click forgot password
   Then Verify button confirm forgot password disable

  Scenario: Check when input email correct
    When I input email forgot password with value "linh.dao@finhay.com.vn"
   And I click button confirm forgot password
   Then Verify message sent otp code to gmail display "Gửi yêu cầu thành công. Kiểm tra email oanh.nguyen@finhay.com.vn để tạo mật khẩu mới."

    Given I click button ok in popup
   When I input otp with value "000000"
   And I click button confirm OTP

  Scenario: Verify when change password successful
  When I input new password "Ab@12345"
   And I input confirm password is "Ab@12345"
   And I click button confirm change pass
   Then Verify message change pass successful "Đổi mật khẩu thành công"
    And Reset app


#  Scenario: No input email
#    When I input email ""
#    And I input password1 "O@nhkim3010"
#    Then Verify button Login disable
#
#  Scenario: No input password
#    When I input email "oanh.nguyen72@finhay.com.vn"
#    And I input password1 ""
#    Then Verify button Login disable
#
#  Scenario: Input password least 8 char
#    When I input email "oanh.nguyen72@finhay.com.vn"
#    And I input password1 "1234567"
#    And I click button Login
#    Then Verify error message under password "Mật khẩu không được ngắn hơn 8 kí tự"
#
#  Scenario: Input wrong email
#    When I input email "oanh.nguyen72finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    Then Verify error message popup display "Tài khoản hoặc mật khẩu không đúng. Vui lòng thử lại"
#
#  Scenario: Input wrong password
#    Given I Click ok in popup
#    When I input email "oanh.nguyen72@finhay.com.vn"
#    And I input password1 "Oanhkim3010"
#    And I click button Login
#    Then Verify button error message display "Tài khoản hoặc mật khẩu không đúng. Vui lòng thử lại"
#
#  Scenario: Input wrong password
#    Given I Click ok in popup
#    When I input email "oanh.nguyen72@finhay.com.vn"
#    And I input password1 "Oanhkim3010"
#    And I click button Login
#    Then Verify button error message display "Tài khoản hoặc mật khẩu không đúng. Vui lòng thử lại"
#
#  Scenario: Input wrong phone number
#    Given I Click ok in popup
#    When I input phone "1234569"
#    And I input password1 "Oanhkim3010"
#    And I click button Login
#    Then Verify button error message display "Tài khoản hoặc mật khẩu không đúng. Vui lòng thử lại"
#
#  Scenario: Show password
#    Given I Click ok in popup
#    When I input phone "12345678"
#    And I input password1 "Oanhkim3010"
#    And I click button show password
#    Then Verify password display "Oanhkim3010"
#
#  Scenario: Hide password
#    When I click button hide password
#    Then Verify password display "•••••••••••"
#
#  Scenario: Login successful with email and password
#    When I input email "oanh.nguyen72@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    Then verify home screen display
#
#  Scenario:  Check when click button logout
#    When I Click to Avatar
#    And I Click button Logout
#    And I Click button OK
#
#  Scenario: Login successful with phone and password
#    Given I Click button Login in welcome screen
#    When I input phone "0964442222"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    Then verify home screen display
#
#  Scenario:  Check when click button logout
#    When I Click to Avatar
#    And I Click button Logout
#    And I Click button OK

 ## Scenario: Login successful with acc google
   ## Given I Click button Login
   ## When I Click Login with Google
  ##  And I Choose acc Login
   ## Then verify home screen display

  ##Scenario:  Check when click forgot password
  ##  Given I Click to Avatar
  ##  And I Click button Logout
  ##  And I Click button OK
#    And I Click button Login in welcome screen
#    When I click forgot password
#    Then Verify button confirm forgot password disable
#
#  Scenario: Check when input email wrong format
#    When I input email forgot password with value "oanhkim3010.com"
#    And I click button confirm forgot password
#    Then Verify error message wrong email display "Email chưa đúng định dạng"
#
#  Scenario: Check when input email no exist in database
#    When I input email forgot password with value "oanhkim30@gmail.com.com"
#    And I click button confirm forgot password
#    Then Verify error message wrong email display "Email này chưa đăng ký tài khoản với Finhay. Vui lòng kiểm tra lại"
#
#  Scenario: Check when input email correct
#    When I input email forgot password with value "oanh.nguyen@finhay.com.vn"
#    And I click button confirm forgot password
#    Then Verify message sent otp code to gmail display "Gửi yêu cầu thành công. Kiểm tra email oanh.nguyen@finhay.com.vn để tạo mật khẩu mới."
#
#  Scenario: Check when input OTP least 6 char
#    Given I click button ok in popup
#    When I input otp with value "0000"
#    And I click button confirm OTP
#    Then Verify display error message OTP "Vui lòng nhập mã OTP"
#
#  Scenario: Check when input wrong OTP
#    Given I click button ok in popup
#    When I input otp with value "000011"
#    And I click button confirm OTP
#    Then Verify display error message OTP "[OTP_RS_PWD_002] Mã OTP không đúng, vui lòng thử lại"
#
#  Scenario: Check when input correct OTP
#    Given I click button ok in popup
#    When I input otp with value "000000"
#    And I click button confirm OTP
#
#  Scenario: Check when input wrong format password (least 8 char)
#    When I input new password "Oanh"
#    And I input confirm password is "Oanh"
#    Then Verify display Button confirm change Pass disable
#
#  Scenario: Check when click button show password
#    When I click button show new password
#    And I click button show confirm new password
#    Then Verify new pass show "Oanh"
#    And Verify confirm password show "Oanh"
#
#  Scenario: Check when input wrong format password (no have special characters + least 8 char)
#    When I input new password "Oanhkim"
#    And I input confirm password is "Oanhkim"
#    Then Verify display Button confirm change Pass disable
#
#  Scenario: Check when input wrong format password (no have special characters)
#    When I input new password "Oanhkim3010"
#    And I input confirm password is "Oanhkim3010"
#    Then Verify display Button confirm change Pass disable
#
#  Scenario: Check when input wrong format password (no have special characters + least 8 char + no have capital letter)
#    When I input new password "oanhkim"
#    And I input confirm password is "oanhkim"
#    Then Verify display Button confirm change Pass disable
#
#  Scenario: Check when input wrong format password ( no have capital letter)
#    When I input new password "o@nhkim3010"
#    And I input confirm password is "o@nhkim3010"
#    Then Verify display Button confirm change Pass disable
#
#  Scenario: Check when input wrong format password ( no have lowercase characters)
#    When I input new password "OANHKIM3010"
#    And I input confirm password is "OANHKIM3010"
#    Then Verify display Button confirm change Pass disable
#
#  Scenario: Check when input confirm new password least 8 char
#    When I input new password "OANHKIM3010"
#    And I input confirm password is "OANH"
#    Then Verify display Button confirm change Pass disable
#
#  Scenario: Check input confirm new pass wrong
#    When I input new password "O@nhkim3010"
#    And I input confirm password is "OANHKIM3010"
#    And I click button confirm change pass
#    Then Verify error message confirm password is "Mật khẩu không trùng khớp"
#
#  Scenario: Verify when change password successful
#    When I input new password "O@nhkim301096"
#    And I input confirm password is "O@nhkim301096"
#    And I click button confirm change pass
#    Then Verify message change pass successful "Đổi mật khẩu thành công"
#
#  Scenario: Check input correct password
#    Given I click button return home screen
#    When I input email "oanh.nguyen@finhay.com.vn"
#    And I input password1 "O@nhkim301096"
#    And I click button Login
#    And verify home screen display
#
#  Scenario: Check when input wrong password 5 time
#    Given I Click to Avatar
#    And I Click button Logout
#    And I Click button OK
#    And I Click button Login in welcome screen
#    And I update password_attempts in database is four time wrong
#    When I input email "oanh.nguyen18@finhay.com.vn"
#    And I input password1 "O@nhkim30109"
#    And I click button Login
#    Then display message "Đăng nhập vào tài khoản đang tạm thời bị khóa. Vui lòng thử lại sau 10 phút."
#
#  Scenario:  Check when input wrong password 10 time
#    Given I click button ok in popup
#    And I update password_attempts in database is nine time wrong
#    When I input email "oanh.nguyen18@finhay.com.vn"
#    And I input password1 "O@nhkim30109"
#    And I click button Login
#    Then display message "Đăng nhập vào tài khoản đang tạm thời bị khóa. Vui lòng thử lại sau 30 phút."
#
#  Scenario:  Check when input wrong password 15 time
#    Given I click button ok in popup
#    And I update password_attempts in database is fourteen time wrong
#    When I input email "oanh.nguyen18@finhay.com.vn"
#    And I input password1 "O@nhkim30109"
#    And I click button Login
#    Then display message "Tài khoản đang tạm thời bị khóa do sai mật khẩu quá nhiều lần. Vui lòng sử dụng tính năng tìm lại mật khẩu để tạo mật khẩu mới."
#
#  Scenario: Check when user find password successful
#    Given I click button ok in popup
#    And I click forgot password
#    And I input email forgot password with value "oanh.nguyen18@finhay.com.vn"
#    And I click button confirm forgot password
#    And I click button ok in popup
#    And I input otp with value "000000"
#    And I click button confirm OTP
#    And Verify display Button confirm change Pass disable
#    When I input new password "O@nhkim301096"
#    And I input confirm password is "O@nhkim301096"
#    And I click button confirm change pass
#    Then Verify message change pass successful "Đổi mật khẩu thành công"
#
#  Scenario: Login successful after find pass
#    Given I click button return home screen
#    When I input email "oanh.nguyen18@finhay.com.vn"
#    And I input password1 "O@nhkim301096"
#    And I click button Login
#    And I Click to Avatar
#    And I Click button Logout
#    And I Click button OK

