package com.osticket;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FormCheckStepDefinitions {
    @Then("I verify that the title is {string}")
    public void iVerifyThatTheTitleIs(String title) {
    }

    @When("I clicked on the Open New Ticket button")
    public void iClickedOnTheOpenNewTicketButton() {

    }

    @Then("I will wait for {string} text to shows")
    public void iWillWaitForTextToShows(String textToWait) {
        System.out.println("FormCheckStepDefinitions.iWillWaitForTextToShows");
        System.out.println("textToWait = " + textToWait);
    }

    @When("I checked the Full Name {string} label exist")
    public void iCheckedTheFullNameLabelExist(String fullName) {
        System.out.println("FormCheckStepDefinitions.iCheckedTheFullNameLabelExist");
        System.out.println("fullName = " + fullName);
    }

    @Then("I type first name {string} value")
    public void iTypeFirstNameValue(String firstName) {
        System.out.println("FormCheckStepDefinitions.iTypeFirstNameValue");
        System.out.println("firstName = " + firstName);
    }

    @When("I checked the Email Address {string} label exist")
    public void iCheckedTheEmailAddressLabelExist(String email) {
        System.out.println("FormCheckStepDefinitions.iCheckedTheEmailAddressLabelExist");
        System.out.println("email = " + email);
    }

    @Then("I type email address {string} value")
    public void iTypeEmailAddressValue(String email) {
        System.out.println("FormCheckStepDefinitions.iTypeEmailAddressValue");
        System.out.println("email = " + email);
    }

    @When("I checked the Telephone {string} and Extension {string} label exist")
    public void iCheckedTheTelephoneAndExtensionLabelExist(String tel, String ext) {
        System.out.println("FormCheckStepDefinitions.iCheckedTheTelephoneAndExtensionLabelExist");
        System.out.println("tel = " + tel + ", ext = " + ext);
    }

    @Then("I type telephone {string} and {string} value")
    public void iTypeTelephoneAndValue(String tel, String ext) {
        System.out.println("FormCheckStepDefinitions.iTypeTelephoneAndValue");
        System.out.println("tel = " + tel + ", ext = " + ext);
    }

    @When("I checked the Help Topic {string} label exist")
    public void iCheckedTheHelpTopicLabelExist(String helpTopic) {
        System.out.println("FormCheckStepDefinitions.iCheckedTheHelpTopicLabelExist");
        System.out.println("helpTopic = " + helpTopic);
    }

    @Then("I type select a help topic {string} from dropdown")
    public void iTypeSelectAHelpTopicFromDropdown(String helpTopic) {
        System.out.println("FormCheckStepDefinitions.iTypeSelectAHelpTopicFromDropdown");
        System.out.println("helpTopic = " + helpTopic);
    }

    @When("I checked the subject {string} label exist")
    public void iCheckedTheSubjectLabelExist(String arg0) {
    }

    @Then("I type a subject {string} value")
    public void iTypeASubjectValue(String arg0) {
    }

    @When("I checked the message {string} label exist")
    public void iCheckedTheMessageLabelExist(String arg0) {
    }

    @Then("I type a message {string} value")
    public void iTypeAMessageValue(String arg0) {
    }

    @And("I click on the Submit Ticket button")
    public void iClickOnTheSubmitTicketButton() {
    }

    @When("I waited for a new created message shows up with {string}")
    public void iWaitedForANewCreatedMessageShowsUpWith(String arg0) {
    }

    @And("I verify that the message contains first name {string} and email address {string}")
    public void iVerifyThatTheMessageContainsFirstNameAndEmailAddress(String firstName, String email) {
        System.out.println("FormCheckStepDefinitions.iVerifyThatTheMessageContainsFirstNameAndEmailAddress");
        System.out.println("firstName = " + firstName + ", email = " + email);
    }

    @And("I verify that the header shows as {string}")
    public void iVerifyThatTheHeaderShowsAs(String arg0) {
    }

    @And("I verify the top right corner shows as {string}")
    public void iVerifyTheTopRightCornerShowsAs(String arg0) {
    }

    @And("I verify the message in the middle shows with {string}")
    public void iVerifyTheMessageInTheMiddleShowsWith(String arg0) {
    }
}
