Feature: Test a Login Functionality

  Scenario Outline: To Login with valid username and valid password
    Given User open the website and go to login page
    When  User fill "<username>" and "<password>" and Assert on login Title Text
    Then User should be see the Assertion on Login Title Text is successfully


    Examples:
      | username   | password   |
      | testAuto   | testing456 |