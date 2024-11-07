package com.scs340.carservicefinder.Models;


public class Service {
    private int productid;
    private String productname;
    private int shopid;
    private float price;

    // constructor
    public Service(){}
    // default constructor
    public Service(int pid, String pname, int shopid, float price ) {
        this.productid = pid;
        this.productname = pname;
        this.shopid= shopid;
        this.price= price;
    }

    //getters and setters
    public void setProductid(int pid) {
        this.productid = pid;
    }
    public String getpid() {
        return productid;
    }
    public void setProductname(String name) {
        this.productname = name;
    }
    public String getName() {
        return productname;
    }
    public int getShopid(){
        return shopid;
    }
}
