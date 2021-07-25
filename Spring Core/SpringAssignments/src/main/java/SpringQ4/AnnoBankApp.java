package SpringQ4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;



@Configuration
@ComponentScan
public class AnnoBankApp {

	@Bean
	public AnnoBankAccountRepositoryImpl getAnnotationBankAccountRepositoryImpl() {
		return new AnnoBankAccountRepositoryImpl();
	}

	@Bean
	public AnnoBankAccountServiceImpl getAnnotationBankAccountServiceImpl() {
		return new AnnoBankAccountServiceImpl();
	}


	public static void main(String[] args) {


		try(ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(
				"applicationContextAnnoBank.xml")){
			AnnoBankAccountController controller= applicationContext.getBean(AnnoBankAccountController.class);
			
			double x =controller.getBalance(1234);
			System.out.println("balance: "+x);
			
			double y =controller.deposit(1234, 1000);
			System.out.println("new balance: "+y);
			controller.withdraw(1234, 1000);;
		}	
	}

}
