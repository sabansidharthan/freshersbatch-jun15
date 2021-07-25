package SpringQ2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringQ1.Customer;


public class SpringAssignmentQ2aApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("contextList.xml");
		QuestionList question = context.getBean(QuestionList.class);
		System.out.println(question.toString());
		context.close();
		
		
	}

}
