package com.tka.feb_11;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertEmployee {
	public static void main(String[] args) {
			
		Configuration cfg= new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		 	ss.save(new Employee(1, "Rahul", "IT", 25000));
	        ss.save(new Employee(2, "Sneha", "HR", 18000));
	        ss.save(new Employee(3, "Amit", "Sales", 22000));
	        ss.save(new Employee(4, "Priya", "IT", 30000));
	        ss.save(new Employee(5, "Rohan", "Finance", 27000));
	        ss.save(new Employee(6, "Neha", "HR", 19000));
	        ss.save(new Employee(7, "Sanket", "IT", 35000));
	        ss.save(new Employee(8, "Kiran", "Sales", 21000));
	        ss.save(new Employee(9, "Pooja", "Finance", 26000));
	        ss.save(new Employee(10, "Vikas", "IT", 40000));
	        ss.save(new Employee(11, "Anjali", "HR", 17000));
	        ss.save(new Employee(12, "Manish", "Sales", 23000));
	        ss.save(new Employee(13, "Komal", "IT", 32000));
	        ss.save(new Employee(14, "Tejas", "Finance", 28000));
	        ss.save(new Employee(15, "Nikita", "HR", 20000));
	        ss.save(new Employee(16, "Yogesh", "Sales", 24000));
	        ss.save(new Employee(17, "Swati", "IT", 36000));
	        ss.save(new Employee(18, "Deepak", "Finance", 29000));
	        ss.save(new Employee(19, "Meena", "HR", 21000));
	        ss.save(new Employee(20, "Arjun", "IT", 45000));
		
		tr.commit();
		System.out.println("Data Insert successfully--");
		
		
		Employee emp = ss.get(Employee.class, 1);
		System.out.println(emp);
		
		
	}

}
