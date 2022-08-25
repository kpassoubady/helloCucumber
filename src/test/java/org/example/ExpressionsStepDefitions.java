package org.example;

import common.Color;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExpressionsStepDefitions {
    @When("I search for a {color}")
    public void iSearchForA(Color color) {
        System.out.println(color);
    }

    @Then("I must get a result with that {color}")
    public void iMustGetAResultWithThat(Color color) {
        System.out.println(color);
    }

    @And("I can/will have {int} row(s) in the result(s) page(s)")
    public void iCanHaveRowInTheResult(int row) {
        System.out.println("ExpressionsStepdefs.iCanHaveRowInTheResult");
        System.out.println("row = " + row);
    }
}
