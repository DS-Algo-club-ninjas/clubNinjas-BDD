package StepDefinitions;

import Utilities.LoggerLoad;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObject.RegistrationPageObject;
import PageObject.HomePageObject;
import PageObject.LoginPageObject;
import Utilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegistrationPageStep {
	WebDriver driver;
	RegistrationPageObject registerPageObj = new RegistrationPageObject();
	HomePageObject homePageObj = new HomePageObject();
	LoginPageObject loginPageObj = new LoginPageObject();
	
	ExcelReader readExcel = new ExcelReader();
	
	@Given("User is in the ds-algo launch page")
	public void user_is_in_the_ds_algo_launch_page() {
	   	LoggerLoad.info("Launch page is displayed");	    
	}

	@When("User clicks the Get Started button")
	public void user_clicks_the_Get_Started_button() {
		homePageObj.clickGetStartedBtn();
		}

	
	@Given("User is in the home page after launching ds-algo portal page")
	public void user_is_in_the_home_page_after_launching_ds_algo_portal_page() {
	   LoggerLoad.info("Home Page is displayed");	    
	}

	@When("User clicks Register link in the home page")
	public void user_clicks_register_link_in_the_home_page() {
		registerPageObj.registerLinkClick();
		LoggerLoad.info("User clicks Register link");
	}

	@Then("User should be able to navigate to Register page")
	public void user_should_be_able_to_navigate_to_register_page() {
		Assert.assertEquals(registerPageObj.registerBtnDisplayed(), true);
	    
	}

	@Given("User navigates to register page after clicking register link")
	public void user_navigates_to_register_page_after_clicking_register_link() {
		registerPageObj.registerLinkClick();
		LoggerLoad.info("Registration page is displayed");
	    
	}

	@When("User enters data from excel sheet {string} and {int} for the username field")
	public void user_enters_data_from_excel_sheet_and_for_the_username_field(String sheetName, int rowNumber) 
		throws IOException {
			
			String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
			registerPageObj.enterUserNameRegTxtBox(Inputs[0]);
			registerPageObj.registerBtnClick();
		    
		}	
	
	@Then("User should be able to enter username from {string} and {int} and click Register button")
	public void user_should_be_able_to_enter_username_and_click_register_button(String sheetName, int rowNumber) 
			throws IOException {
		Assert.assertTrue(registerPageObj.isUsernameEnteredCorrectly(), "Username was not entered correctly");
		
	}

	@When("User enters invalid data from excel sheet {string} and {int} for the username field")
	public void user_enters_invalid_data_from_excel_sheet_and_for_the_username_field(String sheetName, Integer rowNumber) throws IOException  {
		
		registerPageObj.registerLinkClick();
		String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
		registerPageObj.enterUserNameRegTxtBox(Inputs[0]);
		registerPageObj.enterPasswordRegTxtBox(Inputs[1]);
		registerPageObj.enterPasswordConfirmRegTxtBox(Inputs[2]);
	}

	@Then("User gets error message for username in the Register page")
	public void user_gets_error_message_for_username_in_the_register_page() {
		registerPageObj.registerBtnClick();
		String invalidMsg = registerPageObj.errorMessageDisplayed();
		Assert.assertNotNull(invalidMsg, "Error message for username is not displayed");
		}

	@When("User enters data from excel sheet {string} and {int} for the password fields")
	public void user_enters_data_from_excel_sheet_and_for_the_password_fields(String sheetName, Integer rowNumber)
			throws IOException {
		registerPageObj.registerLinkClick();
		String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
		registerPageObj.enterPasswordRegTxtBox(Inputs[1]);
		registerPageObj.registerBtnClick();		
	}

	@Then("User should be able to enter password {string} and {int} and click Register button")
	public void user_should_be_able_to_enter_password_and_click_register_button(String sheetName, int rowNumber) 
			throws IOException {
		Assert.assertTrue(registerPageObj.isPasswordEnteredCorrectly(), "Password was not entered correctly");
		
	}

	@When("User enters invalid data from excel sheet {string} and {int} for the password field")
	public void user_enters_invalid_data_from_excel_sheet_and_for_the_password_field(String sheetName, Integer rowNumber)
			throws IOException {
		registerPageObj.registerLinkClick();
		String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
		registerPageObj.enterUserNameRegTxtBox(Inputs[0]);
		registerPageObj.enterPasswordRegTxtBox(Inputs[1]);
		registerPageObj.enterPasswordConfirmRegTxtBox(Inputs[2]);
		registerPageObj.registerBtnClick();
	    
	}

	@Then("User gets an error message for password in the Register page")
	public void user_gets_an_error_message_for_password_in_the_register_page() {
		String invalidMsg = registerPageObj.errorMessageDisplayed();
		try {
		Assert.assertNotNull(invalidMsg, "Error message for password is not displayed");
		
		}
		catch(NoSuchElementException e){
			//defect to raise in jiira
			Assert.fail("Password fields are accpeting commenly used words");
			
		}
	    
	}

	@When("User enters data from excel sheet {string} and {int} for blank feilds")
	public void user_enters_data_from_excel_sheet_and_for_blank_feilds(String sheetName, Integer rowNumber)
			throws IOException {
		registerPageObj.registerLinkClick();
		String[] Inputs = readExcel.excelDataRead(sheetName, rowNumber);
		registerPageObj.enterUserNameRegTxtBox(Inputs[0]);
		registerPageObj.enterPasswordRegTxtBox(Inputs[1]);
		registerPageObj.enterPasswordConfirmRegTxtBox(Inputs[2]);
		registerPageObj.registerBtnClick();
	    
	}

	@Then("User gets error message in register page")
	public void user_gets_error_message_in_register_page() {
		String actualmessage = loginPageObj.getPopUpMessage();
		Assert.assertNotNull(actualmessage, "Error message popup is not displayed");
		    
	}
}
