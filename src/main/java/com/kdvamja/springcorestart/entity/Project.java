package com.kdvamja.springcorestart.entity;

public class Project {
	
	private Long projectId;
	private String title;
	private String description;
	
	public Project() {
		super();
	}
	
	public Project(Long projectId, String title, String description) {
		super();
		this.projectId = projectId;
		this.title = title;
		this.description = description;
	}
	
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", title=" + title + ", description=" + description
				+ ", getProjectId()=" + getProjectId() + ", getTitle()=" + getTitle() + ", getDescription()="
				+ getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
