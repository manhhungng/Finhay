@DepositCDXM
  Feature: Deposit balance for CDXM products

    Scenario:  User input insufficient deposit amount when deposit from CDxM product page
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      When Click CdxM card
      Then Verify display CDxM home screen
      And I choose Tích lũy siêu khủng CDxM product
      And  I click deposit more in CDxM product screen
      When Input deposit amount of "49999"
      Then Verify continue button is disable

#    Scenario:  User input insufficient deposit amount when deposit from convert button in home screen
#      Given I Click button Skips
#      When I Click button Login in welcome screen
#      And I input email "0985802493"
#      And I input password1 "Ab@12345"
#      And I click button Login
#      When Click Home Convert button
#      Then Verify display
#      And I choose Tích lũy siêu khủng CDxM product
#      And  I click deposit more in CDxM product screen
#      When Input deposit amount of "49999"
#      Then Verify continue button is disable

    Scenario:  User input insufficient deposit amount for the product when deposit from CdxM home
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      And Click CdxM card
      Then Verify display CDxM home screen
      And I click CDxM Tích lũy ngay button
      And I choose Tích lũy siêu khủng CDxM product in the bottom sheet
      When Input deposit amount of "49999"
      Then Verify continue button is disable

    Scenario:  User input exceed maximum deposit amount when deposit from CDxM product page
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      When Click CdxM card
      Then Verify display CDxM home screen
      And I choose Tích lũy siêu khủng CDxM product
      And  I click deposit more in CDxM product screen
      When Input deposit amount of "5000001"
      Then Verify continue button is disable

    Scenario:  User input exceed maximum amount when deposit from convert button in home screen
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      When Click Home Convert button
      Then Verify display
      And I choose Tích lũy siêu khủng CDxM product
      And  I click deposit more in CDxM product screen
      When Input deposit amount of "5000001"
      Then Verify continue button is disable

    Scenario:  User input exceed maximum deposit amount for the product when deposit from CdxM home
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      And Click CdxM card
      Then Verify display CDxM home screen
      And I click CDxM Tích lũy ngay button
      And I choose Tích lũy siêu khủng CDxM product in the bottom sheet
      When Input deposit amount of "5000001"
      Then Verify continue button is disable

    Scenario:  User input exceed available balance in cash account when deposit from CDxM product page
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      And Click CdxM card
      Then Verify display CDxM home screen
      And I choose Tích lũy siêu khủng CDxM product
      And  I click deposit more in CDxM product screen
      When Input deposit amount of "20000000"
      Then Verify continue button is disable

    Scenario:  User input exceed maximum amount when deposit from convert button in home screen
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      When Click Home Convert button
      Then Verify display
      And I choose Tích lũy siêu khủng CDxM product
      And  I click deposit more in CDxM product screen
      When Input deposit amount of "20000000"
      Then Verify continue button is disable

    Scenario:  User input exceed available balance in cash account when deposit from CdxM home
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      And Click CdxM card
      Then Verify display CDxM home screen
      And I click CDxM "Tích lũy ngay" button
      And I choose "Tích lũy siêu khủng" CDxM product in the bottom sheet
      When Input deposit amount of "20000000"
      Then Verify continue button is disable

    Scenario:  User input valid number and deposit success when deposit from CDxM product page
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      And Click CdxM card
      Then Verify display CDxM home screen
      And I click CDxM "Tích lũy ngay" button
      And I choose "Tích lũy siêu khủng" CDxM product in the bottom sheet
      When Input deposit amount of "50000"
      Then Verify confirmation screen displayed
      And Verify final

    Scenario:  User input valid number and deposit success when deposit from convert button in home screen
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      When Click Home Convert button
      Then Verify display
      And I choose Tích lũy siêu khủng CDxM product
      And  I click deposit more in CDxM product screen
      When Input deposit amount of "50000"
      Then Verify confirmation screen displayed
      And Verify final


    Scenario:  User input valid number and deposit success when deposit from CdxM home
      Given I Click button Skips
      When I Click button Login in welcome screen
      And I input email "0985802493"
      And I input password1 "Ab@12345"
      And I click button Login
      And Click CdxM card
      Then Verify display CDxM home screen
      And I choose "Tích lũy siêu khủng" CDxM product in the bottom sheet
      When Input deposit amount of "50000"
      Then Verify confirmation screen displayed
      And Verify final


