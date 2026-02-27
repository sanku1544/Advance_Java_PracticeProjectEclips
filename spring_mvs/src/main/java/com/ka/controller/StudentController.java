package com.ka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ka.model.Student;
import com.ka.service.StudentService;

@Controller
public class StudentController {
			
	@Autowired
	StudentService service;
	
	
	@GetMapping("/login")
	public String loginPage() {
		return "login.html";
	}
	
	@GetMapping("/register")
	public String registerPage() {
		return "register.html";
	}
	
	@PostMapping("/login-stud")
	
	public String loginStudent(String email,String pass) {
		return service.loginStudent(email,pass);
		
	}
	@PostMapping("/register-stud")
	public String registerStudent(@ModelAttribute Student stud) {
		service.addStudent(stud);
		return "student register success.......";
	}
	
	@GetMapping("/update")
	public String updatePage() {
		return "update.html";
	}
	
	@GetMapping("/update-stud")
	public String updateStudent(@ModelAttribute Student stud) {
		service.updateStudent(stud);
		return "student update success.......";
	}
	
	@GetMapping("/delete")
	public String deleteStudentPage() {
		return "delete.html";
	}
	@GetMapping("/delete-stud")
	@ResponseBody
	public String deleteStudentById(int id) {
		return service.deleteStudent(id);
	}
	
	@GetMapping("/getAll")
	public String getDataPage() {
		return "getAll.html";
	}
	
	@GetMapping("/getAll-stud")
	@ResponseBody
	public List<Student> getAllStudents(){
		return service.getAllStudnets();
	}
	
	
	
}
