package com.tka.feb16;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
   int pid;
   String name;
   int price;
  
  public Product() {
	// TODO Auto-generated constructor stub
}

  public Product(int pid, String name, int price) {
	super();
	this.pid = pid;
	this.name = name;
	this.price = price;
  }

  

  @Override
  public String toString() {
	return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
  }
   
}
