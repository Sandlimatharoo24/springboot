package stepDefinition;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefNew {
	

    @Given("^user navigates to SOFTWARETESTINGHELP $")
    public void user_navigates_to_softwaretestinghelpcom() throws Throwable {
    	assertTrue(true);
    }

    @When("^user logs in using Username as (.+) and Password (.+)$")
    public void user_logs_in_using_username_as_and_password(String username, String password) throws Throwable {
    	assertTrue(true);
    }

    @Then("^login should be successful$")
    public void login_should_be_successful() throws Throwable {
    	assertTrue(true);
    }

}
