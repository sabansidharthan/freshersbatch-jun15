package JavaAssignment4;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class TransactionList {

	public static void main(String[] args) {
		
		List<Transaction> TranList =new ArrayList<>();
		
		TranList.add(new Transaction(new Trader("saban","tvm"),2016,100000));
		TranList.add(new Transaction(new Trader("visal","pune"),2016,300000));
		TranList.add(new Transaction(new Trader("sona","tvm"),2011,2500000));
		TranList.add(new Transaction(new Trader("jain","indore"),2019,230000));
		TranList.add(new Transaction(new Trader("saban","tvm"),2018,1500000));
		TranList.add(new Transaction(new Trader("salu","delhi"),2020,1000000));
		TranList.add(new Transaction(new Trader("lulu","delhi"),2021,1900000));
		TranList.add(new Transaction(new Trader("unni","pune"),2021,100000));
		
		System.out.println("Q8 tranction in 2011 soted");		
		TranList.stream()
		.filter(x->x.getYear  ()==2011)
		.sorted((o1,o2)-> o1.getValue()-o2.getValue())
		.forEach(System.out::println);
		System.out.println("");
		
		System.out.println("Q9 traders from distinct city");
		
		Set tradercity=TranList.stream()
				.map(Transaction::getTrader)
				.collect(Collectors.groupingBy(Trader::getCity,Collectors.counting())).keySet();
	     System.out.println(tradercity);
		

		System.out.println("Q10 traders from pune sorted");
		
		TranList.stream()
		.filter(x->x.getTrader().getCity().equals("pune"))
		.sorted((o1,o2)-> o1.getTrader().getName().compareTo(o2.getTrader().getName()))
		.forEach(System.out::println);
		System.out.println("");

		System.out.println("Q11 traders name order print");
		
		TranList.stream()
		.map(Transaction::getTrader)
		.map(Trader::getName)
		.distinct()
		.sorted()
		.forEach(System.out::print);
		
		System.out.println("");
		System.out.println("Q12 traders from indore");
		
		TranList.stream()
		.filter(x->x.getTrader().getCity().equals("indore"))
		.forEach(System.out::println);
		System.out.println("");

		System.out.println("q13transaction value from Delhi");

		//List<Transaction>values=
		 TranList.stream()
		.filter(x->x.getTrader().getCity().equals("delhi"))
		.map(Transaction::getValue)
		.forEach(System.out::println);
		
		System.out.println("");
		
		System.out.println("Q14  transaction value Max");

		//List<Transaction>values=
		 Transaction var = TranList.stream()
		.max(Comparator.comparing(Transaction::getValue))
		.get();
		 System.out.println(var.getValue());
		

		System.out.println("Q15 transaction value min");

		//List<Transaction>values=
		TranList.stream()
		.min(Comparator.comparing(Transaction::getValue))
		.stream()
		.forEach(System.out::println);

	}

}
