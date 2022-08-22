package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelStepDefinitions {
    @Given("I am on the site")
    public void iAmOnTheSite() {
    }

    @When("I set the location to {string}")
    public void iSetTheLocationTo(String arg0) {
    }

    @And("I select Hotel {string}")
    public void iSelectHotel(String arg0) {
    }

    @And("I select Room type {string}")
    public void iSelectRoomType(String arg0) {
    }

    @Then("the search results in an error message")
    public void theSearchResultsInAnErrorMessage() {
    }
}
