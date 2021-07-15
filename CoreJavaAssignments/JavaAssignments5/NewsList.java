package JavaAssignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class NewsList {

	public static void main(String[] args) {
		
		List<News> list = new ArrayList<>();
		list.add(new News(101,"saban","kannan","The budget was awful"));
		list.add(new News(11,"meenu","riya","india won world cup"));
		list.add(new News(11,"nicholas","kannan","budget was not well planned"));
		list.add(new News(101,"solomon","achu","time for party"));
		list.add(new News(101,"messi","meenu","budget no one cares"));
		list.add(new News(183,"solomon","kannan","bank robbed"));
		
		
		//budget appear n time Q5
		long count = list.stream()
		.filter(k->k.getComment().contains("budget"))
		.count();
		System.out.println("budget appears "+count+" times");
		System.out.println();
		
		// no of comment by user Q7
		
		Map<String, Long> kk= list.stream()
				.collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()));
				System.out.println(kk);
				System.out.println();
	
				//news id with most comment Q4
		Integer newsidmax= 
				list.stream()
				.collect(Collectors.groupingBy(News::getNewsId,Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.get().getKey();
				System.out.println("News ID with the most comments is "+newsidmax);
				
				System.out.println();
				
				//Q6
				
			String maxCommentUser= list.stream()
					.collect(Collectors.groupingBy(News::getCommentByUser,Collectors.counting()))
					.entrySet()
					.stream()
					.max(Map.Entry.comparingByValue())
					.get().getKey();
			
					
			System.out.println("user with the most comments is "+maxCommentUser);

		
		
		
		

	}

}
