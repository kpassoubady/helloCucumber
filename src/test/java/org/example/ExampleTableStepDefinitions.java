package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExampleTableStepDefinitions {
    @Given("there are {int} cucumbers")
    public void thereAreCucumbers(Integer start) {
        System.out.println("ExampleTableStepDefinitions.thereAreCucumbers");
        System.out.println("start = " + start);
    }

    @When("I eat {int} cucumbers")
    public void iEatCucumbers(Integer eat) {
        System.out.println("ExampleTableStepDefinitions.iEatCucumbers");
        System.out.println("eat = " + eat);
    }

    @Then("I should have {int} cucumbers")
    public void iShouldHaveCucumbers(Integer left) {
        System.out.println("ExampleTableStepDefinitions.iShouldHaveCucumbers");
        System.out.println("left = " + left);
    }

    @When("I eat banana cucumbers")
    public void iEatBananaCucumbers() {
        System.out.println("ExampleTableStepDefinitions.iEatBananaCucumbers");
    }

    @Then("I should have apple cucumbers")
    public void iShouldHaveAppleCucumbers() {
        System.out.println("ExampleTableStepDefinitions.iShouldHaveAppleCucumbers");
    }

    @Given("there is\\/are <start> cucumber\\(s)")
    public void thereIsAreStartCucumberS() {
    }

    @When("I eat\\/ate <eat> cucumber\\(s)")
    public void iEatAteEatCucumberS() {
    }

    @Then("I must\\/should have left with <left> cucumber\\(s)")
    public void iMustShouldHaveLeftWithLeftCucumberS() {
    }
}
