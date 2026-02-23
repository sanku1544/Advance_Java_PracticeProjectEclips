package com.tka.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.tka.EntityCustomer.Customer;
import com.tka.EntityCustomer.Product;

public class ZomatoMenu {

	public static void main(String[] args) {
		
		int bill=0;
		List<Product> plist=new ArrayList<>();
		plist.add(new Product(2,"Shirt","Clothing",500));
		plist.add(new Product(5,"Pant","Clothing",1000));
		plist.add(new Product(1,"Books","Stationary",750));
		plist.add(new Product(3,"Kurta","Clothing",120));
		plist.add(new Product(4,"Pens","Stationary",250));
		
		Customer c1= new Customer(5,"Sanket",415215322156L);
		for(Product p:plist) {
			System.out.println(p);
		}
		List<Product> opl=  new ArrayList<>();
		
		System.out.println("-------All Products---------");
		Scanner sc = new Scanner(System.in);
		System.out.println("--Total Products---");
		int tproducts=sc.nextInt();
		System.out.println("Enter total "+tproducts+" product ids");
		for(int i=0;i<tproducts;i++) {
		
		int n=sc.nextInt();
		for(Product p:plist) {
			if(p.getId()==n) {
				bill+=p.getPrice();
			}
		}
		for(Product p:plist) {
			if(p.getId()==n) {
				opl.add(p);
			}
		}
		}
		
		System.out.println("Customer name:- "+c1.getCname());
		System.out.println("Customer mob:- "+c1.getMob());
		System.out.println("------------selected products---------");
		for(Product p:opl) {
			System.out.println("Product name:- "+p.getName());
			System.out.println("Product price:- "+p.getPrice());
		}
		System.out.println("Total bill:- "+bill);
			

			


	}

}
