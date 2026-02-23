package com.tka.model;

public class Result {
	private int id;
    private int studentId;
    private int testId;
    private int marksObtained;
    public Result() {
		// TODO Auto-generated constructor stub
	}
	public Result(int id, int studentId, int testId, int marksObtained) {
		super();
		this.id = id;
		this.studentId = studentId;
		this.testId = testId;
		this.marksObtained = marksObtained;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getTestId() {
		return testId;
	}
	public void setTestId(int testId) {
		this.testId = testId;
	}
	public int getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}
	@Override
	public String toString() {
		return "Result [id=" + id + ", studentId=" + studentId + ", testId=" + testId + ", marksObtained="
				+ marksObtained + "]";
	}
    
}
