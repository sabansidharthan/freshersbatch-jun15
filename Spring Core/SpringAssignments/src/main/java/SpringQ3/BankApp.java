package SpringQ3;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BankApp {

	public static void main(String[] args) {


		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(
				"applicationContextBank.xml")){
			BankAccountController controller= applicationContext.getBean(BankAccountController.class);
			
			double x =controller.getBalance(1234);
			System.out.println("balance: "+x);
			
			double y =controller.deposit(1234, 1000);
			System.out.println("new balance: "+y);
			controller.withdraw(1234, 1000);;
		}	
	}

}
