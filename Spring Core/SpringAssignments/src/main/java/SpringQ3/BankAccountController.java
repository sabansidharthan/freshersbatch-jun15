package SpringQ3;

public class BankAccountController {
	BankAccount account;

	public BankAccountController(BankAccount account) {
		super();
		this.account = account;
	}
	
	public void withdraw(long accountId,double accountbalance) {
		if(account.getAccountId()==accountId) 
			 System.out.println(account.getAccountBalance()-accountbalance); 
			
	}
	public double deposit(long accountid,double balance) {
		if(account.getAccountId()==accountid) 
			return account.getAccountBalance()+balance;
			return 0;
	}
	public double getBalance(long accountId) {
		if(account.getAccountId()==accountId) 
			return account.getAccountBalance();
			return 0;
		
	}
	public boolean fundTransfer(long fromAccount,long toAccount,double amount) {
		return true;
		}

		
		
}


