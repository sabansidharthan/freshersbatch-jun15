package SpringQ4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnnoBankAccountServiceImpl implements AnnoBankAccountService
{
	@Autowired
	AnnoBankAccountRepositoryImpl annoBankAccountRepositoryImpl;
	AnnoBankAccount account;
	@Override
	public double withdraw(long accountId, double balance) {
		
		System.out.println("Withdrawn sucessfully");
		
		return 0;
	}

	@Override
	public double deposit(long accountId, double balance) {
		
		return 0;
	}

	@Override
	public double getBalance(long accountId) {
	
		return 0;
	}

	@Override
	public Boolean fundTransfer(long fromAccount, long toAccount, double Amount) {

		return false;
	}

}
