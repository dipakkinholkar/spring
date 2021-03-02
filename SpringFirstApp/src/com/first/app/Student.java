package com.first.app;

public class Student {
	
	private int studId;
	private String studName;
	private String studCity;
	
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudCity() {
		return studCity;
	}
	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}
	
	
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studCity=" + studCity + "]";
	}
	
	
	
	
	
	
	
	

}
