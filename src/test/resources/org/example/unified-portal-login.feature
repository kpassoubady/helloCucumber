Feature: Validation of login

  Scenario: Valid Login
    Given I go to unified portal Url
    And I verify the title "Login" exist
    When I type email "kangs@socotra.com" in the unified portal
    And I type password "ksjhakjsdh" in the form
    And I click login button on the form
    Then I expect to be logged in
    And I verify the title "Logged In" exist