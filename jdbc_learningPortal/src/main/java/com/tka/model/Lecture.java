package com.tka.model;

public class Lecture {
	 private int id;
	    private String subject;
	    private int teacherId;
	    private String mode;
	    private String date;
	    private String time;
	    public Lecture() {
			// TODO Auto-generated constructor stub
		}
		public Lecture(int id, String subject, int teacherId, String mode, String date, String time) {
			super();
			this.id = id;
			this.subject = subject;
			this.teacherId = teacherId;
			this.mode = mode;
			this.date = date;
			this.time = time;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public int getTeacherId() {
			return teacherId;
		}
		public void setTeacherId(int teacherId) {
			this.teacherId = teacherId;
		}
		public String getMode() {
			return mode;
		}
		public void setMode(String mode) {
			this.mode = mode;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		@Override
		public String toString() {
			return "Lecture [id=" + id + ", subject=" + subject + ", teacherId=" + teacherId + ", mode=" + mode
					+ ", date=" + date + ", time=" + time + "]";
		}
	    
}
