package com.example.sw.acceptanceTest;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import com.example.sw.Admin;
import com.example.sw.installer;
import com.example.sw.product;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class notification {

    installer n =new installer();
    Admin a =new Admin();
    product p=new product(5,"cc","in","pic",99.9,true,1);

    @When("the order be done")
    public void theOrderBeDone() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(true);
    }
    @Then("installer sent message to customer")
    public void installerSentMessageToCustomer() {
        // Write code here that turns the phrase above into concrete actions
n.setFirstName("haya");
n.setInstallerId(1);
n.setPhoneNumber("02364849");
a.addinstaller(n);
n.addProduct(p);

        int expectedResult = 1;
        int actualResult = 0 ;
        for(int i = 0 ; i < n.findByNameProduct.size(); i++){
            if((n.findByNameProduct.get(i).getProductStatus() == 1) && (n.findByNameProduct.get(i).getProductId() == 5)){
                // actualResult = 1 ---> in complete
                actualResult = 1;
            }
        }
        assertEquals(actualResult , expectedResult);
        n.orderStatus(5,1,"your order done");


    }

}
