package google.autowire.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String args[])
	{
		
		ApplicationContext app=new ClassPathXmlApplicationContext("google/autowire/byName/web.xml");
		
		Student s=app.getBean("student",Student.class);
		
		System.out.println(s);
		
		
	}

}
