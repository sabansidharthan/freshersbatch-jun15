package JavaAssignments3.parkingLot;

public class CarOwnerDetails {
	
	String ownerName;
	String carModel;
	int carNo;
	int ownerPh;
	String ownerAddr;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}
	public int getOwnerPh() {
		return ownerPh;
	}
	public void setOwnerPh(int ownerPh) {
		this.ownerPh = ownerPh;
	}
	public String getOwnerAddr() {
		return ownerAddr;
	}
	public void setOwnerAddr(String ownerAddr) {
		this.ownerAddr = ownerAddr;
	}
	@Override
	public String toString() {
		return "CarOwnerDetails:  ownerName=" + ownerName + ", carModel=" + carModel + ", carNo=" + carNo + ", ownerPh="
				+ ownerPh + ", ownerAddr=" + ownerAddr ;
	}
	
	
	
	

}
