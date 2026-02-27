package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.UserDao;
import com.tka.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;
	
	public void addUser(User user) {
		dao.save(user);
	}
	public void updateUser(User user) {
		dao.save(user);
	}
	public void delteUser(int id) {
		dao.deleteById(id);
	}
	public User getUserById(int id) {
		return dao.getById(id);
	}
	public List<User> getAllUsers() {
		return dao.findAll();
	}
	public boolean loginUser(String username, String password) {
		List<User> allUsers = getAllUsers();
		for(User u:allUsers) {
			if(u.getUsername().equals(username)) {
				if(u.getPassword().equals(password)) {
					System.err.println("login sucess");
					return true;
				}
			}
		}
		System.err.println("Wrong credentails.....");
		return false;
		
	}
}
