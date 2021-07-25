package SpringQ5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class studentApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContextQ5.xml");
		Student student = context.getBean("student",Student.class);
		System.out.println(student.getAdmNo()+"\t"+student.getStudentname());
		System.out.println(student.getIdCard().getName()+"\t" +student.getIdCard().getClassRoomNo());
		((AbstractApplicationContext) context).close();


	}

}
