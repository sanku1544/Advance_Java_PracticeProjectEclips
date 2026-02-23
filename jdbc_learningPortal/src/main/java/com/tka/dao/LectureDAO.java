package com.tka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tka.model.Lecture;
import com.tka.util.DBConnection;

public class LectureDAO {
	 public void addLecture(Lecture lec) {
	        String q = "INSERT INTO lectures(subject, teacher_id, mode, date, time) VALUES(?,?,?,?,?)";

	        try (Connection con = DBConnection.getConnection();
	             PreparedStatement ps = con.prepareStatement(q)) {

	            ps.setString(1, lec.getSubject());
	            ps.setInt(2, lec.getTeacherId());
	            ps.setString(3, lec.getMode());
	            ps.setString(4, lec.getDate());
	            ps.setString(5, lec.getTime());
	            ps.executeUpdate();

	        } catch (Exception e) { e.printStackTrace(); }
}
	 
	 
}
