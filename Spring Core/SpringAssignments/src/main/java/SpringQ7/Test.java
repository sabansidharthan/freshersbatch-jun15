package SpringQ7;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("contextDemoQ7.xml");
		Demo d1 = context.getBean(Demo.class);
		System.out.println(d1);	
		context.close();
	}

}
