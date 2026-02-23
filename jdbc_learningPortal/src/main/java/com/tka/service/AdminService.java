package com.tka.service;

import java.util.List;
import java.util.Scanner;

import com.tka.dao.AdminDAO;
import com.tka.dao.StudentDAO;
import com.tka.dao.TeacherDAO;
import com.tka.model.Student;

public class AdminService {
	StudentDAO sdao = new StudentDAO();
    TeacherDAO tdao = new TeacherDAO();
    AdminDAO adao = new AdminDAO();

    Scanner sc = null;
    public AdminService() {
    	sc= new Scanner(System.in);
    }
    public void loginAdmin() {

        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Password: ");
        String pass = sc.next();

        if (adao.login(email, pass)) {
            System.out.println("\nAdmin Login Successful!\n");
            adminMenu();
        } else {
            System.out.println("Invalid Credentials");
        }
    }

    public void adminMenu() {

        while (true) {
            System.out.println("\n---- Admin Menu ----");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Logout");

            int ch = sc.nextInt();

            switch (ch) {
                case 1: addStudent(); break;
                case 2: viewAllStudents(); break;
                case 3: return;
                default: System.out.println("Invalid");
            }
        }
    }

    private void addStudent() {

        System.out.println("Enter id: ");
        int  id = sc.nextInt();
        
        sc.nextLine();
        System.out.println("Enter Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Email: ");
        String email = sc.next();

        System.out.println("Enter Password: ");
        String pass = sc.next();

        System.out.println("Enter Course: ");
        String course = sc.next();

        Student s = new Student(id,name, email, pass, course);
        sdao.addStudent(s);

        System.out.println("Student Added Successfully!");
    }

    private void viewAllStudents() {
        List<Student> list = sdao.getAllStudents();

        System.out.println("\n--- Student List ---");
        for (Student s : list) {
            System.out.println(s.getId() + " | " + s.getName() + " | " + s.getEmail());
        }
    }
}
