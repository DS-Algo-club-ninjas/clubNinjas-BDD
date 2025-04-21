package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStep {
	
	@Given("The user clicks the Sign In link")
	public void the_user_clicks_the_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user gets data from excel sheet {string} and {int} for the login page")
	public void the_user_gets_data_from_excel_sheet_and_for_the_login_page(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The error message appears below Username and Password textbox like {string}")
	public void the_error_message_appears_below_username_and_password_textbox_like(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user gets invalid data from excel sheet {string} and {int} for the login page")
	public void the_user_gets_invalid_data_from_excel_sheet_and_for_the_login_page(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The user should be able to see an error message {string}")
	public void the_user_should_be_able_to_see_an_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
