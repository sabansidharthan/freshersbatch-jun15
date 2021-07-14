package JavaAssignments4;
import java.util.*;
import java.lang.StringBuilder;
import java.util.HashMap;
import java.util.Map;

public class lambdaQ7 {

	public static void main(String[] args) {

		Map<String,Integer> list = new HashMap<>();
		
		list.put("saban",10);
		list.put("sona",3);
		list.put("salu",4);
		list.put("kannan",99);
		list.put("unni",9);
		
		StringBuilder sb = new StringBuilder();
		list.forEach((x,y)-> sb.append(x).append(y));

//		for (Map.Entry<String, String> it :list.entrySet()) {
//			sb.append(it.getKey());
//			sb.append(it.getValue());
//			System.out.println( it.getKey() +" "+ it.getValue());
//		}
	
		System.out.println(sb);

	}

}
