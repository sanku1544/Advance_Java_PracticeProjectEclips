package com.tka.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tka.util.DBConnection;

public class AdminDAO {
	public boolean login(String email, String pass) {
        String q = "SELECT * FROM admin WHERE email=? AND password=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(q)) {

            ps.setString(1, email);
            ps.setString(2, pass);

            ResultSet rs = ps.executeQuery();
            return rs.next();

        } catch (Exception e) { e.printStackTrace(); }
        return false;
}
}
