package com.student.manage;

public class Student {

	private String StudentId;
	private String StudentName;
	private String StudentPhone;
	private String StudentCity;
	public Student(String studentId, String studentName, String studentPhone, String studentCity) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
	}
	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		StudentName = studentName;
		StudentPhone = studentPhone;
		StudentCity = studentCity;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentPhone() {
		return StudentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		StudentPhone = studentPhone;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentPhone=" + StudentPhone
				+ ", StudentCity=" + StudentCity + "]";
	}
	
	
	
	
	
}
