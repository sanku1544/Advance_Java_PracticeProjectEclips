package com.tka.Controller;

import java.util.List;

import com.tka.Entity.Product;
import com.tka.Services.Services;

public class Controller {
		
	Services s1=null;
	public Controller() {
		s1= new Services();
	}
	
	public List<Product> allProducts(){
		List<Product> plist=s1.allProducts();
		return plist;
	}

	public List<Product> CategoryWise(String  cat) {
		List<Product> plist=s1.CategoryWise(cat);
		return plist;
	}

	public List<Product> CategoryOrPriceWise(String cat1, int price) {
		List<Product> plist=s1.CategoryOrPriceWise(cat1,price);
		return plist;
	}
	public List<Product> updatePrice() {
		List<Product> plist=s1.updatePrice();
		return plist;
	}
}
