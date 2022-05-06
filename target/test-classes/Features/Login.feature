Feature: Validate the login functionality of Adactin hotel app

  Scenario: Validate the login functionality of Adactin hotel app with valid credentials
    Given launch the browser
    And open the application
    When enter the username and password
    And click the login button
    Then Validate the outcomes
    And close the browser