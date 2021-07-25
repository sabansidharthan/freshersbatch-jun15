package com.spring.assignment.SpringAssignments;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import SpringQ1.Address;
import SpringQ1.Customer;


class SpringAssignmentQ1ApplicationTests {

	@Test
	void test() {
			
		Customer customer = new Customer(900778,"Tom",900778738,
				new Address("Attingal","Trivandrum","Kerala","India"));
		assertEquals(customer.getCustomerId(),900778,"CustomerId");
		assertEquals(customer.getCustomerName(),"Tom","Customer Name");
		assertEquals(customer.getCustomerContact(),900778738,"Customer phone No.");
		assertEquals(customer.getCustomerAdd().getStreet(),"Attingal","Street");
		assertEquals(customer.getCustomerAdd().getCity(),"Trivandrum","City");
		assertEquals(customer.getCustomerAdd().getState(),"Kerala","State");
		assertEquals(customer.getCustomerAdd().getCountry(),"India","Country");

	}
}
