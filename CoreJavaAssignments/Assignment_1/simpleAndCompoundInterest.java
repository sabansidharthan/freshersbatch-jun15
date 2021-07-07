import java.util.Scanner;

public class simpleAndCompoundInterest {

	public static void main(String[] args) {
		
		System.out.println("enter the Principle amount");
		Scanner input = new Scanner(System.in);
		double P = input.nextInt();
		System.out.println("enter the rate of interest");
		double R = input.nextInt();
		System.out.println("enter the time period in years");
		double t = input.nextInt();
		System.out.println("enter frequency of compounding (1 or 2 0r 4)");
		double n = input.nextInt();
		//System.out.println(P+ ""+R+""+ t+""+ n);
		input.close();
		double amtCI , CI;
		double r= R/100;
		amtCI = P*(Math.pow((1+(r/n)),(n*t)));
		CI= amtCI - P;
	System.out.printf("Simple interest is: %.3f \n",(P*r*t));
	System.out.println("Total amount for simple interest: "+ P +(P*r*t));
	System.out.println("total amount for compound interest: "+ amtCI);
	System.out.println("compount interest is :" + CI);
	
	}

}
