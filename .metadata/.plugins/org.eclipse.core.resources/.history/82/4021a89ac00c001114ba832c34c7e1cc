package com.tka.feb17;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private String course;
	private double per;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, String course, double per) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.per = per;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", course=" + course + ", per=" + per + "]";
	}
	
}
