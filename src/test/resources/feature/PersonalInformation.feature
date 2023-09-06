@personal_information

Feature: Check personal information screen

  Scenario: Check input info profile success
    Given I Click button Skips
    When I Click button Login in welcome screen
    When I input email "oanh.nguyen26@finhay.com.vn"
    And I input password1 "O@nhkim3010"
    And I click button Login
    And I Click to button skip active account
    And I click to button confirm skip
    And I Click to Avatar
    When I click button profile
    Given I click button update info
    When I click gender
    And I choose female
    And I click button Done
    And I click icon date of birth
    And I click button OK in dropdown
    And I input detail address is "Bac Ninh"
    And I click button Save info
    And I click button confirm
    Then Verify message update personal information success display is "Cập nhật thông tin cá nhân thành công"

  Scenario: Delete profile user in database
    Given I click button ok in popup error message
    When I delete profile
    And Reset app

#      And Push file
#    When I click button Change avatar
#    And I click button allow to take picture
#    And I click button allow finhay to access photo
#    And I click button choose from gallery
#    And I click camera
#    And I click choose image
#    And I click confirm choose button
#    And Scroll down
#    And Verify display full name is "Nguyen Oanh"
#    And Verify display gender is "Chưa nhập"
#    And Verify display date of birth is "Chưa nhập"
#    And Verify display address is "Chưa nhập"
#    And Verify display tax code is "Chưa nhập"
#    And Verify display job is "Chưa nhập"

