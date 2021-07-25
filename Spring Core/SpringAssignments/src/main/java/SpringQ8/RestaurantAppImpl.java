package SpringQ8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringQ1.Customer;


public class RestaurantAppImpl {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("initDestroyImpl.xml");
		RestaurantImpl restaurant = context.getBean(RestaurantImpl.class);
		restaurant.greet();
		context.close();
		
		
	}

}
