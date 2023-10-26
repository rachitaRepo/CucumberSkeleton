package stepdefinition;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class register {
 
	/*
	 * @BeforeStep public void atBeforeEveryStep() {
	 * 
	 * System.out.println(">>>>Before each step"); }
	 * 
	 * @AfterStep public void atAfterEveryStep() {
	 * 
	 * System.out.println(">>>>After each step"); }
	 */
	 
	@Given("^user is on Registration page$")  // regular expression
	public void user_is_on_registration_page() {
	    
		System.out.println(">>>User is on Registration page");
	}

	
	@When("user enters below details")
	public void  user_enters_below_details (DataTable dataTable) {
		
		Map<String, String> map=dataTable.asMap(String.class, String.class);
		
		System.out.println("User enters the First name as " + map.get("firstname"));
		System.out.println("user enterd lastname as " + map.get("lastName"));
		System.out.println("user enterd emailAddress as " + map.get("emailAddress"));
		System.out.println("user enterd telephone as " + map.get("telephone"));
		System.out.println("user enterd password as " + map.get("password"));
		System.out.println("user enterd confirmpassword as " + map.get("confirmpassword"));

		
		System.out.println(">>>>Data Table values has taken");
	}
	@When("^user select the privacy Policy$")
	public void user_select_the_privacy_policy() {
		System.out.println(">>>user selected the P Policy");
	}
	@And("^user click on Continue button$")
	public void user_click_on_continue_button() {
	   System.out.println(">>>Continue button is clicked");
	}
	@Then("^User should be able to register successfully with message display$")
	public void user_should_be_able_to_register_successfully_with_message_display() {
		System.out.println(">>>user is able to register successfully");
	    
	}

	/*
	 * @When("user enter the firstName as {string}") // {String} is cucu express,
	 * either of these we use, public void user_enter_the_first_name_as(String name)
	 * { System.out.println(">>>Name is: " + name); }
	 * 
	 * 
	 * 
	 * @When("user enter the Last name as  {string}") public void
	 * user_enter_the_last_name_as(String lName) {
	 * System.out.println(">>>Last Name is: " + lName); }
	 * 
	 * 
	 * 
	 * @When("user enter emailaddress as {string}") public void
	 * user_enter_emailaddress_as(String email) {
	 * System.out.println(">>>email address is: " + email);
	 * 
	 * }
	 * 
	 * @When("user enter telephone as {string}") public void
	 * user_enter_telephone_as(String telephone) {
	 * System.out.println(">>>telephone  is: " + telephone); }
	 * 
	 * @When("user enter password as {string}") public void
	 * user_enter_password_as(String password) {
	 * System.out.println(">>>password  is: " + password); }
	 * 
	 * @When("user enter confirmpassword as {string}") public void
	 * user_enter_confirmpassword_as(String conPass) {
	 * System.out.println(">>>conPassword  is: " + conPass); }
	 */
	
}
