Feature:Test the login functionality of OrangeHRM

  Scenario: Test the valid login

    Given User is on login page
    When User enters user name and password
    And User clicks on Login button
    Then User should land on Home Page