package SpringQ8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class RestaurantImpl implements InitializingBean, DisposableBean{
	
	public void greet() {
		System.out.println("Hello welcome to the restaurant");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterProperties method with the Initilizing Bean in Action");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy with the Disposable Bean in Action");
	
	}

		
}


