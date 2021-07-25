package SpringQ1;

public class Customer {
	
	int customerId;
	String customerName;
	int customerContact;
	Address customerAdd;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	public Address getCustomerAdd() {
		return customerAdd;
	}

	public void setCustomerAdd(Address customerAdd) {
		this.customerAdd = customerAdd;
	}

	public Customer(int customerId, String customerName, int customerContact, Address customerAdd) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAdd = customerAdd;
	}
//	
	public void Display() {
		System.out.println(this.customerName +" " +this.customerAdd);
	}

	
	public String getCustomer() {
		return "customerId: " + customerId + "\ncustomerName: " + customerName + "\ncustomerContact:"
				+ customerContact + "\ncustomerAdd: \n" + customerAdd ;
	}
	

}
