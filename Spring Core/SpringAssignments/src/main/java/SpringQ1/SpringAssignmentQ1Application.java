package SpringQ1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringAssignmentQ1Application {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("forConstructor.xml");
		Customer customer = context.getBean(Customer.class);
		System.out.println(customer.getCustomer());
		context.close();
		
		
	}

}
