package com.tka.EntityCustomer;

import java.util.List;

public class OrderList {
		
	private int orderId;
	   private Customer customer;
	   private List<Product> products;
	   private int totalBill;
	   public OrderList(int orderId, Customer customer, List<Product> products, int totalBill) {
		super();
		this.orderId = orderId;
		this.customer = customer;
		this.products = products;
		this.totalBill = totalBill;
	   }
	   public int getOrderId() {
		   return orderId;
	   }
	   public void setOrderId(int orderId) {
		   this.orderId = orderId;
	   }
	   public Customer getCustomer() {
		   return customer;
	   }
	   public void setCustomer(Customer customer) {
		   this.customer = customer;
	   }
	   public List<Product> getProducts() {
		   return products;
	   }
	   public void setProducts(List<Product> products) {
		   this.products = products;
	   }
	   public int getTotalBill() {
		   return totalBill;
	   }
	   public void setTotalBill(int totalBill) {
		   this.totalBill = totalBill;
	   } 
	   
	   
}
