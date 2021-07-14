package JavaAssignments3.chatroom;

import java.util.Scanner;

public class ChatApp {

	public static void main(String[] args) {
		
		User user1 = new User("saban","saban");
		User user2= new User("sona","sona");
		User user3= new User("salu","salu");
		Chatroom cr1 = new Chatroom();	
		cr1.addUserToList(user1);
		cr1.addUserToList(user2);
		cr1.addUserToList(user3);
		
		int in=0;
	
		do {
			System.out.println("1: Login\t0: Exit");	
			Scanner sint = new Scanner(System.in);
			in = sint.nextInt();
			
			if(in==1) {
				Scanner sstr = new Scanner(System.in);
		
				System.out.println("enter username:");
				String user = sstr.next();

				System.out.println("enter password:");
				String pass = sstr.next();
				
				User newUser = new User(user,pass);
				
				if(cr1.credCheck(newUser)) {
					
					System.out.println("login sucessful");
					
					int logout = 0;
					do {
						System.out.println("1. Enter chat\t0. Logout\n");
						
						logout = sint.nextInt();
						
						if(logout==1) {
							
							int stopchat=0;
							
							do {
								System.out.println("1. send message\t2. read message\t3.List user\t4. Clear Chat\t0. Exit\n ");
								stopchat= sint.nextInt();
								
									switch(stopchat) {
									  case 1:
										  String msg;
										  System.out.print("Type message: \n");
										  msg = sstr.nextLine();
										  cr1.sendMsgToChat(newUser,msg);
										  break;
									  case 2:
										  cr1.displayAllMsg();
										  break;
									  case 3:
										  cr1.displayAllUser();;
										  break;
									  case 4:
										  cr1.clearChat();
										  break;
									  case 0:
										  break;
									  default:
										  System.out.println("\n Invalid choice!\n");
										  break;
									}
							}while(stopchat!=0);
							
						}
						else {
							System.out.println("\n Invalid choice!\n");
						}
					}while(logout!=0);
				}else {
					System.out.println("\n wrong cred!\n");
				}	
			}
			
		}while(in!=0);
		
	}
	
}


