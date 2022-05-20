Feature: As an User, I want to perform authentication

  Scenario Outline: User login to the application
    Given user on login page
    When user input email "<email>"
    And user input password "<pw>"
    And Tap login Button
    Then Verify user success login status

    Examples:
      | email | pw |
      |asa    |asa |
      |z      |z   |
