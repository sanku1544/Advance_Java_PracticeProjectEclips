package com.tka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tka.model.Student;
import com.tka.util.DBConnection;

public class StudentDAO {
	 public boolean login(String email, String pass) {
	        String q = "SELECT * FROM students WHERE email=? AND password=?";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(q)) {

	            ps.setString(1, email);
	            ps.setString(2, pass);
	            ResultSet rs = ps.executeQuery();
	            return rs.next();

	        } catch (Exception e) { e.printStackTrace(); }
	        return false;
	    }

	    public void addStudent(Student s) {
	        String q = "INSERT INTO students(name,email,password,course) VALUES(?,?,?,?)";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(q)) {

	            ps.setString(1, s.getName());
	            ps.setString(2, s.getEmail());
	            ps.setString(3, s.getPassword());
	            ps.setString(4, s.getCourse());
	            ps.executeUpdate();

	        } catch (Exception e) { e.printStackTrace(); }
	    }

	    public List<Student> getAllStudents() {
	        List<Student> list = new ArrayList<>();
	        try (Connection con = DBConnection.getConnection();
	             Statement st = con.createStatement();
	             ResultSet rs = st.executeQuery("SELECT * FROM students")) {

	            while (rs.next()) {
	                Student s = new Student();
	                s.setId(rs.getInt(1));
	                s.setName(rs.getString(2));
	                s.setEmail(rs.getString(3));
	                s.setPassword(rs.getString(4));
	                s.setCourse(rs.getString(5));
	                list.add(s);
	            }

	        } catch (Exception e) { e.printStackTrace(); }
	        return list;
	    }
	}
	
