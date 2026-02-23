package com.tka.feb17;	

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SreviceStudent {

	@Autowired
	DaoStudent ds;

	public Student getStudetnByid(int id) {
		return ds.getStudetnByid(id);
	}

	public void addStudent(Student s) {
		ds.addStudent(s);

	}

	public void updateStudent(Student s) {
		ds.updateStudent(s);
	}

	public void deleteStudent(int id) {
		ds.deleteStudent(id);
	}

	public List<Student> getAll() {
		List<Student> s1=ds.getAll();
		return s1;
	}

}
