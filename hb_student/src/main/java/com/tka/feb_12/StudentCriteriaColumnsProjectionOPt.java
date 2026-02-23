package com.tka.feb_12;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class StudentCriteriaColumnsProjectionOPt {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		Criteria crit = ss.createCriteria(Student.class);
		
		ProjectionList  proj=Projections.projectionList();
		proj.add(Projections.property("name"));
		proj.add(Projections.property("age"));
		
		crit.setProjection(proj);
		
		List<Object[]> list = crit.list();
		for(Object[] row:list) {
			for(Object col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
