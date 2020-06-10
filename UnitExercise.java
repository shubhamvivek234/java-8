package lambdaExpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class UnitExercise {
	
	// from java brain video 14 java 8 lambda basics

	public static void main(String[] args) {
		List<Person> people =Arrays.asList (
				new Person("Charles","Dickens",60),
				new Person("shuhbam","sharma",60),
				new Person("kriti","gururani",60),
				new Person("rahul","saurav",60),
				new Person("Charles","hanshraj",60)

				);
		
		//1. sort the list by Last Name
		Collections.sort(people, (p1,p2) ->p1.getLastname().compareTo(p2.getLastname()));
		
		
		printall(people);
		
		
		
		
		//2.create a method that prints all elements in the list
		
		//3.create a method that prints all people that have last name begining with C
		
		
	

	}

	private static void printall(List<Person> people) {
		for(Person p:people)
		{
			System.out.println(p);
		}
		// TODO Auto-generated method stub
		
	}
	
	//3.create a method that prints all people that have last name begining with C
	   //  printConditionally(people, p -> p.getLastname().startsWith("C"));
	
//        printConditionally(people, p -> p.getFirstname().startsWith("C"));
//     
//     private static void printConditionally(List<Person> people ,Predicate<Person> condition ){
//    	 for(Person p :people){
//    		 if(condition.test(p)){
//    			 System.out.println(p);
//    		 }
//    	 }
//     }
    		 
}