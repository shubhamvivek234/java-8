package StreamApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lambdaExpression.Person;
import lambdaExpression.forEachJava8;

public class Streams {

		public static void main(String[] args) throws IOException {
			List<Person> people =Arrays.asList (
					new Person("Charles","Dickens",60),
					new Person("shuhbam","sharma",60),
					new Person("kriti","gururani",60),
					new Person("rahul","saurav",60),
					new Person("Charles","hanshraj",60)
					);
			people.stream()
			.filter(p->p.getFirstname().startsWith("C"))
			.forEach(System.out::println);
			
//--------------------------------------------------------------------------------------------------------------------------------------------------------	-		
			
			 IntStream
			.range(1,10) //----------it will print from 1 to 9...10is exclusive
			.skip(5)    //-----------it will skip first 5 numbers
			.forEach(System.out::print);
						
			System.out.println("\n");
			
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------
			
			System.out.println(
			IntStream
			.range(1, 10)
			.sum()
			);

			System.out.println("\n");
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
			
			
			Stream.of("altl", "humor" , "me")
			.sorted()
			.findFirst()
			.ifPresent(System.out::print);
			
			System.out.println("\n");
//-------------------------------------------------------------------------------------------------------------------------------------------------------------
					
			String [] names={"all","helo","hi","chal","ghoomne","kaha", "chalna","hai"};
			Arrays.stream(names)
			.map(String::toUpperCase)
			.filter(x ->x.startsWith("H"))
			.sorted()
			.forEach(System.out::println);
			
			
			System.out.println("\n");
			
			
//------------------------------------------------------------------------------------------------------------------------------------------------			
			
			IntStream num   = IntStream.range(0, 10);
				
			int[] number =num.toArray();
			Arrays.stream(number)
			.map(x -> x*x)
			.forEach(System.out::println);
			
			System.out.println("\n");	
//----------------------------------------------------------------------------------------------------------------------------------------------
			
			
			Stream<String> bands=Files.lines(Paths.get("C://Users//finds//Desktop//aws.txt")); 
			bands.forEach(System.out::println);
			bands.close(); // Imp to close to prevent memory leaks
			
			System.out.println("\n");	
//-------------------------------------------------------------------------------------------------------------------------------------------		
			
			
			 List<String> bands2=Files.lines(Paths.get("C://example//hello.txt"))
					 .collect(Collectors.toList());
			 bands2.forEach(x ->System.out.println(x));
		
			 
//-----------------------------------------------------------------------------------------------------------------------------------------			
			
			 
			 
			 Stream<String> rows1= Files.lines(Paths.get("C://example//hello1.txt"));
			              int rowcount=  (int)rows1
			            		  .map(x -> x.split(","))
			            		  .filter(x-> x.length==3)
			            		  .count();
			              System.out.println(rowcount);
			              rows1.close();
			              System.out.println("\n");	   		  
			              
 //-----------------------------------------------------------------------------------------------------------------------------------------			 
			              Stream<String> rows2= Files.lines(Paths.get("C://example//hello1.txt"));
			 
			                  rows2 .map(x -> x.split(","))
			                  .filter(x -> x.length == 3)
			                  .filter(x ->Integer.parseInt( x[1]) > 15)
			                  .forEach(x ->System.out.println(x[0]+" " + x[1] +" "+ x[2]));
			                  
			                  System.out.println("\n");
			              
 //-----------------------------------------------------------------------------------------------------------------------------------------	
			                  
			                  Stream<String> rows3= Files.lines(Paths.get("C://example//hello1.txt"));
			                  Map<String, Integer> map =new HashMap<>();
			                  map=rows3
			                	  .map(x -> x.split(","))
			                	  .filter(x->x.length ==3)
			                	  .filter(x ->Integer.parseInt(x[1]) > 15)
			                	  .collect(Collectors.toMap(x -> x[0],x ->Integer.parseInt(x[1])));
			                       rows3.close();
			                       
			                       for(String key :map.keySet()){
			                    	   System.out.println(key+ " "+map.get(key));
			                       }
			                      
			                       System.out.println("\n");	                  
			                  
 //-----------------------------------------------------------------------------------------------------------------------------------------		                  
			                  double total=Stream.of(7.3,1.5,4.8)
			                		  .reduce(0.0,(Double a, Double b)->a+b);
			                  System.out.println("Total= "+ total);
			                       
			                  System.out.println("\n");
			                  
 //-------------------------------------------------------------------------------------------------------		                       
			                       
			        IntSummaryStatistics summary  =IntStream.of (7,5,4,8,105 ,34,56)
			        		              .summaryStatistics();
			                                       System.out.println(summary);
			                  
			                  
			
	}

}
