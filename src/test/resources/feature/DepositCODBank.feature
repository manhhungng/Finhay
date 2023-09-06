@DepositCOD
Feature: Check deposit for COD

  Scenario: Check Saving No Date success old User
    Given I Click button Skips
    When I Click button Login in welcome screen
    And I input email "0987654322"
    And I input password1 "Ab@12345"
    And I click button Login
    And I click button Saving Old Home
    And I click button Saving No Date Old Home
    And I click button More Deposit
    And I input amount "50000"
    And I click button continue deposit
    And I click button bank transfer
    And I click button Payment
    Then Verify display receiver bank is "VPBANK (khuyên dùng)"


  Scenario: Check new user Deposit saving no date success
    Given I click button Close Guide deposit Screen
    When I Click to Avatar
    And I Click button Logout
    And I Click button OK
    And I Click button Login in welcome screen
    And I input email "0984962691"
    And I input password1 "Ab@12345"
    And I click button Add Deposit new Home
    And I input amount in new home is "100000"
    And I click button continue deposit new home
    Then Verify display receiver bank is "VPBANK (khuyên dùng)"

  Scenario: Check new user Deposit saving no date success
    Given I click button Close Guide deposit Screen
    When I click icon convert in new home
    And I click convert to saving three month
    And I input amount convert is "100000"
    And I click button continue convert
    And I click button confirm convert
    And I input pass for convert is "Ab@12345"
    And I click button completed convert
    Then Verify convert success "Chuyển đổi thành công"

  Scenario: Check new user Deposit saving no date success
    Given I click button ok in screen convert success
    When I click icon convert in new home
    And I click convert to saving twelve month
    And I input amount convert is "100000"
    And I click button continue convert
    And I click button confirm convert
    And I input pass for convert is "Ab@12345"
    And I click button completed convert
    Then Verify convert success "Chuyển đổi thành công"

  Scenario: Check new user Deposit saving no date success
    Given I click button ok in screen convert success
    When I click icon convert in new home
    And I click convert to fund investment
    And I click convert to turtle Hoan Kiem
    And I input amount convert is "100000"
    And I click button continue convert
    And I click button confirm convert
    And I input pass for convert is "Ab@12345"
    And I click button completed convert
    Then Verify convert success "Chuyển đổi thành công"


  Scenario: Reset app
    And Reset app









