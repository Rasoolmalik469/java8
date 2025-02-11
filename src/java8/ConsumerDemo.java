package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//public class ConsumerDemo implements Consumer<Integer> {
//
//	@Override
//	public void accept(Integer t) {
//	System.out.println("promt"+t);
//		
//	}
//	
//	public static void main(String ar[]) {
//		ConsumerDemo obj=new ConsumerDemo();
//		obj.accept(10);
//	}
//	
//	
//
//}
//or

//public class ConsumerDemo{
//	
//	public static void main(String[] args) {
//		Consumer<Integer> obj=(t)->{
//			System.out.println(t);
//		};
//		obj.accept(10);
//	}
//	
//	
//}




public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> consumer = (t) -> System.out.println(t);

		consumer.accept(10);

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		//list1.stream().forEach(consumer);
		//foreach internally using consumer
		list1.stream().forEach(t->System.out.println(t));
	}

}
