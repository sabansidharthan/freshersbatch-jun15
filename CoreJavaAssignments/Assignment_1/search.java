import java.util.Scanner;

public class search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your number");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int c=0;
		int a[]= {5,12,14,6,78,19,1,23,26,35,7,52,86,47};
		
		for(int k:a)
			if(k==num) {
				c++;
				System.out.println("number is in the array");
				}
			if(c==0)
				System.out.println("number not in array");
				
	}

}
