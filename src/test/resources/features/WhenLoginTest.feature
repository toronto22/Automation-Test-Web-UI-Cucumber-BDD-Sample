@cucumber
Feature: Login

  Scenario: login successfully with valid username and password
    When user login with username and password
    Then user is navigated to inventory page
