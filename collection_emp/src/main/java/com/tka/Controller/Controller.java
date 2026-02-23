package com.tka.Controller;



import java.util.List;

import com.tka.Entity.Employee;
import com.tka.Services.Services;

public class Controller {

	Services s1=null;
	
	public Controller() {
		s1=new Services();
	}
	
	public List<Employee> getAllEmployess() {
		List<Employee> elist=s1.getAllEmployees();
		return elist;
	}
	public List<Employee> getTesters(String role) {
		 List<Employee> elist=s1.getTesters(role);
		return elist;
	}
	public List<Employee> getByRoleSalary(String role1, int sal) {
		 List<Employee> elist=s1.getByRoleSalary(role1,sal);
		return elist;
	}
	public List<Employee> updateSalary() {
		List<Employee> elist=s1.updateSalary();
				return elist;
	}
	

}
