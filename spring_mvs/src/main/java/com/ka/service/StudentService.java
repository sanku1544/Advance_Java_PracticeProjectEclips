package com.ka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ka.dao.StudentDao;
import com.ka.model.Student;

@Service
public class StudentService {
		
	@Autowired
	StudentDao dao;
	
	public void addStudent(Student stud) {
		dao.save(stud);
	}
	public void updateStudent(Student stud) {
		dao.save(stud);
		
	}
	public String deleteStudent(int id) {
		dao.deleteById(id);
		return "Delete successfull...";
		
	}
	public Student getById(int id) {
		return dao.getById(id);
		
	}
	public List<Student> getAllStudnets() {
		return dao.findAll();
		
	}
	public String loginStudent(String email, String pass) {
		String show="";
		List<Student> list=getAllStudnets();
		for(Student s:list) {
			if(s.getEmail().equals(email)) {
				if(s.getPass().equals(pass)) {
					return "redirect:/home.html";
				}else {
					show="Check your password";
				}
			}else {
				show="Check your email";
			}
		}
		return show;
		
	}

}
