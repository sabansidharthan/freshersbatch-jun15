package SpringQ4;

public interface AnnoBankAccountRepository {
	
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);

}
