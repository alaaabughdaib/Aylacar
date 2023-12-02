package aylacar.acceptance_tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import aylacar.home_frame;
import aylacar.login_frame;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	login_frame l ;
	String email=null;
	String password=null;
	JButton button;
	home_frame h;
	
	
	@Given("the user is on the login page")
	public void theUserIsOnTheLoginPage() {
	 l=new login_frame();
	}

	@When("the user enters valid credentials")
	public void theUserEntersValidCredentials(io.cucumber.datatable.DataTable dataTable) {
      email="ayla@aylacar";
      password="1234";
	}

	@When("submits the login form")
	public void submitsTheLoginForm() {
		 button = l.getLoginButton();
		ActionListener[] listeners = button.getActionListeners();
		for (ActionListener listener : listeners) {
		    listener.actionPerformed(new ActionEvent(button, ActionEvent.ACTION_PERFORMED, ""));
		}
	}

	@Then("the user should be successfully logged in")
	public void theUserShouldBeSuccessfullyLoggedIn() {
     h= new home_frame();
	}

	@When("the user enters an incorrect password")
	public void theUserEntersAnIncorrectPassword(io.cucumber.datatable.DataTable dataTable) {
    email="ayla@aylacar";
    password="12333";
	}

	@Then("the login should fail, and an error message should be displayed")
	public void theLoginShouldFailAndAnErrorMessageShouldBeDisplayed() {
     JOptionPane.showMessageDialog(null, "Incorrect Password , Log in Failed");
	}

	@When("the user enters a non-existing email")
	public void theUserEntersANonExistingUsername(io.cucumber.datatable.DataTable dataTable) {
     email="non@aylacar";
     password="1234";
	}

	@Then("the login should fail, and an error message should indicate the username is not registered")
	public void theLoginShouldFailAndAnErrorMessageShouldIndicateTheUsernameIsNotRegistered() {
		 JOptionPane.showMessageDialog(null, "Incorrect Email , Log in Failed");
	}

	@When("the user leaves the email field empty")
	public void theUserLeavesTheUsernameFieldEmpty(io.cucumber.datatable.DataTable dataTable) {
    email=null;
    password="1234";
	}

	@Then("the login should fail, and an error message should be displayed indicating the email field is required")
	public void theLoginShouldFailAndAnErrorMessageShouldBeDisplayedIndicatingTheUsernameFieldIsRequired() {
		JOptionPane.showMessageDialog(null, " Email Empty , Log in Failed");
	}

	@When("the user leaves the password field empty")
	public void theUserLeavesThePasswordFieldEmpty(io.cucumber.datatable.DataTable dataTable) {
    email="ayla@aylacar";
    password=null;
	}

	@Then("the login should fail, and an error message should be displayed indicating the password field is required")
	public void theLoginShouldFailAndAnErrorMessageShouldBeDisplayedIndicatingThePasswordFieldIsRequired() {
		JOptionPane.showMessageDialog(null, " Password Empty , Log in Failed");
	}

}
