@CreateStock
  Feature: Create stock account

    Scenario: User click stock card without basic account
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      And Click Stock card
      Then Verify display text "Điều khoản sử dụng"
      And Verify display button accept
      And Verify display TAC link "Điều khoản sử dụng chứng khoán"
      And Verify display contract link "Hợp đồng mở tài khoản chứng khoán"
      And Verify display appendix link "Phụ lục hợp đồng chứng khoán lô lẻ"
      And Verify display guide link "Chứng khoán Finhay là gì"

    Scenario: User click term of uses link
      When User click TAC link
      Then Verify term of use link

    Scenario: User click contract link
      When User click contract link
      Then Verify contract info

    Scenario: User click appendix link
      When User click appendix link
      Then Verify appendix link

    Scenario: User click intro link
      When User click intro link
      Then Navigate to info link

    Scenario: User click accept button while lacking eKYC
      Given User lacking ekyc
      And Click Stock card
      Then Verify display button accept
      And Click button accept
      Then Verify alert dialog "Tính năng bị khóa"
      And Verify action button "Xác thực tài khoản"
      And Verify close button "Đóng"
      Then Click action button
      Then Verify profile screen displayed

    Scenario: User click accept button while lacking personal info
      Given User lacking gender info
      Then Verify display button accept
      And Click button accept
      Then Verify alert dialog "Thiếu thông tin cá nhân"
      And Verify action button "Bổ sung ngay"
      And Verify close button "Đóng"
      Then Click action button
      And Verify profile screen displayed

    Scenario: User click accept button while lacking bank info
      Given User lacking bank info
      And Click Stock card
      Then Verify display button accept
      And Click button accept
      Then Verify alert dialog "Thiếu thông tin cá nhân"
      And Verify action button "Nhập thông tin"
      And Verify close button "Đóng"
      Then Click action button
      And Verify bank input screen displayed

    Scenario: User click accept button while using passport
      Given User click button Skips
      And Click Stock card
      Then Verify display button accept
      And Click button accept
      Then Verify alert dialog "Giấy tờ tùy thân không hợp lệ"
      And Verify action button "Liên hệ Hotline"
      And Verify close button "Đóng"

    Scenario: User click accept button while using passport
      Given User click button Skips
      When User click button Login in welcome screen
      And Input phone number "0985802348"
      And Input password "Ab@12345"
      And Click button Login
      And Click "Chứng khoán" card
      Then Verify display button accept
      And Click button accept
      Then Verify alert dialog "Thiếu thông tin cá nhân"
      And Click action button
      Then Verify profile screen displayed

