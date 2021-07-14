package JavaAssignments3.parkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkedOwnerList {
	
	Map<token,CarOwnerDetails> ParkedOwnerList = new HashMap<>();
	
	public void removeCar(token t) {
		this.ParkedOwnerList.remove(t);
	}
	public token generateToken() {
		
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				for(int k=1;k<=3;k++) {
					
					token t = new token(i,j,k);
					if(!(this.ParkedOwnerList.containsKey(t))) {
						return t;
					}
				}
			}
		}
		return null;
	
	}
	public void addNewCar(token t,CarOwnerDetails obj) {
		this.ParkedOwnerList.putIfAbsent(t,obj);
	}
	
	public token getCarLocation(int carNum) {
		for(Map.Entry<token ,CarOwnerDetails> list : this.ParkedOwnerList.entrySet()){
			if(list.getValue().getCarNo()==carNum) {
				System.out.println(list.getKey()+" : "+list.getValue());
				return list.getKey();
			}
		}
		System.out.println("Car not found.");
		return null;
		
	}

}
 