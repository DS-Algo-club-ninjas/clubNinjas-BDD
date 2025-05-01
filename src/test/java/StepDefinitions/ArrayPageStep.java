package StepDefinitions;

import org.testng.Assert;
import PageObject.ArrayPageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ArrayPageStep {
	
	ArrayPageObject arrayPageObj = new ArrayPageObject();
	HomePageObject homePageObj = new HomePageObject();
	LoginPageObject loginPageObj = new LoginPageObject();
	ExcelReader readExcel = new ExcelReader();

	
	@Given("The user is on the Home page and clicks Sign In")
	public void the_user_is_on_the_home_page_and_clicks_sign_in() {
		
		homePageObj.click_getStarted_btn();
		loginPageObj.clickSignInLink();
		LoggerLoad.info("SignIn Page is displayed");
	   
	}
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
	    String currentTitle = arrayPageObj.get_currentPageTitle();
	    LoggerLoad.info(currentTitle+ " page is displayed");
	}

	@When("The user clicks the Get Started button in Array Panel")
	public void the_user_clicks_the_get_started_button_in_array_panel() {
		arrayPageObj.click_arrayGetStarted_btn();
	    
	}

	@Then("The user should be directed to ARRAY Data Structure Page")
	public void the_user_should_be_directed_to_array_data_structure_page() {
		System.out.println("Array ds page");
		String expPageTitle = "Array";
		String actPageTitle = arrayPageObj.get_currentPageTitle();
		Assert.assertEquals(expPageTitle,actPageTitle);
	}

	@When("The user select Array item from the drop down menu")
	public void the_user_select_array_item_from_the_drop_down_menu() {
	    arrayPageObj.click_dataStructutrDropDown();
	    arrayPageObj.select_arrayDropDown();
	}

	@Given("The user is in the Array page after Sign in")
	public void the_user_is_in_the_array_page_after_sign_in() {
		arrayPageObj.click_arrayGetStarted_btn();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}

	@When("The user clicks Arrays in Python button")
	public void the_user_clicks_arrays_in_python_button() {
	    arrayPageObj.click_arraysInPython_link();
	    
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		String expPageTitle = "Arrays in Python";
		String actPageTitle = arrayPageObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	    
	}

	@Given("The user is in the Arrays in Python page")
	public void the_user_is_in_the_arrays_in_python_page() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_arraysInPython_link();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user clicks Try Here button in Arrays in Python page")
	public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
		arrayPageObj.click_tryHere_btn();
	}

	@Then("The user should be redirected to a page having a try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {
		String expPageTitle = "Assessment";
		String actPageTitle = arrayPageObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	    
	}

	@Given("The user is in the Arrays in Python tryEditor page")
	public void the_user_is_in_the_arrays_in_python_try_editor_page() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_arraysInPython_link();
		arrayPageObj.click_tryHere_btn();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user enters {string} and {int} clicks the Run Button in tryEditor page")
	public void the_user_enters_and_clicks_the_run_button_in_try_editor_page(String sheetName, Integer rowNumber) {
	    String[] value = readExcel.excelDataRead(sheetName, rowNumber);
	    arrayPageObj.enterCodeTryEditor(value[0]);
	    arrayPageObj.click_tryHereRun_btn();
	    
	}

	@Then("The user should able to see a error message from {string} and {int}")
	public void the_user_should_able_to_see_a_error_message_from_and(String sheetName, Integer rowNumber) {
	    System.out.println("Try Editor run invalid");
	    String[] value = readExcel.excelDataRead(sheetName, rowNumber);
	    String errorMsg = value[1];
	    arrayPageObj.acceptAlert(errorMsg);
	    
	}

	@Then("The user should able to see output in the console from {string} and {int}")
	public void the_user_should_able_to_see_output_in_the_console_from_and(String sheetName, Integer rowNumber) {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
	    String expOutput = value[1];
	    System.out.println("OutputCode from excel " +expOutput);
	    String actOutput = arrayPageObj.get_tryHereEditor_output();
	    System.out.println("Output from webpage " +actOutput);
	    Assert.assertEquals(actOutput,expOutput);	   
	}


	@When("The user clicks Practice Questions button")
	public void the_user_clicks_practice_questions_button() {
	    arrayPageObj.click_practiceQns_link();	    
	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		String expPageTitle = "Practice Questions";
		String actPageTitle = arrayPageObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	    
	}

	@Given("The user is on the Practice question page of Arrays in Python page")
	public void the_user_is_on_the_practice_question_page_of_arrays_in_python_page() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_arraysInPython_link();
		arrayPageObj.click_practiceQns_link();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
	    arrayPageObj.click_searchTheArray_link();
	    
	}

	@Then("The user should be redirected to Question page of Search the array link")
	public void the_user_should_be_redirected_to_question_page_of_search_the_array_link() {
		String expPageURL = "https://dsportalapp.herokuapp.com/question/1";
		String actPageURL = arrayPageObj.get_currentPageURL();
		Assert.assertEquals(actPageURL,expPageURL);
	    
	}

	@Given("The user is on the practice question editor of Search the array question")
	public void the_user_is_on_the_practice_question_editor_of_search_the_array_question() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_arraysInPython_link();
		arrayPageObj.click_practiceQns_link();
		arrayPageObj.click_searchTheArray_link();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user write the invalid code from {string} and {int} in Editor and click the Run Button")
	public void the_user_write_the_invalid_code_from_and_in_editor_and_click_the_run_button(String sheetName, Integer rowNumber) {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
	    arrayPageObj.enterCodeTryEditor(value[0]);
	    arrayPageObj.click_tryHereRun_btn();
	    
	}

	@Then("The user should able to see error message in alert window from {string} and {int}")
	public void the_user_should_able_to_see_error_message_in_alert_window_from_and(String sheetName, Integer rowNumber) {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
	    String expOutput = value[1];
	    System.out.println("OutputCode from excel " +expOutput);
	    arrayPageObj.acceptAlert(expOutput);
	    
	}

	@When("The user write the valid code from {string} and {int} in Editor and click the Run Button")
	public void the_user_write_the_valid_code_from_and_in_editor_and_click_the_run_button(String sheetName, Integer rowNumber)  {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
	    arrayPageObj.enterCodeTryEditor(value[0]);
	    arrayPageObj.click_tryHereRun_btn();
	    
	}

	@When("The user write the code from {string} and {int} in Editor and Click the Submit Button")
	public void the_user_write_the_code_from_and_in_editor_and_click_the_submit_button(String sheetName, Integer rowNumber)  {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
	    arrayPageObj.enterCodeTryEditor(value[0]);
	    arrayPageObj.click_submit_btn();
	    
	}

	@Then("The user should see a message from {string} and {int}")
	public void the_user_should_see_a_message(String sheetName, Integer rowNumber) {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
	    String expOutput = value[1];
	    System.out.println("OutputCode from excel " +expOutput);
	    String actOutput = arrayPageObj.get_tryHereEditor_output();
	    System.out.println("Output from webpage " +actOutput);
	    Assert.assertEquals(actOutput,expOutput);
	    
	}


	@When("The user clicks the Max Consecutive Ones link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
		arrayPageObj.click_maxConsOnes_link();
	    
	}

	@Then("The user should be redirected to Question page of Max Consecutive Ones link")
	public void the_user_should_be_redirected_to_question_page_of_max_consecutive_ones_link() {
		String expPageURL = "https://dsportalapp.herokuapp.com/question/2";
		String actPageURL = arrayPageObj.get_currentPageURL();
		Assert.assertEquals(actPageURL,expPageURL);
	    
	}

	@Given("The user is on the practice question editor of Max Consecutive Ones question")
	public void the_user_is_on_the_practice_question_editor_of_max_consecutive_ones_question() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_arraysInPython_link();
		arrayPageObj.click_practiceQns_link();
		arrayPageObj.click_maxConsOnes_link();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		//System.out.println(currentTitle);
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}


	@When("The user clicks the Find Numbers with Even Number of Digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
		arrayPageObj.click_findNumbers_link();
	    
	}

	@Then("The user should be redirected to Question page of Find Numbers with Even Number of Digits link")
	public void the_user_should_be_redirected_to_Question_page_of_Find_Numbers_with_Even_Number_of_Digits_link() {
		String expPageURL = "https://dsportalapp.herokuapp.com/question/3";
		String actPageURL = arrayPageObj.get_currentPageURL();
		Assert.assertEquals(actPageURL,expPageURL);
	    
	}

	@Given("The user is on the practice question editor of Find Numbers with Even Number of Digits question")
	public void the_user_is_on_the_practice_question_editor_of_find_numbers_with_even_number_of_digits_question() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_arraysInPython_link();
		arrayPageObj.click_practiceQns_link();
		arrayPageObj.click_findNumbers_link();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}


	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
		arrayPageObj.click_sqrsOfArray_link();
	    
	}
	
	@Then("The user should be redirected to Question page of Squares of a Sorted Array link")
	public void the_user_should_be_redirected_to_Question_page_of_Squares_of_a_Sorted_Array_link() {
		String expPageURL = "https://dsportalapp.herokuapp.com/question/4";
		String actPageURL = arrayPageObj.get_currentPageURL();
		Assert.assertEquals(actPageURL,expPageURL);
	    
	}
	
	@Given("The user is on the practice question editor of Squares of a Sorted Array question")
	public void the_user_is_on_the_practice_question_editor_of_squares_of_a_sorted_array_question() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_arraysInPython_link();
		arrayPageObj.click_practiceQns_link();
		arrayPageObj.click_sqrsOfArray_link();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}


	@When("The user clicks Arrays Using List button")
	public void the_user_clicks_arrays_using_list_button() {
	    arrayPageObj.click_arraysUsingList_link();
	    
	}

	@Then("The user should be redirected to Arrays Using List page")
	public void the_user_should_be_redirected_to_arrays_using_list_page() {
		String expPageTitle = "Arrays Using List";
		String actPageTitle = arrayPageObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	    
	}

	@Given("The user is in the Arrays Using List page")
	public void the_user_is_in_the_arrays_using_list_page() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_arraysUsingList_link();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user clicks Try Here button in Arrays Using List page")
	public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
		arrayPageObj.click_tryHere_btn();
	    
	}

	@Given("The user is in the tryEditor page of Arrays Using List")
	public void the_user_is_in_the_try_editor_page_of_arrays_using_list() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_arraysUsingList_link();
		arrayPageObj.click_tryHere_btn();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}


	@When("The user clicks Basic Operations in Lists button")
	public void the_user_clicks_basic_operations_in_lists_button() {
	    arrayPageObj.click_basicOperationsInLists_link();
	    
	}

	@Then("The user should be redirected to Basic Operations in Lists page")
	public void the_user_should_be_redirected_to_basic_operations_in_lists_page() {
		String expPageTitle = "Basic Operations in Lists";
		String actPageTitle = arrayPageObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	    
	}

	@Given("The user is in the Basic Operations in Lists page")
	public void the_user_is_in_the_basic_operations_in_lists_page() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_basicOperationsInLists_link();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user clicks Try Here button in Basic Operations in Lists page")
	public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() {
		arrayPageObj.click_tryHere_btn();
	    
	}

	@Given("The user is in the tryEditor page of Basic Operations in Lists")
	public void the_user_is_in_the_try_editor_page_of_basic_operations_in_lists() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_basicOperationsInLists_link();
		arrayPageObj.click_tryHere_btn();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}


	@When("The user clicks Applications of Array button")
	public void the_user_clicks_applications_of_array_button() {
		arrayPageObj.click_applicationsOfArray_link();
	    
	}

	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
		String expPageTitle = "Applications of Array";
		String actPageTitle = arrayPageObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	    
	}

	@Given("The user is in the Applications of Array page")
	public void the_user_is_in_the_applications_of_array_page() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_applicationsOfArray_link();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user clicks Try Here button in Applications of Array page")
	public void the_user_clicks_try_here_button_in_applications_of_array_page() {
		arrayPageObj.click_tryHere_btn();
	    
	}

	@Given("The user is in the tryEditor page of Applications of Array")
	public void the_user_is_in_the_try_editor_page_of_applications_of_array() {
		arrayPageObj.click_arrayGetStarted_btn();
		arrayPageObj.click_applicationsOfArray_link();
		arrayPageObj.click_tryHere_btn();
		String currentTitle = arrayPageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

}
