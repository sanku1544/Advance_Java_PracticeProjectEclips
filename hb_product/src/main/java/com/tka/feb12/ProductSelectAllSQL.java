package com.tka.feb12;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ProductSelectAllSQL {
	public static void main(String[] args) {
		
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		Query q = ss.createSQLQuery("select * from Product");
		List<Object[]> list = q.list();
		
		for(Object[] row:list) {
			for(Object col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
	}
}
