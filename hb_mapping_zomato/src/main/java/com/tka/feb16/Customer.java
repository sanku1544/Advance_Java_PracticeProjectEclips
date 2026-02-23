package com.tka.feb16;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 int cid;
	 String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name= "cid")
	List<Product> product;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String name, List<Product> product) {
		super();
		this.cid = cid;
		this.name = name;
		this.product = product;
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

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", product=" + product + "]";
	}
	
	
	
	

}
