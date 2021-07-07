import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter your number");
		Scanner input = new Scanner(System.in);
		int givenNum = input.nextInt();
		input.close();
		//System.out.println(givenNum);

		// finding length of the given number
		int temp = 1 , length=0;
		while(temp<=givenNum) 
		{
			length++;
			temp*=10;
		}
		//System.err.println(length);
		
		// checking if armstrong number
		int remainder ;
		int sumNum=0;
		int num = givenNum;
		for(int i=1;i<=length;i++) 
		{
			
			remainder = num%10;
			num = num/10;
			sumNum = sumNum + (int)Math.pow(remainder, length);		
					
			
		}
		System.out.println("armstrong check Sum:"+sumNum);
		
		if(givenNum==sumNum)
			System.out.println(givenNum+" is an Armstrong number");
		else
			System.out.println(givenNum+" is not an Armstrong number");

	}

}
