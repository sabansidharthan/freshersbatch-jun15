package SpringQ4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnnoBankAccountRepositoryImpl implements AnnoBankAccountRepository {
	
	@Autowired
	AnnoBankAccount account;
	
	@Override
	public double getBalance(long accountId) {
		if(account.getAccountId()==accountId) {
			return account.getAccountBalance();
		}
		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		if(account.getAccountId()==accountId) {
			account.setAccountBalance(newBalance);
		}
		
		return 0;
	}

}