#  Scenario: Click button update
##    Given Scroll up
#    When I click button update info
#    When I click button Save info
#    And display error message no input field required "Vui lòng nhập đầy đủ thông tin"
#
#  Scenario: No choose province
#    Given I click button ok in popup error message
##    And Scroll down
#    When I click button District
#    Then display error message no input field required "Vui lòng chọn Tỉnh/Thành phố trước."
#
#  Scenario: No choose province
#    Given I click button ok in popup error message
#    When I click button Ward
#    Then display error message no input field required "Vui lòng chọn Tỉnh/Thành phố trước."
#
#  Scenario:  No choose district
#    Given I click button ok in popup error message
#    When I click province
#    And I click button OK in dropdown
#    And I click button Ward
#    Then display error message no input field required "Vui lòng chọn Quận/Huyện trước."
#
#  Scenario: Input date of birth and province
#    Given I click button ok in popup error message
#    When I click province
#    And I click button OK in dropdown
#    And I click button District
#    And I click button OK in dropdown
#    And I click button Ward
#    And I click button OK in dropdown
#    And I input detail address is "bn"
#    Then Verify display province is "An Giang"
#    And Verify display District is "Huyện An Phú"
#    And Verify display Ward is "Thị trấn An Phú"
#
#  Scenario: No choose gender and date of birth
##    Given Scroll up
#    When I click button Save info
#    And display error message no input field required "Vui lòng nhập đầy đủ thông tin"
#
#  Scenario: No choose gender
#    Given I click button ok in popup error message
#    When I click icon date of birth
#    And I click button OK in dropdown
#    Then display date of birth is "29-04-2003"
#    And I click button Save info
#    And display error message no input field required "Vui lòng nhập đầy đủ thông tin"
#
#  Scenario: Check choose gender
#    Given I click button ok in popup error message
#    When I click gender
#    And I choose female
#    And I click button Done
#    Then Verify textbox gender display "Nữ"
#
#  Scenario: Check click button Save when input all field
#    And I click button Save info
#    Then display message notice is "Bạn chỉ có một lần chủ động thay đổi thông tin cá nhân, nếu bạn nhập sai và muốn thay đổi bạn sẽ phải liên lạc với hỗ trợ để xác nhận thông tin. Bạn chắc chắn thông tin đã nhập là đúng?"
#    And Verify button cancel display
#    And Verify button confirm display
#
#  Scenario: Check when click button cancel
#    When I click button cancel in info
#    Then verify screen display is "Sửa Thông tin cá nhân"
#
#  Scenario: Check when click button confirm save
#    When I click button Save info
#    And I click button confirm
#    Then Verify message update personal information success display is "Cập nhật thông tin cá nhân thành công"
#
#  Scenario: Verify when save info
#    Given I click button ok in popup error message
##    When Scroll down
#    Then Verify display gender is "Nữ"
#    And Verify display date of birth is "29-04-2003"
#    And Verify display address is "bn, Thị trấn An Phú, Huyện An Phú, An Giang"
#    And Verify display tax code is "Chưa nhập"
#    And Verify display job is "Chưa nhập"
#
#  Scenario: Check click trigger phone number
##    Given Scroll up
#    When I click button phone number
##    And Scroll down
#    Then Display phone number is phone registered "0979073701"
#    And Display button resend OTP SMS
#    And Display button I have code active
#
#  Scenario: Check edit phone wrong format
#  ##  Given I click textbox phone
#    When I input phone is "09000000"
#    And I click button resend OTP SMS
#    And I click button submit in popup
#    Then display error message active account "[AUTH_009] Số điện thoại không đúng định dạng"
#
#  Scenario: Check send code OTP SMS
#    Given I click button ok in popup error message
#    When I click button phone number
#    And I click button resend OTP SMS
#    And I click button submit in popup
#    Then display error message active account "Mã xác nhận đã được gửi cho bạn qua tin nhắn hoặc cuộc gọi. Nếu không nhận được mã bạn có thể tạm BỎ QUA bước này và có thể xác thực lại vào lúc khác."
#
#  Scenario: Check item in active account screen display
#    When I click button ok in popup error message
#    Then Verify button resend SMS disable
#    And Verify button resend Phone disable
###    And Verify notice send OTP display "Một mã OTP kích hoạt đã được gửi đến số điện thoại của bạn 0979773701."
#    And Verify display message Facebook display
#
#  Scenario: Check when input wrong OTP least 6 char
#    When I input OTP textbox is "11111"
#    And I click  button Active Now
#    Then display error message active account "Vui lòng nhập mã OTP"
#
#  Scenario: Check when input wrong OTP
#    Given I click button ok in popup error message
#    When I input OTP textbox is "111111"
#    And I click  button Active Now
#    Then display error message active account "Mã xác nhận không hợp lệ, mã là chuỗi 6 chữ số. Vui lòng thử lại."
#
#  Scenario: Check when input correct OTP
#    Given I click button ok in popup error message
#    When I input OTP textbox is "000000"
#    And I click  button Active Now
#    Then Verify phone number display activated is "0979073701"
#
#  Scenario: Check when click phone number when activated
#    When I click button phone number
#    Then Verify display notice active success "Thông tin này đã được xác thực và không thể thay đổi"
#
#  Scenario: Check active with email
#    Given Click button return page
#    When I click button email
#    Then Verify display notice active email is "Kiểm tra email của bạn, bấm nút xác nhận hoặc sao chép mã OTP kích hoạt (có thể xuất hiện trong thư mục spam/Junk)"
#    And Display button send
#    ##And Display button Input OTP
#  ##Scenario: Check edit email wrong format
###When I click textbox email
# ##   And I input email for active is "oanh.nguyen25@finhay"
#  ##  And I click button send
#   ## Then display error email for active is "Email sai định dạng"
#
#  Scenario: Check input correct email
#    And I click button send
#    Then display error message active account "Gửi mã kích hoạt email thành công."
#
#  Scenario: Verify when send OTP success email
#    When I click button ok in popup error message
#    Then Display message send email "Đã gửi email kích hoạt."
#
#  Scenario: Check when click button input OTP
#         ## Given I click button email
#    When I click button input OTP
#    Then Verify button Active Now display
#    And Verify button Switch to activation by Phone display
#
#  Scenario: Check when click button Switch to activation by Phone
#    When I click button Switch to activation by Phone
#    And I click button resend OTP SMS
#    And I click button submit in popup
#    Then display error message active account "[OTP_REQ_011] Tài khoản này đã được xác thực"
#
#  Scenario: Check when input correct OTP
#    Given I click button ok in popup error message
#    And Click button return page
#    When I input OTP textbox is "000000"
#    And I click  button Active Now
#    Then display error message active account "Xác thực email thành công!"
#
#  Scenario: Check when active email success
#    Given I click button ok in popup error message
#    When I click button email
#    Then Verify display notice active success "Thông tin này đã được xác thực và không thể thay đổi"
#    And Click button return page
#
#  Scenario: Delete account active in database
#    When I delete profile
#    And I delete user id activated phone and email
#
#























































