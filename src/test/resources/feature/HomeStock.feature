@HomeStock
  Feature: Actions in home stock

    Scenario: Show Stock home screen for non-funded user
      Given User click button Skips
      When User click button Login in welcome screen
      And Input phone number "0985802480"
      And Input password "Ab@12345"
      And Click button Login
      And Click Stock card
      Then Verify display "Nạp tiền ngay" button

    Scenario: Show empty stock order book when click order book tab
      When User click tab "Lệnh đã đặt"
      Then Verify display empty content

    Scenario: Show empty stock portfolio when click portfolio tab
      When User click tab "Đang sở hữu"
      Then Verify display empty content

    Scenario: Verify First deposit success
      Given User has fund in Finhay Wallet
      When User click button "Nạp tiền ngay"
      Then Verify


    Scenario: Show Stock home screen for funded user
      Given User click button Skips
      When User click button Login in welcome screen
      And Input phone number "0985802480"
      And Input password1 "Ab@12345"
      And Click button Login
      And Click Stock card
      Then Verify display "Nạp tiền" button
      And  Verify display "Rút tiền" button

    Scenario: Show Market screen when click Market tab
      When User click tab "Thị trường"
      Then Verify display market list

    Scenario: Show Market screen when click Market tab
      When User click tab "Mở rộng"
      Then Verify display right button

