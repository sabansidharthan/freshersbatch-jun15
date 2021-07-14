package JavaAssignments4;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class lambdaQ5 {

	public static void main(String[] args) {
			
		List<String> list = new ArrayList<>();
		
		list.add("cat");
		list.add("dog");
		list.add("betta");
		list.add("parrot");
		list.add("hen");
		list.add("goat");
		list.add("stars");
		
		StringBuilder sb = new StringBuilder();
		Consumer<String> c = i -> sb.append(i.charAt(0));
		list.forEach(c);
		System.out.println(sb);
//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		Consumer<List<String>> con = lst -> {
			StringBuilder s = new StringBuilder();
			lst.forEach(j -> s.append(j.charAt(0)));
			System.out.println(s);		
				
		};
		
		con.accept(list);
		
	}

}
