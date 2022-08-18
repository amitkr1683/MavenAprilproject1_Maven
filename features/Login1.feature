Feature: Login

@Test
Scenario: Successful Login with valid credentials

 Given user Launch Chrome Browser
 When user opens URL "https://admin-demo.nopcommerce.com/login"
 And user enters Email as "admin@yourstore.com" and passwords as "admin"
 And click on Login
 Then page Title Should be "Dashboard / nonCommerce administration"
 When user click on Logout link
 Then page title should be "Your store. Login"
 And close browser