package com.tka.feb_11;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class EmployeeCriteriaRowsRestrictions {
	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session ss = sf.openSession();
		
		Criteria crit = ss.createCriteria(Employee.class);

//		crit.add(Restrictions.lt("sal", 20000.0));
//		crit.add(Restrictions.eq("ctg", "IT"));
//		crit.add(Restrictions.ne("ctg", "HR"));
		crit.add(Restrictions.ge("sal", 10000.0));
//		crit.add(Restrictions.le("sal", 50000.0));
//		crit.add(Restrictions.between("sal", 5000.0, 30000.0));
//		crit.add(Restrictions.ilike("name", "r%"));
//		crit.add(Restrictions.isNull("ctg"));
//		crit.add(Restrictions.isNotNull("name"));

		List<Employee> list = crit.list();
    		list.forEach(System.out::println);
		
	}

}
