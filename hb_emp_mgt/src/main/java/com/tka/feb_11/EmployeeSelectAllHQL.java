package com.tka.feb_11;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeSelectAllHQL {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		List<Employee> list = ss.createQuery("from Employee where sal>=5000").list();
		list.forEach(System.out::println);
		
		
	}

}
