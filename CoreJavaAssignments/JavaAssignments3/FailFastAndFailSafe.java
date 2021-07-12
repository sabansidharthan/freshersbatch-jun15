package JavaAssignments3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastAndFailSafe {

	public static void main(String[] args) {

//		Map<String,String> student=new  HashMap<>();
//		student.put("saban","mumbai");
//		student.put("salu","tvm");
//		student.put("sona","atl");
//		student.put("achu","uae");
//		student.put("anu","mct");
//		
//		Set<String> key = student.keySet();
//
//		Iterator<String> it = key.iterator();
//		while(it.hasNext())
//		{
//			String name;
//			name = it.next();
//			student.put("kannan", "chennai"); // throws Concurrent Modification Exception
//			System.out.println("name: "+ name +"\t place: "+ student.get(name));
//			
//		}
	///////////////////////////////////////////////////////////////////////////////////////////////
		
		Map<String,String> student=new  ConcurrentHashMap<>();
		student.put("saban","mumbai");
		student.put("salu","tvm");
		student.put("sona","atl");
		student.put("achu","uae");
		student.put("anu","mct");
		
		Set<String> key = student.keySet();

		Iterator<String> it = key.iterator();
		while(it.hasNext())
		{
			String name;
			name = it.next();
			student.put("kannan", "chennai"); // doesnot throw exception and adds the data
			System.out.println("name: "+ name +"\t place: "+ student.get(name));
			
		}
		
	}

}
