import java.util.Scanner;

public class taxSlabQn {

	public static void main(String[] args) {
		System.out.println("enter your income in rupees.");
		Scanner input = new Scanner(System.in);
		double income = input.nextDouble();
		input.close();
		double tax=0;
		if (income<= 180000)
			 tax = 0;
		else if (income>180000 && income <=300000)
			tax= (income - 180000)*0.10;
		else if (income>300000 && income <=500000)
			tax = (300000-180001)*.10+ (income - 300000)*0.20;
		else if (income>500000 && income <=1000000)
			tax = (300000-180001)*0.1+(500000-300001)*0.20+ (income - 500000)*0.30;
		
		System.out.println("tax payable: " + tax);
	}

}
