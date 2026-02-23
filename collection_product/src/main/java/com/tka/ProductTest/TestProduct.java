package com.tka.ProductTest;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.tka.CompInterface.ProductComp;
import com.tka.Controller.Controller;
import com.tka.Entity.Product;

public class TestProduct {

	public static void main(String[] args) {
		Controller c1= new Controller();
		System.out.println("--------AllProducts----------------------------------------------");

		List<Product> allProducts= c1.allProducts();
		allProducts.forEach(System.out::println);
		
		//category wise
		System.out.println("--------CategoryWise----------------------------------------------");
		String cat="Clothing";
		List<Product> catWise= c1.CategoryWise(cat);
		catWise.forEach(System.out::println);
		
		
		//category wise or price wise
		System.out.println("----------CategoryOrPriceWise--------------------------------------------");
		String cat1="Clothing";
		int price=500;
		List<Product> catOrPrice= c1.CategoryOrPriceWise(cat1,price);
		catOrPrice.forEach(System.out::println);
		
		
		
		//price update
		System.out.println("----------Update price--------------------------------------------");
		List<Product> update= c1.updatePrice();
		update.forEach(System.out::println);
		
		//sorting
		System.out.println("----------Sorting by id--------------------------------------------");
		Comparator<Product> com=new ProductComp();
		Collections.sort(allProducts,com);
		allProducts.forEach(System.out::println);


	}

}
