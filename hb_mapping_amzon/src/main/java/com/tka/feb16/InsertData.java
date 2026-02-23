package com.tka.feb16;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		// Customer
		Customer c = new Customer();
		c.setCid(1);
		c.setName("Sanket");

		// Cart
		Cart cart = new Cart();
		cart.setCartId(101);
		cart.setCustomer(c);

		// Products
		Product p1 = new Product();
		p1.setPid(1);
		p1.setPname("Mobile");
		p1.setPrice(20000);
		p1.setCart(cart);

		Product p2 = new Product();
		p2.setPid(2);
		p2.setPname("Laptop");
		p2.setPrice(50000);
		p2.setCart(cart);

		List<Product> plist = new ArrayList<>();
		plist.add(p1);
		plist.add(p2);

		cart.setProducts(plist);
		c.setCart(cart);

		// Save customer (cascade saves cart & products)
		session.save(c);

		tx.commit();
		session.close();


	}

}
