package com.tka.feb_12;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteStudetData {

	public static void main(String[] args) {
			
		Configuration con =new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Student e1 = ss.get(Student.class, 2);
		
		ss.delete(e1);
		
		
		
		tr.commit();
		System.out.println("Delete successfully---\n");
		Student s2 = ss.get(Student.class, e1.getId());
		System.out.println(s2);
		ss.close();
		sf.close();
		
	}

}
