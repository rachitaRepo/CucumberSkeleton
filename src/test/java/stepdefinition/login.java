package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class login {
	
	/*  as hooks method is seperatly called
	 * @Before("@register ") public void setUp() {
	 * 
	 * System.out.println(" >>>Broswer -opening when register for all fiels "); }
	 * 
	 * @After("@register") public void tearDown() {
	 * 
	 * System.out.println(">>>Close browser after registration scenario"); }
	 * 
	 * @Before("@smoke ") public void smokeTestStart() {
	 * 
	 * System.out.println(" >>before each Smoke test execution "); }
	 * 
	 * @Before("@smoke ") public void atSmoketestFinsih() {
	 * 
	 * System.out.println(" >>after each Smoke test execution "); }
	 */
	
	
	
	
	  @Given ("User is at Login Page") public void user_is_at_login_page1() {
	  System.out.println(">>> User is on Login page"); }
	 
	 
	 

	@When("^Enter the Valid email address (.+)$")
	public void enter_the_valid_email_address(String emailaddressText) {
	  System.out.println(">>user enter the Valid email " + emailaddressText );
	}

	@And("^Enter the valid password (.+)$")
	public void enter_the_valid_password(String passwordtext) {
		System.out.println(">>user enter the Valid password " + passwordtext );


	}

	@When("Click on Login button")
	public void click_on_login_button() {
		System.out.println(">>user clicked on Login button");

	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
	 System.out.println(">>User logged in successfully");
	}
//===============================================================

//	@When("Enter the Invalid email add {string}")
	@When("^Enter the Invalid email add (.+)$")
	public void enter_the_invalid_email_add(String invalidEmailAdd) {
		 System.out.println(">>user enter the inValid email " + invalidEmailAdd );
	}

//	@When("Enter the Invalid password {string}")
	@When("^Enter the Invalid password (.+)$")
	public void enter_the_invalid_password(String invalidpass) {
		 System.out.println(">>user enter the inValid password " + invalidpass);
	}
//===============================================================================
	@Then("User should get warning message Warning: {string}")
	public void user_should_get_warning_message_warning(String warningMsg) {
		 
		System.out.println(">>user should get warning message like" + warningMsg );
		
	   
	}

	

	@When("User do not enters any credential")
	public void user_donot_enters_any_credential() {
		System.out.println(">>User not entered any credentials");
	  
	}

}
