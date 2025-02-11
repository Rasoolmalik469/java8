package com.rasool.parallelstream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

import com.rasool.api.example.DataBase;
import com.rasool.api.example.Employee;

public class ParalllelStream {
	
	
	
	public static void main(String[] args) {
		
		long start=0;
		long end=0;
		
//		start=System.currentTimeMillis();
//		IntStream.range(1, 100).forEach(System.out::println);
//		end=System.currentTimeMillis();
//		System.out.println("Plainstream"+(end-start));
//		System.out.println("-------------");
//		
//		start=System.currentTimeMillis();
//		IntStream.range(1, 100).parallel().forEach(System.out::println);
//		end=System.currentTimeMillis();
//		System.out.println("Parallel Plainstream"+(end-start));
//		
		
		IntStream.range(1, 100).forEach(x->
		System.out.println("Thread"+Thread.currentThread())
				);
		
		IntStream.range(1, 100).parallel().forEach(x->
		System.out.println("Thread parallle"+Thread.currentThread())
				);
		
		start=System.currentTimeMillis();
		List<Employee> emp1=DataBase.getEmployees();
		OptionalDouble st=emp1.stream().map(Employee::getSalary).mapToDouble(i->i)
		.average();	
		end=System.currentTimeMillis();
		System.out.println("normal stream"+(end-start));
		
		

		start=System.currentTimeMillis();
		OptionalDouble st1=emp1.parallelStream().map(Employee::getSalary).mapToDouble(i->i)
				.average();	
		end=System.currentTimeMillis();
		System.out.println("Paralle stream"+(end-start));
		
		
		
		
		
		
	}

}
