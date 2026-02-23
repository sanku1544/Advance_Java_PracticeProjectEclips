package com.tka.feb_12;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

public class StudentSelectAllSQL {
	public static void main(String[] args) {
			
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		Query query = ss.createSQLQuery("select * from Student");
		
		List<Object[]> list = query.list();
		for(Object[] row:list) {
			for(Object col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
	}

}
