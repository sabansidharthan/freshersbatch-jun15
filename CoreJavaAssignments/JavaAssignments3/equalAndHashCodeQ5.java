package JavaAssignments3;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

class Employee{
	int empId;
	String name;
	double salary;
	
	public Employee(int empId, String name, double salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		
		return 20;
	}

	@Override
	public boolean equals(Object obj) {
		
		return true;
	}
}

public class equalAndHashCodeQ5 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1234, "saban",1000);
		Employee emp2 = new Employee(1034, "sona",4000);
		Employee emp3 = new Employee(1736, "salu",5000);

		Map<Employee,Integer> emplist = new Hashtable<>();
		emplist.put(emp1, 1);
		emplist.put(emp2, 2);
		emplist.put(emp3, 3);
		System.out.println(emplist.get(emp1));// should print 1 
		System.out.println(emplist.get(emp2));// should print 2
		System.out.println(emplist.get(emp3));// should print 3
		
		// the value will always print 3
		// because hash code given is only constant as the hash code is saved at one  bucket
		//also the equals method always return true
		// but values are over written

		
		
		

	}

}
