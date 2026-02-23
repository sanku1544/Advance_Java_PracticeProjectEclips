package com.tka.service;

import java.util.Scanner;

import com.tka.dao.StudentDAO;

public class StudentService {
		
	 StudentDAO sdao = new StudentDAO();

	 Scanner sc = null;
	 
	 public StudentService() {
		 sc= new Scanner(System.in);
	 }
	    public void loginStudent() {

	        System.out.print("Email: ");
	        String email = sc.next();

	        System.out.print("Password: ");
	        String pass = sc.next();

	        if (sdao.login(email, pass)) {
	            System.out.println("Student Login Successful!");
	            studentMenu();
	        } else {
	            System.out.println("Invalid Credentials");
	        }
	    }

	    private void studentMenu() {

	        while (true) {
	            System.out.println("\n--- Student Menu ---");
	            System.out.println("1. View Profile");
	            System.out.println("2. Logout");

	            int ch = sc.nextInt();

	            switch (ch) {
	                case 1: 
	                	System.out.println("Profile Feature Coming Soon!"); break;
	                case 2: return;
	            }
	        }
	    }
	    
	    

}
