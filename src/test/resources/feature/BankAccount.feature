#@bank
#Feature: Check add bank account
#
#  Scenario: Verify text when no add bank account
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    When I input email "0987776666"
#    And I input password1 "Ab@12345"
#    And I click button Login
#    And I Click to Avatar in homepage
#    Then Verify text bank account "Chưa nhập"
#
#  Scenario:  Check when click detail screen bank account
#    When I click button withdraw account
#    Then Verify button completed disable
#    And Verify display text warning "*Tên chủ tài khoản phải trùng với tên giấy tờ tuỳ thân"
#
#  Scenario: Check when click button choose bank
#    When I click icon choose bank
#    Then Verify textbox search bank display
#
#  Scenario: Check input search bank
#    When I input textbox search bank is "agri"
#    Then Verify display name bank "AGRIBANK - NH NONG NGHIEP VA PHAT TRIEN NONG THON VIET NAM"
#
#  Scenario: Check choose bank
#    When I click choose agribank
#    Then Verify textbox bank display "AGRIBANK - NH NONG NGHIEP VA PHAT TRIEN NONG THON VIET NAM"
#
#  Scenario: Check when input correct account number but do not have the same name on the profile
#    When I click icon choose location
#    And I click choose An Giang location
#    And I click icon choose branch
#    And I click choose Chi Lang branch
#    And I input account number is "1482205376655"
#    Then Verify textbox account name display "NGUYEN THI KHANH LINH"
#  #  And Verify display text warning "*Tên chủ tài khoản không khớp với tên trên giấy tờ tuỳ thân"
#    And Verify button completed disable
#
#  Scenario: Check when input wrong account number with napas
#    When I click icon choose bank
#    And I input textbox search bank is "tech"
#    And I click choose techcombank
#    And I input account number is "1234567"
#    Then Verify display error message account number "Lỗi xảy ra khi tra cứu người dùng trên VCCB"
#
#  Scenario: Check input correct account number
#    Given I click button OK in popup
#    When I input account number is "19032985954011"
#    Then Verify textbox account name display "NGUYEN THI KIM OANH"
# #   And Verify display text warning "*Tên chủ tài khoản hợp lệ"
#    And Verify button completed enable
#
#  Scenario: Check click button completed
#    When I click button completed add bank account
#    Then Verify message account verification successful "Xác thực tài khoản thành công!"
#
#  Scenario: Check click button Done
#    When I click button Done in popup
#    And I click button withdraw account
#    Then I Verify information bank with database
#    And I Verify information account number with database
#    And I Verify information account name with database
#
#  Scenario: Delete bank account
#    When Delete bank account
#    And Reset app
#
#
#
