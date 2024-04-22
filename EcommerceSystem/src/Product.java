/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yossef
 */
public class Product {
    private int productId;
    private String name;
    private float price;
    
    Product(){}
    
    Product(int productId,String name,float price){
        if(productId < 0){
         this.productId = Math.abs(productId);
        }else{
        this.productId = productId;}
        if(price < 0){
        this.price = Math.abs(price);
        }else{
        this.price = price;}
        this.name = name;
    }
    
    
    public void setProductId(int productId){
        if(productId < 0){
         this.productId = Math.abs(productId);
        }else{
        this.productId = productId;}
    }
    public int getProductId(){
        return productId;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    public void setprice(float price){
        if(price < 0){
        this.price = Math.abs(price);
        }else{
        this.price = price;}
    }
    public float getprice(){
        return price;
    }    
}
