package StepDefinitions;

import org.testng.Assert;

import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import PageObject.TreePageObject;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TreePageStep {
	TreePageObject treePageObj = new TreePageObject();
	HomePageObject homePageObj = new HomePageObject();
	LoginPageObject loginPageObj = new LoginPageObject();
	ExcelReader readExcel = new ExcelReader();

	public final static String PAGE_TITLE_TREE = "Tree";
	public final static String PAGE_TITLE_OVERVIEW_OF_TREES = "Overview of Trees";
	public final static String PAGE_TITLE_TERMINOLOGIES = "Terminologies";
	public final static String PAGE_TITLE_TYPES_OF_TREES = "Types of Trees";
	public final static String PAGE_TITLE_TREE_TRAVERSALS = "Tree Traversals";
	public final static String PAGE_TITLE_TRAVERSALS_ILLUSTRATION = "Traversals-Illustration";
	public final static String PAGE_TITLE_BINARY_TREES = "Binary Trees";
	public final static String PAGE_TITLE_TYPES_OF_BINARY_TREES = "Types of Binary Trees";
	public final static String PAGE_TITLE_IMPLE_IN_PYTHON = "Implementation in Python";
	public final static String PAGE_TITLE_BINARY_TREE_TRAVERSALS = "Binary Tree Traversals";
	public final static String PAGE_TITLE_IMPLE_OF_BINARY_TREES = "Implementation of Binary Trees";
	public final static String PAGE_TITLE_APPLI_OF_BINARY_TREES = "Applications of Binary trees";
	public final static String PAGE_TITLE_BINARY_SEARCH_TREES = "Binary Search Trees";
	public final static String PAGE_TITLE_IMPLE_OF_BST = "Implementation Of BST";
	public final static String PAGE_TITLE_PRACTICE_QUESTIONS = " Practice Questions ";

	/*
	 * @Given("The user is in the Home page after Sign in") public void
	 * the_user_is_in_the_home_page_after_sign_in() {
	 * 
	 * homePageObj.click_getStarted_btn(); loginPageObj.clickSignInLink();
	 * LoggerLoad.info("SignIn Page is displayed");
	 * 
	 * 
	 * }
	 */

	@When("The user clicks the Getting Started button in TreePanel")
	public void the_user_clicks_the_button_in_tree_panel() {
		treePageObj.click_tree_getStarted_btn();

	}

	@When("The user select Tree item from the drop down menu")
	public void the_user_select_tree_item_from_the_drop_down_menu() {
		treePageObj.click_dataStructutrDropDown();
		treePageObj.click_treeDropDown_btn();

	}

	@Given("The user on the {string} page in Tree Data Structure")
	public void the_user_is_on_the_given_page_in_tree_data_structure(String pageTitle) {
		if (PAGE_TITLE_TREE.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
		} else if (PAGE_TITLE_OVERVIEW_OF_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_overviewOfTrees();
		} else if (PAGE_TITLE_TERMINOLOGIES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_terminologies();
		} else if (PAGE_TITLE_TYPES_OF_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_types_of_Trees();
		} else if (PAGE_TITLE_TREE_TRAVERSALS.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_tree_Traversals();
		} else if (PAGE_TITLE_TRAVERSALS_ILLUSTRATION.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_traversals_Illustration();
		} else if (PAGE_TITLE_BINARY_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_binary_Trees();
		} else if (PAGE_TITLE_TYPES_OF_BINARY_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_types_of_Binary_Trees();
		} else if (PAGE_TITLE_IMPLE_IN_PYTHON.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_implementation_In_Python();
		} else if (PAGE_TITLE_BINARY_TREE_TRAVERSALS.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_binary_Tree_Traversals();
		} else if (PAGE_TITLE_IMPLE_OF_BINARY_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_implementation_Of_Binary_Trees();
		} else if (PAGE_TITLE_APPLI_OF_BINARY_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_applications_Of_Binary_Trees();
		} else if (PAGE_TITLE_BINARY_SEARCH_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_binary_Search_Trees();
		} else if (PAGE_TITLE_IMPLE_OF_BST.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_implementation_Of_BST();
		} else if (PAGE_TITLE_PRACTICE_QUESTIONS.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_practiceQns_link();
		} else {
			LoggerLoad.error("Invalid page in Tree Data Structure");
		}

	}

	@When("The user clicks {string} link in Tree Data Structure")
	public void the_user_clicks_given_link_in_tree_data_structure(String linkName) {
		if (PAGE_TITLE_OVERVIEW_OF_TREES.equals(linkName)) {
			treePageObj.click_overviewOfTrees();
		} else if (PAGE_TITLE_TERMINOLOGIES.equals(linkName)) {
			treePageObj.click_terminologies();
		} else if (PAGE_TITLE_TYPES_OF_TREES.equals(linkName)) {
			treePageObj.click_types_of_Trees();
		} else if (PAGE_TITLE_TREE_TRAVERSALS.equals(linkName)) {
			treePageObj.click_tree_Traversals();
		} else if (PAGE_TITLE_TRAVERSALS_ILLUSTRATION.equals(linkName)) {
			treePageObj.click_traversals_Illustration();
		} else if (PAGE_TITLE_BINARY_TREES.equals(linkName)) {
			treePageObj.click_binary_Trees();
		} else if (PAGE_TITLE_TYPES_OF_BINARY_TREES.equals(linkName)) {
			treePageObj.click_types_of_Binary_Trees();
		} else if (PAGE_TITLE_IMPLE_IN_PYTHON.equals(linkName)) {
			treePageObj.click_implementation_In_Python();
		} else if (PAGE_TITLE_BINARY_TREE_TRAVERSALS.equals(linkName)) {
			treePageObj.click_binary_Tree_Traversals();
		} else if (PAGE_TITLE_IMPLE_OF_BINARY_TREES.equals(linkName)) {
			treePageObj.click_implementation_Of_Binary_Trees();
		} else if (PAGE_TITLE_APPLI_OF_BINARY_TREES.equals(linkName)) {
			treePageObj.click_applications_Of_Binary_Trees();
		} else if (PAGE_TITLE_BINARY_SEARCH_TREES.equals(linkName)) {
			treePageObj.click_binary_Search_Trees();
		} else if (PAGE_TITLE_IMPLE_OF_BST.equals(linkName)) {
			treePageObj.click_implementation_Of_BST();
		} else if (PAGE_TITLE_PRACTICE_QUESTIONS.equals(linkName)) {
			treePageObj.click_practiceQns_link();
		}

	}

	@Then("The user should be directed to {string} in Tree Data Structure")
	public void the_user_should_be_directed_to_data_structure_page(String expPgTitle) {
		String currentTitle = treePageObj.get_currentPageTitle();
		Assert.assertEquals(expPgTitle, currentTitle);// ****expected [Overview of Trees] but found
														// [Traversals-Illustration]

	}

	@When("The user clicks \"Try Here\" button in {string} page in Tree Data Structure")
	public void the_user_clicks_try_here_button_in_given_trees_data_structures_page(String string) {
		treePageObj.click_tryHere_btn();
	}

	@Then("The user should be directed to Try Editor page to test {string}")
	public void the_user_should_be_redirected_try_editor_page_to_test_given_trees_section(String pageTitle) {
		String expPageTitle = "Assessment";
		String actPageTitle = treePageObj.get_currentPageTitle();
		Assert.assertEquals(expPageTitle, actPageTitle);

	}

	@Given("The user is on the Try Editor page of {string} page in Tree Data Structure")
	public void the_user_is_on_the_tryEditor_page_of_given_section_in_tree_data_structure(String pageTitle) {
		if ("PAGE_TITLE_TREE".equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
		} else if (PAGE_TITLE_OVERVIEW_OF_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_overviewOfTrees();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_TERMINOLOGIES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_terminologies();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_TYPES_OF_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_types_of_Trees();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_TREE_TRAVERSALS.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_tree_Traversals();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_TRAVERSALS_ILLUSTRATION.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_traversals_Illustration();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_BINARY_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_binary_Trees();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_TYPES_OF_BINARY_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_types_of_Binary_Trees();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_IMPLE_IN_PYTHON.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_implementation_In_Python();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_BINARY_TREE_TRAVERSALS.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_binary_Tree_Traversals();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_IMPLE_OF_BINARY_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_implementation_Of_Binary_Trees();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_APPLI_OF_BINARY_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_applications_Of_Binary_Trees();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_BINARY_SEARCH_TREES.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_binary_Search_Trees();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_IMPLE_OF_BST.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_implementation_Of_BST();
			treePageObj.click_tryHere_btn();
		} else if (PAGE_TITLE_PRACTICE_QUESTIONS.equals(pageTitle)) {
			treePageObj.click_dataStructutrDropDown();
			treePageObj.click_treeDropDown_btn();
			treePageObj.click_practiceQns_link();
			treePageObj.click_tryHere_btn();
		}

	}

	@When("The user clicks the Run button in Tree Data Structure tryEditor page")
	public void the_user_clicks_run_button_without_entering_the_code_in_the_tree_try_Editor() {
		treePageObj.click_tryHereRun_btn();
	}

	@When("The user enters {string} and {int} clicks the Run Button in Tree Data Structure tryEditor page")
	public void the_user_enters_and_clicks_the_run_button_in_time_complexity_try_editor_page(String sheetName,
			Integer rowNumber) {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
		treePageObj.enterCodeTryEditor(value[1]);
		treePageObj.click_tryHereRun_btn();

	}

	@Then("The user should able to see a error message from {string} and {int} on Tree Data Structure tryEditor alert")
	public void the_user_should_able_to_see_a_error_message_from_and_on_tree_try_editor_alert(String sheetName,
			Integer rowNumber) {
		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
		String errorMsg = value[0];
		treePageObj.acceptAlert(errorMsg);

	}

	@Then("The user should able to see output in the console from {string} and {int} on Tree Data Structure tryEditor page")
	public void the_user_should_able_to_see_output_in_the_console_from_and_in_time_complexity_try_editor_page(
			String sheetName, Integer rowNumber) {

		String[] value = readExcel.excelDataRead(sheetName, rowNumber);
		String expOutput = value[0];
		System.out.println("OutputCode from excel " + expOutput);
		String actOutput = treePageObj.get_tryHereEditor_output();
		System.out.println("Output from webpage " + actOutput);
		Assert.assertEquals(actOutput, expOutput);

	}

}
