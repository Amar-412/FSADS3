package com.klu.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Order {
 private int orderId;
 private String customerName;
 private int quantity;
 
 @Autowired // this will automatically inject the object of "Product" class if it exists
 private Product product;
 
 @Autowired
 public Order() {
	 this.orderId=2004;
	 this.customerName="Amar";
	 this.quantity=5;
 }
 
 
 public void display() {
	System.out.println("The following are the order details of customers");
	System.out.println("OrderID: "+orderId);
	System.out.println("CustomerName: "+customerName);
	System.out.println("Quantity: "+quantity);
	System.out.println("ProductID: "+product.getProductId());
	System.out.println("ProuductName: "+product.getProductName());
	System.out.println("ProductPrice: "+product.getPrice());
	System.out.println("ProductCategory: "+product.getCategory());
 }

 
}
