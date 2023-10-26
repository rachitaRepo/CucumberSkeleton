Feature: User Login
  Register user should be able to login to access details

  ## background is for common statement as Given prereq, remove Given from all scenarios
  Background: Given User is at Login Page

  Scenario Outline: Login with Valid credential
    ##  Given User is at Login Page
    When Enter the Valid email address <emailAddress>
    And Enter the valid password <password>
    And Click on Login button
    Then User should login successfully

    Examples: 
      | emailAddress     | password |
      | test01@test.com  | test01   |
      | test001@test.com | test001  |

  Scenario Outline: Login with Invalid credential
    ##    Given User is at Login Page
    When Enter the Invalid email add <invalidEmail>
    And Enter the Invalid password <invalidPass>
    And Click on Login button
    Then User should get warning message Warning: "No match for E-Mail Address and/or Password."

    Examples: 
      | invalidEmail     | invalidPass |
      | test001@test.com | test078     |
      | test000@test.com | test006     |
      | test067@test.com | test056     |

  Scenario: Login with valid email and invalid password
    ##     Given User is at Login Page
    When Enter the Valid email address "test01@test.com"
    And Enter the Invalid password "test001"
    And Click on Login button
    Then User should get warning message Warning: "No match for E-Mail Address and/or Password."

  Scenario: Login with Invalid email and valid password
    ##  Given User is at Login Page
    When Enter the Invalid email add "test001@test.com"
    And Enter the valid password "test01"
    And Click on Login button
    Then User should get warning message Warning: "No match for E-Mail Address and/or Password."

  Scenario: Login without providing any credential
    ##   Given User is at Login Page
    When User donot enters any credential
    And Click on Login button
    Then User should get warning message Warning: "No match for E-Mail Address and/or Password."
