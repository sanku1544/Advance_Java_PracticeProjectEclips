package com.tka.Services;

import java.util.ArrayList;
import java.util.List;

import com.tka.Dao.Dao;
import com.tka.Entity.Employee;

public class Services {
	Dao d1= null;
	public Services() {
		d1= new Dao();
	}
	
	
	public List<Employee> getAllEmployees() {
		List<Employee> elist=d1.getAllEmployees();
		return elist;
	}
	public List<Employee> getTesters(String role) {
		List<Employee> elist=d1.getAllEmployees();
		List<Employee> emp=new ArrayList<>();
		
		for(Employee e:elist) {
			if(e.getRole().equalsIgnoreCase(role)) {
				emp.add(e);
			}
		}
		return emp;
	}
	public List<Employee> getByRoleSalary(String role1, int sal) {
		List<Employee> elist=d1.getAllEmployees();
		List<Employee> emp=new ArrayList<>();
		for(Employee e:elist) {
			if(e.getRole().equalsIgnoreCase(role1) && e.getSalary()>sal) {
				emp.add(e);
			}
		}
		return emp;
	}
	public List<Employee> updateSalary() {
		List<Employee> elist=d1.getAllEmployees();
		
		for(Employee e:elist) {
			if(e.getSalary()<10000) {
				
				e.setSalary((e.getSalary()*10/100)+e.getSalary());
			}else if(e.getSalary()>10000 && e.getSalary()<20000) {
				e.setSalary((e.getSalary()*15/100)+e.getSalary());
			}else if(e.getSalary()>20000) {
				e.setSalary((e.getSalary()*20/100)+e.getSalary());
			}
		}
		return elist;
	}
	

}
