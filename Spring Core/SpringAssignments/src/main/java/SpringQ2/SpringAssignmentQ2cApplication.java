package SpringQ2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringQ1.Customer;


public class SpringAssignmentQ2cApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("contextMap.xml");
		QuestionMap question = context.getBean(QuestionMap.class);
		System.out.println(question.toString());
		context.close();
		
		
	}

}
