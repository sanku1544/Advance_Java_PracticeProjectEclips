package com.tka.entity;

import java.util.List;

public class OrderItems {
	
	private int oid;
	private Customer customer;
	private List<Product> plist;
	private int totaBill;
	 public OrderItems() {
		// TODO Auto-generated constructor stub
	}
	 public OrderItems(int oid, Customer customer, List<Product> plist, int totaBill) {
		super();
		this.oid = oid;
		this.customer = customer;
		this.plist = plist;
		this.totaBill = totaBill;
	 }
	 public int getOid() {
		 return oid;
	 }
	 public void setOid(int oid) {
		 this.oid = oid;
	 }
	 public Customer getCustomer() {
		 return customer;
	 }
	 public void setCustomer(Customer customer) {
		 this.customer = customer;
	 }
	 public List<Product> getPlist() {
		 return plist;
	 }
	 public void setPlist(List<Product> plist) {
		 this.plist = plist;
	 }
	 public int getTotaBill() {
		 return totaBill;
	 }
	 public void setTotaBill(int totaBill) {
		 this.totaBill = totaBill;
	 }
	 @Override
	 public String toString() {
		return "OrderItems [oid=" + oid + ", customer=" + customer + ", plist=" + plist + ", totaBill=" + totaBill
				+ "]";
	 }
	 
}
