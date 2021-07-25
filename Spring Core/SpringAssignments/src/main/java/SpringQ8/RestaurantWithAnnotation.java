package SpringQ8;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class RestaurantWithAnnotation {
	
	public void greet() {
		System.out.println("Hello welcome to the restaurant");
		
	}
	@PostConstruct
	public void init() {
		System.out.println("The init method with annotation in action");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("The destroy method with annotation in action");
	}

}
