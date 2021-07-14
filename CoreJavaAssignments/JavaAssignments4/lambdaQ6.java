package JavaAssignments4;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

public class lambdaQ6 {

	public static void main(String[] args) {
		
		
List<String> list = new ArrayList<>();
		
		list.add("cat");
		list.add("dog");
		list.add("betta");
		list.add("parrot");
		list.add("hen");
		list.add("goat");
		list.add("stars");
//		
		UnaryOperator<List<String>> uo = x ->{
			x.replaceAll(y->y.toUpperCase());;
			return x;
		};
		System.out.println(uo.apply(list));
//		
//		list.replaceAll(String::toUpperCase);
//		System.out.println(list);
	}

}
