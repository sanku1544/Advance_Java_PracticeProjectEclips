package com.tka.Dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.Entity.Employee;

public class Dao {
	 
	public List<Employee> getAllEmployees(){
		List<Employee> elist=new ArrayList<>();
		elist.add(new Employee(1,"Sanket","Developer",45000));
		elist.add(new Employee(2,"Atul","Tester",20000));
		elist.add(new Employee(3,"Harish","Developer",15000));
		elist.add(new Employee(6,"Manish","Tester",35000));
		elist.add(new Employee(5,"Rakesh","Developer",27000));
		elist.add(new Employee(4,"Rakesh","Developer",27000));
		
		return elist;
	}
}
