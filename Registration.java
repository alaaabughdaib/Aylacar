package aylacar.acceptance_tests;



import javax.swing.JOptionPane;

import org.hamcrest.CustomMatcher;

import aylacar.Customer;
import aylacar.Manage;
import aylacar.adminf;
import aylacar.loginf;
import aylacar.signupf;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	String name ;
	String pass;
	Manage m = new Manage();
	@Given("the user is on the registration page")
	
	public void theUserIsOnTheRegistrationPage() {
	    // Write code here that turns the phrase above into concrete actions
		signupf m = new signupf();
		m.setVisible(true);
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user enters their name {string} email {string} and password {string}")
	public void theUserEntersTheirNameEmailAndPassword(String string, String string2, String string3) {
	
			
			name=name.getText();
			pass = pass.getText();
			
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("clicks the {string} button")
	public void clicksTheButton(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		if (signupb.clicked) {
			user.check();
			
			
		}
		
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user's account is created")
	public void theUserSAccountIsCreated() {
		Customer c = new Customer();
	    m.addCustomer(c);// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("they receive a confirmation email")
	public void theyReceiveAConfirmationEmail() {
	   m.sendemail(); // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	

	@Given("there is an existing user with the email {string}")
	public void thereIsAnExistingUserWithTheEmail(String string) {
		boolean c;
		c=m.customerExistsByEmail(string);
	  //e code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
	@When("the user enters their name {string} the existing email {string} and password {string}")
	public void theUserEntersTheirNameTheExistingEmailAndPassword(String string, String string2, String string3) {
		boolean c;
		c=m.customerExistsByEmail(string);
	    throw new io.cucumber.java.PendingException();
	}

	@Then("an error message is displayed")
	public void anErrorMessageIsDisplayed() {
		   JOptionPane.showMessageDialog(null,"unvalid email","Alert",JOptionPane.WARNING_MESSAGE);     
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user's account is not created")
	public void theUserSAccountIsNotCreated() {
		 JOptionPane.showMessageDialog(null,"registration failed","Alert",JOptionPane.WARNING_MESSAGE);     
	    throw new io.cucumber.java.PendingException();
	}
	
	
	

	@Given("the user is on the login page")
	public void theUserIsOnTheLoginPage() {
	   loginf l=new loginf();
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user enters their valid email {string} and vlid password {string}")
	public void theUserEntersTheirValidEmailAndVlidPassword(String string, String string2) {
	  m.customerExists(string, string2);
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user is successfully logged in")
	public void theUserIsSuccessfullyLoggedIn() {
		 JOptionPane.showMessageDialog(null, "success");     
	    throw new io.cucumber.java.PendingException();
	}

	@Then("new page will open")
	public void newPageWillOpen() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user enters an incorrect email {string} and incorrect password {string}")
	public void theUserEntersAnIncorrectEmailAndIncorrectPassword(String string, String string2) {
	    m.customerExists(string, string2);
	    throw new io.cucumber.java.PendingException();
	}

	@Then("the user is not logged in")
	public void theUserIsNotLoggedIn() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user enters their valid email {string} and invalid password {string}")
	public void theUserEntersTheirValidEmailAndInvalidPassword(String string, String string2) {
	    m.isCustomerPasswordCorrect(string, string2);
	    throw new io.cucumber.java.PendingException();
	}

	@When("the user enters their invalid email {string} and valid password {string}")
	public void theUserEntersTheirInvalidEmailAndValidPassword(String string, String string2) {
	    m.customerExistsByEmail(string);
	    throw new io.cucumber.java.PendingException();
	}

	@Given("an admin is logged into their account")
	public void anAdminIsLoggedIntoTheirAccount() {
	    adminf m = new adminf();
	    m.setVisible(true);// Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
