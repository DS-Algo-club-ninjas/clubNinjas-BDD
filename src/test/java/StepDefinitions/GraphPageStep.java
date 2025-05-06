package StepDefinitions;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;

import DriverFactory.DriverFactory;
import PageObject.ArrayPageObject;
import PageObject.GraphPageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;
import Utilities.TryEditor;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GraphPageStep {
	
	LoginPageObject loginPageObj = new LoginPageObject();
	HomePageObject homePageObj = new HomePageObject();
	GraphPageObject graphPageObj = new GraphPageObject();
	ArrayPageObject arrayPageObj = new ArrayPageObject();
	ExcelReader readExcel = new ExcelReader();
	WebDriver driver= DriverFactory.getDriver();
	TryEditor tryEditorObj = new TryEditor();
	
	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		homePageObj.launchURL();
		homePageObj.clickGetStartedBtn();
		
	}

	@When("The user selects Graph from Data Structures dropdown")
	public void the_user_selects_graph_from_data_structures() {
		homePageObj.dataStructuresDrpDwnClick();
		homePageObj.graphDrpDwnClick();
	}

	@Then("The user should able to see an warning message {string}")
	public void the_user_should_able_to_see_an_warning_message(String string) {
		loginPageObj.LoggedMessageSignIn("You are not logged in");
		String homeText = homePageObj.getHomeLogInMsg();
		assertEquals("You are not logged in", homeText);
   
	}

	@When("The user clicks Get Started buttons of Graph on the homepage without Sign in")
	public void the_user_clicks_get_started_buttons_of_graph_on_the_homepage_without_sign_in() {
	 homePageObj.graphGetStartedBtnClick();  
	}

	@Then("The user should able to see an warning message_graph {string}")
	public void the_user_should_able_to_see_an_warning_message_graph(String string) {
		loginPageObj.LoggedMessageSignIn("You are not logged in");
		String homeText = homePageObj.getHomeLogInMsg();
		assertEquals("You are not logged in", homeText);
	    
	}

	@When("The user gets data from excel sheet {string} and {int} for the login page and clicks Graphs Get Started button")
	public void the_user_gets_data_from_excel_sheet_and_for_the_login_page_and_clicks_graphs_get_started_button(String sheetName, Integer rowNumber) throws IOException {
		loginPageObj.clickSignInLink();// Sign in should common from object file
		String[] credentials = readExcel.excelDataRead(sheetName, rowNumber);
		loginPageObj.enterUserNameTxtBox(credentials[0]);
		loginPageObj.enterPasswordRegTxtBox(credentials[1]);
		loginPageObj.LoginBtnClick();

		homePageObj.graphGetStartedBtnClick();
	}

	@Then("The user should able to redirect to the Graph page")
	public void the_user_should_able_to_redirect_to_the_graph_page() {
		String currentTitle = tryEditorObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
		Assert.assertEquals("Graph", currentTitle);
		}

	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() throws IOException{
		the_user_is_on_the_home_page();
		homePageObj.graphGetStartedBtnClick(); 
		String sheetName = "Valid_Login"; // Define the sheet name
		Integer rowNumber = 1; // Define the row number
		the_user_gets_data_from_excel_sheet_and_for_the_login_page_and_clicks_graphs_get_started_button(sheetName, rowNumber);
		LoggerLoad.info("Graph page is displayed");
	}
	
	@When("The user clicks on the sublink Graph on the Graph page")
	public void the_user_clicks_on_the_sublink_graph_on_the_graph_page() {
	   graphPageObj.clickGraphLink();
	    
	}

	@Then("The user should redirect to the sublink Graph page")
	public void the_user_should_redirect_to_the_sublink_graph_page() {
		String expPageTitle = "Graph";//reusing lines of code multiple times
		String actPageTitle = tryEditorObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle, expPageTitle);
	    
	}

	@Given("The user is on the sublink Graph page")
	public void the_user_is_on_the_sublink_graph_page() {
		graphPageObj.clickGraphLink();
	    
	}

	@When("The user clicks on the button Try here >>> from the sublink Graph page")
	public void the_user_clicks_on_the_button_try_here_from_the_sublink_graph_page() {
		graphPageObj.click_tryHere_btn();
	    
	}

	@Then("The user should able to redirect to a new page with text area for trying the code")
	public void the_user_should_able_to_redirect_to_a_new_page_with_text_area_for_trying_the_code() {
		Assert.assertEquals(graphPageObj.runBtnDisplayed(), true);
	    
	}

	@Given("The user is on the try here textarea of sublink Graph page")
	public void the_user_is_on_the_try_here_textarea_of_sublink_graph_page() throws IOException {
		the_user_is_on_the_graph_page();
		graphPageObj.click_tryHere_btn();
	    
	}

	@When("The user gets python code from excel sheet {string} and {int} for the tryeditor and click run button")
	public void the_user_gets_python_code_from_excel_sheet_and_for_the_tryeditor_and_click_run_button(String sheetName, Integer rowNumber) throws IOException {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
		tryEditorObj.enterCodeTryEditor(value[0]);
	    graphPageObj.click_tryHereRun_btn();
	    
	}

	@Then("The user should able to get the result from excel sheet {string} and {int}")
	public void the_user_should_able_to_get_the_result_from_excel_sheet_and(String sheetName, Integer rowNumber) throws IOException{
		   
		String expectedResult = readExcel.excelDataRead(sheetName, rowNumber)[1];
		String actualResult = graphPageObj.getResultText();

		Assert.assertEquals(actualResult, expectedResult);
		System.out.println("Expected Result: " + expectedResult);
		System.out.println("Actual Result: " + actualResult);
	    
	}

	@When("I enter the code from excel sheet {string} and {int}")
	public void i_enter_the_code_from_excel_sheet_and(String sheetName, Integer rowNumber) throws IOException {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);

		tryEditorObj.enterCodeTryEditor(value[0]);
		graphPageObj.click_tryHereRun_btn();
	}

	@Then("The user should be able to receive an alert message from excel sheet {string} and {int}")
	public void the_user_should_be_able_to_receive_an_alert_message_from_excel_sheet_and(String sheetName, Integer rowNumber) throws IOException {
		System.out.println("Try Editor run invalid");
	    String[] value = readExcel.excelDataRead(sheetName, rowNumber);
	    String errorMsg = value[1];
	    String alertMsg = tryEditorObj.acceptAlert(errorMsg);
	    Assert.assertTrue(alertMsg.contains(errorMsg));
	    
	}

	@When("The user try to click on the browser back button")
	public void the_user_try_to_click_on_the_browser_back_button() {
		driver.navigate().back();
	}

	@Then("The user should be able to navigate to the previous page from the try here page ie, Graph page")
	public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_graph_page() {
		the_user_should_redirect_to_the_sublink_graph_page();
	    
	}

	@When("The user clicks on the link Graph Representations on the Graph page")
	public void the_user_clicks_on_the_link_graph_representations_on_the_graph_page() {
		graphPageObj.clickGraphRepresentationsLink();
	    
	}

	@Then("The user should redirect to the Graph Representations page")
	public void the_user_should_redirect_to_the_graph_representations_page() {
		String expPageTitle = "Graph Representations";
		String actPageTitle = tryEditorObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	        
	}

	@Given("The user is on the Graph Representations page")
	public void the_user_is_on_the_graph_representations_page() {
		graphPageObj.clickGraphRepresentationsLink();
	    	    
	}

	@When("The user clicks on the button Try here >>> from the Graph Representations page")
	public void the_user_clicks_on_the_button_try_here_from_the_graph_representations_page() {
		graphPageObj.click_tryHere_btn();
	    
	}

	@Given("The user is on the try here textarea of Graph Representations page")
	public void the_user_is_on_the_try_here_textarea_of_graph_representations_page() {
		the_user_is_on_the_graph_representations_page();
		graphPageObj.click_tryHere_btn();
	    
	}

	@Then("The user should be able to navigate to the previous page from the try here page ie, Graph Representations page")
	public void the_user_should_be_able_to_navigate_to_the_previous_page_from_the_try_here_page_ie_graph_representations_page() {
		the_user_should_redirect_to_the_graph_representations_page();
	    
	}

	@When("The user clicks on the link Practice Questions on the Graph page")
	public void the_user_clicks_on_the_link_practice_questions_on_the_graph_page() {
		  graphPageObj.clickGraphLink();
		  graphPageObj.clickPracticeQuestionsLink();
	    
	}

	@Then("The user should redirect to the Practice Questions page")
	public void the_user_should_redirect_to_the_practice_questions_page() {
		String expPageTitle = "Practice Questions";
		String actPageTitle = tryEditorObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	    
	}



}
