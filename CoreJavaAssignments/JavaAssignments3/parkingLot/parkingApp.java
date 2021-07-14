package JavaAssignments3.parkingLot;

import java.util.Scanner;

public class parkingApp {

	public static void main(String[] args) {
		
		ParkedOwnerList pol1 = new ParkedOwnerList();
		int e=0;
		do {
			System.out.println("Please select your option \n 1.Park car \n 2. Remove car \n 3. Find car \n 0. Exit");
			Scanner sInt= new Scanner(System.in);
			Scanner sLn= new Scanner(System.in);
				e = sInt.nextInt();
			switch(e) {
			  case 1:
				  CarOwnerDetails newCO = new CarOwnerDetails();
				  String s;
					  int n;
					  System.out.print("Enter name : ");
					  s = sLn.nextLine();
					  newCO.setOwnerName(s);;
					  System.out.print("Enter car model : ");
					  s = sLn.nextLine();
					  newCO.setCarModel(s);
					  System.out.print("Enter car number : ");
					  n = sInt.nextInt();
					  newCO.setCarNo(n);
					  System.out.print("Enter mobile number : ");
					  n = sInt.nextInt();
					  newCO.setOwnerPh(n);
					  System.out.print("Enter adress : ");
					  s = sLn.nextLine();
					  newCO.setOwnerAddr(s);
					  token t = pol1.generateToken();
					  if(t != null) {
						  	pol1.addNewCar(t,newCO);
					  		System.out.print("\nCar parked successfully.\n");
					  }
					  else {
						  System.out.print("No slots available.");
						  }
				 	  break;
			  case 2:
				  	  System.out.print("Enter car number : ");
					  int num;
					  num = sInt.nextInt();
					  token pt=pol1.getCarLocation(num);
					  if(pt!=null) {
						  pol1.removeCar(pt);
						  System.out.print("\nCar checked out.\n");
					  }
				 	  break;
			  case 3:
					  System.out.print("Enter car number : ");
					  int n1;
					  n1 = sInt.nextInt();
					  token pt1=pol1.getCarLocation(n1);
				  
			  case 0:
				  break;
			  default:
				  System.out.println("\n Invalid choice!\n");
				  break;
			}
		}while(e!=0);
		

	}


}


