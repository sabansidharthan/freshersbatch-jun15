import java.util.Scanner;

public class passedOrNot {

	public static void main(String[] args) {
		System.out.println("enter the marks for Subject 1");
		Scanner input = new Scanner(System.in);
		float mark1 = input.nextInt();
		System.out.println("enter the marks for Subject 2");
		float mark2 = input.nextInt();
		System.out.println("enter the marks for Subject 3");
		float mark3 = input.nextInt();
		input.close();
		if (mark1>=60 && mark2>=60 && mark3 >= 60)
			System.out.println("Passed");
		else if((mark1>=60 && mark2>= 60) ||( mark2>= 60 && mark3 >= 60) ||( mark1>=60 && mark3>=60))
			System.out.println("Promoted");
		else
			System.out.println("failed");
		
	}

}
