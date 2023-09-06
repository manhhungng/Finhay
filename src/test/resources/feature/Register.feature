#Feaure : List of screario
  # Screario : Bussiness rule through list of steps with arguments
  # Given : Some precondition steps
  # When : Some key action
  # Then : To observe outcome or validation
  # Screnario Outline : List of steps for data-driven as an Example and <Placeholder>

@Register
Feature: Register application

  Scenario: Register screen display
    Given I Click button Skips
    When I click button Register
    Then Verify button Register by Google display
    And Verify button Register by Phone display

  Scenario: CLick button Register by Phone
    When I click button Register by Phone
    Then Veriry button Continue step one disable

#  Scenario: Only input Last name
#    When I input last name "Nguyen"
#    Then Veriry button Continue step one disable
#
#  Scenario: Only input First name
#    When I input first name "Oanh"
#    And I input last name is ""
#    Then Veriry button Continue step one disable
#
#  Scenario: Only input First name and Lastname least 2 char
#    When I input first name "O"
#    And I input last name is "N"
#    Then Veriry button Continue step one disable

  Scenario:  Input correct LastName and FirstName
    When I input last name "Nguyen"
    And I input first name "Oanh"
    Then Veriry button Continue step one enable

  Scenario: Click button Continue steps one
    When I click button Continue steps one
    Then Verify button Continue step two disable

#  Scenario:  No input email
#    When I input to Phone "0987747474"
#    Then Verify button Continue step two disable
#
#  Scenario: No input phone
#    When I input to Phone " "
#    And I input to Email "oanh.nguyen2@finhay.com.vn"
#    Then Verify button Continue step two disable
#
#  Scenario: Input phone no enough 10
#    When I input to Phone "1234"
#    And I input to Email "oanh.nguyen2@finhay.com.vn"
#    Then Verify button Continue step two disable
#
#  Scenario: Input email wrong format
#    When I input to Phone "0975443332"
#    And I input to Email "oanh.nguyen"
#    And I click button Continue step two
#    Then Verify error email message "Email sai định dạng"
#    And Verify icon email error display
#
#  Scenario: Check register duplicate Phone number
#    When I input to Phone "0912364485"
#    Then Verify error message Phone display "Số điện thoại đã tồn tại trong hệ thống"
#    And Verify icon phone error display
#
#  Scenario: Check wrong fomat phone
#    When I input to Phone "1122334455"
#    Then Verify error message Phone display "SĐT không đúng định dạng"


  Scenario: Check input phone enough 10 number and Email
    When I input to Phone correct
    And I input to Email correct
    And I click button Continue in step two
    Then Verify button Complete Register disable
    And Verify display text Minimum of 8 characters
    And Verify display text There is 1 capital letter
    And Verify display text There is 1 special character
    And Verify display text There is 1 lower case letter

#  Scenario: No input password
#    When I input password ""
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: No input confirm password
#    When I input confirm password ""
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: No input confirm password and password
#    When I input password ""
#    When I input confirm password ""
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Uncheck terms of use
#    When I input password "O@nhkim3010"
#    When I input confirm password "O@nhkim3010"
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Uncheck commitment
#    When I input password "O@nhkim3010"
#    When I input confirm password "O@nhkim3010"
#    And I selected checkbox terms of use
#    Then Verify button Complete Register disable

#  Scenario: Verify password have format ........
#    When I input password "Ab@12345"
#    And I input confirm password "Ab@12345"
#    Then Verify password textbox display "••••••••"
#    And Verify confirm password textbox display "••••••••"
#
#  Scenario: Verify password show when click show
#    When I input password "O@nhkim3010"
#    And I input confirm password "O@nhkim3010"
#    And I Click button Show password
#    And I Click button Show confirm password
#    Then Verify password textbox show "O@nhkim3010"
#    And Verify confirm password textbox show "O@nhkim3010"
#
#  Scenario: Verify when input invalidate password
#    When I input password "Oanh"
#    And I input confirm password "Oanh"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Verify when input invalidate password
#    When I input password "O@nh"
#    And I input confirm password "O@nh"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Verify when input invalidate password
#    When I input password "oanh"
#    And I input confirm password "oanh"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Verify when input invalidate password
#    When I input password "oanh1"
#    And I input confirm password "oanh1"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Verify when input invalidate password
#    When I input password "oanh1@"
#    And I input confirm password "oanh1@"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Verify when input invalidate password
#    When I input password "@#$%^&*"
#    And I input confirm password "@#$%^&*"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Verify when input invalidate password
#    When I input password "@#$%^&*"
#    And I input confirm password "@#$%^&*"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Verify when input invalidate password
#    When I input password "@#$%^&*oanh"
#    And I input confirm password "@#$%^&*oanh"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Verify when input invalidate password
#    When I input password "@#$%^&*OANH"
#    And I input confirm password "@#$%^&*OANH"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Verify when input invalidate password
#    When I input password "OANHKIM"
#    And I input confirm password "OANHKIM"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    Then Verify button Complete Register disable
#
#  Scenario: Verify when input confirm password not the same as the password
#    When I input password "O@nhkim3010"
#    And I input confirm password "Oanhkim3010"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    And I click button Completed Register
#    Then verify error message wrong confirm password "Mật khẩu không trùng khớp"
#
#  Scenario: Check when click terms of use
#    When I click link terms of use
#    Then Verify file pdf display
#    And Click button back out terms of use

  Scenario: Check register successful
    When I input password "Ab@12345"
    And I input confirm password "Ab@12345"
    And I selected checkbox terms of use
    And I selected checkbox commitment
    And I click button Completed Register
    Then Verify button Active now display
    And Verify button Skip display

  Scenario: Check click button Active Now
    When I click Active now
    And I click button seen OTP SMS
    When I Click button Agree
    And I Click button OK
    When I input pincode "000000"
    And I click Active when input code
    Then Verify button Discover Now display
    And I Click button Discover Now

  Scenario:  Check when click button logout
    When I Click to Avatar
    And I Click button Logout
    And I Click button OK
    And Reset app




