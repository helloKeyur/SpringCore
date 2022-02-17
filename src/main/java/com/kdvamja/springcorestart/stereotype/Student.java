package com.kdvamja.springcorestart.stereotype;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
	
	@Value("001")
	private int studentId;
	
	@Value("Keyur Vamja")
	private String studentName;
	
	@Value("#{booksList}")
	private List<String> books;
	
	@Value("#{authorMapData}")
	private Map<Integer, String> authors;
	
	@Value("#{20+10}")
	private int marks;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	public Map<Integer, String> getAuthors() {
		return authors;
	}
	public void setAuthors(Map<Integer, String> authors) {
		this.authors = authors;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", books=" + books + ", authors="
				+ authors + ", marks=" + marks + "]";
	}
}
