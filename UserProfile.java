package aylacar.acceptance_tests;

import javax.swing.JButton;

import aylacar.Customer;
import aylacar.home_frame;
import aylacar.installation_frame;
import aylacar.order_history_frame;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class UserProfile {

	
	home_frame h;
	String name=null;
	String password=null;
	String email=null;
	Customer c=new Customer();
	
    @Given("the customer is logged in")
    public void theCustomerIsLoggedIn() {
    h=new home_frame();
    }

    @When("the customer navigates to the profile editing page")
    public void theCustomerNavigatesToTheProfileEditingPage() {
        JButton edit_profile=new JButton();
        edit_profile.doClick();
    }

    @When("updates their contact information")
    public void updatesTheirContactInformation(io.cucumber.datatable.DataTable dataTable) {
        name="aaaa";
        email="aaaa@aylacar";
    }

    @When("submits the profile editing form")
    public void submitsTheProfileEditingForm() {
    	 JButton submit=new JButton();
    	 submit.doClick();
    }

    @Then("the customer's profile should be updated successfully")
    public void theCustomersProfileShouldBeUpdatedSuccessfully() {
      c.update(name,email);
    }

    @When("the customer navigates to the order history page")
    public void theCustomerNavigatesToTheOrderHistoryPage() {
    	order_history_frame f=new order_history_frame();
    }

    @Then("the customer should see a list of past orders")
    public void theCustomerShouldSeeAListOfPastOrders() {
        
    }

    @Then("be able to view details of each order, including products, quantities, and order status")
    public void beAbleToViewDetailsOfEachOrderIncludingProductsQuantitiesAndOrderStatus() {
       
    }

    @When("the customer navigates to the installation requests page")
    public void theCustomerNavigatesToTheInstallationRequestsPage() {
        installation_frame i = new installation_frame();
    }

    @Then("the customer should see a list of past installation requests")
    public void theCustomerShouldSeeAListOfPastInstallationRequests() {
      
    }

    @Then("be able to view details of each installation request, including installer information and status")
    public void beAbleToViewDetailsOfEachInstallationRequestIncludingInstallerInformationAndStatus() {
        
    }
}
