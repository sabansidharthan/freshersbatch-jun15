package JavaAssignment4;

public class Fruit {
	String name;
	int caories;
	int price;
	String colour;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCaories() {
		return caories;
	}
	public void setCaories(int caories) {
		this.caories = caories;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Fruit(String name, int caories, int price, String colour) {
		super();
		this.name = name;
		this.caories = caories;
		this.price = price;
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "name=" + name + ", caories=" + caories + ", price=" + price + ", colour=" + colour;
	}
	

}
