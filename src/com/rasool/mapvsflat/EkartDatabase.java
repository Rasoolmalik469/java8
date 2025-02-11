package com.rasool.mapvsflat;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {

	public static List<Customer> getAll() {
		return Stream
				.of(new Customer(101, "john", "john@gmail.com", Arrays.asList("397", "216")),
						new Customer(102, "Smith", "Smith@gmail.com", Arrays.asList("697", "516")),
						new Customer(103, "Rasool", "Rasool@gmail.com", Arrays.asList("897", "916")))
				.collect(Collectors.toList());
	}
}
