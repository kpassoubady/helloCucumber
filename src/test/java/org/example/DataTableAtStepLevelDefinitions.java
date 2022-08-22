package org.example;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class DataTableAtStepLevelDefinitions {
    @When("the following table is transposed:")
    public void the_following_table_is_transposed(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists();
        for (List<String> row : rows) {
            System.out.println("row = " + row);
            for (String col : row) {
                System.out.println("col = " + col);
            }
        }
    }

    @Then("it should be:")
    public void it_should_be(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists();
        for (List<String> row : rows) {
            System.out.println("row = " + row);
            for (String col : row) {
                System.out.println("col = " + col);
            }
        }
    }
}
