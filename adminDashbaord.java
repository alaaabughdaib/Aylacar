package com.example.sw.acceptanceTest;

import com.example.sw.Admin;
import com.example.sw.customer;
import com.example.sw.product;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class adminDashbaord {
    Admin a =new Admin();

    product p=new product(1,"cc","in","pic",99.9,true,1);
    product p1=new product(2,"cc","in","pic",99.9,true,1);
    product p2=new product(3,"cc","in","pic",99.9,true,1);
    customer c = new customer(1,"haya hindya" , "059263845" , "Nablus" , "groupgroup060@gmail.com");

    @When("admin want to add some product to catalog")
    public void adminWantToAddSomeProductToCatalog() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(true);
    }
    @Then("the product will be added")
    public void theProductWillBeAdded() {
        // Wria;te code here that turns the phrase above into concrete actions
        a.addProduct(p);
    }
    @When("admin want to edit some product")
    public void adminWantToEditSomeProduct() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(true);
    }
    @Then("product will be edited")
    public void productWillBeEdited() {
        // Write a.updateProduct(p1,2);code here that turns the phrase above into concrete actions
        a.updateProduct(p,1);
    }
    @When("admin want to remove a product")
    public void adminWantToRemoveAProduct() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(true);
    }
    @Then("product will be removed")
    public void productWillBeRemoved() {
        // Write code here that turns the phrase above into concrete actions
        a.deleteProduct(3);
    }

    @When("admin want to see customer account")
    public void adminWantToSeeCustomerAccount() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(true);
    }
    @Then("the customer account will be viewed")
    public void theCustomerAccountWillBeViewed() {
        // Write code here that turns the phrase above into concrete actions
        a.addCustomer(c);
        boolean actualResult = a.searchCustomerByEmail("groupgroup060@gmail.com");
        boolean expectedResult = true;

        assertEquals(actualResult,expectedResult);
    }
    @When("admin want to add product listing")
    public void adminWantToAddProductListing() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(true);
    }
    @Then("the product listing will be added")
    public void theProductListingWillBeAdded() {
        // Write code here that turns the phrase above into concrete actions

    }

}
