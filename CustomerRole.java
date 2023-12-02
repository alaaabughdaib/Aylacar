
package aylacar.acceptance_tests;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import aylacar.Manage;
import aylacar.cart_frame;
import aylacar.home_frame;
import aylacar.list_frame;
import aylacar.p1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CustomerRole {

home_frame h;
String product_s=null;
Manage m=new Manage();
p1 p;
cart_frame c;
String address_c=null;
String name_c=null;
String phone_c=null;
JButton button;
	
	
	
	

@Given("the customer is on the product catalog page")
public void theCustomerIsOnTheProductCatalogPage() {
h=new home_frame();
}

@When("the customer views the list of available products")
public void theCustomerViewsTheListOfAvailableProducts() {
   
	h=new home_frame();
	
	
}

@Then("the customer should see a variety of products categorized into sections like {Interior} {Exterior} and {Electronics}")
public void theCustomerShouldSeeAVarietyOfProductsCategorizedIntoSectionsLikeAnd(String Interior, String Exterior, String Electronics) {
  
}

@When("the customer searches for a specific product by name or keyword")
public void theCustomerSearchesForASpecificProductByNameOrKeyword() {
 product_s="p1";
}

@Then("the customer should see relevant search results matching the product name or keyword")
public void theCustomerShouldSeeRelevantSearchResultsMatchingTheProductNameOrKeyword() {
	m.searchProductByName(product_s);
}

@When("the customer filters products by selecting a specific category \\(e.g., {Electronics})")
public void theCustomerFiltersProductsBySelectingASpecificCategoryEG(String string) {
	
m.FiltersProductsBySelectingASpecificCategory();

}

@Then("the customer should see only products belonging to the selected category")
public void theCustomerShouldSeeOnlyProductsBelongingToTheSelectedCategory() {
	
m.SeeOnlyProductsBelongingToTheSelectedCategory();

}

@Given("the customer is on the product details page")
public void theCustomerIsOnTheProductDetailsPage() {
	p = new p1();

}

@When("the customer clicks the {string} button for a specific product")
public void theCustomerClicksTheButtonForASpecificProduct(String AddtoCart) {
p1.addToCart();
}

@Then("the product should be added to the customer's shopping cart")
public void theProductShouldBeAddedToTheCustomerSShoppingCart() {
  JOptionPane.showMessageDialog(null, " Product Added To The Cart ");
}


@Given("the customer has added products to the shopping cart")
public void theCustomerHasAddedProductsToTheShoppingCart() {
c=new cart_frame();
}

@When("the customer proceeds to checkout")
public void theCustomerProceedsToCheckout() {

}

@When("completes the purchase by providing necessary details")
public void completesThePurchaseByProvidingNecessaryDetails() {
 name_c="alaa";
 phone_c="059812";
 address_c="nablus";
}

@Then("the customer should receive an order confirmation")
public void theCustomerShouldReceiveAnOrderConfirmation() {
	  int response = JOptionPane.showConfirmDialog(
	            null,
	            "Do you want to proceed?",
	            "Confirmation",
	            JOptionPane.YES_NO_OPTION
	        );
}

@Then("the purchased products should be removed from the shopping cart")
public void thePurchasedProductsShouldBeRemovedFromTheShoppingCart() {
c.remove(p);
}

@Given("the customer is logged in")
public void theCustomerIsLoggedIn() {
h=new home_frame();
}

@When("the customer navigates to the order history page")
public void theCustomerNavigatesToTheOrderHistoryPage() {
	button=h.getLoginButton();
	ActionListener[] listeners = button.getActionListeners();
	for (ActionListener listener : listeners) {
	    listener.actionPerformed(new ActionEvent(button, ActionEvent.ACTION_PERFORMED, ""));
	}
}

@Then("the customer should see a list of past orders")
public void theCustomerShouldSeeAListOfPastOrders() {
list_frame l =new list_frame();
}

@Then("be able to view details of each order, including products, quantities, and order status")
public void beAbleToViewDetailsOfEachOrderIncludingProductsQuantitiesAndOrderStatus() {

}


}
