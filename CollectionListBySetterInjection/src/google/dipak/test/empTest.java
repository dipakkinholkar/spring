package google.dipak.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import google.dipak.employee.Emp;

public class empTest {

	public static void main(String[] args) {
		
		ApplicationContext app=new ClassPathXmlApplicationContext("/google/dipak/config/config.xml");
		
		
		Emp e=app.getBean(Emp.class);

		System.out.print(e);
		
		
	}

}
