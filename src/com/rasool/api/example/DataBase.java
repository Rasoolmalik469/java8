package com.rasool.api.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataBase {
	public static List<Employee> getEmployees(){
//		List<Employee> li=new ArrayList<>();
//		li.add(new Employee(1,"Rasool","IT",60000));
//		li.add(new Employee(1,"Malik","ITE",70000));
//		li.add(new Employee(1,"RasoolMalik","CS",90000));
//		return li;
		
		List<Employee> emp=new ArrayList<>();
		for(int i=1;i<=1000;i++) {
			emp.add(new Employee(i,"emp"+i,"dep"+i,100+i));
		}
		
		return emp;
		
		
		
	}

}
