package com.example.sw;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.Level;
import java.util.logging.Logger;
public class Admin {

    private String username;
    private String password;
    Logger logger = Logger.getLogger(Admin.class.getName());

    protected List<product> findByNameProduct = new ArrayList<>();
    protected List<customer> findByNameCustomer = new ArrayList<>();
    protected List<installer> findByNameInstaller = new ArrayList<>();

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

  public   Admin(){ }


    public boolean addProduct(product newProduct) {
        for (product oldproduct : findByNameProduct) {
            if (oldproduct.getProductId() == (newProduct.getProductId())) {
                logger.log(Level.INFO, "product is Exist");
                return true;
            }
        }
        logger.log(Level.INFO, "PRODUCT will added to list");
        findByNameProduct.add(newProduct);
        return false;


    }

    public boolean deleteProduct(int id){
        for(product existProduct : findByNameProduct){
            if(existProduct.getProductId()== (id)){
                logger.log(Level.INFO,"Exist");
                findByNameProduct.removeIf(n -> (n.getProductId() == (id)));
                return true;
            }}
        logger.log(Level.INFO,"Not Exist");
        return false;
    }
    public boolean searchProduct(int id){
        for(product existProduct : findByNameProduct){
            if(existProduct.getProductId() == (id)){
                logger.log(Level.INFO,"Exist");
                return true;
            }
        }
        logger.log(Level.INFO,"Not Exist");
        return false;
    }





    public boolean updateProduct(product toUpdate,int id){
        int neededIndex = 0;
        for(product product : findByNameProduct) {
            boolean temp = searchProduct(id);
            if(temp){
                return  true;
            }

        }
        findByNameProduct.set(neededIndex-1,toUpdate);
        return false;
    }


    public boolean searchCustomerByEmail(String email){
        for(customer existCustomer : findByNameCustomer){
            if(existCustomer.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    public boolean addCustomer(customer newCustomer) {
        for (customer cus : findByNameCustomer) {
            if (cus.getId() == (newCustomer.getId())) {
                logger.log(Level.INFO, "custOmEr is Exist");
                return true;
            }
        }
        logger.log(Level.INFO, "CUSTOMER will added to list");
        findByNameCustomer.add(newCustomer);
        return false;


    }
    public boolean addinstaller(installer newInstaller) {
        for (installer oldInstaller : findByNameInstaller) {
            if (oldInstaller.getInstallerId() == (newInstaller.getInstallerId())) {
                logger.log(Level.INFO, "installer is Exist");
                return true;
            }
        }
        logger.log(Level.INFO, "installer will added to list");
        findByNameInstaller.add(newInstaller);
        return false;
    }



    }
