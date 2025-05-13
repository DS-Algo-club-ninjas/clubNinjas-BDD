package StepDefinitions;


import PageObject.HomePageObject;
import PageObject.LinkeListPageObject;
import PageObject.LoginPageObject;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverFactory.DriverFactory;
public class LinkeListStep {
	
	HomePageObject homePageObj = new HomePageObject();
	LoginPageObject loginPageObj = new LoginPageObject();
	ExcelReader readExcel = new ExcelReader();
	LinkeListPageObject linkedlistObj =new  LinkeListPageObject();
	WebDriver driver= DriverFactory.getDriver();
	
	@Given(" The user is on the Home page and clicks Sign In")
	public void  the_user_is_on_the_Home_page_and_clicks_Sign_In() {
		 String currentTitle = linkedlistObj.get_currentPageTitle();
		    LoggerLoad.info(currentTitle+ " page is displayed");
	   
	}
	
	@Given(" The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		homePageObj.clickGetStartedBtn();
		loginPageObj.clickSignInLink();
		LoggerLoad.info("SignIn Page is displayed");
	}

	@When("The user clicks the Get Started button in LinkedList panel")
	public void the_user_clicks_the_get_started_button_in_linked_list_panel() {
		linkedlistObj.click_linkdlistGetStarted();
		
	}
	
	@Then("The user be directed to Linked List Data Structure Page")
	public void the_user_be_directed_to_linked_list_data_structure_page() {
		String expPageTitle = "Linked List";
		String actPageTitle = linkedlistObj.get_currentPageTitle();
		Assert.assertEquals(expPageTitle,actPageTitle);
	}

	@When("The user select LinkeList from drop down menu")
	public void the_user_select_linke_list_from_drop_down_menu() {
		linkedlistObj.click_dataStructutrDropDown();
		linkedlistObj.click_linkedlistDropDown();
	}

	@Given("The user is in Linked List after signin")
	public void the_user_is_in_linked_list_after_signin() {
		linkedlistObj.click_linkdlistGetStarted();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}
	
	@When("The user clicks Introduction button")
	public void the_user_clicks_introduction_button() {
		linkedlistObj.click_introduction();
		
	}
	
	 @Then("The user should be redirected to Introduction page")
	   public void the_user_should_be_redirected_to_Introduction_page () {
		 String expPageTitle = "Introduction";
			String actPageTitle = linkedlistObj.get_currentPageTitle();
			Assert.assertEquals(actPageTitle,expPageTitle);
			
	 }
	
	@Then("The user should be redirected to LinkeList page")
	public void the_user_should_be_redirected_to_linke_list_page() {
		String expPageTitle = "LinkeList";
		String actPageTitle = linkedlistObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
		
	}

