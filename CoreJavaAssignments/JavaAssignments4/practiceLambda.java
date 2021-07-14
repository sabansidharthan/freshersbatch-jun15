package JavaAssignments4;

import java.util.Arrays;
import java.util.List;

public class practiceLambda {

	public static void main(String[] args) {
		
		
		List<Integer> list =Arrays.asList(2,3,4,5,6,7,8);

		list.forEach(i->System.out.println(i));
}
}