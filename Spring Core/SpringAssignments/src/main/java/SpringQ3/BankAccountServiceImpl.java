package SpringQ3;

public class BankAccountServiceImpl implements BankAccountService
{

	BankAccount account;
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
