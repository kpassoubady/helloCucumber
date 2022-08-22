@data
Feature: Scenario Template

  Background:
    Given I'm on Kavin school website

  Scenario Template:
    When I'm click on the "<buttonName>" button
    Then verify that the "<pageName>" will get loaded

    Examples:
      | buttonName | pageName  |
      | home       | home page |
      | news       | News page |

  Scenario Outline:
    When I type "<searchText>" in the search input field
    Then I verify the "<resultText>" shows up in the results page

    Examples:
      | searchText | resultText                                 |
      | Selenium   | Selenium 4.0 is released about a year back |
      | Cypress    | Cypress does not support Safari yet        |

