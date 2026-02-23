package com.tka.entity;

public class Customer {
	
	private int id;
	private String name;
	private Long mob;
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, Long mob) {
		super();
		this.id = id;
		this.name = name;
		this.mob = mob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMob() {
		return mob;
	}
	public void setMob(Long mob) {
		this.mob = mob;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mob=" + mob + "]";
	}
	
	
}
