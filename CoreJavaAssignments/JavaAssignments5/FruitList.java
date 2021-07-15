package JavaAssignment4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FruitList {

	public static void main(String[] args) {
		List<Fruit> flist = new ArrayList<>();
		
		flist.add(new Fruit("apple",100,10,"red"));
		flist.add(new Fruit("orange",200,15,"orange"));
		flist.add(new Fruit("banana",150,5,"green"));
		flist.add(new Fruit("pineapple",700,40,"yellow"));
		flist.add(new Fruit("blueberry",70,50,"blue"));
		flist.add(new Fruit("plum",95,20,"red"));
		flist.add(new Fruit("strawberry",50,150,"red"));

		
		System.out.println("calorie less than 100");
		flist.stream()
		.filter(x ->(x.getCaories()<100))
		.forEach(System.out::println);
		
		System.out.println("");
		System.out.println("group by colour");
		
		flist.stream()
		.collect(Collectors.groupingBy(Fruit::getColour))
		.forEach((x,y)-> {
			System.out.println(x);
			y.forEach(System.out::println);
			}
				);
		System.out.println("");
		System.out.println("group by colour red");
		
		flist.stream()
		.filter(x->x.getColour().contains("red"))
		.forEach(System.out::println);
		
		
		System.out.println("");
		System.out.println("group by colour red ascending");
		
		flist.stream()
		.filter(x->x.getColour().contains("red"))
		.sorted((o1,o2)-> o2.getPrice()-o1.getPrice())
		.forEach(System.out::println);
		

	}

}
