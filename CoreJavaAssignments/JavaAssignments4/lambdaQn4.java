package JavaAssignments4;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class lambdaQn4 {

	public static void main(String[] args) {
			
		List<String> list = new ArrayList<>();
		
		list.add("string");
		list.add("saban");
		list.add("sting");
		list.add("striped");
		list.add("stringent");
		list.add("striker");
		list.add("strs");
		
		Predicate<String> p = e -> ((e.length())%2 != 0);
		list.removeIf(p);		
		System.out.println(list);
		
		
	}

}
