package com.tka.feb_11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class updateEmployee2 {
	public static void main(String[] args) {
			
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e1= new Employee(16,"Mayur","Designer",4500.0);
		ss.saveOrUpdate(e1);
		
		tr.commit();
		System.out.println("Data insert/update successfully--");
		
		
		Employee emp = ss.get(Employee.class, 16);
		System.out.println(emp);
		
		
	}

}
