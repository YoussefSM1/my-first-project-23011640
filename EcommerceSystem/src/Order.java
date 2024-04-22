/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yossef
 */
public class Order {
    private int customerId;
    private int orderId;
    private float totalPrice;
    private int nProducts;
    Product[] products;
    
   Order(){}
   
   Order(int customerId,int nProducts, float totalPrice, int orderId, Product[] prod){
    this.customerId = customerId;
    this.nProducts = nProducts;
    this.products = new Product[nProducts];
    this.totalPrice = totalPrice;
    this.orderId = orderId;
    products = prod;
   }
    
    
    public void printOrderInfo(){
        System.out.println("Here's your order's summary:");
        System.out.println("order ID: "+orderId);
        System.out.println("customer ID: "+customerId);
        System.out.println("Product:");
        for(int i = 0; i < nProducts; i++){
           
            Product product = products[i];
            System.out.println(product.getname()+" - $"+product.getprice());
            
        }
        System.out.println("Total Price: "+totalPrice);
    }
}
