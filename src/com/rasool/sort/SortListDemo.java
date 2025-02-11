package com.rasool.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.rasool.api.example.DataBase;
import com.rasool.api.example.Employee;

public class SortListDemo {
	
public static void main(String a[]) {
	List<Integer> li=new ArrayList<>();
	li.add(8);
	li.add(10);
	li.add(15);
	li.add(1);
	
List<Employee> em=DataBase.getEmployees();
//	Collections.sort(em,new Comparator<Employee>() {
//
//		@Override
//		public int compare(Employee o1, Employee o2) {
//			// TODO Auto-generated method stub
//			return (int)(o1.getSalary()-o2.getSalary());
//		}
//		
//	});
//	System.out.println(em);
	
	//or
//	Collections.sort(em,(o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
//	System.out.println(em);//acending order
//	
//	Collections.sort(em,(o1,o2)->(int)(o2.getSalary()-o1.getSalary()));
//	System.out.println(em);//descending order
	
	//em.stream().sorted((o1,o2)->(int)(o1.getSalary()-o2.getSalary())).forEach(System.out::println);	
//	Collections.sort(li);//ascending
//	Collections.reverse(li);//descending
//	//System.out.println(li);
//	li.stream().sorted().forEach(t->System.out.println(t));//ascending
//	li.stream().sorted(Collections.reverseOrder()).forEach(t->System.out.println(t));


	em.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);	

}

}
//class MyComparator implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		return (int)(o1.getSalary()-o2.getSalary());//ascending
//		//return (int)(o2.getSalary()-o1.getSalary());//descneding
//	}
//}
