package StepDefinitions;

import org.testng.Assert;
import PageObject.ArrayPageObject;
import PageObject.HomePageObject;
import PageObject.QueuePageObject;
import Utilities.LoggerLoad;
import Utilities.TryEditor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QueuePageStep {
	
	//ArrayPageObject arrayPageObj = new ArrayPageObject();
	QueuePageObject queuePageObj = new QueuePageObject();
	TryEditor tryEditorObj = new TryEditor();
	
	@When("The user clicks the Get Started button in Queue Panel")
	public void the_user_clicks_the_get_started_button_in_queue_panel() {
		queuePageObj.click_queueGetStarted_btn();
	    
	}

	@Then("The user should be directed to Queue Data Structure Page")
	public void the_user_should_be_directed_to_queue_data_structure_page() {
		String expPageTitle = "Queue";
		String actPageTitle = tryEditorObj.get_currentPageTitle();
		Assert.assertEquals(expPageTitle,actPageTitle);
	    
	}

	@When("The user select Queue item from the drop down menu")
	public void the_user_select_queue_item_from_the_drop_down_menu() {
		queuePageObj.click_dataStructutrDropDown();
		queuePageObj.click_queueDropDown();
	    
	}

	@Given("The user is in the Queue page")
	public void the_user_is_in_the_queue_page() {
		queuePageObj.click_queueGetStarted_btn();
		String currentTitle = tryEditorObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user clicks Implementation of Queue in Python button")
	public void the_user_clicks_implementation_of_queue_in_python_button() {
	    queuePageObj.click_implOfQueue_link();
	    
	}

	@Then("The user should be redirected to Implementation of Queue in Python page")
	public void the_user_should_be_redirected_to_implementation_of_queue_in_python_page() {
		String expPageTitle = "Implementation of Queue in Python";
		String actPageTitle = tryEditorObj.get_currentPageTitle();
		Assert.assertEquals(expPageTitle,actPageTitle);
	    
	}


	@When("The user clicks Try Here button in Implementation of Queue in Python page")
	public void the_user_clicks_try_here_button_in_implementation_of_queue_in_python_page() {
		tryEditorObj.click_tryHere_btn();
	    
	}
	
	@Given("The user is in the Implementation of Queue in Python tryEditor page")
	public void the_user_is_in_the_implementation_of_queue_in_python_try_editor_page() {
		queuePageObj.click_queueGetStarted_btn();
		queuePageObj.click_implOfQueue_link();
		tryEditorObj.click_tryHere_btn();
		String currentTitle = tryEditorObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}

	@Given("The user is in the Implementation of Queue in Python page")
	public void the_user_is_in_the_implementation_of_queue_in_python_page() {
		queuePageObj.click_queueGetStarted_btn();
		queuePageObj.click_implOfQueue_link();
		String currentTitle = tryEditorObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user clicks Implementation using collections.deque button")
	public void the_user_clicks_implementation_using_collections_deque_button() {
	    queuePageObj.click_implUsingCollections_link();
	    
	}

	@Then("The user should be redirected to Implementation using collections.deque page")
	public void the_user_should_be_redirected_to_implementation_using_collections_deque_page() {
		String expPageTitle = "Implementation using collections.deque";
		String actPageTitle = tryEditorObj.get_currentPageTitle();
		Assert.assertEquals(expPageTitle,actPageTitle);
	    
	}

	@Given("The user is on the Implementation using collections.deque page")
	public void the_user_is_on_the_implementation_using_collections_deque_page() {
		queuePageObj.click_queueGetStarted_btn();
		queuePageObj.click_implUsingCollections_link();
		String currentTitle = tryEditorObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user clicks Try Here button in Implementation using collections.deque page")
	public void the_user_clicks_try_here_button_in_implementation_using_collections_deque_page() {
		tryEditorObj.click_tryHere_btn();
	    
	}
	
	@Given("The user is in the Implementation using collections.deque tryEditor page")
	public void the_user_is_in_the_implementation_using_collections_deque_try_editor_page() {
		queuePageObj.click_queueGetStarted_btn();
		queuePageObj.click_implUsingCollections_link();
		tryEditorObj.click_tryHere_btn();
		String currentTitle = tryEditorObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}

	@When("The user clicks Implementation using array button")
	public void the_user_clicks_implementation_using_array_button() {
	    queuePageObj.click_implUsingArray_link();
	    
	}

	@Then("The user should be redirected to Implementation using array page")
	public void the_user_should_be_redirected_to_implementation_using_array_page() {
		String expPageTitle = "Implementation using array";
		String actPageTitle = tryEditorObj.get_currentPageTitle();
		Assert.assertEquals(expPageTitle,actPageTitle);
	    
	}

	@Given("The user is on the Implementation using array page")
	public void the_user_is_on_the_Implementation_using_array_page() {
		queuePageObj.click_queueGetStarted_btn();
		queuePageObj.click_implUsingArray_link();
		String currentTitle = tryEditorObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user clicks Try Here button in Implementation using array page")
	public void the_user_clicks_try_here_button_in_implementation_using_array_page() {
		tryEditorObj.click_tryHere_btn();
	    
	}
	
	@Given("The user is in the Implementation using array tryEditor page")
	public void the_user_is_in_the_implementation_using_array_try_editor_page() {
		queuePageObj.click_queueGetStarted_btn();
		queuePageObj.click_implUsingArray_link();
		tryEditorObj.click_tryHere_btn();
		String currentTitle = tryEditorObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}

	@When("The user clicks Queue Operations button")
	public void the_user_clicks_queue_operations_button() {
	    queuePageObj.click_queueOperation_link();
	    
	}

	@Then("The user should be redirected to Queue Operations page")
	public void the_user_should_be_redirected_to_queue_operations_page() {
		String expPageTitle = "Queue Operations";
		String actPageTitle = tryEditorObj.get_currentPageTitle();
		Assert.assertEquals(expPageTitle,actPageTitle);
	    
	}

	@Given("The user is on the Queue Operations page")
	public void the_user_is_on_the_queue_operations_page() {
		queuePageObj.click_queueGetStarted_btn();
		queuePageObj.click_queueOperation_link();
		String currentTitle = tryEditorObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@When("The user clicks Try Here button in Queue Operations page")
	public void the_user_clicks_try_here_button_in_queue_operations_page() {
		tryEditorObj.click_tryHere_btn();
	    
	}


	@Given("The user is in the Queue Operations tryEditor page")
	public void the_user_is_in_the_queue_operations_try_editor_page() {
		queuePageObj.click_queueGetStarted_btn();
		queuePageObj.click_queueOperation_link();
		tryEditorObj.click_tryHere_btn();
		String currentTitle = tryEditorObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}

}
