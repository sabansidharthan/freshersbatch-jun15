package JavaAssignments4;
import java.util.function.Supplier;
import java.util.function.*;
public class lambdaQ3 {

	public static void main(String[] args) {
		
		Supplier<String> s = () -> "Hellooo world!!";
		System.out.println(s.get());
		
		Consumer<Integer> c= (i) -> System.out.println(i);
		c.accept(10);
		
		Predicate<Integer> p=(k) -> k>100;   
		Predicate<Integer> pred = k-> (k>100);
		
		System.out.println(pred.test(103));
		System.out.println(p.test(98));
		System.out.println(p.test(1000));
		
		Function<Integer,Integer> Mul = (k)-> k*k;
		int x=Mul.apply(22);
		System.out.println(x);


	}

}
