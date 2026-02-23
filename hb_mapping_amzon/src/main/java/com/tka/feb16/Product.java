package com.tka.feb16;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {

    @Id
    private int pid;
    private String pname;
    private double price;

    @ManyToOne
    @JoinColumn(name = "cart_id")   // FK
    private Cart cart;

    public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int pid, String pname, double price, Cart cart) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.cart = cart;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", cart=" + cart + "]";
	}
    
}

