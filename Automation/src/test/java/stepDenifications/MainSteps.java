package stepDenifications;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
	@Given("User is on NetBanking landing page")
	public void user_is_on_net_banking_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on NetBanking landing page");
	    System.out.println("how are you?");
	    System.out.println("what is your name?");
	    System.out.println("123?");
	    System.out.println("45633?"); 
	    System.out.println("add branch");
	    
	}
	
	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {
		System.out.println("User is on Practice landing page");
	}
	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
		System.out.println(data.get(0));
	    
	}
	
	
	@When("^User login into application with (.+) and password (.+)$")
	public void user_login_into_application_with_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(username + " and password is "+password);
	}
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Home Page is displayed");
	
	}
	@Then("Cards are displayed")
	public void cards_are_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("Cards are displayed");
	}
	@Given ("Setup the entries in database")
	public void SetupEntries()
	{System.out.println("***************");
	System.out.println("Setup the entries in database");
	}
	
	@When ("launch the browser from config variables")
	public void LaunchBrowser()
	{
		System.out.println("launch the browser from config variables");
	}
	@When ("hit the home page url of banking site")
	public void HitURL()
	{
		System.out.println("hit the home page url of banking site");
	}
	@When ("hit the home page url of banking site")
	public void HitURL1()
	{
		System.out.println("hit the home page url of banking site");
	}
}
