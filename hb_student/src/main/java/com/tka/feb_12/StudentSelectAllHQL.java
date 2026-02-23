package com.tka.feb_12;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class StudentSelectAllHQL {
	public static void main(String[] args) {
			
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
			
		List<Student> list = ss.createQuery("from Student  ").list();
		list.forEach(System.out::println);
		
	}

}
