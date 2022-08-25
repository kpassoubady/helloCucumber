package com.osticket.step.definitions;

import hooks.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Api {

    public Api(DriverFactory driverFactory) {
        System.out.println(driverFactory.getValue());
    }

    @Given("I'm on the develop environment {string}")
    public void iMOnTheDevelopEnvironment(String arg0) {
    }

    @When("I provide valid credentials")
    public void iProvideValidCredentials() {
    }

    @And("I pass the course name")
    public void iPassTheCourseName() {
    }

    @Then("I should get a price information")
    public void iShouldGetAPriceInformation() {
    }
}
