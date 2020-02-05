package cucumberStepsDeffinations;

import googleTet.GoogleTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CucumberStepsDefination {
    GoogleTest page = new GoogleTest();
    @Given("I am in google home")
    public void i_am_in_google_home() {
page.browserSetup();
page.geTTitle();

    }

    @Then("I am click Search and Write {string}")
    public void i_am_click_Search_and_Write(String value) {
        page.click(value);
        String actual = "Sleep";
        Assert.assertEquals(actual, value);
    }
    @Then("I am searching a {string}")
    public void i_am_searching_a(String value) {
        page.click(value);
    }

    @Then("i am searching:")
    public void i_am_searching(String table) {
        page.table(table);


    }



}








