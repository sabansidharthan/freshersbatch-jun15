package SpringQ10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("applicationContextQ10.xml");
		ApplicationContextAwareTest appcontext= (ApplicationContextAwareTest)context.getBean("appcontext");
		ApplicationContext appCon =appcontext.getContext();
		TestClass a= (TestClass)appCon.getBean("testClass");
		a.doTask();
		context.registerShutdownHook();
	}

}
