package SpringQ9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringQ1.Customer;


public class RestaurantApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("initDestroyQ9.xml");
		Restaurant restaurant = context.getBean(Restaurant.class);
		restaurant.greet();
		context.registerShutdownHook();
		
		
	}

}
