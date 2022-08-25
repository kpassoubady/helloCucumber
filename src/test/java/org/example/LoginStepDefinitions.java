package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions {
    @Given("I go to unified portal Url")
    public void iGoToUnifiedPortalUrl() {
    }

    @And("I verify the title {string} exist")
    public void iVerifyTheTitleExist(String arg0) {
    }

    @When("I type email {string} in the unified portal")
    public void iTypeEmailInTheUnifiedPortal(String arg0) {
    }

    @And("I type password {string} in the form")
    public void iTypePasswordInTheForm(String arg0) {
    }

    @And("I click login button on the form")
    public void iClickLoginButtonOnTheForm() {
    }

    @Then("I expect to be logged in")
    public void iExpectToBeLoggedIn() {
    }
}
