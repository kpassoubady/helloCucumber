@api
Feature: Get the price


  @get-price-using-api
  Scenario: Verify the get price api
    Given I'm on the develop environment "https://develop.kavinschool.com/"
    When I provide valid credentials
    And I pass the course name
    Then I should get a price information
