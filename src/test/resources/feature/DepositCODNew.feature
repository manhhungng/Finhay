@NewUserDepositCOD
  Feature: Check COD deposit flow for new user

    Scenario: Input deposit number below minimum number
      Given Click COD card in the home screen
      When Click button Bắt đầu tích lũy
      And I input amount "49999"
      Then Verify continue button is disable

    Scenario: Input deposit number exceed maximum number
      Given Click COD card in the home screen
      When Click button Bắt đầu tích lũy
      And I input amount "1000000000000"
      Then Verify continue button is disable

    Scenario: Input valid deposit number
      Given Click COD card in the home screen
      When Click button Bắt đầu tích lũy
      And I input amount "50000"
      Then Verify continue button is enable

