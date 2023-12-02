package com.example.sw;

public class customer {
    private int id ;
    private String name ;
    private String phone ;
    private String address ;
    private String email;


    public customer(){}
    public customer(int id , String name , String phone , String address , String email ){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;

    }


    // setters and getters Functions
    ////////////////////////////////////////////////////////////////



    public void setId(int id){
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email){this.email = email;}

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail(){return email;}

    ///////////////////////////////////////////////////////////////

    // method to add new Customer
    public customer addCustomer(){
        return new customer(id,name,phone,address,email) ;
    }




}
