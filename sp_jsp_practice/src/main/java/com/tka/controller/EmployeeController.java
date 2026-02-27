package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tka.model.Employee;
import com.tka.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeService empService;
	
	@GetMapping("/")
	public String homePage() {
		return "index.jsp";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		return "login.jsp";
	}
	
	@PostMapping("/login-emp")
	public String loginEmployee(String email,String password,Model model) {
		boolean res=empService.loginEmployee(email,password);
		if(res) {
			model.addAttribute("msg", email+ " Login sucess bro...");
			return "index.jsp";
		}else {
			model.addAttribute("msg", email+ " Login failed bro...");
			return "login.jsp";
		}
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "register.jsp";
	}
	
	@PostMapping("/register-emp")
	public String registerEmployee(@ModelAttribute Employee emp) {
		empService.addEmployee(emp);
		return "login.jsp";
	}
	
	@GetMapping("/update")
	public String updatePage() {
		return "update.jsp";
	}
	
	@GetMapping("/update-emp")
	public String updateEmployee(@ModelAttribute Employee emp) {
		 empService.updateEmployee(emp);
		 return "login.jsp";
		
	}
	
	@GetMapping("/delete")
	public String deltePage() {
		return "delete.jsp";
	}
	
	@GetMapping("/delete-emp")
	public String delteEmployee(int eid) {
		 empService.deleteEmployeeById(eid);
		return "Delete successfull";
	}
	
	@GetMapping("/getEmp")
	public String getEmployeeByIdPage() {
		return "getEmp.jsp";
	}
	
	@GetMapping("/get-emp")
	public String getEmployeeById(int eid,Model model) {
	        Employee emp = empService.getEmployeeById(eid);
	        model.addAttribute("employee", emp);
	    return "getEmp.jsp";   
	}

	@GetMapping("/getAll")
	public String getAllEmployee(Model model) {
		List<Employee> allEmployee = empService.getAllEmployee();
		model.addAttribute("getAllEmp", allEmployee);
		return "getAll.jsp";
	}
	
	

}
