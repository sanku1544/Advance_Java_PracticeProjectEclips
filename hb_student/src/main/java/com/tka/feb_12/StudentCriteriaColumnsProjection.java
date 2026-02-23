package com.tka.feb_12;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class StudentCriteriaColumnsProjection {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		Criteria ct = ss.createCriteria(Student.class);
		
		Projection p=Projections.property("name");
		Projection p1=Projections.property("id");
		
		ProjectionList pj=Projections.projectionList();
		pj.add(p);
		pj.add(p1);
		
		ct.setProjection(pj);
		
		List<Object[]> list = ct.list();
		for(Object[] row:list) {
			for(Object col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
