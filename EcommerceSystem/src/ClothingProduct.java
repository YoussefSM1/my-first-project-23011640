/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yossef
 */
public class ClothingProduct extends Product{
    private String size,fabric;
    
    ClothingProduct(){}
    
    ClothingProduct(String size,String fabric,int productId,String name,float price){
    super(productId,name,price);
    this.size = size;
    this.fabric = fabric;}
    
    public void setsize(String size){
    this.size = size;}
    public String getsize(){
    return size;}
    
    public void setfabric(String fabric){
    this.fabric = fabric;}
    public String getfabric(){
    return fabric;}
}
