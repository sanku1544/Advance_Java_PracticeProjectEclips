package com.tka.Services;

import java.util.ArrayList;
import java.util.List;

import com.tka.Dao.Dao;
import com.tka.Entity.Product;

public class Services {
		
	Dao d1=null;
	public Services() {
		d1= new Dao();
	}
	
	public List<Product> allProducts(){
		List<Product> plist=d1.allProducts();
		return plist;
	}

	public List<Product> CategoryWise(String cat) {
		List<Product> plist=d1.allProducts();
		List<Product> pl=new ArrayList<>();
		for(Product  p:plist) {
			if(p.getCategory().equalsIgnoreCase(cat)) {
				pl.add(p);
			}
		}
		return pl;
	}

	public List<Product> CategoryOrPriceWise(String cat1, int price) {
		List<Product> plist=d1.allProducts();
		List<Product> pl=new ArrayList<>();
		for(Product p:plist) {
			if(p.getCategory().equalsIgnoreCase(cat1) && p.getPrice()>price) {
				pl.add(p);
			}
		}
		return pl;
	}
	
	public List<Product> updatePrice(){
		List<Product> plist=d1.allProducts();
		
		for(Product p:plist) {
			if(p.getPrice()<=500) {
				p.setPrice((p.getPrice()*10/100)+p.getPrice());
			}else if(p.getPrice()>=500 && p.getPrice()<=1000) {
				p.setPrice((p.getPrice()*15/100)+p.getPrice());
			}else if( p.getPrice()>=1000) {
				p.setPrice((p.getPrice()*20/100)+p.getPrice());
			}
		}
		return plist;
	}
}
