#@CreateRevi
#Feature: Check deposit for COD by CIMB
#
#  Scenario: Check click credit CIMB (User already have a card CASA)
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "0984878463"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I click bank CIMB
#    Then Verify display button Credit CIMB - Finhay
#    And Verify display content text one CIMB "• Tạo luôn tài khoản ngân hàng tại CIMB"
#    And Verify display content text two CIMB "• Không mất phí"
#
#  Scenario: Check when click button Credit CIMB-Finhay
#    When I click button Credit CIMB - Finhay
#    Then Verify button Start open credit CIMB disable
#
#  Scenario: Check when check in checkbox policy
#    When I check in checkbox policy
#    Then Verify button Start open credit CIMB enable
#
#  Scenario: Check click button Start open credit CIMB
#    When I click button Start open credit CIMB
#    Then Verify display icon visa card
#    And Verify display seekbar
#    And Verify display button continue create revi
#
#  Scenario: Check seekbar
#    When I long press seekbar
#    Then I get text card limit is "50.000.000đ"
#
#  Scenario: Check when click button contiune create revi
#    When I click button continue create revi
#    And Verify display steps one
#
#  Scenario: Check in ID front and ID back and Portrait (Check auto fill when User already have a card CASA)
#    Given I click button check in id front
#    And I click button allow
#    And I click button camera
#    And I click button tick image
#    And I chose image just check in
#    And I click button check in id back
#    And I click button camera
#    And I click button tick image
#    And I chose image just check in
#    And I click button check in Portrait
#    And I click button camera
#    And I click button tick image
#    And I chose image just check in
#    When I click button continue in step one
#    Then Verify display step two
#
#   And Verify display fullname is "yyy"
#    And Verify display gender "Nam"
#    And Verify display birthday is "17/06/2003"
#    And Verify display supply date is "17/06/2003"
#    And Verify display permanent address is "yyyy"
#    And Verify display now address is "yyyy"
#    And Verify display city is "Thành phố Hà Nội"
#    And Verify display business is "Kế Toán/ Kiểm Toán/ Cố Vấn Pháp Luật/ Thư Ký"
#    And Verify display work place is "ggg"
#    And Verify display position is "TỔNG GIÁM ĐỐC"
#    And Verify display marital status is "Độc thân"
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
##  Scenario: Check when input all field
##    When I input fullname is "Nguyen Kim Oanh"
##    And I choose gender is female
##    And I choose date of birth
##    And I choose supply date
##    And I input permanent address is "Que Vo"
##    And I check now address same permanent
##    And I choose city
##    And I choose academic level
##    And I choose business
##    And I choose job
##    And I choose status job
##    And I input work place is "Kim Ma"
##    And I choose position
##    And I input monthly income is "50000000"
##    And I choose marital status
##    And I click button continue in step two
##    Then Verify display step three
##
##  Scenario: Check input all field in steps 3
##    When I input relative's name is "Hong Van"
##    And I input relative's phone is "0945555555"
##    And I input friends name is "Mai Lan"
##    And I input friend phone is "0984444333"
##    And I click button continue in step three
##    Then Verify display step four
##
##  Scenario: Check click button wrong information
##    When I click button wrong information
##    Then Verify display step three
##
##  Scenario: Check click button confirm info
##    Given I click button continue in step three
##    When I click button confirm info
##    Then Verify display message notification success
##    And Verify display message result notification "CIMB đang xử lý đề nghị mở thẻ của bạn và sẽ có kết quả trong vòng 2 phút"
##
##  Scenario: Check click button Close
##    When I click button close created revi success
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
