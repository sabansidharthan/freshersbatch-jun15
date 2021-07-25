package SpringQ3;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	BankAccount account;
	
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
