package com.tka.feb_12;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudetData {

	public static void main(String[] args) {
			
		Configuration con =new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Student e1 = ss.get(Student.class, 1);
		e1.setName("Harish");
		ss.update(e1);
		
		
		
		tr.commit();
		System.out.println("Update successfully---\n");
		Student s2 = ss.get(Student.class, 1);
		System.out.println(s2);

		sf.close();
		
	}

}
