#@Loyalty
#Feature: Check level member
#  Scenario: Check new member have point = 0
#    Given I Click button Skips
#    When I Click button Login in welcome screen
#    When I input email "oanh.nguyen63@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I Click to button skip active account
#    And I click to button confirm skip
#    And I Click to Avatar
#    Then Verify display text new member "Thành viên mới"
#    And Verify display progress bar
#    And Verify display text suggest point "1001 điểm nữa để lên Thành viên đồng"
#    And Verify icon rank display
#
#  Scenario: Check click show detail level member
#    When  I click go to level member
#    Then Verify text level member display "Thành viên mới"
#    And Verify icon level display
#    And Verify point have value "0"
#    And display tool tip point info
#    And display tab my preference
#    And display tab Point history
#    And display progress bar
#    And display suggest point to next level "1001 điểm nữa để lên Thành viên đồng"
#
#  Scenario: Check click tool tip point information
#    When I click tool tip point
#    Then Verify total point value display "0"
#    And Verify display reward point display "0"
#    And Verify display friendly point display "0"
#    And I Click button close
#
#  Scenario: Check click bronze medal
#    Given I verify display request title "Yêu cầu xét hạng và quyền lợi"
#    When I click bronze medal
#    Then Verify unlook text "BẠN CHƯA MỞ HẠNG NÀY"
#
#  Scenario: Check click silver medal
#    When I click silver medal
#    Then Verify unlook text "BẠN CHƯA MỞ HẠNG NÀY"
#
#  Scenario: Check click gold medal
#    When I click gold medal
#    Then Verify unlook text "BẠN CHƯA MỞ HẠNG NÀY"
#
#  Scenario: Check request for rating and benefits
#    When I click new medal
#    And Verify display text level of user "BẠN ĐANG Ở HẠNG NÀY"
##    And Verify display text maintain fee "Phí bảo trì tài khoản: 0.09% (tối đa 1.100đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí rút"
##    And Verify display text transfer saving to investment "Chuyển từ Tích luỹ sang Đầu Tư: Miễn phí (Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario: Verify when login user = 1000 point
#    Given I click button back
#    And I Click button Logout
#    And I Click button OK
#    And I Click button Login in welcome screen
#    When I input email "oanh.nguyen65@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I Click to button skip active account
#    And I click to button confirm skip
#    And I Click to Avatar
#    Then Verify display text new member "Thành viên mới"
#    And Verify display progress bar
#    And Verify display text suggest point "1 điểm nữa để lên Thành viên đồng"
#    And Verify icon rank display
#
#  Scenario: Check click show detail level member
#    When  I click go to level member
#    Then Verify text level member display "Thành viên mới"
#    And Verify icon level display
#    And Verify point have value "1.000"
#    And display tool tip point info
#    And display tab my preference
#    And display tab Point history
#    And display progress bar
#    And display suggest point to next level "1 điểm nữa để lên Thành viên đồng"
#
#  Scenario: Check click tool tip point information
#    When I click tool tip point
#    Then Verify total point value display "1.000"
#    And Verify display reward point display "1.000"
#    And Verify display friendly point display "0"
#    And I Click button close
#
#  Scenario: Check click bronze medal
#    Given I verify display request title "Yêu cầu xét hạng và quyền lợi"
#    When I click bronze medal
#    Then Verify unlook text "BẠN CHƯA MỞ HẠNG NÀY"
#
#  Scenario: Check click silver medal
#    When I click silver medal
#    Then Verify unlook text "BẠN CHƯA MỞ HẠNG NÀY"
#
#  Scenario: Check click gold medal
#    When I click gold medal
#    Then Verify unlook text "BẠN CHƯA MỞ HẠNG NÀY"
#
#  Scenario: Verify when login user = 1001 point
#    Given I click button back
#    And I Click button Logout
#    And I Click button OK
#    And I Click button Login in welcome screen
#    When I input email "oanh.nguyen66@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#      ##And I Click to  button skip active account
#      ##And I click to  button confirm skip
#    And I Click to Avatar
#    Then Verify display text bronze member "Thành viên đồng"
#    And Verify display progress bar
#    And Verify display text suggest point "4000 điểm nữa để lên Thành viên bạc"
#    And Verify icon rank display
#
#  Scenario: Check click show detail level member
#    When  I click go to level member
#    Then Verify text level member display "Thành viên đồng"
#    And Verify icon level display
#    And Verify point have value "1.001"
#    And display tool tip point info
#    And display tab my preference
#    And display tab Point history
#    And display progress bar
#    And display suggest point to next level "4000 điểm nữa để lên Thành viên bạc"
#
#  Scenario: Check click tool tip point information
#    When I click tool tip point
#    Then Verify total point value display "1.001"
#    And Verify display reward point display "1.001"
#    And Verify display friendly point display "0"
#    And I Click button close
#
#  Scenario: Check click silver medal
#    Given I verify display request title "Yêu cầu xét hạng và quyền lợi"
#    When I click silver medal
#    Then Verify unlook text "BẠN CHƯA MỞ HẠNG NÀY"
#
#  Scenario: Check click gold medal
#    When I click gold medal
#    Then Verify unlook text "BẠN CHƯA MỞ HẠNG NÀY"
#
#  Scenario: Check request for rating and benefits
#    When I click new medal
#          ## Then Verify level point display text "Dưới 1.000  điểm"
#    And Verify display text level of user "BẠN ĐÃ MỞ HẠNG NÀY"
##    And Verify display text maintain fee "Phí bảo trì tài khoản: 0.09% (tối đa 1.100đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí rút"
##    And Verify display text transfer saving to investment "Chuyển từ Tích luỹ sang Đầu Tư: Miễn phí (Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario:  Check request for rating and benefits bronze medal
#    When I click bronze medal
#    And Verify display text level of user "BẠN ĐANG Ở HẠNG NÀY"
##    And Verify display text maintain fee bronzo "Phí bảo trì tài khoản: 0.09% (tối đa 2.200đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving bronze "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí"
##    And Verify display text transfer saving to investment bronze "Chuyển từ Tích luỹ sang Đầu Tư(Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text investment structure "Thêm cấu trúc đầu tư (Smart Portfolio)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario: Verify when login user = 5000 point
#    Given I click button back
#    And I Click button Logout
#    And I Click button OK
#    And I Click button Login in welcome screen
#    When I input email "oanh.nguyen67@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I Click to button skip active account
#    And I click to button confirm skip
#    When I Click to Avatar
#    Then Verify display text bronze member "Thành viên đồng"
#    And Verify display progress bar
#    And Verify display text suggest point "1 điểm nữa để lên Thành viên bạc"
#    And Verify icon rank display
#
#  Scenario: Check click show detail level member
#    When  I click go to level member
#    Then Verify text level member display "Thành viên đồng"
#    And Verify icon level display
#    And Verify point have value "5.000"
#    And display tool tip point info
#    And display tab my preference
#    And display tab Point history
#    And display progress bar
#    And display suggest point to next level "1 điểm nữa để lên Thành viên bạc"
#
#  Scenario: Check click tool tip point information
#    When I click tool tip point
#    Then Verify total point value display "5.000"
#    And Verify display reward point display "5.000"
#    And Verify display friendly point display "0"
#    And I Click button close
#
#  Scenario: Check click silver medal
#    Given I verify display request title "Yêu cầu xét hạng và quyền lợi"
#    When I click silver medal
#    Then Verify unlook text "BẠN CHƯA MỞ HẠNG NÀY"
#
#  Scenario: Check click gold medal
#    When I click gold medal
#    Then Verify unlook text "BẠN CHƯA MỞ HẠNG NÀY"
#
#  Scenario: Check request for rating and benefits
#    When I click new medal
#          ## Then Verify level point display text "Dưới 1.000  điểm"
#    And Verify display text level of user "BẠN ĐÃ MỞ HẠNG NÀY"
##    And Verify display text maintain fee "Phí bảo trì tài khoản: 0.09% (tối đa 1.100đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí rút"
##    And Verify display text transfer saving to investment "Chuyển từ Tích luỹ sang Đầu Tư: Miễn phí (Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario:  Check request for rating and benefits bronze medal
#    When I click bronze medal
#    And Verify display text level of user "BẠN ĐANG Ở HẠNG NÀY"
##    And Verify display text maintain fee bronzo "Phí bảo trì tài khoản: 0.09% (tối đa 2.200đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving bronze "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí"
##    And Verify display text transfer saving to investment bronze "Chuyển từ Tích luỹ sang Đầu Tư(Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text investment structure "Thêm cấu trúc đầu tư (Smart Portfolio)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario: Verify when login user = 5001 point
#    Given I click button back
#    And I Click button Logout
#    And I Click button OK
#    And I Click button Login in welcome screen
#    When I input email "oanh.nguyen68@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#     ## And I Click to  button skip active account
#      ##And I click to  button confirm skip
#    When I Click to Avatar
#    Then Verify display text silver member "Thành viên bạc"
#    And Verify display progress bar
#    And Verify display text suggest point "45000 điểm nữa để lên Thành viên vàng"
#    And Verify icon rank display
#
#  Scenario: Check click show detail level member
#    When  I click go to level member
#    Then Verify text level member display "Thành viên bạc"
#    And Verify icon level display
#    And Verify point have value "5.001"
#    And display tool tip point info
#    And display tab my preference
#    And display tab Point history
#    And display progress bar
#    And display suggest point to next level "45000 điểm nữa để lên Thành viên vàng"
#
#  Scenario: Check click tool tip point information
#    When I click tool tip point
#    Then Verify total point value display "5.001"
#    And Verify display reward point display "5.001"
#    And Verify display friendly point display "0"
#    And I Click button close
#
#  Scenario: Check request for rating and benefits
#    Given I verify display request title "Yêu cầu xét hạng và quyền lợi"
#    When I click new medal
#          ## Then Verify level point display text "Dưới 1.000  điểm"
#    And Verify display text level of user "BẠN ĐÃ MỞ HẠNG NÀY"
##    And Verify display text maintain fee "Phí bảo trì tài khoản: 0.09% (tối đa 1.100đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí rút"
##    And Verify display text transfer saving to investment "Chuyển từ Tích luỹ sang Đầu Tư: Miễn phí (Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario:  Check request for rating and benefits bronze medal
#    When I click bronze medal
#    And Verify display text level of user "BẠN ĐÃ MỞ HẠNG NÀY"
##    And Verify display text maintain fee bronzo "Phí bảo trì tài khoản: 0.09% (tối đa 2.200đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving bronze "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí"
##    And Verify display text transfer saving to investment bronze "Chuyển từ Tích luỹ sang Đầu Tư(Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text investment structure "Thêm cấu trúc đầu tư (Smart Portfolio)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario:  Check request for rating and benefits silver medal
#    When I click silver medal
#    And Verify display text level of user "BẠN ĐANG Ở HẠNG NÀY"
##    And Verify display text maintain fee silver "Phí bảo trì tài khoản: 0.07% (tối đa 7.700đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee silver "Phí rút đầu tư: Miễn phí sau 9 tháng"
##    And Verify display text transfer investment to saving silver "Chuyển Đầu tư sang Tích luỹ hoặc cấu trúc khác(0,1% thuế): 0,5% (1 lần chuyển/tháng)"
##    And Verify display text transfer saving to investment bronze "Chuyển từ Tích luỹ sang Đầu Tư(Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text investment structure "Thêm cấu trúc đầu tư (Smart Portfolio)"
##    And Verify display text saving product silver "Sản phẩm Tích luỹ: tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#      ##And Verify display text periodic transfer "Chuyển khoản định kỳ"
#
#  Scenario: Verify when login user = 50000 point
#    Given I click button back
#    And I Click button Logout
#    And I Click button OK
#    And I Click button Login in welcome screen
#    When I input email "oanh.nguyen69@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#    And I Click to button skip active account
#    And I click to button confirm skip
#    When I Click to Avatar
#    Then Verify display text silver member "Thành viên bạc"
#    And Verify display progress bar
#    And Verify display text suggest point "1 điểm nữa để lên Thành viên vàng"
#    And Verify icon rank display
#
#  Scenario: Check click show detail level member
#    When  I click go to level member
#    Then Verify text level member display "Thành viên bạc"
#    And Verify icon level display
#    And Verify point have value "50.000"
#    And display tool tip point info
#    And display tab my preference
#    And display tab Point history
#    And display progress bar
#    And display suggest point to next level "1 điểm nữa để lên Thành viên vàng"
#
#  Scenario: Check click tool tip point information
#    When I click tool tip point
#    Then Verify total point value display "50.000"
#    And Verify display reward point display "50.000"
#    And Verify display friendly point display "0"
#    And I Click button close
#  Scenario: Check request for rating and benefits
#    Given I verify display request title "Yêu cầu xét hạng và quyền lợi"
#    When I click new medal
#          ## Then Verify level point display text "Dưới 1.000  điểm"
#    And Verify display text level of user "BẠN ĐÃ MỞ HẠNG NÀY"
##    And Verify display text maintain fee "Phí bảo trì tài khoản: 0.09% (tối đa 1.100đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí rút"
##    And Verify display text transfer saving to investment "Chuyển từ Tích luỹ sang Đầu Tư: Miễn phí (Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario:  Check request for rating and benefits bronze medal
#    When I click bronze medal
#  And Verify display text level of user "BẠN ĐÃ MỞ HẠNG NÀY"
##    And Verify display text maintain fee bronzo "Phí bảo trì tài khoản: 0.09% (tối đa 2.200đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving bronze "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí"
##    And Verify display text transfer saving to investment bronze "Chuyển từ Tích luỹ sang Đầu Tư(Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text investment structure "Thêm cấu trúc đầu tư (Smart Portfolio)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario:  Check request for rating and benefits silver medal
#    When I click silver medal
#  And Verify display text level of user "BẠN ĐANG Ở HẠNG NÀY"
##    And Verify display text maintain fee silver "Phí bảo trì tài khoản: 0.07% (tối đa 7.700đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee silver "Phí rút đầu tư: Miễn phí sau 9 tháng"
##    And Verify display text transfer investment to saving silver "Chuyển Đầu tư sang Tích luỹ hoặc cấu trúc khác(0,1% thuế): 0,5% (1 lần chuyển/tháng)"
##    And Verify display text transfer saving to investment bronze "Chuyển từ Tích luỹ sang Đầu Tư(Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text investment structure "Thêm cấu trúc đầu tư (Smart Portfolio)"
##    And Verify display text saving product silver "Sản phẩm Tích luỹ: tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#      ##And Verify display text periodic transfer "Chuyển khoản định kỳ"
#
#  Scenario: Verify when login user = 50001 point
#    Given I click button back
#    And I Click button Logout
#    And I Click button OK
#    And I Click button Login in welcome screen
#    When I input email "oanh.nguyen70@finhay.com.vn"
#    And I input password1 "O@nhkim3010"
#    And I click button Login
#      ##And I Click to  button skip active account
#      ##And I click to  button confirm skip
#    And I Click to Avatar
#    Then Verify display text gold member "Thành viên vàng"
#
#  Scenario: Check click show detail level member
#    When  I click go to level member
#    Then Verify text level member display "Thành viên vàng"
#    And Verify icon level display
#    And Verify point have value "50.001"
#    And display tool tip point info
#    And display tab my preference
#    And display tab Point history
#
#
#  Scenario: Check click tool tip point information
#    When I click tool tip point
#    Then Verify total point value display "50.001"
#    And Verify display reward point display "50.001"
#    And Verify display friendly point display "0"
#    And I Click button close
#
#  Scenario: Check request for rating and benefits
#    Given I verify display request title "Yêu cầu xét hạng và quyền lợi"
#    When I click new medal
#          ## Then Verify level point display text "Dưới 1.000  điểm"
#    And Verify display text level of user "BẠN ĐÃ MỞ HẠNG NÀY"
##    And Verify display text maintain fee "Phí bảo trì tài khoản: 0.09% (tối đa 1.100đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí rút"
##    And Verify display text transfer saving to investment "Chuyển từ Tích luỹ sang Đầu Tư: Miễn phí (Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario:  Check request for rating and benefits bronze medal
#    When I click bronze medal
#    And Verify display text level of user "BẠN ĐÃ MỞ HẠNG NÀY"
##    And Verify display text maintain fee bronzo "Phí bảo trì tài khoản: 0.09% (tối đa 2.200đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee "Phí rút đầu tư: Miễn phí sau 18 tháng"
##    And Verify display text transfer investment to saving bronze "Chuyển từ Đầu tư sang Tích luỹ(0,1% thuế): Theo biểu phí"
##    And Verify display text transfer saving to investment bronze "Chuyển từ Tích luỹ sang Đầu Tư(Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text investment structure "Thêm cấu trúc đầu tư (Smart Portfolio)"
##    And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#
#  Scenario:  Check request for rating and benefits silver medal
#    When I click silver medal
#    And Verify display text level of user "BẠN ĐÃ MỞ HẠNG NÀY"
##    And Verify display text maintain fee silver "Phí bảo trì tài khoản: 0.07% (tối đa 7.700đ)/tháng"
##    And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
##    And Verify display text invest fee silver "Phí rút đầu tư: Miễn phí sau 9 tháng"
##    And Verify display text transfer investment to saving silver "Chuyển Đầu tư sang Tích luỹ hoặc cấu trúc khác(0,1% thuế): 0,5% (1 lần chuyển/tháng)"
##    And Verify display text transfer saving to investment bronze "Chuyển từ Tích luỹ sang Đầu Tư(Coming Soon)"
##    And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
##    And Verify display text investment structure "Thêm cấu trúc đầu tư (Smart Portfolio)"
##    And Verify display text saving product silver "Sản phẩm Tích luỹ: tiết kiệm chỉ từ 50.000đ"
##    And Verify display text protected product "Sản phẩm Bảo Vệ"
#      ##And Verify display text periodic transfer "Chuyển khoản định kỳ"
#
#  Scenario:  Check request for rating and benefits gold medal
#    When I click gold medal
#    Then Verify display text level of user "BẠN ĐANG Ở HẠNG NÀY"
#    ##  And Verify display text maintain fee gold "Phí bảo trì tài khoản: 0.05% (tối đa 22.000đ)/tháng"
#     ## And Verify display text withdrawl fee "Phí rút từ Tích luỹ: Miễn phí"
#
#    ##  Scenario: Check request for rating and benefits gold medal
#     ## And Verify display text invest fee gold "Phí rút đầu tư: Miễn phí sau 6 tháng"
#    ##  And Verify display text transfer investment to saving gold "Chuyển Đầu tư sang Tích luỹ hoặc cấu trúc khác(0,1% thuế): Miễn phí (1 lần chuyển/tháng)"
#    ##  And Verify display text transfer saving to investment bronze "Chuyển từ Tích luỹ sang Đầu Tư(Coming Soon)"
#     ## And Verify display text shopping cashback "Mua sắm hoàn tiền, tái tích lũy (Túi Ba Gang)"
#     ## And Verify display text investment structure "Thêm cấu trúc đầu tư (Smart Portfolio)"
#    ##  And Verify display text saving product "Sản phẩm Tích luỹ: Tiết kiệm chỉ từ 50.000đ"
#     ## And Verify display text protected product "Sản phẩm Bảo Vệ"
#     ## And Verify display text periodic transfer "Chuyển khoản định kỳ"
#     ## And Verify display text use priority "Ưu tiên sử dụng các sản phẩm mới"
#     ## And Verify display text optional "Tự chọn phân bổ theo ý muốn (Coming soon)"
#     ## And Verify display text support "Hỗ trợ Hotline: 1900 29 29 91"
#
#
#
