package com.test.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.Dao.StudentDao;
import com.jdbc.pojo.Student;

public class Test {

	public static void main(String[] args) {
		
ApplicationContext ctx=new ClassPathXmlApplicationContext("com/dipak/xml/config.xml");  
	    
	    StudentDao dao=(StudentDao) ctx.getBean("sdao");
		
	    Student stud=new Student();
	    
	    stud.setsId(101);
	    stud.setsName("Dipak");
	    stud.setsClass("B.sc");
	    
	    int status=dao.saveStudent(stud);  
	    System.out.println(status);  
	          

		
		
		
		
		
		
		
	}

}
