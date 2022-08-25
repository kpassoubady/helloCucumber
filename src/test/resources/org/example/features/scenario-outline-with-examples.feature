@data
Feature: Hotel check out

  Scenario Outline: verify whether the check-out date field accepts a later date than check-in date
    Given I am on the site
    When I set the location to "<location>"
    And I select Hotel "<hotels>"
    And I select Room type "<roomType>"
    Then the search results in an error message

    Examples:
      | location | hotels         | roomType |
      | Sydney   | Hotel Creek    | Standard |
      | London   | Hotel Sunshine | Double   |
