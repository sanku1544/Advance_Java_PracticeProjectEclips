package com.tka.EntityCustomer;

public class Customer {
	
	private int  cid;
	private String cname;
	private Long mob;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int cid, String cname, Long mob) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.mob = mob;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Long getMob() {
		return mob;
	}
	public void setMob(Long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", mob=" + mob + "]";
	}
	
}
