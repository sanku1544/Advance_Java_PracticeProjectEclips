package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.EmployeeDao;
import com.tka.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao empDao;
	
	public void addEmployee(Employee emp) {
		empDao.save(emp);
	}
	
	public void updateEmployee(Employee emp) {
		 empDao.save(emp);
	}
	
	public Employee getEmployeeById(int id) {
		return empDao.getById(id);
	}
	
	public void  deleteEmployeeById(int eid) {
		empDao.deleteById(eid);;
	}
	
	public List<Employee> getAllEmployee() {
		return empDao.findAll();
	}

	public boolean loginEmployee(String email, String password) {
		List<Employee> emp = getAllEmployee();
		for(Employee e:emp) {
			if(e.getEmail().equals(email)) {
				if(e.getPassword().equals(password)) {
					System.err.println("Login sucessfull...");
					return true;
				}
			}
		}
		System.err.println("Login failed...");
		return false;
	}
	
	
}
