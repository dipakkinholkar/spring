package google.autowire.byType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import google.autowire.byName.Student;

public class Test {

	public static void main(String[] args) {
	
		

		ApplicationContext app=new ClassPathXmlApplicationContext("google/autowire/byType/web.xml");
		
		College s=app.getBean("college",College.class);
		
		System.out.println(s);
		
		
		
		
		
	}

}
