package com.kdvamja.springcorestart.autowired.entity;

public class Student {
	
	private Long studentId;
	private String studentName;
	private Address address;
	public Student() {
		super();
	}
	public Student(Long studentId, String studentName, Address address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + "]";
	}
}
