package com.rasool.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.rasool.api.example.Employee;

public class SortMapDemo {
	
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("eight",8);
		map.put("four", 4);
		map.put("ten", 10);
		map.put("two", 2);
		
//		Map<Employee,Integer> ma1=new TreeMap<>(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				// TODO Auto-generated method stub
//				return (int) (o1.getSalary()-o2.getSalary());
//			}
//			
//		});
		
		Map<Employee,Integer> ma1=new TreeMap<>((o1,o2)->(int)(o2.getSalary()-o1.getSalary()));

		ma1.put(new Employee(1,"Rasool","IT",60000),60);
		ma1.put(new Employee(1,"Malik","ITE",70000),70);
		ma1.put(new Employee(1,"RasoolMalik","CS",90000),80);
		//System.out.println(ma1);
		
		ma1.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())).forEach(System.out::println);
		
		//List<Entry<String,Integer>> ent=new ArrayList<>(map.entrySet());
//		
//		Collections.sort(ent,new Comparator<Entry<String,Integer>>() {
//
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//		
//				return o1.getKey().compareTo(o2.getKey());
//			}
//		});
//		
//		for(Entry<String,Integer> en:ent) {
//			System.out.println(en.getKey());
//		}
		
		
		
//		Collections.sort(ent,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
//		for(Entry<String,Integer> en:ent) {
//		System.out.println(en.getKey());
//	}
		
		
		//map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		//System.out.println("-------");
		//map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
	
	}

}
