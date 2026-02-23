package com.tka.model;

public class Test {
	 private int id;
	    private int lectureId;
	    private String date;
	    private String time;
	    private int totalMarks;
	    public Test() {
			// TODO Auto-generated constructor stub
		}
		public Test(int id, int lectureId, String date, String time, int totalMarks) {
			super();
			this.id = id;
			this.lectureId = lectureId;
			this.date = date;
			this.time = time;
			this.totalMarks = totalMarks;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getLectureId() {
			return lectureId;
		}
		public void setLectureId(int lectureId) {
			this.lectureId = lectureId;
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
		public int getTotalMarks() {
			return totalMarks;
		}
		public void setTotalMarks(int totalMarks) {
			this.totalMarks = totalMarks;
		}
		@Override
		public String toString() {
			return "Test [id=" + id + ", lectureId=" + lectureId + ", date=" + date + ", time=" + time + ", totalMarks="
					+ totalMarks + "]";
		}
		
		
}
