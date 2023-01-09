Feature:Test the login functionality of OrangeHRM

  Scenario Outline: : Test the valid login

    Given User is on login page
    When User enters <username> and <password>
    And User clicks on Login button
    Then User should land on Home Page
    Examples:
    username|password|
    Admin|admin123|
    admin1|admin|