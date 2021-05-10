package com.jdbc.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.pojo.Student;

public class StudentDao {
	
	private static JdbcTemplate jdbc;

	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcTemplate jdbc) {
		
		this.jdbc = jdbc;
	}
	
	public int saveStudent(Student stud)
	{
		String query="insert into student values('"+stud.getsId()+"','"+stud.getsName()+"','"+stud.getsClass()+"')";  
	  
		return jdbc.update(query);  
	}
	
	// update student name , class by sid.
	
	public int updateStudent(Student stud)
	{
		
		String query="update student set sname='"+ stud.getsName()+"', sclass='"+stud.getsClass()+"' where sid='"+stud.getsId()+"' ";	
		
		return jdbc.update(query);
	}
	
	public int deleteStudent(Student stud)
	{
		String query="delete from student where sid='"+stud.getsId()+"'";
		
		return jdbc.update(query);
	}
	
	
	
}
