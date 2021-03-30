package studentListTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import studentCollectionList.studentList;

public class studentTest {

	public static void main(String[] args) {
		
		
		ApplicationContext app=new ClassPathXmlApplicationContext("studlist/config/config.xml");
		
		studentList stud=(studentList) app.getBean("studlist");
		
		System.out.println(stud);
		

	}

}
