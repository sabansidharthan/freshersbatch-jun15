package SpringQ2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringQ1.Customer;


public class SpringAssignmentQ2bApplication {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("contextSet.xml");
		QuestionSet question = context.getBean(QuestionSet.class);
		System.out.println(question.toString());
		context.close();
		
		
	}

}
