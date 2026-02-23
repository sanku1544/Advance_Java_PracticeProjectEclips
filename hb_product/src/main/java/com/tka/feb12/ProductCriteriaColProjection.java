package com.tka.feb12;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProductCriteriaColProjection {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		Criteria ct = ss.createCriteria(Product.class);
		
		ProjectionList pt=Projections.projectionList();
		pt.add(Projections.property("cat"));
		pt.add(Projections.property("price"));
		
		ct.setProjection(pt);
		
		List<Object[]> list = ct.list();
		for(Object[] row:list) {
			for(Object col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}

}
