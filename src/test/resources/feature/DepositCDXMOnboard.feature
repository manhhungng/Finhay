@CDXMOnboard
  Feature: Onboard screen for CDxM

    Scenario: Show onboarding screen for non-funded CDxM user
      Given User click button Skips
      When User click button Login in welcome screen
      And Input phone number "0985802480"
      And Input password "Ab@12345"
      And Click button Login
      And Click "Tích lũy mới" card
      Then Verify display new user banner

    Scenario: Check start button for user with no balance in Finhay Wallet
      Given User has no balance in Finhay Wallet
      When User click button "Bắt đầu tích lũy"
      Then Verify display finhay wallet deposit alert
      And Click deposit finhay wallet CTA button
      Then Input "50000" into deposit bar
      Then Click button continue
      Then Click button confirm deposit
      Then Verify display transaction detail screen

    Scenario: Check start button for user with balance in Finhay Wallet
      Given User has "50000" balance in Finhay Wallet
      When User click button "Bắt đầu tích lũy"
      Then Verify display CDxM products choosing list

    Scenario: First time deposit fail in CDxM product due to insufficient fund in Finhay Wallet
      When User choose first product
      Then Verify display deposit screen
      And Enter deposit amount of "60000"
      Then Verify button continue CDXM deposit is disabled
      And Verify "Nạp túi Finhay" button is displayed
      Then Click deposit finhay wallet CTA button
      And Input "50000" into deposit bar
      And Click button continue
      And Click button confirm deposit
      Then Verify display transaction detail screen

    Scenario: First time deposit fail in CDxM product due to
      When User choose first product
      Then Verify display deposit screen
      And Enter deposit amount of "50000"
      And Click button continue CDXM deposit
      And Click button confirm CDXM deposit
      Then Verify deposit CDXM success screen displayed

    Scenario: First time deposit success in CDxM product
      When User choose first product
      Then Verify display deposit screen
      And Enter deposit amount of "50000"
      And Click button continue CDXM deposit
      And Click button confirm CDXM deposit
      Then Verify deposit CDXM success screen displayed
