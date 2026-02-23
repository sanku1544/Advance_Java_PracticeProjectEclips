package com.tka.feb16;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {
	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();

		List<Customer> customers =
		        session.createQuery("FROM Customer", Customer.class).list();

		for(Customer cust : customers) {

		    System.out.println("Customer: " + cust.getName());

		    Cart ct = cust.getCart();

		    for(Product p : ct.getProducts()) {
		        System.out.println("   Product: " + p.getPname()
		                + " | Price: " + p.getPrice());
		    }
		}

		session.close();
	}
}
