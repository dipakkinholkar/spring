package com.first.app;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
	
		
		ApplicationContext app     =new ClassPathXmlApplicationContext("/xmlfile/config.xml");
		    		
			Student student=(Student)     app.getBean("student");  

		    System.out.println(student);
		    
		
		
		
		
	}

}
