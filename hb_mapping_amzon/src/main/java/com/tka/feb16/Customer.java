package com.tka.feb16;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

    @Id
    private int cid;
    private String name;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Cart cart;

   public Customer() {
	// TODO Auto-generated constructor stub
}

   public Customer(int cid, String name, Cart cart) {
	super();
	this.cid = cid;
	this.name = name;
	this.cart = cart;
   }

   public int getCid() {
	return cid;
   }

   public void setCid(int cid) {
	this.cid = cid;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public Cart getCart() {
	return cart;
   }

   public void setCart(Cart cart) {
	this.cart = cart;
   }

   @Override
   public String toString() {
	return "Customer [cid=" + cid + ", name=" + name + ", cart=" + cart + "]";
   }
   
}
