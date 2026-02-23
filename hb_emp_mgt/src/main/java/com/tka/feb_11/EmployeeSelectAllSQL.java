package com.tka.feb_11;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class EmployeeSelectAllSQL {
	public static void main(String[] args) {
			
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		Query sqlQuery = ss.createSQLQuery("select * from Employee");
		
		List<Object[]> list = sqlQuery.list();
		
		for(Object[] row:list) {
			for(Object col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
