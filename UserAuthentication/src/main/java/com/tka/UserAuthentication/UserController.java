package com.tka.UserAuthentication;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
		
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
	return	userService.registerUser(user);
		
	}
	
	@PostMapping("/login")
	public String loginUser(@RequestBody User user) {
		String email=user.getEmail();
		String password=user.getPassword();
		return userService.loginUser(email,password);
	}
	
	@PostMapping("/login-profile")
	public String loginUserProfile(@RequestBody User user){
		String email=user.getEmail();
		String password=user.getPassword();
		return userService.loginUserProfile(email,password);
	}
	
	
}
