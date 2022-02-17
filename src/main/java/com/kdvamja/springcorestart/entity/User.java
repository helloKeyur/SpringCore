package com.kdvamja.springcorestart.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {

	private Long userId;
	private String username;
	private String address;
	private Set<String> phones;
	private List<String> books;
	private Map<String, String> courses;
	private List<Project> projects;
	
	public User() {
		super();
	}

	public User(Long userId, String username, String address, Set<String> phones, List<String> books,
			Map<String, String> courses, List<Project> projects) {
		super();
		this.userId = userId;
		this.username = username;
		this.address = address;
		this.phones = phones;
		this.books = books;
		this.courses = courses;
		this.projects = projects;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public List<String> getBooks() {
		return books;
	}

	public void setBooks(List<String> books) {
		this.books = books;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", address=" + address + ", phones=" + phones
				+ ", books=" + books + ", courses=" + courses + ", projects=" + projects + ", getUserId()="
				+ getUserId() + ", getUsername()=" + getUsername() + ", getAddress()=" + getAddress() + ", getPhones()="
				+ getPhones() + ", getBooks()=" + getBooks() + ", getCourses()=" + getCourses() + ", getProjects()="
				+ getProjects() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
