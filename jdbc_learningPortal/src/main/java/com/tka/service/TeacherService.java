package com.tka.service;

import java.util.Scanner;

import com.tka.dao.LectureDAO;
import com.tka.dao.TeacherDAO;
import com.tka.model.Lecture;

public class TeacherService {
	TeacherDAO tdao = new TeacherDAO();
    LectureDAO lecdao = new LectureDAO();
    Scanner sc = null;
    
    public TeacherService() {
    		sc=new Scanner(System.in);
    }
    
    public void loginTeacher() {

        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Password: ");
        String pass = sc.next();

        if (tdao.login(email, pass)) {
            System.out.println("Teacher Login Successful!");
            teacherMenu();
        } else {
            System.out.println("Invalid Credentials");
        }
    }

    private void teacherMenu() {

        while (true) {
            System.out.println("\n--- Teacher Menu ---");
            System.out.println("1. Conduct Lecture");
            System.out.println("2. Logout");

            int ch = sc.nextInt();

            switch (ch) {
                case 1: conductLecture(); break;
                case 2: return;
            }
        }
    }

    private void conductLecture() {
       

        Lecture lec = new Lecture();

        System.out.print("Subject: ");
        lec.setSubject(sc.nextLine());

        System.out.print("Teacher ID: ");
        lec.setTeacherId(sc.nextInt());
        sc.nextLine();

        System.out.print("Mode (Online/Offline): ");
        lec.setMode(sc.nextLine());

        System.out.print("Date (YYYY-MM-DD): ");
        lec.setDate(sc.nextLine());

        System.out.print("Time (HH:MM:SS): ");
        lec.setTime(sc.nextLine());

        lecdao.addLecture(lec);

        System.out.println("Lecture Added Successful!");
    }

}
