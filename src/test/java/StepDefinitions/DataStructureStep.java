package StepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObject.DataStructurePageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructureStep {

	WebDriver driver;
	DataStructurePageObject dataStructurePageObj;
	HomePageObject homePageObj = new HomePageObject();
	LoginPageObject loginPageObj = new LoginPageObject();
	ExcelReader readExcel = new ExcelReader();

	public DataStructureStep() {
		DataStructurePageObject dataStructurePageObj = new DataStructurePageObject();
		this.dataStructurePageObj = dataStructurePageObj;

	}

	@Given("DS The user is in the Home page after logged in")
	public void ds_the_user_is_in_the_home_page_after_logged_in() {
		dataStructurePageObj.click_getStarted_btn();
		dataStructurePageObj.click_signIn_btn();
	}

	@When("DS The user gets data from excel to login button in Data Structures - Introduction")
	public void ds_the_user_clicks_the_button_in_data_structures_introduction(String sheetName, Integer rowNumber)
			throws IOException {
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
		dataStructurePageObj.enter_userNameTxtBox(credentials[0]);
		dataStructurePageObj.enter_passwordTxtBox(credentials[1]);
		dataStructurePageObj.click_login_btn();

	}

	@Then("DS The user should login")
	public void ds_the_user_should_land_in(String string) {

	}

	@Given("DS The user is in the Home page")
	public void ds_the_user_is_in_the_page(String string) {
		String currentTitle = dataStructurePageObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle + " page is displayed");

	}

	@When("The user clicks the \"Get Started\" button in Data Structures - Introduction")
	public void the_user_clicks_the_get_started_in_data_structures_introduction() {

		dataStructurePageObj.click_dataStructuresGetStarted_btn();

	}

	@When("The user clicks the Time Complexity button")
	public void the_user_clicks_the_time_complexity_button() {

		dataStructurePageObj.click_timeComplexity_btn();
		System.out.println("**********Time complexity:");

	}

	@Given("The user is in the \"Time Complexity\" page")
	public void the_user_is_in_the_try_editor_page() {

	}

	@Then("The user should be redirected to {string} in Data structures-Introduction")
	public void the_user_should_be_redirected_to_in_data_structures_introduction(String expPageTitle) {
		String actPageTitle = dataStructurePageObj.get_currentPageTitle();
		Assert.assertEquals(expPageTitle, actPageTitle);

	}

	@Given("The user is in the {string} page in Data structures-Introduction")
	public void the_user_is_in_the_page_in_data_structures_introduction(String string) {
		if ("Data Structures-Introduction".equals(string)) {
			dataStructurePageObj.click_dataStructuresGetStarted_btn();
			String actPageTitle = dataStructurePageObj.get_currentPageTitle();
			Assert.assertEquals(string, actPageTitle);
		} else if ("Time Complexity".equals(string)) {
			dataStructurePageObj.click_dataStructuresGetStarted_btn();
			dataStructurePageObj.click_timeComplexity_btn();
			String actPageTitle = dataStructurePageObj.get_currentPageTitle();
			Assert.assertEquals(string, actPageTitle);
		} else if ("Practice Questions".equals(string)) {
			dataStructurePageObj.click_dataStructuresGetStarted_btn();
			dataStructurePageObj.click_timeComplexity_btn();
			dataStructurePageObj.click_practiceQns_link();
			String actPageTitle = dataStructurePageObj.get_currentPageTitle();
			Assert.assertEquals(string, actPageTitle);
		} else if ("Assessment".equals(string)) {
			dataStructurePageObj.click_dataStructuresGetStarted_btn();
			dataStructurePageObj.click_timeComplexity_btn();
			dataStructurePageObj.click_tryHere_btn();
			String actPageTitle = dataStructurePageObj.get_currentPageTitle();
			Assert.assertEquals(string, actPageTitle);
		}
	}

	@When("The user clicks the Practice Questions button in Time Complexity page")
	public void the_user_clicks_the_practice_questions_button_in_time_timecomplexity_page() {
		dataStructurePageObj.click_practiceQns_link();
	}

	@When("The user clicks the first practice question in Practice Questions page")
	public void the_user_clicks_the_first_practice_question_in_practice_questions_page() {
		dataStructurePageObj.click_first_practiceQn_link();

	}

	@When("The user clicks the Try here button in Time Complexity page")
	public void the_user_clicks_the_try_here_button_in_time_complexity_page() {

		dataStructurePageObj.click_tryHere_btn();

	}
	
	
	@When("The user clicks the Run button in Data structures-Introductio tryEditor page")
	public void the_user_clicks_the_try_run_button_in_time_complexity_try_editor_page() {

		dataStructurePageObj.click_tryHereRun_btn();

	}

	@When("The user enters {string} and {int} clicks the Run Button in Time Complexity tryEditor page")
	public void the_user_enters_and_clicks_the_run_button_in_time_complexity_try_editor_page(String sheetName,
			Integer rowNumber) {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
		dataStructurePageObj.enterCodeTryEditor(value[1]);
		dataStructurePageObj.click_tryHereRun_btn();

	}

	@Then("The user should able to see a error message from {string} and {int} on Time Complexity tryEditor popup")
	public void the_user_should_able_to_see_a_error_message_from_and_on_time_complexity_try_editor_popup(
			String sheetName, Integer rowNumber) {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
		String errorMsg = value[0];
		dataStructurePageObj.acceptAlert(errorMsg);

	}

	@Then("The user should able to see output in the console from {string} and {int} in Time Complexity tryEditor page")
	public void the_user_should_able_to_see_output_in_the_console_from_and_in_time_complexity_try_editor_page(
			String sheetName, Integer rowNumber) {

		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
		String expOutput = value[0];
		String actOutput = dataStructurePageObj.get_tryHereEditor_output();
		Assert.assertEquals(actOutput, expOutput);

	}

}
