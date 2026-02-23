package com.tka.feb12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class deleteProduct4 {
		
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session son = sf.openSession();
		
		Product p1= new Product(2,"Parle-G","Food",10);
		son.update(p1);
		
		son.beginTransaction().commit();
		System.out.println("Data update successfully");
		
		Product product = son.get(Product.class,p1.getPid());
		System.out.println(product);
		
		
	}
}
