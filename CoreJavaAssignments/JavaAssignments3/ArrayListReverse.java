package JavaAssignments3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListReverse {

	public static void main(String[] args) {
		List<Integer> arr= new ArrayList<>();
		
		arr.add(21);
		arr.add(34);
		arr.add(57);
		arr.add(87);
		arr.add(23);
		
		Collections.sort(arr);
		Collections.reverse(arr);
		
		Iterator<Integer> it = arr.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}

}
