Feature: Cucumber expressions

  Scenario: searching colors
    Given I am on the google site
    When I search for a red
    Then I must get a result with that red
    And I can have 1 row in the result page
    But I will have 100 rows in the results page