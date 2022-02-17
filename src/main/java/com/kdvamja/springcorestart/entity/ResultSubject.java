package com.kdvamja.springcorestart.entity;

public class ResultSubject {
	
	private Long resultSubjectId;
	private String subjectName;
	private float totalMarks;
	private float obtainMarks;
	
	public ResultSubject() {
		super();
	}

	public ResultSubject(Long resultSubjectId, String subjectName, float totalMarks, float obtainMarks) {
		super();
		this.resultSubjectId = resultSubjectId;
		this.subjectName = subjectName;
		this.totalMarks = totalMarks;
		this.obtainMarks = obtainMarks;
	}

	public Long getResultSubjectId() {
		return resultSubjectId;
	}

	public void setResultSubjectId(Long resultSubjectId) {
		this.resultSubjectId = resultSubjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public float getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

	public float getObtainMarks() {
		return obtainMarks;
	}

	public void setObtainMarks(float obtainMarks) {
		this.obtainMarks = obtainMarks;
	}

	@Override
	public String toString() {
		return "ResultSubject [resultSubjectId=" + resultSubjectId + ", subjectName=" + subjectName + ", totalMarks="
				+ totalMarks + ", obtainMarks=" + obtainMarks + "]";
	}
}
