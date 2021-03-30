package google.dipak.employee;

import java.util.List;
import java.util.Vector;

public class Emp {
	
	private List<String> eid;
	private List<String>  ename;
	private List<String> ecity;
	
	
	public List<String> getEid() {
		return eid;
	}
	public void setEid(List<String> eid) {
		this.eid = eid;
	}
	public List<String> getEname() {
		return ename;
	}
	public void setEname(List<String> ename) {
		this.ename = ename;
	}
	public List<String> getEcity() {
		return ecity;
	}
	public void setEcity(List<String> ecity) {
		this.ecity = ecity;
	}
	
	
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", ecity=" + ecity + "]";
	}	
	
	
	
	
	

}
