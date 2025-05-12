package StepDefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import DriverFactory.DriverFactory;
import PageObject.GraphPageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import PageObject.StackPageObject;
import Utilities.ExcelReader;
import Utilities.LoggerLoad;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class StackPageStep {
    
    
    StackPageObject stackpageObj = new  StackPageObject();
    LoginPageObject loginPageObj = new LoginPageObject();
    HomePageObject homePageObj = new HomePageObject();
    GraphPageObject graphPageObj = new GraphPageObject();
    ExcelReader readExcel = new ExcelReader();
    WebDriver driver= DriverFactory.getDriver();
    
    

    
    @Given("The user is in the Stack page after Sign in")
    public void the_user_is_in_the_stack_page_after_sign_in() {
         stackpageObj.click_getstartedstack();
        String currentTitle = stackpageObj.get_currentPageTitle();
        LoggerLoad.info(currentTitle+ " page is displayed");  
    }
    
    @When("The user clicks the Getting Started button in Stack Panel")
    public void the_user_clicks_the_getting_started_button_in_stack_panel() {
        stackpageObj.click_getstartedstack();
    }
    @Then("The user be directed to Stack Data Structure Page")
    public void the_user_be_directed_to_stack_data_structure_page() {
        String expPageTitle = "Stack";
        String actPageTitle = stackpageObj.get_currentPageTitle();
        Assert.assertEquals(expPageTitle,actPageTitle);
    }
    
    @When("The user select Stack item from the dropdown menu")
    public void the_user_select_stack_item_from_the_dropdown_menu() {
        stackpageObj.click_dropdowndatastuctr();
        stackpageObj.click_dropdownstack();
    }
    @When("The user clicks Operations in Stack button")
    public void the_user_clicks_operations_in_stack_button() {
        stackpageObj.click_OperationsInStack();
    }
    @Then("The user should be redirected to Operations in Stack page")
    public void the_user_should_be_redirected_to_operations_in_stack_page() {
        String expPageTitle = "Operations in Stack";
        String actPageTitle = stackpageObj.get_currentPageTitle();
        Assert.assertEquals(actPageTitle,expPageTitle);
        
    }
    @Given("The user is on the Operations in Stack page")
    public void the_user_is_on_the_Operations_in_Stack_page() {
        stackpageObj.click_getstartedstack();
        stackpageObj.click_OperationsInStack();
        String currentTitle = stackpageObj.get_currentPageTitle();
        LoggerLoad.info(currentTitle+ " page is displayed");
    }
    @When("The user clicks Try Here button in Operations in Stack page")
    public void the_user_clicks_try_here_button_in_operations_in_stack_page() {
        stackpageObj.click_tryHere_btn();
    
    }
    @Then("The user should be redirected to a page having an try Editor with a Run button to test")
    public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
        String expPageTitle = "Assessment";
        String actPageTitle = stackpageObj.get_currentPageTitle();
        Assert.assertEquals(actPageTitle,expPageTitle);
        
    }
    @Given("The user is in the Operations in Stack tryEditor page")
    public void the_user_is_in_the_Operations_in_Stack_tryEditor_page() {
        stackpageObj.click_getstartedstack();
        stackpageObj.click_OperationsInStack();
        stackpageObj.click_tryHere_btn();
        String currentTitle = stackpageObj.get_currentPageTitle();
        LoggerLoad.info(currentTitle+ " page is displayed");
    }
    
    @When("The user enters excel sheet in {string} and the {int} and clicks the Run Button in tryEditor page")
    public void The_user_enters_excel_sheet_in_and_the_clicks_the_Run_button_in_try_editor_page(String strings1, Integer rows) {
           String[] value = readExcel.excelDataRead(strings1, rows);
            stackpageObj.enterCodeTryEditor(value[0]);
            stackpageObj.click_runbttn();
    }
    
    @Then("The user should able to see a error message from excel sheet {string} and the {int}")
    public void The_user_should_able_to_see_a_error_message_from_excel_sheet_and_the(String strings1, Integer rows) {
         String[] value = readExcel.excelDataRead(strings1, rows);
            String errorMsg = value[1];
            String alertMsg = stackpageObj.acceptAlert(errorMsg);
            Assert.assertTrue(alertMsg.contains(errorMsg));
    }
    @Then("The user should able to see the output in the console from excel sheet {string} and the {int}")
    public void user_should_able_to_see_a_error_message_from_excel_sheet_and_the(String stringst, Integer rows) {
         String[] value = readExcel.excelDataRead(stringst, rows);
         String expOutput = value[1];
            String actOutput = stackpageObj.get_tryHereEditor_output();
            Assert.assertEquals(actOutput,expOutput);   
    }

    @When("The user clicks Practice Questions button page")
    public void The_user_clicks_Practice_Questions_button_page() {
        stackpageObj.click_PracticeQuestions();
    }
    

   
    @Given("The user is in the Operations in Stack page after Sign in")
    public void the_user_is_in_the_operations_in_stack_page_after_sign_in() {
       
    }
    @Then("The user should be redirected to Practice page links")
    public void The_user_should_be_redirected_to_Practice_page_links() {
        boolean page = stackpageObj.check_practiecQtns_avail();
        Assert.assertTrue(page, "No Practise Questions found");
    }
    @When("The user clicks Implementation button")
    public void the_user_clicks_implementation_button() {
        stackpageObj.click_Implementation();
        
    }
    @Then("The user should be redirected to Implementation page")
    public void the_user_should_be_redirected_to_implementation_page() {
        String expPageTitle = "Implementation";
        String actPageTitle = stackpageObj.get_currentPageTitle();
        Assert.assertEquals(actPageTitle,expPageTitle);
    }
    @Given("The user is on the Implementation page")
    public void the_user_is_on_the_implementation_page() {
        stackpageObj.click_getstartedstack();
        stackpageObj.click_Implementation();
        String currentTitle = stackpageObj.get_currentPageTitle();
        LoggerLoad.info(currentTitle+ " page is displayed");
        
    }
    
    @When("The user clicks Try Here button in Implementation page")
    public void the_user_clicks_try_here_button_in_implementation_page() {
        stackpageObj.click_tryHere_btn();
    }
    
    @Given("The user is in the Implementation tryEditor page")
    public void The_user_is_in_the_Implementation_tryEditor_page() {
        stackpageObj.click_getstartedstack();
        stackpageObj.click_Implementation();
        stackpageObj.click_tryHere_btn();
        String currentTitle = stackpageObj.get_currentPageTitle();
        LoggerLoad.info(currentTitle+ " page is displayed");
    }
    @Given("The user is in the Implementation page after Sign in")
    public void the_user_is_in_the_implementation_page_after_sign_in() {
        stackpageObj.click_getstartedstack();
        stackpageObj.click_Implementation();
        String currentTitle = stackpageObj.get_currentPageTitle();
        LoggerLoad.info(currentTitle+ " page is displayed");
    }
    
     @Given("The user is in the Implementation page")
       public void The_user_is_in_the_Implementation_page() {
    	 stackpageObj.click_getstartedstack();
         stackpageObj.click_Implementation();
         String currentTitle = stackpageObj.get_currentPageTitle();
         LoggerLoad.info(currentTitle+ " page is displayed");
     }
    @When("The user clicks Applications button")
    public void the_user_clicks_applications_button() {
    	stackpageObj.click_applicatio();
     
    }
    @Then("The user should be redirected to Applications page")
    public void the_user_should_be_redirected_to_applications_of_stack_page() {
    	String expPageTitle = "Applications";
        String actPageTitle = stackpageObj.get_currentPageTitle();
        Assert.assertEquals(actPageTitle,expPageTitle);
        
    }
    
     @When("The user clicks Try Here button in Applications page")
       public void The_user_clicks_Try_Here_button_in_Applications_page() {
         stackpageObj.click_tryHere_btn();
     }
    
    @Given("The user is in the Applications tryEditor page")
    public void The_user_is_in_the_Applications_tryEditor_page() {
        stackpageObj.click_getstartedstack();
        stackpageObj.click_applicatio();
        stackpageObj.click_tryHere_btn();
        String currentTitle = stackpageObj.get_currentPageTitle();
        LoggerLoad.info(currentTitle+ " page is displayed");
    }
    @Given("The user is in the Applications page")
    public void The_user_is_in_the_Applications_page() {
    	stackpageObj.click_getstartedstack();
        stackpageObj.click_applicatio();
        String currentTitle = stackpageObj.get_currentPageTitle();
        LoggerLoad.info(currentTitle+ " page is displayed");
    }

}