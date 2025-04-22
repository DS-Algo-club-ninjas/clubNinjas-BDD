package StepDefinitions;

import org.openqa.selenium.WebDriver;

import PageObject.ArrayPageObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayPageStep {
	WebDriver driver;
	ArrayPageObject arrayPageObj;
	
	public ArrayPageStep() {
		ArrayPageObject arrayPageObj = new ArrayPageObject();
		this.arrayPageObj = arrayPageObj;
	}
	
	@Given("The user is on the Home page and clicks Sign In")
	public void the_user_is_on_the_home_page_and_clicks_sign_in() {
		
		arrayPageObj.click_getStarted_btn();
		arrayPageObj.click_signIn_btn();
	   
	}

	@When("The user gets data from excel sheet for the login page")
	public void the_user_gets_data_from_excel_sheet_for_the_login_page() {
		arrayPageObj.enter_username();
		arrayPageObj.enter_password();
		arrayPageObj.click_login_btn();
	}

	@Then("The user should login successfully")
	public void the_user_should_login_successfully() {
	    
	}
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
	    
	}

	@When("The user clicks the Get Started button in Array Panel")
	public void the_user_clicks_the_get_started_button_in_array_panel() {
		arrayPageObj.click_arrayGetStarted_btn();
	    
	}

	@Then("The user should be directed to ARRAY Data Structure Page")
	public void the_user_should_be_directed_to_array_data_structure_page() {
		System.out.println("Array ds page");
	    
	}

	@When("The user select Array item from the drop down menu")
	public void the_user_select_array_item_from_the_drop_down_menu() {
	    
	    
	}

	@Given("The user is in the Array page after Sign in")
	public void the_user_is_in_the_array_page_after_sign_in() {
	    
	    
	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
	    
	    
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
	    
	    
	}

	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
	    
	    
	}

	@When("The user clicks Try Here button in Arrays in Python page")
	public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
	    
	    
	}

	@Then("The user should be redirected to a page having a try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {
	    
	    
	}

	@Given("The user is in the Arrays in Python tryEditor page")
	public void the_user_is_in_the_arrays_in_python_try_editor_page() {
	    
	    
	}

	@When("The user enters {string} and {int} clicks the Run Button in tryEditor page")
	public void the_user_enters_and_clicks_the_run_button_in_try_editor_page(String string, Integer int1) {
	    
	    
	}

	@Then("The user should able to see a error message from {string} and {int}")
	public void the_user_should_able_to_see_a_error_message_from_and(String string, Integer int1) {
	    
	    
	}

	@Then("The user should able to see output in the console from {string} and {int}")
	public void the_user_should_able_to_see_output_in_the_console_from_and(String string, Integer int1) {
	    
	    
	}

	@Given("The user is in the Arrays in Python page")
	public void the_user_is_in_the_arrays_in_python_page() {
	    
	    
	}

	@When("The user clicks Practice Questions button")
	public void the_user_clicks_practice_questions_button() {
	    
	    
	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
	    
	    
	}

	@Given("The user is on the Practice question page of Arrays in Python page")
	public void the_user_is_on_the_practice_question_page_of_arrays_in_python_page() {
	    
	    
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
	    
	    
	}

	@Then("The user should be redirected to Question page of Search the array link")
	public void the_user_should_be_redirected_to_question_page_of_search_the_array_link() {
	    
	    
	}

	@Given("The user is on the practice question editor of Search the array question")
	public void the_user_is_on_the_practice_question_editor_of_search_the_array_question() {
	    
	    
	}

	@When("The user write the invalid code from {string} and {int} in Search the array question Editor and click the Run Button")
	public void the_user_write_the_invalid_code_from_and_in_search_the_array_question_editor_and_click_the_run_button(String string, Integer int1) {
	    
	    
	}

	@Then("The user should able to see error message in alert window from {string} and {int}")
	public void the_user_should_able_to_see_error_message_in_alert_window_from_and(String string, Integer int1) {
	    
	    
	}

	@When("The user write the valid code from {string} and {int} in Search the array question Editor and click the Run Button")
	public void the_user_write_the_valid_code_from_and_in_search_the_array_question_editor_and_click_the_run_button(String string, Integer int1) {
	    
	    
	}

	@When("The user write the code from {string} and {int} in Search the array question Editor and Click the Submit Button")
	public void the_user_write_the_code_from_and_in_search_the_array_question_editor_and_click_the_submit_button(String string, Integer int1) {
	    
	    
	}

	@Then("The user see an error message {string}")
	public void the_user_see_an_error_message(String string) {
	    
	    
	}

	@When("The user write the valid code from {string} and {int} in Search the array Editor and Click the Submit Button")
	public void the_user_write_the_valid_code_from_and_in_search_the_array_editor_and_click_the_submit_button(String string, Integer int1) {
	    
	    
	}

	@Then("The user see success message {string}")
	public void the_user_see_success_message(String string) {
	    
	    
	}

	@When("The user clicks the Max Consecutive Ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
	    
	    
	}

	@Then("The user should be redirected to Question page of Max Consecutive Ones link")
	public void the_user_should_be_redirected_to_question_page_of_max_consecutive_ones_link() {
	    
	    
	}

	@Given("The user is on the practice question editor of Max Consecutive Ones question")
	public void the_user_is_on_the_practice_question_editor_of_max_consecutive_ones_question() {
	    
	    
	}

	@When("The user write the invalid code from {string} and {int} in Max Consecutive Ones question Editor and click the Run Button")
	public void the_user_write_the_invalid_code_from_and_in_max_consecutive_ones_question_editor_and_click_the_run_button(String string, Integer int1) {
	    
	    
	}

	@When("The user write the valid code from {string} and {int} in Max Consecutive Ones question Editor and click the Run Button")
	public void the_user_write_the_valid_code_from_and_in_max_consecutive_ones_question_editor_and_click_the_run_button(String string, Integer int1) {
	    
	    
	}

	@When("The user write the code from {string} and {int} in Max Consecutive Ones question Editor and Click the Submit Button")
	public void the_user_write_the_code_from_and_in_max_consecutive_ones_question_editor_and_click_the_submit_button(String string, Integer int1) {
	    
	    
	}

	@When("The user write the valid code from {string} and {int} in Max Consecutive Ones Editor and Click the Submit Button")
	public void the_user_write_the_valid_code_from_and_in_max_consecutive_ones_editor_and_click_the_submit_button(String string, Integer int1) {
	    
	    
	}

	@When("The user clicks the Find Numbers with Even Number of Digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
	    
	    
	}

	@Then("The user should be redirected to Question page contains a question,and try Editor with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
	    
	    
	}

	@Given("The user is on the practice question editor of Find Numbers with Even Number of Digits question")
	public void the_user_is_on_the_practice_question_editor_of_find_numbers_with_even_number_of_digits_question() {
	    
	    
	}

	@When("The user write the invalid code from {string} and {int} in Find Numbers with Even Number of Digits question Editor and click the Run Button")
	public void the_user_write_the_invalid_code_from_and_in_find_numbers_with_even_number_of_digits_question_editor_and_click_the_run_button(String string, Integer int1) {
	    
	    
	}

	@When("The user write the valid code from {string} and {int} in Find Numbers with Even Number of Digits question Editor and click the Run Button")
	public void the_user_write_the_valid_code_from_and_in_find_numbers_with_even_number_of_digits_question_editor_and_click_the_run_button(String string, Integer int1) {
	    
	    
	}

	@When("The user write the code from {string} and {int} in Find Numbers with Even Number of Digits question Editor and Click the Submit Button")
	public void the_user_write_the_code_from_and_in_find_numbers_with_even_number_of_digits_question_editor_and_click_the_submit_button(String string, Integer int1) {
	    
	    
	}

	@When("The user write the valid code from {string} and {int} in Find Numbers with Even Number of Digits Editor and Click the Submit Button")
	public void the_user_write_the_valid_code_from_and_in_find_numbers_with_even_number_of_digits_editor_and_click_the_submit_button(String string, Integer int1) {
	    
	    
	}

	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
	    
	    
	}

	@Given("The user is on the practice question editor of Squares of a Sorted Array question")
	public void the_user_is_on_the_practice_question_editor_of_squares_of_a_sorted_array_question() {
	    
	    
	}

	@When("The user write the invalid code from {string} and {int} in Squares of a Sorted Array question Editor and click the Run Button")
	public void the_user_write_the_invalid_code_from_and_in_squares_of_a_sorted_array_question_editor_and_click_the_run_button(String string, Integer int1) {
	    
	    
	}

	@When("The user write the valid code from {string} and {int} in Squares of a Sorted Array question Editor and click the Run Button")
	public void the_user_write_the_valid_code_from_and_in_squares_of_a_sorted_array_question_editor_and_click_the_run_button(String string, Integer int1) {
	    
	    
	}

	@When("The user write the code from {string} and {int} in Squares of a Sorted Array question Editor and Click the Submit Button")
	public void the_user_write_the_code_from_and_in_squares_of_a_sorted_array_question_editor_and_click_the_submit_button(String string, Integer int1) {
	    
	    
	}

	@When("The user write the valid code from {string} and {int} in Squares of a Sorted Array Editor and Click the Submit Button")
	public void the_user_write_the_valid_code_from_and_in_squares_of_a_sorted_array_editor_and_click_the_submit_button(String string, Integer int1) {
	    
	    
	}

	@When("The user clicks Arrays Using List button")
	public void the_user_clicks_arrays_using_list_button() {
	    
	    
	}

	@Then("The user should be redirected to Arrays Using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
	    
	    
	}

	@Given("The user is on the Arrays Using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
	    
	    
	}

	@When("The user clicks Try Here button in Arrays Using List page")
	public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
	    
	    
	}

	@Given("The user is in the tryEditor page of Arrays Using List")
	public void the_user_is_in_the_try_editor_page_of_arrays_using_list() {
	    
	    
	}

	@Given("The user is in the Arrays Using List page")
	public void the_user_is_in_the_arrays_using_list_page() {
	    
	    
	}

	@When("The user clicks Basic Operations in Lists button")
	public void the_user_clicks_basic_operations_in_lists_button() {
	    
	    
	}

	@Then("The user should be redirected to Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
	    
	    
	}

	@Given("The user is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
	    
	    
	}

	@When("The user clicks Try Here button in Basic Operations in Lists page")
	public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() {
	    
	    
	}

	@Given("The user is in the tryEditor page of Basic Operations in Lists")
	public void the_user_is_in_the_try_editor_page_of_basic_operations_in_lists() {
	    
	    
	}

	@Given("The user is in the Basic Operations in Lists page")
	public void the_user_is_in_the_basic_operations_in_lists_page() {
	    
	    
	}

	@When("The user clicks Applications of Array button")
	public void the_user_clicks_applications_of_array_button() {
	    
	    
	}

	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
	    
	    
	}

	@Given("The user is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
	    
	    
	}

	@When("The user clicks Try Here button in Applications of Array page")
	public void the_user_clicks_try_here_button_in_applications_of_array_page() {
	    
	    
	}

	@Given("The user is in the tryEditor page of Applications of Array")
	public void the_user_is_in_the_try_editor_page_of_applications_of_array() {
	    
	    
	}

	@Given("The user is in the Applications of Array page")
	public void the_user_is_in_the_applications_of_array_page() {
	    
	    
	}

	

}
