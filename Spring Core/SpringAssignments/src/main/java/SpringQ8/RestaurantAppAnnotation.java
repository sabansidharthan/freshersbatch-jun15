package SpringQ8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import SpringQ1.Customer;


public class RestaurantAppAnnotation {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("initDestroyAnnotation.xml");
		RestaurantWithAnnotation restaurant = context.getBean(RestaurantWithAnnotation.class);
		restaurant.greet();
		context.close();
		
		
	}

}
