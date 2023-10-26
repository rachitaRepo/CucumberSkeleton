@all
Feature: Registered User
  make Sure user is making registration successfull with / without mandatory fields

  @register @smoke
  Scenario: Register with all fields
    Given user is on Registration page
    ## DataTable for many input values
      When user enters below details
      | firstname       | rashi            |
      | lastName        | bhandari         |
      | emailAddress    | test091@test.com |
      | telephone       | 3434343343 |
      | password        | test091          |
      | confirmpassword | test091          |
    And user select the privacy Policy
    And user click on Continue button
    Then User should be able to register successfully with message display
