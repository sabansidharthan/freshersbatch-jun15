package JavaAssignments3;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
	private String name;
	private int weight;
	private int height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Person(String name, int weight, int height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}
	@Override
	public int compareTo(Person o) {
		
		if(this.weight==o.getWeight()){	
			
			if(this.height==o.getHeight())
				return 0;
			else if(this.height>o.getHeight()) 
				return 1;
			else
				return-1;
		}else if(this.weight>o.getWeight()) {
			return 1;
		}else {
			return -1;
			}
	
	}
	
		
}

public class PersonQuestion {

	public static void main(String[] args) {
		
		Person p1 = new Person("saban",80,176);
		Person p2 = new Person("unni",87,180);
		Person p3 = new Person("kannan",75,172);
		Person p4 = new Person("sona",75,167);
		Person p5 = new Person("salu",75,164);
		
//		System.out.println( p1.toString());
//		System.out.println( p2.toString());
		
		Set<Person> set = new TreeSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);	
		System.out.println(set);
			
	}

}
