package JavaAssignments2;
class Cust
{
	int custId;
	int savingsAccNo;
	int currentAccNo;
	
	public Cust(int custId,int savingsAccNo,int currentAccNo)
	{
		this.custId = custId;
		this.savingsAccNo = savingsAccNo;
		this.currentAccNo = currentAccNo;
				
	}
	
	public void getCust()
	{
		System.out.println("custId: "+custId);
//		System.out.println("totalAccBal: "+totalAccBal);
	}
}

class savAcc extends Cust
{
	int savAccBal;

	public savAcc(int custId, int savingsAccNo, int currentAccNo, int savAccBal) {
		super(custId, savingsAccNo, currentAccNo);
		
		this.savAccBal = savAccBal;
		
		
	}
	
	public void getBalance()
	{
		//System.out.println("custId: "+custId);
		System.out.println("savAccBal: "+savAccBal);
	}
}

class curAcc extends Cust
{
	int curAccBal;

	public curAcc(int custId, int savingsAccNo, int currentAccNo, int curAccBal) {
		super(custId, savingsAccNo, currentAccNo);
		this.curAccBal = curAccBal;

	}

	
	public  void getBalance()
	{
	//	System.out.println("custId: "+custId);
		System.out.println("curAccBal: "+curAccBal);
	}
}

public class currentAndSavings {

	public static void main(String[] args) {
		
		Cust tommy = new Cust(9999,12345,12346);
		curAcc tommyCur= new curAcc(9999,12345,12346,5000);
		savAcc tommySav= new savAcc(9998,12345,12346,8000);
		
		tommyCur.getBalance();
		tommySav.getBalance();
		System.out.println("total balance = "+(tommyCur.curAccBal+tommySav.savAccBal));
		

	}

}
