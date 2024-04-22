/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yossef
 */
public class BookProduct extends Product{
    private String author,publisher;
    
    BookProduct(){}
    
    BookProduct(String author,String publisher,int productId,String name,float price){
    super(productId,name,price);
    this.author = author;
    this.publisher = publisher;}
    
    public void setauthor(String author){
    this.author = author;}
    public String getauthor(){
    return author;}
    
    public void setpublisher(){
    this.publisher = publisher;}
    public String getpublisher(){
    return publisher;}
}