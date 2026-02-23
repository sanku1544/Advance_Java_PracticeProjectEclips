package com.tka.feb12;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ProductCriteriaRowRestrictions {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		Criteria ct = ss.createCriteria(Product.class);
		
//		ct.add(Restrictions.gt("price",5000));
//		ct.add(Restrictions.lt("price", 5000));
		ct.add(Restrictions.eq("cat", "Electronics"));
//		ct.add(Restrictions.ne("category", "Food"));
//		ct.add(Restrictions.ge("price", 1000));
//		ct.add(Restrictions.between("price", 1000, 10000));
//		ct.add(Restrictions.like("name", "S%"));
//		ct.add(Restrictions.ilike("name", "dairy%"));
//		ct.add(Restrictions.isNull("category"));
//		ct.add(Restrictions.isNotNull("category"));
//		ct.add(Restrictions.not(Restrictions.eq("category", "Food")));
//		


		
		List<Product> list = ct.list();
		list.forEach(System.out::println);
	}
}
