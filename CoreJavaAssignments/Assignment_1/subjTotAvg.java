import java.util.Scanner;

public class subjTotAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[][] = new int[3][3];
		for(int c=0;c<3;c++) 
		{
			System.out.println("enter the marks of student "+(c+1)+"for sub A, B, C");
			for(int d=0;d<3;d++)
			{
				Scanner input = new Scanner(System.in);
				int a = input.nextInt();
				num[c][d]=a;
			}
		}	
		
		for(int c=0;c<3;c++) 
		{
			for(int d=0;d<3;d++)
			{
				System.out.print(num[c][d]+" ");
			}
			System.out.println();
		}
		
		//total and avg mark for students
		int sum[]= new int[3];
		
		for(int c=0;c<3;c++) 
		{
			for(int d=0;d<3;d++)
			{
				sum[c]+=num[c][d];
			}
			System.out.println("Total mark of student "+ (c+1)+" : "+sum[c]);
			System.out.println("Average mark of student "+ (c+1)+" : " +(float)sum[c]/3);

		}
		int sum1[]= new int[3];
		
		
		// total and avg for subjects
		for(int c=0;c<3;c++) 
		{
			for(int d=0;d<3;d++)
			{
				sum1[c]+=num[d][c];
			}
			System.out.println("Total mark of subj "+ (c+1)+" : "+sum1[c]);
			System.out.println("Average mark of subj "+ (c+1)+" : " +(float)sum1[c]/3);

		}
		
	}

}
