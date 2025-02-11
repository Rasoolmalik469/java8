package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Filter {
	public static void main(String[] args) {
		
	
	
	List<String> li=new ArrayList<>();
	li.add("Rasool");
	li.add("malik");
	li.add("RasoolMalik");
	
//	for(String s:li) {
//		if(s.startsWith("R")) {
//			System.out.println(s);
//		}
//	}
//	
	li.stream().filter(t->t.startsWith("R")).forEach(t->System.out.println(t));	
	
	Map<Integer,String> m=new HashMap<>();
	m.put(1, "Rasool");
	m.put(2, "malik");
	m.put(3, "RasoolMalik");
	m.entrySet().stream().filter(t->t.getKey()%2==0).forEach(t->System.out.println(t));
}}
