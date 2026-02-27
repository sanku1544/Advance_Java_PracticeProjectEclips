package com.tka.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int eid;
	String name;
	String role;
	String mobile;
	String email;
	String password;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String role, String mobile, String email, String password) {
		super();
		this.name = name;
		this.role = role;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", role=" + role + ", mobile=" + mobile + ", email=" + email
				+ ", password=" + password + "]";
	}
	
	
	

}
