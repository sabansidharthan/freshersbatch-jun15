package JavaAssignments2;
// class
class employee
{
//	 member variables
	int id;
	String name;
	int salary;
	static String ceo;
	
//	constructor
	
	public employee(int id, String name, int salary )
	{
		this.id=id;
		this.name= name;
		this.salary = salary;
	}
	
	static {
		ceo = "saban";
	}
	
//	methods
	public void getSalary()
	{
		
		System.out.println("The salary of "+name+" id: "+id+" is "+ salary );
	}
	
}
//creating manager class
class manager extends employee
{
	int incentives;

	public manager(int id, String name, int salary,int incentives)
	{
		super(id, name, salary);
		this.incentives = incentives;
		
		
	}
	
	public void getSalary()
	{
		
		System.out.println("The total salary of manager "+name+" id: "+id+" with incentive is "+ (salary+incentives));
	}
}
// creating class labour

class labour extends employee
{
	int overTime;

	public labour(int id, String name, int salary,int overTime)
	{
		super(id, name, salary);
		this.overTime = overTime;		
	}
	public void getSalary()
	{
		
		System.out.println("The total salary of labour "+name+" id: "+id+" with overTimeis "+ (salary+overTime));
	}
	
}

// main
public class Organization {
	
	public static void main(String[] args) 
	{		
		employee name1 = new employee(2193,"name1",2000);
		manager name2 = new manager(3632,"name2",3000,100);
		labour name3 = new labour(4983,"name3",5000,100);
		
		name3.getSalary();
		name2.getSalary();
		name1.getSalary();
	}

}
