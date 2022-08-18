Feature: Test OrangeHRM smoke scenario

@Test
Scenario: Test login with valid credentials
Given Open the chrome and start application
When I enter valid username and valid password
Then User should be able to login succesfully after 10sec logout and teardown