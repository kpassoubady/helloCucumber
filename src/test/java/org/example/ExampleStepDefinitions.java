package org.example;

import hooks.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleStepDefinitions {

    public ExampleStepDefinitions(DriverFactory driverFactory) {
        System.out.println("ExampleStepDefinitions.ExampleStepDefinitions");
        System.out.println("driverFactory = " + driverFactory.getValue());

    }

    @Given("an example scenario")
    public void anExampleScenario() {

    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {

    }

    @Then("the scenario passes")
    public void theScenarioPasses() {

    }

}
