package com.rasool.mapvsflat;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



public class OptionalDemo  {
	
	public static Customer getCustomer(String email) throws Exception {
		
		List<Customer> customers=EkartDatabase.getAll();
		return customers.stream().filter(cust->cust.getEmail().equals(email)).findAny().orElseThrow(()->new Exception("Rqsooal"));
	}
	public static void main(String[] args) throws Exception {

		Customer cu1 = new Customer(101, "john", null, Arrays.asList("397", "216"));

		// empty
		// of
		// nullable

		// Optional<Object> emp=Optional.empty();
		// System.out.println(emp);

		// Optional<String> op=Optional.of(cu1.getEmail());
		// System.out.println(op);

		Optional<String> op1 = Optional.ofNullable(cu1.getEmail());
//		if (op1.isPresent()) {
//			System.out.println(op1.orElse("default@gamil.com"));
//		} else {
//
//			System.out.println(op1.orElse("default@gamil.com"));
//		}

		//System.out.println(op1.orElseThrow(() -> new IllegalArgumentException("emial not")));

		
		//System.out.println(op1.map(String::toUpperCase).orElseGet(() -> "default"));
        getCustomer("pqr");
	}

}
