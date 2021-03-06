package SpringQ3;

public interface BankAccountService {
	
	public double withdraw(long accountId, double balance);
	public double deposit(long accountId, double balance);
	public double getBalance(long accountId);
	public Boolean fundTransfer(long fromAccount, long toAccount, double Amount);
	
}