	@Given("The user is in the Introduction page")
	public void the_user_is_in_the_introduction_page() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_introduction();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}
	
	@When("The user clicks Try Here button in Introduction page")
	public void the_user_clicks_try_here_button_in_introduction_page() {
		linkedlistObj.click_tryHere_btn();
	}
	
	@Then("The user should be in a page of having a try Editor with a Run button to test")
	public void the_user_should_be_in_a_page_of_having_a_try_editor_with_a_run_button_to_test() {
		String expPageTitle = "Assessment";
		String actPageTitle = linkedlistObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	}
	

	@Given("The user is in the Introduction tryEditor page")
	public void the_user_is_in_the_introduction_try_editor_page() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_introduction();
		linkedlistObj.click_tryHere_btn();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}

	@When("The user enters excel sheet {string} and the {int} clicks the Run Button in tryEditor page")
	public void the_user_enters_excel_sheet_and_the_clicks_the_run_button_in_try_editor_page(String strings, Integer row1) {
		   String[] value = readExcel.excelDataRead(strings, row1);
		   linkedlistObj.enterCodeTryEditor(value[0]);
		    linkedlistObj.click_runbttn();
	}

	@Then("The user should able to see a error message from excel sheet {string} and the  {int}")
	public void the_user_should_able_to_see_a_error_message_from_excel_sheet_and_the(String strings, Integer row1) {
		 String[] value = readExcel.excelDataRead(strings, row1);
		    String errorMsg = value[1];
		    String alertMsg = linkedlistObj.acceptAlert(errorMsg);
		    Assert.assertTrue(alertMsg.contains(errorMsg));
	}

	
	@Then("The user should able to see the  output in the console from excel sheet {string} and the {int}")
	public void the_user_should_able_to_see_the_output_in_the_console_from_excel_sheet_and_the(String strings, Integer row1) {
		String[] value = readExcel.excelDataRead(strings, row1);
	    String expOutput = value[1];
	    String actOutput = linkedlistObj.get_tryHereEditor_output();
	    Assert.assertEquals(actOutput,expOutput);	
	}
	
	

	@When("The user clicks the  Practice Questions button")
	public void the_user_clicks_the_practice_questions_button() {
		linkedlistObj.click_practicequestns_link();	
	}

	@Then("The user should be redirected to the Practice page")
	public void the_user_should_be_redirected_to_the_practice_page() {
		boolean page = linkedlistObj.check_practiecQtns_avail();
		Assert.assertTrue(page, "No Practise Questions found");
	}


	@When("The user clicks the Creating Linked list  button")
	public void the_user_clicks_the_creating_linked_list_button() {
		linkedlistObj.click_creatinglinkedlist();
	}

	@Then("The user should be redirected to Creating Linked list page")
	public void the_user_should_be_redirected_to_creating_linked_list_page() {
		String expPageTitle = "Creating Linked LIst";
		String actPageTitle = linkedlistObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	}
	
	@Given("The user is in the Creating Linked list page")
	public void the_user_is_in_the_creating_linked_list_page() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_creatinglinkedlist();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	    
	}

	@Given("The user is in the Creating Linked list  tryEditor page")
	public void the_user_is_in_the_creating_linked_list_try_editor_page() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_creatinglinkedlist();
		linkedlistObj.click_tryHere_btn();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}
   
	@When("The user clicks Try Here button in Creating Linked list page")
	 public void the_user_clicks_Try_Here_button_in_Creating_Linked_list_page() {
		linkedlistObj.click_tryHere_btn();
	}
	
	@Given("The user is on the Types of Linked list  page after Sign in")
	public void the_user_is_on_the_types_of_linked_list_page_after_sign_in() {
		linkedlistObj.click_linkdlistGetStarted();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}

	@When("The user clicks the  Types of Linked list   button")
	public void the_user_clicks_the_types_of_linked_list_button() {
		linkedlistObj.click_typslinkdlist();
	}

	@Then("The user should be redirected to  Types of Linked list  page")
	public void the_user_should_be_redirected_to_types_of_linked_list_page() {
		String expPageTitle = "Types of Linked List";
		String actPageTitle = linkedlistObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	}
	
	@Given("The user is in the  Types of Linked list  tryEditor page")
	public void the_user_is_in_the_types_of_linked_list_try_editor_page() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_typslinkdlist();
		linkedlistObj.click_tryHere_btn();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}
	
	@Given("The user is in the Types of Linked list page")
	public void the_user_is_in_the_types_of_linked_listt_page() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_typslinkdlist();
		
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}
	
	 @When("The user clicks Try Here button in Types of Linked list page")
	 public void the_user_clicks_Try_Here_button_in_Types_of_Linked_list_page() {
		 linkedlistObj.click_tryHere_btn();
	 }

	@Given("The user is on the Implement Linked List in Python  page after Sign in")
	public void the_user_is_on_the_implement_linked_list_in_python_page_after_sign_in() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_impmntlinkdlstpython();
		
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
      }

	@When("The user clicks the  Implement Linked List in Python button")
	public void the_user_clicks_the_implement_linked_list_in_python_button() {
		linkedlistObj.click_impmntlinkdlstpython();
	
	}

	@Then("The user should be redirected to  Implement Linked List in Python  page")
	public void the_user_should_be_redirected_to_implement_linked_list_in_python_page() {
		String expPageTitle = "Implement Linked List in Python";
		String actPageTitle = linkedlistObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	}
	
	@Given("The user is in the Implement Linked List in Python tryEditor page")
	public void the_user_is_in_the_implement_linked_list_in_python_try_editor_page() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_typslinkdlist();
		linkedlistObj.click_tryHere_btn();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}


	@Given("The user is in the Implement Linked List in Python page")
	 public void the_user_is_in_the_Implement_Linked_List_in_Python_page() {
	 linkedlistObj.click_linkdlistGetStarted();
	 linkedlistObj.click_creatinglinkedlist();
	  String currentTitle = linkedlistObj.get_currentPageTitle();
	LoggerLoad.info(currentTitle+ " page is displayed");
	}


	@Given("The user is on the Traversal  page after Sign in")
	public void the_user_is_on_the_traversal_page_after_sign_in() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_traversal();
		
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}

	@When("The user clicks the  Traversal button")
	public void the_user_clicks_the_traversal_button() {
		linkedlistObj.click_traversal();
	}

	@Then("The user should be redirected to Traversal page")
	public void the_user_should_be_redirected_to_traversal_page() {
	    String expPageTitle = "Traversal";
		String actPageTitle = linkedlistObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	}

	@Given("The user is in the Traversal  tryEditor page")
	public void the_user_is_in_the_traversal_try_editor_page() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_typslinkdlist();
		linkedlistObj.click_tryHere_btn();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	
	}

	@When("The user clicks Try Here button in Traversal page")
	  public void  the_user_clicks_Try_Here_button_in_Traversal_page() {
		linkedlistObj.click_tryHere_btn();
	
	}


	@Given("The user is on the Insertion page after Sign in")
	public void the_user_is_on_the_insertion_page_after_sign_in() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_insertion();
		
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	}

	@When("The user clicks the  Insertion button")
	public void the_user_clicks_the_insertion_button() {
		linkedlistObj.click_insertion();
	}

	@Then("The user should be redirected to Insertion page")
	public void the_user_should_be_redirected_to_insertion_page() {
		String expPageTitle = "Insertion";
		String actPageTitle = linkedlistObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	
	}

	
	@When("The user clicks Try Here button in Insertion page")
	 public void the_user_clicks_Try_Here_button_in_Insertion_page() {
		linkedlistObj.click_tryHere_btn();
	}
	
	@Given("The user is in the Insertion tryEditor page")
	public void the_user_is_in_the_insertion_try_editor_page() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_typslinkdlist();
		linkedlistObj.click_tryHere_btn();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	
	}

	


	@Given("The user is on the  Deletion page after Sign in")
	public void the_user_is_on_the_deletion_page_after_sign_in() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_Deletion();
		
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
		
	}

	@When("The user clicks the  Deletion button")
	public void the_user_clicks_the_deletion_button() {
		linkedlistObj.click_Deletion();
	}

	@Then("The user should be redirected to  Deletion page")
	public void the_user_should_be_redirected_to_deletion_page() {
		String expPageTitle = "Deletion";
		String actPageTitle = linkedlistObj.get_currentPageTitle();
		Assert.assertEquals(actPageTitle,expPageTitle);
	
	}
	
	@When("The user clicks Try Here button in Deletion page")
	   public void the_user_clicks_Try_Here_button_in_Deletion_page() {
		linkedlistObj.click_tryHere_btn();
	}

	@Given("The user is in the  Deletion tryEditor page")
	public void the_user_is_in_the_deletion_try_editor_page() {
		linkedlistObj.click_linkdlistGetStarted();
		linkedlistObj.click_Deletion();
		linkedlistObj.click_tryHere_btn();
		String currentTitle = linkedlistObj.get_currentPageTitle();
		LoggerLoad.info(currentTitle+ " page is displayed");
	
	}



}
