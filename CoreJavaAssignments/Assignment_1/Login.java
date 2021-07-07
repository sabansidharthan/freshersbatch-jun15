import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String password= "password";
		String login= "saban";
		//System.out.println(login);
		int n=0;
		do
		{
			System.out.println("enter your login name");
			Scanner input = new Scanner(System.in);
			String inLogin = input.next();
			
			//System.out.println(inLogin);
			
			System.out.println("enter your password");
			String inPassword = input.next();
			//
			//System.out.println(inPassword);
			
			boolean B1 = (inLogin.equals("saban") && inPassword .equals( "password"));
			
			//System.out.println(B1);
			if (B1)
			{
				System.out.println("your have successfully logged in");
				break;
			}
			else 
			{
				System.out.println("Wrong password!!!");
				
				n++;
				if(n!=3)
					System.out.println(" Try again.");
			}
			
		}
		while( n<3);
		if(n==3)
			System.out.println("contact admin");
	}

}
