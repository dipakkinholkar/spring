package com.test.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.Dao.StudentDao;
import com.jdbc.pojo.Student;

public class Test extends Thread{

	static  StudentDao dao;
	static Student stud;
	
	public void run()
	{
		try {
		    
		    int status=dao.saveStudent(stud);
		    
		    System.out.print(status+"    saved");
		    Thread.sleep(10000);
		    
		    stud.setsId(101);
		    stud.setsName("Mahesh");
		    stud.setsClass("BCA");
		    
		    status=dao.updateStudent(stud);
		    Thread.sleep(10000);
		    System.out.print(status+"    updated");

		    status=dao.deleteStudent(stud);  
		    Thread.sleep(10000);
		    System.out.print(status+"   deleted");
		          
		    }
			
			catch(Exception e)
		    {
				System.out.print(e);
		    }
					

	}
	
	public static void main(String[] args) {
		
ApplicationContext ctx=new ClassPathXmlApplicationContext("com/dipak/xml/config.xml");  
	    
	 dao=(StudentDao) ctx.getBean("sdao");
		
	 stud=new Student();
	    
	 	stud.setsId(101);
	    stud.setsName("dipak");
	    stud.setsClass("M.sc");
	    
	  Test t=new Test();
//	  
	   t.start();
	    		
	}

}
