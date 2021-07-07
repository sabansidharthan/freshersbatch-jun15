
package JavaAssignments2;
import java.util.Scanner;

abstract class DessertItem{
	protected int tax;
	protected int stock;
	protected int price;
	
	public abstract void placeOrder(int n);
	public abstract float getCost(int n);
	public abstract void addItem(int n);
	public abstract void show();
	
	public DessertItem(int tax,int stock,int price) {
		this.tax=tax;
		this.price=price;
		this.stock=stock;
		
	}
	
}
///////////////////////////////////////////////////////////////////////////////////////////////

class Candy extends DessertItem{

	public Candy(int tax, int stock, int price) {
		super(tax, stock, price);
		
	}

	@Override
	public void placeOrder(int n) {
		stock=stock-n;
		System.out.printf("Order placed for %d candy",n);
		System.out.println("Total cost : "+getCost(n));
		show();
		
	}

	@Override
	public float getCost(int n) {
		float cost = price*n;
		cost= cost+(cost*tax/100);
		cost= cost*60;	
		return cost;
	}

	@Override
	public void addItem(int n) {
		stock = stock+n;
		System.out.printf("%d candy added to storage",n);
		show();
		
	}

	@Override
	public void show() {
		System.out.println("Dessert..: Candy");
		System.out.println("Stock....: "+stock);
		System.out.println("Price....: "+price);
		System.out.println("Tax......: "+tax);

		
	}
	
}	
////////////////////////////////////////////////////////////////////////////////////////////////
	


class Cookie extends DessertItem{

	public Cookie(int tax, int stock, int price) {
		super(tax, stock, price);
		
	}

	@Override
	public void placeOrder(int n) {
		stock=stock-n;
		
		show();
		System.out.printf("Order placed for %d Cookie",n);
		System.out.println("Total cost : "+getCost(n));
	}

	@Override
	public float getCost(int n) {
		float cost = price*n;
		cost= cost+(cost*tax/100);
		cost= cost*70;	
		return cost;
	}

	@Override
	public void addItem(int n) {
		stock = stock+n;
		System.out.printf("%d Cookie added to storage",n);
		show();
		
	}

	@Override
	public void show() {
		System.out.println("Dessert..: Cookie");
		System.out.println("Stock....: "+stock);
		System.out.println("Price....: "+price);
		System.out.println("Tax......: "+tax);
	
	}
	
}

///////////////////////////////////////////////////////////////////////////////////////

class IceCream extends DessertItem{

	public IceCream(int tax, int stock, int price) {
		super(tax, stock, price);
		
	}

	@Override
	public void placeOrder(int n) {
		stock=stock-n;
		System.out.printf("Order placed for %d IceCream",n);
		System.out.println("Total cost : "+getCost(n));
		show();
		
	}

	@Override
	public float getCost(int n) {
		float cost = price*n;
		cost= cost+(cost*tax/100);
		cost= cost*01;	
		return cost;
	}

	@Override
	public void addItem(int n) {
		stock = stock+n;
		System.out.printf("%d IceCream added to storage",n);
		show();
		
	}

	@Override
	public void show() {
		System.out.println("Dessert..: IceCream");
		System.out.println("Stock....: "+stock);
		System.out.println("Price....: "+price);
		System.out.println("Tax......: "+tax);

		
	}
		
}


public class Dessert {

	static Candy candy = new Candy(10,100,10);// 10% tax 100 qty 10rs
	static Cookie cookie = new Cookie(20,50,30);
	static IceCream iceCream = new IceCream(10,40,20);
	
	public static void showInventory()
	{
		candy.show();
		cookie.show();
		iceCream.show();
			
	}
	
	public static void main(String[] args) {
		
		int k=0;
		do{
			int item=0;
			int qty=0;
			System.out.println("\n\nPick \t1. Owner \t2. Customer\t0. Exit\n");
			Scanner s= new Scanner(System.in);
			k = s.nextInt();
			if(k==1){
				showInventory();
				System.out.println("\nPlease select any item(1,2,3)");
				item = s.nextInt();
				System.out.print("\nPlease enter the qty : ");
				qty = s.nextInt();
				switch(item) {
				  case 1:
				  	candy.addItem(qty);
				    break;
				  case 2:
				  	cookie.addItem(qty);
				    break;
				  case 3:
				  	iceCream.addItem(qty);
				    break;
				  default:
				    System.out.println("\nInvalid choice.\n");
				}

			}
			else if(k==2){
				showInventory();
				System.out.println("\nPlease select any item(1,2,3)");
				item = s.nextInt();
				System.out.print("\nPlease enter the qty : ");
				qty = s.nextInt();
				switch(item) {
				  case 1:
				  	candy.placeOrder(qty);
				    break;
				  case 2:
				  	cookie.placeOrder(qty);
				    break;
				  case 3:
				  	iceCream.placeOrder(qty);
				    break;
				  default:
				    System.out.println("\nInvalid choice.\n");
				}
			}
			else if(k!=0){
				System.out.println("\nInvalid choice.\n");
			}
		}while(k!=0);
		
	}
}
