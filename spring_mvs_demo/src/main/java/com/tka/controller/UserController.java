package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tka.model.User;
import com.tka.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService service;
	
	@GetMapping("/")
	public String homePage() {
	    return "demo.jsp";
	}
	@GetMapping("/login")
	public String loginPage() {  
		return "login.jsp";  
	}
	
	@PostMapping("/login-user")
	public String loginUser(String username,String password,Model model) {
		boolean resp=service.loginUser(username,password);
		if(resp) {
			String msg=username +" Login sucessfull";
			model.addAttribute("msg", msg);
			return "home.jsp";
		}else {
			String msg=username +" Login faild";
			model.addAttribute("msg", msg);
			return "login.jsp";
		}
	}

	@GetMapping("/register")
	public String registerPage() {
	    return "register.jsp";
	}
	
	@PostMapping("/register-user")
	@ResponseBody
	public String addUser(@ModelAttribute User user) {
	    service.addUser(user);
	    return "User saved successfully!";
	}
	
	@GetMapping("/getAll")
	@ResponseBody
	public List<User> getAllUser(){
		return service.getAllUsers();
	}
	
	@GetMapping("/update")
	public String updatePage() {
	    return "update.jsp";
	}
	
	
	@GetMapping("/update-user")
	public String updateUser(@ModelAttribute User user) {
		service.updateUser(user);
		return "User updated";
	}
}
