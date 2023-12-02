package com.example.sw;

import java.util.ArrayList;
import java.util.List;

public class installer {
    private int installerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String specialization;

    public installer() {

    }

    public List<product> findByNameProduct = new ArrayList<>();
    protected List<customer> findByNameCustomer = new ArrayList<>();

    public installer(int installerId, String firstName, String lastName, String email, String phoneNumber, String specialization) {
        this.installerId = installerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.specialization = specialization;
    }

    // Getters and Setters for the properties

    public int getInstallerId() {
        return installerId;
    }

    public void setInstallerId(int installerId) {
        this.installerId = installerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean searchProduct(int id) {
        for (product existProduct : findByNameProduct) {
            if (existProduct.getProductId() == (id)) {

                return true;
            }
        }
        return false;
    }


    public boolean addProduct(product newProduct){
        for(product oldProduct : findByNameProduct){
            if(oldProduct.getProductId()==(newProduct.getProductId())){

                return true;
            }
        }

        findByNameProduct.add(newProduct);
        return false;
    }



    public boolean searchCustomerByEmail(String email) {
        for (customer existCustomer : findByNameCustomer) {
            if (existCustomer.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
    public boolean searchCustomer(int id){
        for(customer existCustomer : findByNameCustomer){
            if(existCustomer.getId() == id){

                return true;
            }
        }

        return false;
    }


    public void orderStatus(int productId, int customerId, String email) {
        String status = "";

        for (int i = 0; i < findByNameProduct.size(); i++) {
            if ((searchCustomer(customerId) && searchProduct(productId) && searchCustomerByEmail(email)) && (findByNameProduct.get(i).getProductId() == productId)) {

                status = "Your Order Complete";
                SendEMail.getSendEmail(status, email);

            }


        }

    }
}