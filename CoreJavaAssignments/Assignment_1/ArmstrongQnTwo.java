
public class ArmstrongQnTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// program to print armstrong number from 100 to 999
		int length = 3;
		
		
		for(int k=100;k<=999;k++) 
		{
			// checking if armstrong number
			int givenNum = k;
			int remainder ;
			int sumNum=0;
			int num = givenNum;
			for(int i=0;i<=length;i++) 
			{
				
				remainder = num%10;
				num = num/10;
				sumNum = sumNum + (int)Math.pow(remainder, length);	
			}
			// checking armstrong or not
			
			if(givenNum==sumNum)
				System.out.println(k+"");
		}

	}

}
