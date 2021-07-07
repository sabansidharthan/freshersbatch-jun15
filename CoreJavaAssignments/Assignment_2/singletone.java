package JavaAssignments2;

public class singletone {

	public static void main(String[] args) 
	{
		
		Abc obj=Abc.getInstance();
		Abc obj1=Abc.getInstance();
	} 

}

class Abc
{
	public static Abc obj ;
		int i;
		private Abc()
		{
		
			System.out.println("Instance created");
		}
	
	public static Abc getInstance()
	{
		if (obj==null)
		{
			obj = new Abc();
			
		}
		return obj; 
	}
	
}


/**
 * creating sub class for singletone class
 */
//class Def extends Abc{
//	
//}
//
