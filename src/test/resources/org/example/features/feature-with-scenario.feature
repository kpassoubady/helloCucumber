@simple
Feature: To verify login

  To verify valid login
  Details
  1. Launch hotel reservation application using URL as in test data.
  2. Login to the application using username and password as in test data.
  User:{test username}
  Password:{test password}
  User should login to the application

  Scenario: verify valid login
    Given I am on the google site
    When I log in with my credentials
    Then I am logged in

  Scenario: Log in with wrong credentials
    Given I am on the google site
    When I log in with the wrong credentials
    Then I should get a message
