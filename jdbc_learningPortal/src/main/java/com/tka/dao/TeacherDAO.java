package com.tka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.tka.util.DBConnection;

public class TeacherDAO {
	public boolean login(String email, String pass) {
        String q = "SELECT * FROM teachers WHERE email=? AND password=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(q)) {

            ps.setString(1, email);
            ps.setString(2, pass);

            return ps.executeQuery().next();

        } catch (Exception e) { e.printStackTrace(); }
        return false;
    }
}
