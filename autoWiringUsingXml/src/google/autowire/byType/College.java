package google.autowire.byType;

import google.autowire.byType.Student;

public class College {
	
	private String cname;
	private String ccity;
	
	private Student student;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCcity() {
		return ccity;
	}

	public void setCcity(String ccity) {
		this.ccity = ccity;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	
	
	@Override
	public String toString() {
		return "College [cname=" + cname + ", ccity=" + ccity + ", student=" + student.getSid()+" "+student.getSname()+" "+student.getScity()+"]";
	}
	
	
	
	
	
	

}
