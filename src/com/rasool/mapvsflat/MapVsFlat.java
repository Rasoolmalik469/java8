package com.rasool.mapvsflat;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlat {
	public static void main(String[] args) {

		List<Customer> cust = EkartDatabase.getAll();

//converting List<Customer> to List<String> ->Data Transformation

//       List<String> email=cust.stream().map(emp->emp.getEmail()).collect(Collectors.toList());
//       System.out.println(email);

		List<List<String>> ph = cust.stream().map(cust1 -> cust1.getPnumbers()).collect(Collectors.toList());
		System.out.println(ph);//[[397, 216], [697, 516], [897, 916]]
		
		
		List<String> ph1 = cust.stream().flatMap(cust1 -> cust1.getPnumbers().stream()).collect(Collectors.toList());
		System.out.println(ph1);//[397, 216, 697, 516, 897, 916]

		
		
		

	}
}
