@rule
Feature: Rules with Scenarios
  You can place scenarios inside rules. This makes is possible to structure
  Gherkin documents in the same way as [example maps](https://cucumber.io/blog/bdd/example-mapping-introduction/).
  You can also use the Examples synonym for Scenario to make them even more similar.

  Rule: a sale cannot happen if change cannot be returned
    # sad path
    Scenario: no change
      Given there are 5 0.20 coins inside
      When the customer tries to buy a 0.85 chocolate with a 1 coin
      Then the sale should not happen

    # happy path
    Scenario Outline: exact change
      Given there are <totalNumberOfCoins> <coinType> coins inside
      And there are <numberOfChocolates> chocolates inside
      When the customer tries to buy a <chocolateBought> chocolate with a <customerCoins> coin
      Then the customer's change should be <changeCoins> <remainingAmount> coin

      Examples:
        | totalNumberOfCoins | numberOfChocolates | customerCoins | changeCoins | remainingAmount | coinType | chocolateBought |
        | 4                  | 1                  | 1             | 1           | 0.20            | 0.20     | 0.80            |
 #       | 8                  | 10                 | 5             | 2           | 0.20            | 0.20     | 0.80            |


  Rule: a sale cannot happen if we're out of stock
    # sad path
    Scenario: : no chocolates left
      Given there are no chocolates inside
      But there are 10 0.5 coins inside
      When the customer tries to buy a 0.85 chocolate with a 1 coin
      Then the sale should not happen
