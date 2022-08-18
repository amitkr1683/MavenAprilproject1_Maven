Feature: Login Feature

  @Test
Scenario: Verify user is able to login

  Given user enters username and password
  When user click Login
  Then Welcome Page should be displayed

    @Test2
    Scenario Outline: Validate calculator API Add Service
      Given <num1> and <num2> are updated in request xml
      When add service is called
      Then response should match <result>

      Examples:
      |num1| num2 |result|
      |2   |5     |7     |