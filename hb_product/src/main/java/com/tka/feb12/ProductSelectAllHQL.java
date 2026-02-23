package com.tka.feb12;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductSelectAllHQL {

	public static void main(String[] args) {
			SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session ss = sf.openSession();
			
			List<Product> list = ss.createQuery("from Product where id>1").list();
			list.forEach(System.out::println);
	}

}
