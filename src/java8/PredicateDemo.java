package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//public class PredicateDemo implements Predicate<Integer> {
//
//	@Override
//	public boolean test(Integer t) {
//    if(t%2==0) {
//    	return true;
//    }
//    else {
//		return false;
//	}
//    
//	}
//	
//	public static void main(String[] args) {
//		PredicateDemo p=new PredicateDemo();
//		System.out.println(p.test(10));//true
//	}
//	
//	
//
//}

//public class PredicateDemo{
//	public static void main(String[] args) {
//		Predicate<Integer> p=t->{
//			if(t%2==0) {
//				return true;
//			}
//			else {
//				return false;
//			}
//			
//		};
//		System.out.println(p.test(10));//true
//	}
//	
//}


public class PredicateDemo{
	public static void main(String[] args) {
		Predicate<Integer> p=t->t%2==0;
			
		System.out.println(p.test(10));//true
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5);
		list1.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
		
		
	}
	
}