#  Scenario: Verify when Click button Skip
#    When I Click button Skip
#    Then Verify button OK, I will validate the OTP display
#    And I still want to skip this step display
#
#  Scenario: Verify When click confirm Skip
#    When I Click button confirm skip
#    Then Verify button Discover Now display
#
#  Scenario:  Check when click button logout
#    When I Click button Discover Now
#    When I Click to Avatar
#    And I Click button Logout
#    And I Click button OK
#
#  Scenario: Verify when click Active
#    Given I click button Register
#    And I click button Regiser by Phone
#    And I input last name "Nguyen"
#    And I input first name "Oanh"
#    When I click button Continue steps one
#    And  I input to Phone correct
#    And I input to Email "test2@finhay.com.vn"
#    And I click button Continue step two
#    And I input password "Ab@12345"
#    And I input confirm password "O@nhkim3010"
#    And I selected checkbox terms of use
#    And I selected checkbox commitment
#    And I click button Completed Register
#    Then Verify error message popup "Email đã được sử dụng"
#    And I Click button ok in popup
#    And I Click Back in steps 3
#    And I input to Email correct
#    And I click button Continue step two
#    And I input password "Ab@12345"
#    And I input confirm password "Ab@12345"
#    And I click button Completed Register
#    When I click Active now
#    And Verify display button seen OTP SMS
#    And Verify button I had code
#
#  Scenario: Click button Get the activation
#    When I click button seen OTP SMS
#    Then Verify content code display
#    And I click icon Close
#    And Verify display button seen OTP SMS
#    And I click button seen OTP SMS
#
#  Scenario: Click button Agree get Active
#    When I Click button Agree
#    Then I Click button OK
#    And Verify textbox input pincode display
#
#  Scenario:  Check when input pincode least six number
#    When I input pincode "1234"
#    And I click Active when input code
#    Then Verify error message popup "Vui lòng nhập mã OTP"
#    And I Click button ok in popup
#
#  Scenario:  Check when input wrong pincode
#    When I input pincode "123456"
#    And I click Active when input code
#    Then Verify error message popup "Mã xác nhận không hợp lệ, mã là chuỗi 6 chữ số. Vui lòng thử lại."
#    And I Click button ok in popup

  ##Scenario: Verify when Click button Resend via SMS
   ## When  I Click button Resend via SMS display
    ##Then Verify message Resend via SMS display "Mã xác nhận đã được gửi cho bạn qua tin nhắn hoặc cuộc gọi. Nếu không nhận được mã bạn có thể tạm BỎ QUA bước này và có thể xác thực lại vào lúc khác."
    ##And I Click button OK resend via SMS
    ##And Button resend via SMS disable
    ##And Button Resend via Phone number enable


##  Scenario: Verify when Click button Resend via Phone number
  ##  When  I Click button Resend via Phone number display
  ##  Then Verify message Resend via Phone number display "Hãy nghe điện thoại và ghi nhớ mã OTP"
  ##  And I Click button OK Resend via Phone number
  ##  And Display countdown time

#  Scenario: Check when input correct OTP
#    When I input pincode "000000"
#    And I click Active when input code
#    Then Verify button Discover Now display
#    And I Click button Discover Now




  ##Scenario:Verify when  Register by Gooogle
   ## Given When I click button Register
    ##And I Click button Register By google
   ## Then Show webview choosing acc google
   ## When I input last name "Nguyen"
  ## And I Click button return in keyboard
   ## And I click button Continue steps one
   ## Then Verify email register  display "oanh.nguyen@finhay.com.vn"

   ## Scenario: Register successful by Google
    ##  When I input to Phone "0957437277"
    ##  And I click button Continue in step two
    ##  And I input to password "O@nhkim3010"
    ##  And I  input confirm password "O@nhkim3010"
    ##  And I selected checkbox terms of use
    ##  And I selected checkbox commitment
   ##   And I click button Completed Register
    ##  When I click Active now
    ##  Then Verify Phone registed display
    ##  And Verify button get the activation code display
    ##  And Verify button I had code

    ##  Scenario: Click button I had code active
     ##   When I click in texbox pincode
    ## And I Click I had code active
    ##     And I input pincode "000000"
     ##   And I click Active when input code
     ##   Then Verify button Discover Now display
      ##  And I Click button Discover Now




















