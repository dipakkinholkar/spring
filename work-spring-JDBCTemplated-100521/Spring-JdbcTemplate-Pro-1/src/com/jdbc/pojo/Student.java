package com.jdbc.pojo;



public class Student {

	
	private int sId;
	private String sName;
	private String sClass;

	
	public Student()
	{
		super();
	}
	
	
	

	// generate getters and setters

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsClass() {
		return sClass;
	}
	public void setsClass(String sClass) {
		this.sClass = sClass;
	}
	
	
	
	
}
