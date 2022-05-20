Feature: As an User, I want to register new account

  Scenario Outline: User in register page

    Given user on register page
    When user input Email "<email>"
    And user input Name "<name>"
    And user input Password "<pw>"
    Then Tap register button

    Examples:
      | name | email |pw|
      |ihsan |       |ihsan|
      | ihsan     |ihsaan@email.com    |ihsan    |