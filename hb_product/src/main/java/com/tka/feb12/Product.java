package com.tka.feb12;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
	@Id
	private int pid;
	private String pname;
	private String cat;
	private int price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String pname, String cat, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.cat = cat;
		this.price = price;
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
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", cat=" + cat + ", price=" + price + "]";
	}
	
}
