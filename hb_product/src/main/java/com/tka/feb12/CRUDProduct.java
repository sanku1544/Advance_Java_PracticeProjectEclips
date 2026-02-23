package com.tka.feb12;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CRUDProduct {
		
	public static void main(String[] args) {
		
		Configuration cfg= new Configuration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session son = sf.openSession();
		
		Product p1= new Product(23,"Happy Happy","Food",100);
		Product prod = son.get(Product.class, p1.getPid());
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter choice \n 1 for insert \n 2 for update \n 3 for delete \n 4 show data");
		int n=sc.nextInt();
		sc.close();
		
		switch(n) {
		case 1:
			if(prod==null) {
				son.clear();
				sf.openSession();
				son.save(p1);
				son.beginTransaction().commit();
				System.out.println("Data insert successfully");
			}else {
				System.out.println("Data already exits");
			}
			break;
			
		case 2:
			if(prod!=null) {
				son.clear();
				sf.openSession();
				son.update(p1);
				son.beginTransaction().commit();
				System.out.println("Data update successfully");
			}else {
				System.out.println("Data not found");
			}
			break;
		case 3:
			if(prod!=null) {
				son.clear();
				sf.openSession();
				son.delete(p1);
				son.beginTransaction().commit();
				System.out.println("Data delete successfully");
			}else {
				System.out.println("Data not found");
			}
			break;
		case 4:
			if(prod!=null) {
				son.clear();
				sf.openSession();
				
				Product p = son.get(Product.class, p1.getPid());
				System.out.println(p);
			}else {
				System.out.println("Data not found");
			}
			
		}
		
		
		
		
	}
}
