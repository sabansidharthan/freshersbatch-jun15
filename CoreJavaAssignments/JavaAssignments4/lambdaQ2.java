package JavaAssignments4;

import java.util.Arrays;
import java.util.List;

class order{
	int orderNo;
	int price;
	String status;
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public order(int orderNo, int price, String status) {
		super();
		this.orderNo = orderNo;
		this.price = price;
		this.status = status;
	}
	@Override
	public String toString() {
		return "orderNo: " + orderNo + ", price: " + price + ", status: " + status;
	}
	
//--------------------------------------------//	
}

public class lambdaQ2 {

	public static void main(String[] args) {
		
		List<order> list = Arrays.asList(
				new order(1,4000,"not accepted"),
				new order(2,15000,"completed"),
				new order(3,8000,"accepted"),
				new order(4,15000,"not accepted"),
				new order(5,10000,"not accepted"));
		
		filter f1= (a)->{
			if(a.price>=10000)
				return true;
			else return false;
		};
		
		filter f2 = (a)->{
			if(a.status.equals("completed")||a.status.equals("accepted"))
				return true;
						
			else return false;
						
		};
		System.out.println("\norder more than 10000\n");
		for(order b:list){
			if(f1.search(b))
				System.out.println(b);
		};
		System.out.println("--------------------------------------------");
		System.out.println("\naccepted or completed orders\n");
		for(order b:list){
			if(f2.search(b))
				System.out.println(b);
		};

	}

}

//--------------------------------------------------------------------------------------//
interface filter{
	public Boolean search(order a);
}
