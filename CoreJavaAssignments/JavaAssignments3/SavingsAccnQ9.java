package JavaAssignments3;

import java.util.*;

class SavingsAccount implements Comparable<SavingsAccount>{
	
	int acc_bal;
	int acc_Id;
	 String accHolderName;
	 @Override
	public String toString() {
		return "acc_bal=" + acc_bal + ", acc_Id=" + acc_Id + ", accHolderName=" + accHolderName
				+ ", isSalAcc=" + isSalAcc + "\n";
	}

	Boolean isSalAcc;
	
	public int getAcc_bal() {
		return acc_bal;
	}
	public void setAcc_bal(int acc_bal) {
		this.acc_bal = acc_bal;
	}
	public int getAcc_Id() {
		return acc_Id;
	}
	public void setAcc_Id(int acc_Id) {
		this.acc_Id = acc_Id;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public Boolean getIsSalAcc() {
		return isSalAcc;
	}
	public void setIsSalAcc(Boolean isSalAcc) {
		this.isSalAcc = isSalAcc;
	}
	public SavingsAccount(int acc_bal, int acc_Id, String accHolderName, Boolean isSalAcc) {
		super();
		this.acc_bal = acc_bal;
		this.acc_Id = acc_Id;
		this.accHolderName = accHolderName;
		this.isSalAcc = isSalAcc;
	}
	
	public String withdraw(int k){
		if (acc_bal-k<0)
		return ("Insufficient balance");
		else {
			acc_bal= acc_bal-k;
				
		return ("Amount withdrawn: " + k + "\nAccount Balance: "+acc_bal);
		}
				
	}
	
	public String deposit(int k) {
		acc_bal= acc_bal+k;
		
		return ("Amount deposited: " + k + "\nAccount Balance: "+acc_bal);
	}

	@Override
	public int compareTo(SavingsAccount o) {
		return this.acc_Id-o.getAcc_Id();
	}
	
}
////////////////////////////////////////////////////////////////////////////////////
class BankAccList{
	
	Set <SavingsAccount> BankAccList = new TreeSet<>();

	public void setBankAccList(SavingsAccount sav) {
		this.BankAccList.add(sav);
		
		
	}

	@Override
	public String toString() {
		return "" + BankAccList+"\n";
	}

	public Iterator<SavingsAccount> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
		
}

////////////////////////////////////////////////////////////////////////////////////////////////
public class SavingsAccnQ9 {

	public static void main(String[] args) {
		
		SavingsAccount sav1 = new SavingsAccount(1000,9876,"sss",true);
		SavingsAccount sav2 = new SavingsAccount(5000,9878,"ppp",false);
		SavingsAccount sav3 = new SavingsAccount(3000,9880,"qqq",true);
		SavingsAccount sav4 = new SavingsAccount(7000,9882,"rrr",false);
		SavingsAccount sav5 = new SavingsAccount(9000,9884,"ttt",true);
		
		
		sav1.deposit(500);
		sav2.withdraw(500);
		System.out.println(sav1.getAcc_bal());
		System.out.println(sav2.getAcc_bal());

//		Set <SavingsAccount> BankAccList1 = new TreeSet<>();
		
		BankAccList BankAccList1 = new BankAccList();
		
		BankAccList1.setBankAccList(sav1);
		BankAccList1.setBankAccList(sav2);
		BankAccList1.setBankAccList(sav3);
		BankAccList1.setBankAccList(sav4);
		BankAccList1.setBankAccList(sav5);
		
		
		
			System.out.print(BankAccList1);
	

	}

}
