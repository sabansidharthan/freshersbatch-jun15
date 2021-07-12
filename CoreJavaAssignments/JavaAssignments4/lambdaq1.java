package JavaAssignments4;

interface operation {
	
	public double opp(double i,double j);
		
}

public class lambdaq1 {

	public static void main(String[] args) {
		
		
operation addFn = (i,j) -> i+j;
operation subFn = (i,j) -> i-j;
operation divFn = (i,j) -> i/j;
operation mulFn = (i,j) -> i*j;

System.out.println(addFn.opp(20, 5));
System.out.println(subFn.opp(20, 10));
System.out.println(divFn.opp(20, 5));
System.out.println(mulFn.opp(20, 3));

		
	}

}
