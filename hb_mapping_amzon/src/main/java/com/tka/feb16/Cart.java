package com.tka.feb16;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {

    @Id
    private int cartId;

    @OneToOne
    @JoinColumn(name = "customer_id")  // FK
    private Customer customer;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
    private List<Product> products;

    public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(int cartId, Customer customer, List<Product> products) {
		super();
		this.cartId = cartId;
		this.customer = customer;
		this.products = products;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
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

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", customer=" + customer + ", products=" + products + "]";
	}
    
}
