package com.tka.services;

import java.util.HashMap;
import java.util.Map;

import com.tka.EntityCustomer.Product;

public class Services {
	 private Map<Integer, Product> productMap = new HashMap<>();

	    public Services() {
	        productMap.put(2, new Product(2, "Shirt", "Clothing", 500));
	        productMap.put(5, new Product(5, "Pant", "Clothing", 1000));
	        productMap.put(1, new Product(1, "Books", "Stationary", 750));
	        productMap.put(3, new Product(3, "Kurta", "Clothing", 120));
	        productMap.put(4, new Product(4, "Pens", "Stationary", 250));
	    }

	    public Map<Integer, Product> getAllProducts() {
	        return productMap;
	    }

	    public Product getProductById(int id) {
	        return productMap.get(id);
	    }
}
