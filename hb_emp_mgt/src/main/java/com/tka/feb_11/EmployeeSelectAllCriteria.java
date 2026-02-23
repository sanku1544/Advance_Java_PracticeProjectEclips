package com.tka.feb_11;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeSelectAllCriteria {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		List<Employee> list = ss.createCriteria(Employee.class).list();
		list.forEach(System.out::println);
		
//		for(Employee e1:list) {
//			System.out.println(e1.getName()+"  "+e1.getSal());
//		}
		
	}

}
