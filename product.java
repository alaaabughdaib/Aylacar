package com.example.sw;

public class product {
    private int productId;
   private  String productName;
   private String category;
   private String picture;
   private double cost;

boolean productDone;
   int productStatus;

   public product(int productId,String productName,String category,String picture,double cost,boolean productDone, int productStatus){
    this.productName=productName;
    this.productId=productId;
    this.category=category;
    this.picture=picture;
    this.cost=cost;
    this.productDone = productDone;
    this.productStatus = productStatus;

   }

public String getProductName(){
       return productName;
}
public String getCategory(){
       return category;
}
public String getPicture(){
       return picture;
}

public  double getCost(){
       return cost;
}
    public int getProductId() {
        return productId;
    }

public  void setId (int productId){this.productId=productId;}

    public boolean getProductDone() {
        return productDone;
    }


   public int getProductStatus(){
        return productStatus;
   }
    public void setProductDone(boolean productDone){
        this.productDone = productDone;
    }
   public void setProductStatus(int productStatus) {this.productStatus = productStatus;}
}