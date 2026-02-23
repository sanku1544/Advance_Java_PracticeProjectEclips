package com.tka.feb_12;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class StudentCriteriaRowRestriction {
	public static void main(String[] args) {
			
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		Criteria criteria = ss.createCriteria(Student.class);
		
//		criteria.add(Restrictions.isNull("age"));
//		criteria.add(Restrictions.ilike("name", "r%"));
//		criteria.add(Restrictions.like("name", "H%"));
//		criteria.add(Restrictions.between("age", 20, 24));
//		criteria.add(Restrictions.le("age", 25));
		criteria.add(Restrictions.ge("age", 22));
//		criteria.add(Restrictions.ne("name", "Amit"));
//		criteria.add(Restrictions.eq("name", "Rahul"));
//		criteria.add(Restrictions.lt("age", 20));

		
		List<Student> list = criteria.list();
		list.forEach(System.out::println);
		
		
	}

}
