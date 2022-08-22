package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RulesStepDefinitions {
    @Given("there are {int} {double} coins inside")
    public void thereAreCoinsInside(Integer totalNumber, Double coins) {
        System.out.println("RulesStepDefinitions.thereAreCoinsInside");
        System.out.println("totalNumber = " + totalNumber + ", coins = " + coins);
        
    }

    @When("the customer tries to buy a {double} chocolate with a {int} coin")
    public void theCustomerTriesToBuyAChocolateWithACoin(Double double1, Integer int1) {
        
        
    }

    @Then("the sale should not happen")
    public void theSaleShouldNotHappen() {
        
        
    }

    @Given("there are {int} chocolates inside")
    public void thereAreChocolatesInside(Integer int1) {
        
        
    }

    @Then("the customer's change should be {int} {double} coin")
    public void theCustomerSChangeShouldBeCoin(Integer int1, Double double1) {
        
        
    }

    @Given("there are no chocolates inside")
    public void thereAreNoChocolatesInside() {
        
        
    }
}
