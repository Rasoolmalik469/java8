package com.rasool.api.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
	
	public List<Employee> evaluteTax(String input){
		
//		if(input.equalsIgnoreCase("tax")) {
//			
//			return DataBase.getEmployees().stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList());	
//		}
//		else {
//			return DataBase.getEmployees().stream().filter(emp->emp.getSalary()<=50000).collect(Collectors.toList());	
//		}
//			
		return (input.equalsIgnoreCase("tax"))? DataBase.getEmployees().stream().filter(emp->emp.getSalary()>50000).collect(Collectors.toList())
				:DataBase.getEmployees().stream().filter(emp->emp.getSalary()<=50000).collect(Collectors.toList());
			
		
	}
	public static void main(String[] args) {
		TaxService tax=new TaxService();
		System.out.println(tax.evaluteTax("tax"));
		
	}

}
