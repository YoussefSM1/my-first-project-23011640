/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yossef
 */
public class ElectronicProduct extends Product{
   private String brand;
   private int warrantyPeriod;
    
    ElectronicProduct(){}
    
    ElectronicProduct(String brand,int warrantyPeriod,int productId,String name,float price){
    super(productId,name,price);
    this.brand = brand;
    if(warrantyPeriod < 0){ this.warrantyPeriod = Math.abs(warrantyPeriod);
    }else{this.warrantyPeriod = warrantyPeriod;}
    }
    
    public void setbrand(String brand){
    this.brand = brand;}
    public String getbrand(){
    return brand;}
    
    public void setwarrantyPeriod(int warrantyPeriod){
    if(warrantyPeriod < 0){ this.warrantyPeriod = Math.abs(warrantyPeriod);
    }else{this.warrantyPeriod = warrantyPeriod;}}
    public int getwarrantyPeriod(){
    return warrantyPeriod;}
}