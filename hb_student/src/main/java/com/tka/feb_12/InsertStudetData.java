package com.tka.feb_12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertStudetData {

	public static void main(String[] args) {
			
		Configuration con =new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		ss.save(new Student(1, "Rahul", 22));
		ss.save(new Student(2, "Sneha", 21));
		ss.save(new Student(3, "Amit", 23));
		ss.save(new Student(4, "Priya", 20));
		ss.save(new Student(5, "Rohan", 24));
		ss.save(new Student(6, "Neha", 22));
		ss.save(new Student(7, "Kiran", 21));
		ss.save(new Student(8, "Pooja", 23));
		ss.save(new Student(9, "Vikas", 25));
		ss.save(new Student(10, "Anjali", 22));
		ss.save(new Student(11, "Manish", 24));
		ss.save(new Student(12, "Komal", 20));
		ss.save(new Student(13, "Tejas", 23));
		ss.save(new Student(14, "Nikita", 21));
		ss.save(new Student(15, "Yogesh", 22));
		ss.save(new Student(16, "Swati", 24));
		ss.save(new Student(17, "Deepak", 23));
		ss.save(new Student(18, "Meena", 20));
		ss.save(new Student(19, "Arjun", 25));
		ss.save(new Student(20, "Sanket", 22));

		
		
		
		tr.commit();
		Student s2 = ss.get(Student.class, 3);
		System.out.println(s2);
		
		ss.close();
		sf.close();
		
	}

}
