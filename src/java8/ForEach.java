package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class ForEach {
	
	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("Rasool");
		li.add("malik");
		li.add("RM");
		li.add("MR");
//		for(String s:li) {
//			System.out.println(s);
//		}
//		li.stream().forEach(t->System.out.println(t));
		
		Map<Integer,String> ma=new HashMap<>();
		ma.put(1, "rasool");
		ma.put(2, "malik");
		ma.put(3,"RM");
		
		
		//ma.forEach((key,value)->System.out.println(key+value));
		//ma.entrySet().stream().forEach(t->System.out.println(t));
		Consumer<String> co=t->System.out.println(t);
		co.accept("malik");
		for(String a:li) {
			co.accept(a);
		}
	}
	

}
