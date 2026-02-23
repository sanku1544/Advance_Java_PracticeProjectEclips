package com.tka.model;

public class Student {
	 private int id;
	    private String name;
	    private String email;
	    private String password;
	    private String course;
	    public Student() {

	    }
		public Student(int id, String name, String email, String password,String course) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
			this.course = course;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
		}
		
	    
}
