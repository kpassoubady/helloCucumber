@data
Feature: Scenario Outline and Scenario Template Example
  Many scenarios can be added in a single feature file

  # Scenarios does not allow for a background with only scenario
  # When Scenarios given if you use Background then Scenario Outline: with Examples are expected

    Background: This is the background
      Given I'm on Kavin school website


  Scenario Outline: I have to check valid login
    When I type valid user id "<userId>"
    And I type valid password "<password>"
    And I click sign in
    Then I verify I have logged in
    Examples:
      | userId | password  |
      | home   | home page |
      | news   | News page |

  Scenario Template: I have to check invalid login
    When I type valid user id "<userId>"
    And I type invalid password "<password>"
    And I click sign in
    Then I verify that I have not logged in

    Examples:
      | userId | password  |
      | home   | home page |
      | news   | News page |

  Scenario Outline: I have to check forgot password after typing user id
    When I type valid user id "<userId>"
    And I type valid password "<password>"
    And I click forgot password link
    Then I verify I have pre-loaded with user id
    Examples:
      | userId | password  |
      | home   | home page |
      | news   | News page |

  Scenario Outline: I have to check forgot password without typing user id
    When I click forgot password link
    Then I verify that I have not logged in
    When I check my email
    Then I have shown the user id "<userId>"
    And I have shown encrypted "<password>"
    Examples:
      | userId | password  |
      | home   | home page |
      | news   | News page |


    Scenarios:  Happy path for credentials scenario

  Scenario: Log in with wrong credentials
    When I log in with the wrong credentials
    Then I should get a message

  Scenario: Log in with right credentials
    When I log in with the right credentials
    Then I should login


  Scenario Outline: I have to check forgot password without typing user id
    When I click forgot password link
    Then I verify that I have not logged in
    When I check my email
    Then I have shown the user id "<userId>"
    And I have shown encrypted "<password>"
    Examples:
      | userId | password  |
      | home   | home page |
      | news   | News page |
