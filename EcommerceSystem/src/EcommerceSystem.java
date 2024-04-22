/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;


public class EcommerceSystem {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the E-commerce system!");
        
        System.out.println("Please enter your id:");
        int c = Integer.parseInt(sc.nextLine());
        System.out.println("Please enter your name:");
        String na = sc.nextLine();
        System.out.println("Please enter your address:");
        String a = sc.nextLine();
        
        Customer c1 = new Customer(c,na,a);
        
        System.out.println("How many products you want to your cart?");
        int n = sc.nextInt();
        
        Cart ca = new Cart(c,n);
        
        ca.addProduct(n);
        int x = 1;
        Order O = new Order(c,n,(float)ca.calculatePrice(),x,ca.products); 
        
        System.out.println("your total is "+ca.calculatePrice()+". Would you like to place the order? 1- yes 2- no");
        int YN = sc.nextInt();
        
        if(ca.placeOrder(YN) == true){
                O.printOrderInfo();
                x++;
                }
}
}