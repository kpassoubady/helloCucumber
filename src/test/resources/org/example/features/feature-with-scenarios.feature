@simple
Feature: Many scenarios can be added in a single feature file


  Scenarios: Many scenarios follows when I login

  Scenario: Log in with wrong credentials
    When I log in with the wrong credentials
    Then I should get a message

  Scenario: Log in with right credentials
    When I log in with the right credentials
    Then I should login