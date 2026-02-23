package com.tka.feb_12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudetData3 {

	public static void main(String[] args) {
			
		Configuration con =new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Student e1 = new Student(252,"Raj",25);
		Student e2=ss.get(Student.class, e1.getId());
		if(e2!=null) {
			ss.clear();
			sf.openSession();
			System.out.println("data present");
			ss.update(e1);
			tr.commit();
			System.out.println("Data update successfully----");
		}else if(e2==null){
			ss.clear();
			sf.openSession();
			System.out.println("data not present");
			ss.save(e1);
			tr.commit();
			System.out.println("Data insert successfully----");
		}
		
		Student s2 = ss.get(Student.class, e1.getId());
		System.out.println(s2);

		sf.close();
		
	}

}
