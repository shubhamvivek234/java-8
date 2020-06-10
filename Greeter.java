package lambdaExpression;

public class Greeter {
	
	public void greet(Greeting greeting)
	{
	     greeting.perform();
	
		//System.out.println("Hello world");
	}
	   

	public static void main(String[] args) {
		 
		Greeter greeter=new Greeter();
		Greeting helloworldgreeting =new HelloWorldGreeter();
		greeter.greet(helloworldgreeting);
		
		Greeting  myLambdaGreeting=()->System.out.print("Hello");
		
		

	}

}
 