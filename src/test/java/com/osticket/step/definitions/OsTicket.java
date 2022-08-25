package com.osticket.step.definitions;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class OsTicket {

    @When("I'm on the home page of {string}")
    public void i_m_on_the_home_page_of(String string) {
        
    }
    @Then("I verify that the link {string} is present")
    public void i_verify_that_the_link_is_present(String string) {
        
    }

    @Then("I verify that the Open New Ticket button is present")
    public void i_verify_that_the_open_new_ticket_button_is_present() {
        
    }

    @Then("I verify that the Check Status button is present")
    public void i_verify_that_the_check_status_button_is_present() {
        
    }

    @Then("I verify the the menu button is present")
    public void iVerifyTheTheMenuButtonIsPresent() {
       assertTrue(5>7,"5>7 expression failed");
    }

}
