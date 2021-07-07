package JavaAssignments2;
import java.util.Scanner;
abstract class Persistence{
	abstract void persist();
	
	public void store()
	{
		System.out.println("Storing Data");
	}
	
}

class FilePersistence extends Persistence{
	
	public void persist()
	{
		System.out.println("in File");
	}

}
class DataBasePersistence extends Persistence {
	
	public void persist()
	{
		System.out.println("in DataBase");
	}
}

public class PersistenceQn {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int inp = (int)s.nextInt();
		s.close();
		if(inp%2==0)
		{
			Persistence obj = new FilePersistence();
			obj.persist();
		}
		else
		{
			Persistence obj = new DataBasePersistence();
			obj.persist();
		}
		
	}

}
