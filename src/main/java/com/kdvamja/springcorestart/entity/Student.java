package com.kdvamja.springcorestart.entity;

import java.util.List;

public class Student {
	
	private Long studentId;
	private String firstName;
	private int currentStandard;
	private String currentAcaYear;
	private List<StudentResult> results;
	public Student() {
		super();
	}
	public Student(Long studentId, String firstName, int currentStandard, String currentAcaYear,
			List<StudentResult> results) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.currentStandard = currentStandard;
		this.currentAcaYear = currentAcaYear;
		this.results = results;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getCurrentStandard() {
		return currentStandard;
	}
	public void setCurrentStandard(int currentStandard) {
		this.currentStandard = currentStandard;
	}
	public String getCurrentAcaYear() {
		return currentAcaYear;
	}
	public void setCurrentAcaYear(String currentAcaYear) {
		this.currentAcaYear = currentAcaYear;
	}
	public List<StudentResult> getResults() {
		return results;
	}
	public void setResults(List<StudentResult> results) {
		this.results = results;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", currentStandard=" + currentStandard
				+ ", currentAcaYear=" + currentAcaYear + ", results=" + results + "]";
	}
}
