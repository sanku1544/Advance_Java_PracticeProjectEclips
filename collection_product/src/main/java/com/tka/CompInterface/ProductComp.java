package com.tka.CompInterface;

import java.util.Comparator;

import com.tka.Entity.Product;

public class ProductComp implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		return new Integer(p1.getId()).compareTo(new Integer(p2.getId()));
	}

	
	

}
