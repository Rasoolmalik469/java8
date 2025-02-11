package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.rasool.api.example.DataBase;
import com.rasool.api.example.Employee;

public class MapReduce {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers=Arrays.asList(3,5,6,7);
		List<String> wo=Arrays.asList("Core Java","Hiber","Spring");		
		int sum=0;
		for(int no:numbers) {
			sum=sum+no;
		}
		//System.out.println(sum);
		
		int sum1=numbers.stream().mapToInt(i->i).sum();
		//System.out.println(sum1);
		
		int reduce=numbers.stream().reduce(0,(a,b)->a+b);
		//System.out.println(reduce);
		
		Optional<Integer> re=numbers.stream().reduce(Integer::sum);
		System.out.println(re.get());
		
		int reduce1=numbers.stream().reduce(1,(a,b)->a*b);
		System.out.println(reduce1);
		
		int reduce11=numbers.stream().reduce(1,(a,b)->a>b?a:b);
		System.out.println(reduce11);
		
		int reduce111=numbers.stream().reduce(Integer::max).get();
		System.out.println(reduce111);
		
		String s=wo.stream().reduce((wo1,wo2)->wo1.length()>wo2.length()?wo1:wo2).get();
		System.out.println(s);
		
		//get employess whose grade is A
		//get salary
		
//		double avgSal=DataBase.getEmployees().stream().
//				filter(em->em.getName().equalsIgnoreCase("A"))
//				.map(em->em.getSalary()).
//				mapToDouble(i->i).
//				average().getAsDouble();
		
		//System.out.println(avgSal);
		
				


		
		
		
		
		
		
		
	}

}