#  Scenario: Check screen saving
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    And I input email "johnterry268328@finhay.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I Click to button skip active account
#    And I click to button confirm skip
#    And I click button looking for more information
#    And I click button continue
#    And I click button continue
#    And I click button continue
#    Then verify saving total is "0"
#    And verify text saving no date "Tích lũy không kỳ hạn"
#    And verify text start from "Bắt đầu chỉ từ 50.000"
#
#  Scenario: Check when click saving no date
#    When I click button saving no date
#    Then Verify display total vnd saving no date is "0"
#    And Verify display button start saving
#
#  Scenario: Check when click button start saving ( User not active)
#    When I click button start saving
#    And I click button continue saving
#    Then Display text cannot deposit "Bạn phải kích hoạt số điện thoại hoặc email để có thể nạp tiền"
#    And Display button active now
#
#  Scenario: Check when click button active now
#    When I click button active now
#    And I click button phone number
#    And I click button resend OTP SMS
#    And I click button submit in popup
#    And I click button ok in popup error message
#    And I input OTP textbox is "000000"
#    And I click  button Active Now
#    And Click button return page
#    And I click button continue saving
#    Then Verify textbox amount display
#    And Verify button one million vnd display
#    And Verify button five million vnd  display
#    And Verify button ten million vnd display
#    And button continue deposit disable
#
#  Scenario: Check input amount < 50.000 vnd
#    When I input amount "49000"
#    Then button continue deposit disable
#
#  Scenario: Check input amount > 500.000.000 vnd
#    When I input amount "500000001"
#    Then button continue deposit disable
#
#  Scenario: Check input amount = 50.000 vnd
#    When I input amount "50000"
#    Then button continue deposit enable
#
#  Scenario: Check input amount = 500000000 vnd
#    When I input amount "500000000"
#    Then button continue deposit enable
#
#  Scenario: Check click button amount = 1000000 vnd
#    When I click button one million vnd
#    Then Verify textbox amount is "1.000.000đ"
#
#
#  Scenario: Check click button continue deposit
#    When I click button continue deposit
##    Then verify payment method bank transfer display
##    And  Verify payment method momo display
#
#  Scenario: Check click button bank transfer
#    When I click button bank transfer
#    Then Display amount deposit is "1.000.000đ"
#    And Display fee transfer is "0đ"
#    And Display total deposit is "1.000.000đ"
#    And Display button confirm transaction
#
#  Scenario: Check when click button confirm transaction
#    When I click button confirm transaction
#    Then Verify notice guide is "Hãy để Finhay hướng dẫn bạn cách chuyển khoản nhé."
#
#  Scenario: Check when click button skip guide
#    When I click button skip guide
#    Then Verify amount deposit "1.000.000đ"
#    And Verify bank accept is "VPBank"
#    And Verify account number "65227467368"
##    And Verify receiver "CTCP FINHAY VIET NAM"
#    And Display button copy in account number
#    And Display button copy in transfer content
#    And Display notice transfer content is "*Thiếu thông tin này, Finhay sẽ không thể nhận ra khoản tiền đến từ Nguyen Oanh"
#
##  Scenario: Check click tooltip receiver
##    When I click icon tooltip receiver
##    Then Verify content tooltip display "Tài khoản này được Finhay kết hợp với VPBank để tạo riêng cho bạn nên nó sẽ mang tên bạn. Mỗi khi bạn chuyển tiền đến tài khoản này, Finhay sẽ tự động nhận ra và đưa tiền của bạn đến đúng yêu cầu nạp tiền của bạn."
#
##  Scenario: Check click tab TCB bank
##    Given I click close tooltip
##    When I click tab Techcombank
##    Then Verify amount deposit "1.000.000 đ"
##    And Verify bank accept is "VPBank"
##    And Verify account number "19031109316699"
##    And Verify receiver "CTCP FINHAY VIET NAM"
##    And Display button copy in account number
##    And Display button copy in transfer content
##    And Display notice transfer content is "*Thiếu thông tin này, Finhay sẽ không thể nhận ra khoản tiền đến từ Nguyen Oanh"
#
#  Scenario: Check click tab VCB
#    When I click tab Vietcombank
#    Then Verify amount deposit "1.000.000đ"
#    And Verify bank accept is "Vietcombank"
#    And Verify account number "0491000135587"
#    And Verify receiver "CTCP FINHAY VIET NAM"
#    And Display button copy in account number
#    And Display button copy in transfer content
#    And Display notice transfer content is "*Thiếu thông tin này, Finhay sẽ không thể nhận ra khoản tiền đến từ Nguyen Oanh"
#
#  Scenario: Check when click button Close
#    When I click button close
#    Then Verify your request display is "1"
#
#  Scenario: Check history saving
#    When I click menu exchange
#    And I click tab saving history
#    Then Verify display text deposit saving history "Nạp tiền-Tích lũy"
#    And Verify display text amount history "+1.000.000"
#    And Verify display text status history "Chưa thanh toán"
#
#  Scenario: Check history saving no date deposit
#    When I click button deposit history
#    Then Verify display text deposit saving history "Nạp tiền-Tích lũy"
#    And Verify display text amount history "+1.000.000"
#    And Verify display text status history "Chưa thanh toán"
#
#
#  Scenario: Check when click button saving more
#    Given I click home page menu
#    When I click button saving more
#    Then Display saving no date is "1"
##        And Display notice when bank transfer "Nếu bạn đã chuyển khoản, hãy kiểm tra lại thông tin và chờ trong ít phút"
##        And Display notice when complete "Khi giao dịch hoàn thành, Finhay sẽ gửi thông báo đến bạn"
#
#  Scenario: Check when click icon menu
#    Given I click button saving no date in request
#    And I click button no display
#    And I click icon menu
#    Then Display category Payment Guide
#    Then Display category Error report
#    Then Display category Cancel this order
#
#  Scenario: Check when click cancel this order
#    When I click button Cancel this order
#    Then verify message popup "Bạn không thể hoàn thành giao dịch đã hủy sau này nếu muốn. Bạn chắc chắn muốn hủy chứ?"
#
#  Scenario: Check when click confirm cancel
#    When I click button confirm cancel
#    Then verify message popup "Hủy giao dịch thành công"
#
#  Scenario: Check when cancel order
#    Given I click button ok in popup
#    When Click button back home page
#    Then No display button saving more
#
#  Scenario: Check deposit history when cancel transaction
#    When I click menu exchange
#    And I click tab saving history
#    Then Verify no display text deposit saving history
#
#
#  Scenario: Check when click icon add
#    Given I delete transaction just cancel
#    When I click icon add
#    And I click button saving
#    And I click button saving no date
#    And I click button start saving
#    And I click button continue saving
#    And I click button five million
#    And I click button continue deposit
#    And I click button bank transfer
#    When I click button confirm transaction
##        And I click button no display
#    When I click button close
#    Then Verify your request display is "1"
#
#  Scenario: Check transfer bank successful but < 5000000
#    When I transfer bank successful is one million
#    When  I click menu exchange
#    Then Verify status in database is "2"
##   And Verify popup first saving success is  "Yay! Chúc mừng!"
#
##  Scenario: Check click continue saving in popup
##    When I click continue saving in popup
##    Then Verify textbox amount display
#
##  Scenario: Check history deposit when success
##   When I click button back from deposit screen
#   And I click tab saving history
#   And I click button deposit history
##    When I click detail transaction history
##      Then Verify status detail is "Tiếp nhận và đang xử lý"
##      And Verify text received request is "Finhay đã nhận yêu cầu của bạn"
##    And Verify amount was deposit is "1.000.000"
##    And Verify payment type is "Ngân hàng"
##    And Verify status type is "Đã mua"
###      And Verify contract is "FINHAY-CD000030"
###      And Verify rate is "4.0%/năm"
###      And Verify display button support
###      And Display total deposit is "Tổng: 1.000.000"
##
##
##      Scenario: Check click button Support
##        When I click button Support
##        Then Verify display bank process is "Ngân hàng đang xử lý"
##        And Verify text check account number received money "Kiểm tra số tài khoản nhận tiền"
##        And Verify text Reason other "Lý do khác. Gửi tin nhắn cho Finhay"
##
##  Scenario: Check display 1.000.000 in home screen
##    Given I click button back from deposit screen
#  # And I click button back from deposit screen
#   When I click home page menu
#  Then Verify display value in saving is "1.000.000"
##
##  Scenario: Check click saving in home
##    When I click button saving in home
##    Then verify saving total is "1.000.000"
##    And Verify provisional interest is "0"
##    And Verify interest received is "0"
##
##  Scenario: Check click button saving no date when deposit
##    When I click button saving no date
##    Then display button deposit more
##    And display button allocation
##    And display button transfer
##    And display button withdraw
##
##  Scenario:  Check deposit > 500000000 vnd
##    When I click button deposit more
##    And I click button five million
##    And I click button continue deposit
##    And I click button bank transfer
##    And I click button confirm transaction
##  #  And I click button no display
##    And I click button close
##    And I order by in database in cod transaction table
##    And I call API transfer success
##    And I click menu exchange
##    Then Verify display text amount history "+1.000.000"
##
## # Scenario: Check when click button deposit history
## #   When I click tab saving history
##  #And I click button deposit history
##  # And Verify display text amount history "+499.000.000"
##
##  Scenario: Check return homepage
##    When I click home page menu
##    Then Verify display amount invest is "1.000.000"
##    And Verify display value in saving is "500.000.000"
##
##  Scenario: Check click button saving in home when deposit >= 500.000.000 vnd
##    When I click button saving in home
##    And I click button saving no date
##    And I click button deposit more
##    Then verify message popup "Tổng số tiền tích lũy tối đa 500.000.000đ. Bạn không thể tạo thêm yêu cầu tích lũy. Hãy hoàn thành hoặc hủy các yêu cầu trước đó"
##
##  Scenario: Check user have withdrawn all the money
##    Given I click button ok in popup
##    And I click button back from saving no date
##    And I click button back from saving no date
##    And I Click to Avatar
##    And I Click button Logout
##    And I Click button OK
##    And I Click button Login in welcome screen
##    And I input phone "0985802363"
##    And I input password1 "Ab@12345"
##    And I click button Login
##    When I click button saving in home
##    And I click button continue
##    And I click button continue
##    And I click button continue
##    Then Verify display total vnd saving no date is "0"
##    When I click button saving no date
##    Then display button deposit more
##    And display button transfer
##    And display button withdraw
##
# Scenario: Reset user
##    Given I click button back from saving no date
##    And I click button back from saving no date
##    And I Click to Avatar
##    And I Click button Logout
##    And I Click button OK
#    When Reset user
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
