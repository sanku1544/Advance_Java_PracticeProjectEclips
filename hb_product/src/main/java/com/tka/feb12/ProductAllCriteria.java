package com.tka.feb12;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductAllCriteria {
	public static void main(String[] args) {
		
		SessionFactory sf = new 	Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		List<Product> list = ss.createCriteria(Product.class).list();
		list.forEach(System.out::println);
	}

}
