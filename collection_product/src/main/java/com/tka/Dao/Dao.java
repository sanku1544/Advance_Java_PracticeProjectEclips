package com.tka.Dao;

import java.util.ArrayList;
import java.util.List;

import com.tka.Entity.Product;

public class Dao {
		
	public List<Product> allProducts(){
		List<Product> plist=new ArrayList<>();
		plist.add(new Product(4,"Shirt","Clothing",500));
		plist.add(new Product(6,"Pant","Clothing",1000));
		plist.add(new Product(2,"Books","Stationary",250));
		plist.add(new Product(5,"Pens","Stationary",50));
		plist.add(new Product(1,"Kurta","Clothing",1200));
		plist.add(new Product(3,"Dailry Milk","Food",10));
		
		return plist;
	}
}
