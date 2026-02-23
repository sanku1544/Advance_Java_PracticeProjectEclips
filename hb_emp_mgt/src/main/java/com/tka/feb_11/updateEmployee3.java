package com.tka.feb_11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class updateEmployee3 {
	public static void main(String[] args) {
			
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		
		Employee e1= new Employee(80,"Rakesh","Developer",51000.0);
		Employee employee = ss.get(Employee.class,e1.getEid());
		
		if(employee!=null) {
			ss.clear();
			sf.openSession();
			System.out.println("Data Present");
			ss.update(e1);
			System.out.println("data update succesfully");
			ss.beginTransaction().commit();
		}else {
			System.out.println("Not Present");
			ss.save(e1);
			System.out.println("data insert succesfully");
			ss.beginTransaction().commit();
		}
		
		
		
		
		
	}

}
