package com.scs340.carservicefinder.Models;

public class cart{
    private int userid;
    private int shopid;
    private int serviceid;
    private String price;
    private String serviceName;

    public cart(){}

    public cart(int usid, int shopid, int serid, String price, String sername){
        this.userid= usid;
        this.shopid= shopid;
        this.serviceid = serid;
        this.price= price;
        this.serviceName= sername;
    }

    public void setUserid(int id){this.userid=id;}
    public int getUserid(){return userid;}

    public void setShopid(int id2){this.shopid=id2;}
    public int getShopid(){return shopid;}

    public void setServiceid(int serid){this.serviceid=serid;}
    public int getServiceid(){return serviceid;}

    public void setPrice(String price){this.price=price;}
    public String getPrice(){return price;}

    public void setServiceName(String sername){this.serviceName=sername;}
    public String getServiceName(){return serviceName;}
}