package JavaAssignments3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashVsLinkedHash {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new LinkedHashSet<>();
		
		set1.add(8);
		set1.add(11);
		set1.add(18);
		set1.add(22);
		set1.add(85);
		
		set2.add(8);
		set2.add(11);
		set2.add(18);
		set2.add(22);
		set2.add(85);
		System.out.println("Hashset");
		System.out.println(set1);
		System.out.println("-------------------");
		System.out.println("Linked Hashset");
		System.out.println(set2);
		
		
		

	}

}
