package com.tka.feb12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class updateProduct3 {
		
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session son = sf.openSession();
		Product p1= new Product(2,"Happy Happy","Food",10);
		
		Product prod = son.get(Product.class, p1.getPid());
		if(prod!=null) {
			System.out.println("data was present");
			son.clear();
			sf.openSession();
			son.update(p1);
			son.beginTransaction().commit();
			System.out.println("Data update successfully");
		}else{
			System.out.println("data was not present");
			son.clear();
			sf.openSession();
			son.save(p1);
			son.beginTransaction().commit();
			System.out.println("Data insert successfully");
		}
		
		
		
	}
}
