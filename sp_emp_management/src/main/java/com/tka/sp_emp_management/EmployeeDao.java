package com.tka.sp_emp_management;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	SessionFactory sf;
	
	public Employee getEmpById(int id) {
		Session ss = sf.openSession();
		return ss.find(Employee.class, id);
	}

	public String addEmployee(Employee emp) {
		Session ss = sf.openSession();
		ss.persist(emp);
		ss.beginTransaction().commit();
		return emp.getName()+" :- "+"was successfully inserted...";
	}

	public String updateEmployee(Employee emp) {
		Session ss = sf.openSession();
		ss.merge(emp);
		ss.beginTransaction().commit();
		return emp.getName()+" :- "+"was successfully updated..."; 
	}

	public String deleteEmployee(int id) {
		String show=null;
		Session ss = sf.openSession();
		Employee employee = ss.find(Employee.class, id);
		if(employee!=null) {
			ss.remove(employee);
			ss.beginTransaction().commit();
			show=employee.getName()+" :- "+"was successfully delete...";
		}else {
			show="Employee not found....";
		}
		return show;
	}

	public List<Employee> getAllEmployee() {
		Session ss = sf.openSession();
		List<Employee> emp=ss.createQuery("from Employee").list();
		return emp;
	}

	public List<Employee> getEmpByRole(String role) {
		Session ss = sf.openSession();
		List<Employee> list = ss.createQuery("from Employee").list();
		List<Employee> rlist=new ArrayList<>();
		for(Employee e:list) {
			if(e.getRole().equalsIgnoreCase(role)) {
				rlist.add(e);
			}
		}
		return rlist;
	}

	public List<Employee> getEmpBySalary(int sal) {
		Session ss = sf.openSession();
		List<Employee> list = ss.createQuery("from Employee").list();
		List<Employee> rlist=new ArrayList<>();
		for(Employee e:list) {
			if(e.getSalary()>sal) {
				rlist.add(e);
			}
		}
		return rlist;
	}

}
