package JavaAssignments4;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;

public class lambdaQ8 {

	public static void main(String[] args) {
List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		Thread t1 = new Thread(()-> {for(int l : list) System.out.println(l);
		});
		
		Consumer <List<Integer>> con = (lt)->{
			for(int k :lt) System.out.println(k);
		};		
		Thread t2 = new Thread(()-> con.accept(list));
		
		t1.start();
		t2.start();
	}

}
