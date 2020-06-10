package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class forEachJava8 {

	public static void main(String[] args) {
		List<Integer> people =new ArrayList <Integer>();
			people.add(10);
			people.add(20);
			people.add(30);
			people.add(40);
			people.add(80);
			people.add(90);
			
			
			people.forEach(p->System.out.println(p/2));
			System.out.println("\n");
			people.forEach(p->System.out.println(p+(p/2)));
			people.forEach(p->System.out.println(p/2));
			System.out.println("\n");
			people.forEach(System.out::println); //-------Method Reference
		

	}

}
