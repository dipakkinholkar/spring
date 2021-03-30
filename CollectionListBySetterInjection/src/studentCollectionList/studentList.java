package studentCollectionList;

import java.util.List;

public class studentList {
	
	
	private List<Integer> sid;
	private List<String> sname;
	private List<String> scity;
	public List<Integer> getSid() {
		return sid;
	}
	public void setSid(List<Integer> sid) {
		this.sid = sid;
	}
	public List<String> getSname() {
		return sname;
	}
	public void setSname(List<String> sname) {
		this.sname = sname;
	}
	public List<String> getScity() {
		return scity;
	}
	public void setScity(List<String> scity) {
		this.scity = scity;
	}
	
	
	
	@Override
	public String toString() {
		return "studentList"+"\n"+"sid="+ sid + "\n"+"sname=" + sname + "\n"+ "scity=" + scity + ""+"\n";
	}
	
	
	
	
	
	
	
	

}
