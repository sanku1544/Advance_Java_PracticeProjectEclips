package com.tka.feb_12;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class StudentSelectAllCriteria {
	public static void main(String[] args) {
			
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		List<Student> list = ss.createCriteria(Student.class).list();
		list.forEach(System.out::println);
		
		
	}

}
