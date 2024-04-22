/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yossef
 */
public class Customer {
    private int customerId;
    private String name,address;
    
    Customer(){}
    
    Customer(int customerId,String name,String address){
    this.name = name;
    this.address = address;
    if(customerId < 0){
        this.customerId = Math.abs(customerId);
    }else{
    this.customerId = customerId;}
    }
    
    public void setcustomerId(int coustomerId){
     if(customerId < 0){
        this.customerId = Math.abs(customerId);
    }else{
    this.customerId = customerId;}
    }
    public int getcustomerId(){
    return customerId;}
    
    public void setname(String name){
    this.name = name;}
    public String getname(){
    return name;}
    
    public void setaddress(String address){
    this.address = address;}
    public String getaddress(){
    return address;}
}
