package SpringQ6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan
@PropertySource("classpath:dbConfig.properties")
public class PropReadApp {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(PropReadApp.class);
		PropRead prop = run.getBean(PropRead.class);
		System.out.println(prop.toString());

		
	}

}
