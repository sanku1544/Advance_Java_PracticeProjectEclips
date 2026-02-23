package com.tka.feb12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class updateProduct2 {
		
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session son = sf.openSession();
		
		Product p1= new Product(2,"Good Day","Food",10);
		son.saveOrUpdate(p1);
		
		son.beginTransaction().commit();
		System.out.println("Data insert/update successfully");
		
		Product product = son.get(Product.class,p1.getPid());
		System.out.println(product);
		
		
		
		
		
	}
}
