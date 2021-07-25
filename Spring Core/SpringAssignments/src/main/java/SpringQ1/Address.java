package SpringQ1;

public class Address {
String street;
String city;
String state;
String country;


public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "street:" + street + "\ncity: " + city + "\nstate: " + state + "\ncountry: " + country ;
}
public Address(String street, String city, String state, String country) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
	this.country = country;
}



}
