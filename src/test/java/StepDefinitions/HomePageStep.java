package StepDefinitions;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import PageObject.HomePageObject;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageStep {
	HomePageObject homePageObj = new HomePageObject();
	

	@Then("User should be able to navigate to the home page")
	public void user_should_be_able_to_navigate_to_the_home_page() {
	    Assert.assertEquals(homePageObj.dataStructuresDrpDwnDisplayed(), true);
	   }

	@When("User clicks on the Data Structures dropdown")
	public void user_clicks_on_the_data_structures_dropdown() {
	    homePageObj.dataStructuresDrpDwnClick();
	    
	}

	@Then("User should be able to see the options: Arrays, Linked List, Stack, Queue, Tree, Graph in the dropdown menu")
	public void user_should_be_able_to_see_the_options_arrays_linked_list_stack_queue_tree_graph_in_the_dropdown_menu() {
		Assert.assertEquals(homePageObj.dataStructuresDrpDwnDisplayed(), true);
	    
	}

	@When("User selects Arrays from the dropdown without signing in")
	public void user_selects_arrays_from_the_dropdown_without_signing_in() {

		homePageObj.dataStructuresDrpDwnClick();
		homePageObj.arrayDrpDwnClick();
			    
	}

	@Then("User should be able to see a warning message You are not logged in")
	public void user_should_be_able_to_see_a_warning_message_you_are_not_logged_in() {
	    String homeText = homePageObj.getHomeLogInMsg();
	    assertEquals("You are not logged in", homeText);
	    
	}

	@When("User selects Linked List from the dropdown without signing in")
	public void user_selects_linked_list_from_the_dropdown_without_signing_in() {
		homePageObj.dataStructuresDrpDwnClick();
		homePageObj.linkedListDrpDwnClick();
	    
	}

	@When("User selects Stack from the dropdown without signing in")
	public void user_selects_stack_from_the_dropdown_without_signing_in() {
		homePageObj.dataStructuresDrpDwnClick();
		homePageObj.stackDrpDwnClick();
	    	    
	}

	@When("User selects Queue from the dropdown without signing in")
	public void user_selects_queue_from_the_dropdown_without_signing_in() {
		homePageObj.dataStructuresDrpDwnClick();
		homePageObj.queueDrpDwnClick();
	    	    
	}

	@When("User selects Tree from the dropdown without signing in")
	public void user_selects_tree_from_the_dropdown_without_signing_in() {
		homePageObj.dataStructuresDrpDwnClick();
		homePageObj.treeDrpDwnClick();
	    	    
	}

	@When("User selects Graph from the dropdown without signing in")
	public void user_selects_graph_from_the_dropdown_without_signing_in() {
		homePageObj.dataStructuresDrpDwnClick();
		homePageObj.graphDrpDwnClick();
	    	    
	}

	@When("User clicks on the launch page other than the Get Started")
	public void user_clicks_on_the_launch_page_other_than_the_get_started() {
	    homePageObj.randomClickMethod();
	    
	}

	@Then("User should stay in the same launch page")
	public void user_should_stay_in_the_same_launch_page() {
		LoggerLoad.info("User is in Launch Page");
	}

	@When("User clicks on the launch page other than the Get Started button")
	public void user_clicks_on_the_launch_page_other_than_the_get_started_button() {
		homePageObj.randomClickMethod();
	}

	@Then("User should not be able to navigate to the home page")
	public void user_should_not_be_able_to_navigate_to_the_home_page() {
		LoggerLoad.info("User is in Home Page");
	}

	@Then("The user is in Home Page")
	public void the_user_is_in_home_page() {
		LoggerLoad.info("User is in Home Page");
	}
}