package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

//public class SupplierDemo implements Supplier<String> {
//
//	@Override
//	public String get() {
//
//		return "Hi Rasool";
//	}
//	
//	public static void main(String[] args) {
//		Supplier<String> s=new SupplierDemo();S
//		System.out.println(s.get());//Hi Rasool
//	}
//
//}
//or
public class SupplierDemo{
	
	public static void main(String[] args) {
		
//   Supplier<String> p=()->{
//	   return "Hi Rasool";
//   };
	Supplier<String> p=()->"Hi Rasool";
	

	//System.out.println(p.get());//Hi Rasool
	
	List<String> li=Arrays.asList("a","b");
	System.out.println(li.stream().findAny().orElseGet(p));//a
	List<String> li1=Arrays.asList();
	System.out.println(li1.stream().findAny().orElseGet(p));//Hi Rasool
	System.out.println(li1.stream().findAny().orElseGet(()->"Hi Rasool"));//Hi rasool
	
	
}}