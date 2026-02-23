package com.tka.feb_11;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CRUDEmployee {
	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		

		Employee e1 = new Employee(45, "Rajesh", "Tester", 5000.0);

		Employee employee = ss.get(Employee.class, e1.getEid());
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice \n 1 for insert \n 2 for update \n 3 for delete \n 4 show data");
		int ch = sc.nextInt();
		sc.close();
		switch (ch) {
		
		case 1:
			if(employee==null) {
				ss.clear();
				sf.openSession();
				ss.save(e1);
				System.out.println("data insert succesfully");
				ss.beginTransaction().commit();
				
			}else {
				System.out.println("data already present go for update");

			}
			break;

		case 2:
			if (employee != null) {
				ss.clear();
				sf.openSession();
				ss.update(e1);
				System.out.println("data update succesfully");
				ss.beginTransaction().commit();
			} else {
				System.out.println("data not present go for update");
			}
			
			break;
		case 3:
			if(employee!=null) {
				ss.clear();
				sf.openSession();
				ss.delete(e1);
				System.out.println("data delete succesfully");
				ss.beginTransaction().commit();
			}else {
				System.out.println("Data not Present");

			}
			break;
		case 4:
			if(employee!=null) {
			Employee empData = ss.get(Employee.class, e1.getEid());
			System.out.println(empData);
			}else {
				System.out.println("Data not found");
			}

		}

	}

}
