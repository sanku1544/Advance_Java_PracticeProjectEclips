package com.tka.feb12;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class insertProduct {
		
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Product p1= new Product(2,"Dairy Milk","Food",15);
		ss.save(p1);
		
		ss.save(new Product(2, "KitKat", "Food", 20));
        ss.save(new Product(3, "iPhone", "Electronics", 80000));
        ss.save(new Product(4, "Laptop", "Electronics", 55000));
        ss.save(new Product(5, "Pen", "Stationery", 10));
        ss.save(new Product(6, "Notebook", "Stationery", 50));
        ss.save(new Product(7, "Shoes", "Fashion", 2000));
        ss.save(new Product(8, "T-Shirt", "Fashion", 700));
        ss.save(new Product(9, "Watch", "Accessories", 3000));
        ss.save(new Product(10, "Bag", "Accessories", 1500));
        ss.save(new Product(11, "Headphones", "Electronics", 2500));
        ss.save(new Product(12, "Keyboard", "Electronics", 1200));
        ss.save(new Product(13, "Mouse", "Electronics", 800));
        ss.save(new Product(14, "Chair", "Furniture", 4000));
        ss.save(new Product(15, "Table", "Furniture", 7000));
        ss.save(new Product(16, "Bottle", "Daily Use", 100));
        ss.save(new Product(17, "Soap", "Daily Use", 40));
        ss.save(new Product(18, "Shampoo", "Daily Use", 180));
        ss.save(new Product(19, "TV", "Electronics", 45000));
        ss.save(new Product(20, "Refrigerator", "Electronics", 35000));
		
		ss.beginTransaction().commit();
		System.out.println("Data insert successfully");
		
		Product product = ss.get(Product.class,2);
		System.out.println(product);
		
		
	}
}
