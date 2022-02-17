package com.kdvamja.springcorestart.entity;

import java.util.List;

public class StudentResult {
	
	private Long stuResultId;
	private int resultStandard;
	private float percentage;
	private String acaYear;
	private List<ResultSubject> subjects;
	
	public StudentResult() {
		super();
	}

	public StudentResult(Long stuResultId, int resultStandard, float percentage, String acaYear,
			List<ResultSubject> subjects) {
		super();
		this.stuResultId = stuResultId;
		this.resultStandard = resultStandard;
		this.percentage = percentage;
		this.acaYear = acaYear;
		this.subjects = subjects;
	}

	public Long getStuResultId() {
		return stuResultId;
	}

	public void setStuResultId(Long stuResultId) {
		this.stuResultId = stuResultId;
	}

	public int getResultStandard() {
		return resultStandard;
	}

	public void setResultStandard(int resultStandard) {
		this.resultStandard = resultStandard;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String getAcaYear() {
		return acaYear;
	}

	public void setAcaYear(String acaYear) {
		this.acaYear = acaYear;
	}

	public List<ResultSubject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<ResultSubject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "StudentResult [stuResultId=" + stuResultId + ", resultStandard=" + resultStandard + ", percentage="
				+ percentage + ", acaYear=" + acaYear + ", subjects=" + subjects + "]";
	}
	
}
